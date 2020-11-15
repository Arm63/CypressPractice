package com.example.cypresspractice.data.repositores.user

import com.example.cypresspractice.data.api.ApiService

class UserRemoteDataSource(private val service: ApiService) {

    suspend fun getUsers() = service.getUsers()
}