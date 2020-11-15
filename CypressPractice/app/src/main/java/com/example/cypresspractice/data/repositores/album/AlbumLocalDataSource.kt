package com.example.cypresspractice.data.repositores.album

import com.example.cypresspractice.data.db.dao.AlbumDao
import com.example.cypresspractice.data.db.dao.PhotoDao
import com.example.cypresspractice.data.model.Album
import com.example.cypresspractice.data.model.Photo

class AlbumLocalDataSource(private val daoAlbum: AlbumDao, private val daoPhoto: PhotoDao) {

    //---------------------------------------ALBUM------------------------------------------
    suspend fun insertAlbums(albums: List<Album>) {
        daoAlbum.insertAlbums(albums)
    }

    suspend fun deleteAllAlbums(){
        daoAlbum.deleteAllAlbums()
    }

    fun getAlbumsData(userId: Int) = daoAlbum.getAlbumsById(userId)



    //---------------------------------------PHOTO------------------------------------------

    suspend fun insertPhotos(photos: List<Photo>) {
        daoPhoto.insertPhotos(photos)
    }

    suspend fun deleteAllPhotos(){
        daoPhoto.deleteAllPhotos()
    }

    fun getPhotosData() = daoPhoto.getAllPhotos()
    fun getPhotosById(albumId:Int) = daoPhoto.getPhotosById(albumId)

}