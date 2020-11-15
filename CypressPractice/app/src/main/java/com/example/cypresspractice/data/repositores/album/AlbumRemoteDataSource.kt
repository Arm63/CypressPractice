package com.example.cypresspractice.data.repositores.album

import com.example.cypresspractice.data.api.ApiService

class AlbumRemoteDataSource(private val service: ApiService) {

    suspend fun getAlbums() = service.getAlbums()

    suspend fun getPhotos() = service.getPhotos()

}