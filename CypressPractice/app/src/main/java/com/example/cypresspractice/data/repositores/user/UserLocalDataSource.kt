package com.example.cypresspractice.data.repositores.user

import com.example.cypresspractice.data.db.user.UserDao
import com.example.cypresspractice.data.model.User

class UserLocalDataSource(private val dao: UserDao) {

    suspend fun insertUsers(users: List<User>) {
        dao.insertUsers(users)
    }

    suspend fun deleteAll(){
        dao.deleteAll()
    }

    fun getData() = dao.getAllData()


}