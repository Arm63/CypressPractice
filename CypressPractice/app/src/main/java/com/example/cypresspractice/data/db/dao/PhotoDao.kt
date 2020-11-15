package com.example.cypresspractice.data.db.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.cypresspractice.data.model.Photo

@Dao
interface PhotoDao {
    @Query("SELECT * FROM PHOTO_TABLE")
    fun getAllPhotos(): LiveData<List<Photo>>

    @Query("SELECT * FROM PHOTO_TABLE WHERE albumId = :albumId")
    fun getPhotosById(albumId: Int): LiveData<List<Photo>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertPhotos(albums: List<Photo>)

    @Query("DELETE FROM PHOTO_TABLE")
    suspend fun deleteAllPhotos()

}