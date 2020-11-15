package com.example.cypresspractice.ui.activity

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.View
import androidx.annotation.RequiresApi
import androidx.core.view.isVisible
import com.example.cypresspractice.R
import com.example.cypresspractice.data.model.ScreenItem
import com.example.cypresspractice.ui.adapter.IntroViewPagerAdapter
import com.example.cypresspractice.util.Constant
import com.example.cypresspractice.util.Constant.PASSED
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_intro.*


class IntroActivity : BaseActivity() {


    private var introViewPagerAdapter: IntroViewPagerAdapter? = null

    private val listScreen = arrayListOf<ScreenItem>()

    @RequiresApi(Build.VERSION_CODES.R)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (isIntroPassed()) {
            val mainActivity = Intent(applicationContext, LoginActivity::class.java)
            startActivity(mainActivity)
            finish()
        }
        loadData()
        init()
        setListeners()

    }

    override fun getLayoutResource(): Int = R.layout.activity_intro

    private fun setListeners() {
        tab_indicator!!.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                vp_screen!!.currentItem = tab.position
                if (tab.position == listScreen.size - 1)
                    loadLastScreen()
            }

            override fun onTabUnselected(tab: TabLayout.Tab) {}
            override fun onTabReselected(tab: TabLayout.Tab) {}
        })


        btn_getStarted.setOnClickListener {
            if (!ll_toast.isVisible) {

                ll_toast.visibility = View.VISIBLE
                ll_toast.animate()
                    .alpha(0.0f).duration = 1500
            }
            introScreenPassed()
            startActivity(Intent(this, LoginActivity::class.java))
            finish()

        }


        tv_skip.setOnClickListener {
            introScreenPassed()
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }
    }

    private fun loadData() {
        listScreen.add(ScreenItem("Food", "Description food", R.drawable.img1))
        listScreen.add(ScreenItem("Delivery", "Description Delivery", R.drawable.img2))
        listScreen.add(ScreenItem("Payment", "Description Payment", R.drawable.img3))
    }

    private fun init() {
        introViewPagerAdapter = IntroViewPagerAdapter(this, listScreen)
        vp_screen.adapter = introViewPagerAdapter
        tab_indicator?.setupWithViewPager(vp_screen)
    }

    private fun introScreenPassed() {
        val pref = getSharedPreferences(PASSED, MODE_PRIVATE)
        val editor = pref.edit()
        editor.putBoolean(Constant.GET_STARTED, true)
        editor.apply()
    }

    private fun isIntroPassed(): Boolean {
        val pref = getSharedPreferences(PASSED, MODE_PRIVATE)
        return pref.getBoolean(Constant.GET_STARTED, false)
    }

    private fun loadLastScreen() {
        tv_skip.visibility = View.GONE
        tab_indicator!!.visibility = View.INVISIBLE
        if (!btn_getStarted.isVisible) {
            btn_getStarted.visibility = View.VISIBLE
        }
    }
}