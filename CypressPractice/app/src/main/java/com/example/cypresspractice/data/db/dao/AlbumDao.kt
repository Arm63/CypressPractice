package com.example.cypresspractice.data.db.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.cypresspractice.data.model.Album

@Dao
interface AlbumDao {

    @Query("SELECT * FROM ALBUM_TABLE where userId = :id")
    fun getAlbumsById(id: Int): LiveData<List<Album>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAlbums(albums: List<Album>)

    @Query("DELETE FROM ALBUM_TABLE")
    suspend fun deleteAllAlbums()


}