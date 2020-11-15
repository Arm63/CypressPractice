package com.example.cypresspractice.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.cypresspractice.util.Constant
import com.google.gson.annotations.SerializedName

@Entity(tableName = Constant.ALBUM_TABLE)
data class Album(


	@PrimaryKey
	@field:SerializedName("id")
	val id: Int,

	@field:SerializedName("title")
	val title: String,

	@field:SerializedName("userId")
	val userId: Int
)
