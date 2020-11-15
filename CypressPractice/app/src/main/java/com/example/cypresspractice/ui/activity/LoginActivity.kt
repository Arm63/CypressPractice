package com.example.cypresspractice.ui.activity

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import com.example.cypresspractice.R
import com.example.cypresspractice.util.Constant.INVALID_DATA
import com.example.cypresspractice.util.Constant.LOGGED
import com.example.cypresspractice.util.Constant.LOGGED_IN
import com.example.cypresspractice.util.isValidEmail
import com.example.cypresspractice.util.isValidPassword
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : BaseActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (isLogged()) {
            val mainActivity = Intent(applicationContext, MainActivity::class.java)
            startActivity(mainActivity)
            finish()
        }
        init()
        setListeners()

    }


    private fun init() {
        cl_form.elevation = 6f
    }

    private fun setListeners() {
        btn_login.setOnClickListener {
            if (isValidEmail(
                    et_email.text.toString().trim()
                ) && isValidPassword(et_password.text.toString().trim())
            ) {
                userLogged()
                startActivity(Intent(this, MainActivity::class.java))
                finish()

            } else {
                Toast.makeText(applicationContext, INVALID_DATA, Toast.LENGTH_SHORT).show()
            }
        }

    }

    override fun getLayoutResource(): Int = R.layout.activity_login


    private fun userLogged() {
        val pref = getSharedPreferences(LOGGED, MODE_PRIVATE)
        val editor = pref.edit()
        editor.putBoolean(LOGGED_IN, true)
        editor.apply()
    }

    private fun isLogged(): Boolean {
        val pref = getSharedPreferences(LOGGED, MODE_PRIVATE)
        return pref.getBoolean(LOGGED_IN, false)
    }


}






