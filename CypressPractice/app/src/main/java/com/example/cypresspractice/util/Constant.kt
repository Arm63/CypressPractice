package com.example.cypresspractice.util

object Constant {
    //API
    const val BASE_URL = "https://jsonplaceholder.typicode.com/"

    //Database
    const val USER_DATABASE = "USER_DATABASE"
    const val USER_TABLE = "USER_TABLE"

    const val PHOTO_DATABASE = "PHOTO_DATABASE"
    const val PHOTO_TABLE = "PHOTO_TABLE"

    const val ALBUM_DATABASE = "ALBUM_DATABASE"
    const val ALBUM_TABLE = "ALBUM_TABLE"


    const val SHOW = 0x00000081
    const val HIDE = 0x00000001
    const val SPECIAL_CHARACTERS = "-@%\\[\\}+'!/#$^?:;,\\(\"\\)~`.*=&\\{>\\]<_"
    const val REGEX_SYMBOLS =
        "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[$SPECIAL_CHARACTERS])(?=\\S+$).{8,30}$"

    //Prefs
    const val LOGGED_IN = "Logged in"
    const val GET_STARTED = "Logged Get started"
    const val PASSED = "Passed"
    const val LOGGED = "Logged"

    //Msg
    const val INVALID_DATA = "Invalid data"

    //Extra
    const val USER_ID = "USER_ID"

}