package com.example.cypresspractice.data.api

import com.example.cypresspractice.data.model.Album
import com.example.cypresspractice.data.model.Photo
import com.example.cypresspractice.data.model.User
import retrofit2.http.GET

interface ApiService {
    @GET("users")
    suspend fun getUsers(): List<User>

    @GET("albums")
    suspend fun getAlbums(): List<Album>

    @GET("photos")
    suspend fun getPhotos(): List<Photo>


}