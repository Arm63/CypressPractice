package com.example.cypresspractice.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.cypresspractice.util.Constant.USER_TABLE
import com.google.gson.annotations.SerializedName

@Entity(tableName = USER_TABLE)
data class User(

    @PrimaryKey
    @field:SerializedName("id")
    val id: Int,

    @SerializedName("username")
    var username: String,

    @SerializedName("email")
    var email: String
)
