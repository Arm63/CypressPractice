package com.example.cypresspractice.data.db.user

import androidx.room.Room
import com.example.cypresspractice.data.db.dao.AlbumDao
import com.example.cypresspractice.data.db.dao.PhotoDao
import com.example.cypresspractice.util.Constant
import org.koin.dsl.module


val dbUserModule = module {
    single {
        Room.databaseBuilder(
            get(),
            UserDatabase::class.java,
            Constant.USER_DATABASE
        )
            .fallbackToDestructiveMigration()
            .build()
    }

    fun provideUserDao(database: UserDatabase): UserDao {
        return database.userDao()
    }

    fun providePhotoDao(database: UserDatabase): AlbumDao {
        return database.albumDao()
    }

    fun provideAlbumDao(database: UserDatabase): PhotoDao {
        return database.photoDao()
    }
    single { provideUserDao(get()) }
    single { providePhotoDao(get()) }
    single { provideAlbumDao(get()) }

}
