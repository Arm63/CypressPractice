package com.example.cypresspractice.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.cypresspractice.util.Constant.PHOTO_TABLE
import com.google.gson.annotations.SerializedName

@Entity(tableName = PHOTO_TABLE)
data class Photo(

	@field:SerializedName("albumId")
	val albumId: Int,

	@PrimaryKey
	@field:SerializedName("id")
	val id: Int,

	@field:SerializedName("title")
	val title: String,

	@field:SerializedName("url")
	val url: String,

	@field:SerializedName("thumbnailUrl")
	val thumbnailUrl: String
)
