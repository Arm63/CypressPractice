package com.example.cypresspractice.data.repositores.album

import com.example.cypresspractice.data.model.Album
import com.example.cypresspractice.data.model.Photo

class AlbumDataRepository(private val remote: AlbumRemoteDataSource, private var locale: AlbumLocalDataSource) {

    //--------------------------------------ALBUMS-------------------------------------
    suspend fun insertAlbum(albums: List<Album>) = locale.insertAlbums(albums)

    suspend fun getAlbums() = remote.getAlbums()

    suspend fun deleteAllAlbums() = locale.deleteAllAlbums()

    fun getAlbumsData(userId:Int) = locale.getAlbumsData(userId)


    //--------------------------------------PHOTOS-------------------------------------
    suspend fun insertPhoto(photo: List<Photo>) = locale.insertPhotos(photo)

    suspend fun getPhotos() = remote.getPhotos()

    suspend fun deleteAllPhoto() = locale.deleteAllPhotos()

    fun getPhotosById(albumId:Int) = locale.getPhotosById(albumId)


}