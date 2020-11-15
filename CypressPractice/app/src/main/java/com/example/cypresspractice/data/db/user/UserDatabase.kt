package com.example.cypresspractice.data.db.user

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.cypresspractice.data.db.dao.AlbumDao
import com.example.cypresspractice.data.db.dao.PhotoDao
import com.example.cypresspractice.data.model.Album
import com.example.cypresspractice.data.model.Photo
import com.example.cypresspractice.data.model.User

@Database(entities = [User::class, Album::class, Photo::class], version = 2, exportSchema = false)
abstract class UserDatabase : RoomDatabase() {

    abstract fun userDao(): UserDao
    abstract fun albumDao(): AlbumDao
    abstract fun photoDao(): PhotoDao
}
