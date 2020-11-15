package com.example.cypresspractice.util

import android.text.TextUtils
import android.util.Patterns
import com.example.cypresspractice.util.Constant
import java.util.regex.Pattern

fun isValidEmail(email: String): Boolean {
    return !TextUtils.isEmpty(email) && Patterns.EMAIL_ADDRESS.matcher(email).matches()
}

fun isValidPassword(password: String): Boolean {
    return Pattern.compile(Constant.REGEX_SYMBOLS).matcher(password).matches()
}

