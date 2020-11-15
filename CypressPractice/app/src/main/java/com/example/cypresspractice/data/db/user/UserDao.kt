package com.example.cypresspractice.data.db.user

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.cypresspractice.data.model.User

@Dao
interface UserDao {

    @Query("SELECT * FROM USER_TABLE")
    fun getAllData(): LiveData<List<User>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertUsers(users: List<User>)

    @Query("DELETE FROM USER_TABLE")
    suspend fun deleteAll()


}