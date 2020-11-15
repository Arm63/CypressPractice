package com.example.cypresspractice.ui.album

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.cypresspractice.data.model.Album
import com.example.cypresspractice.data.model.Photo
import com.example.cypresspractice.data.repositores.album.AlbumDataRepository
import com.example.cypresspractice.resource.Resource
import com.example.cypresspractice.resource.Status
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class AlbumViewModel(var repository: AlbumDataRepository) : ViewModel() {

    private val _albumsResource = MutableLiveData<Resource<List<Album>>>()
    private val _photosResource = MutableLiveData<Resource<List<Photo>>>()

    val albumsResource: LiveData<Resource<List<Album>>>
        get() = _albumsResource

    val photosResource: LiveData<Resource<List<Photo>>>
        get() = _photosResource


    init {
        fetchData()
    }

    private fun fetchData() {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                _albumsResource.postValue(Resource(Status.LOADING, null, null))
                _photosResource.postValue(Resource(Status.LOADING, null, null))

                val albums = repository.getAlbums()
                val photos = repository.getPhotos()
                _albumsResource.postValue(Resource(Status.SUCCESS, albums, null))
                _photosResource.postValue(Resource(Status.SUCCESS, photos, null))

            } catch (t: Throwable) {
                _albumsResource.postValue(Resource(Status.ERROR, null, t.message))
                _photosResource.postValue(Resource(Status.ERROR, null, t.message))
            }
        }
    }

    fun insertAllPhotos(photoList: List<Photo>) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.deleteAllPhoto()
            repository.insertPhoto(photoList)
        }
    }

    fun insertAllAlbums(albumList: List<Album>) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.deleteAllAlbums()
            repository.insertAlbum(albumList)

        }
    }
}
