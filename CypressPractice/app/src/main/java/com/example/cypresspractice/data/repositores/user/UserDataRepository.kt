package com.example.cypresspractice.data.repositores.user

import com.example.cypresspractice.data.model.User

class UserDataRepository(private val remote: UserRemoteDataSource, private var locale: UserLocalDataSource) {

    suspend fun insertData(users: List<User>) = locale.insertUsers(users)

    suspend fun getUsers() = remote.getUsers()

    suspend fun deleteAll() = locale.deleteAll()

    fun getData() = locale.getData()


}