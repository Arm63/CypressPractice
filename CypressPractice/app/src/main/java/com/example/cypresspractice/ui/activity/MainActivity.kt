package com.example.cypresspractice.ui.activity

import android.os.Bundle
import android.os.Handler
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.example.cypresspractice.R
import com.example.cypresspractice.ui.album.AlbumListFragment
import com.example.cypresspractice.ui.fragment.BaseFragment
import com.example.cypresspractice.ui.user.UserListFragment
import com.google.android.material.navigation.NavigationView


class MainActivity : BaseActivity(), NavigationView.OnNavigationItemSelectedListener,
    SwipeRefreshLayout.OnRefreshListener {

    private lateinit var mDrawerLayout: DrawerLayout
    private lateinit var mNavigationView: NavigationView
    private lateinit var mSwipeRefreshLayout: SwipeRefreshLayout


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        findViews()
        setListeners()
        initDrawer()

        openScreen(
            UserListFragment.newInstance(),
            R.id.nav_users,
            false
        )


    }


    override fun getLayoutResource(): Int = R.layout.activity_main

    private fun findViews() {
        mDrawerLayout = findViewById<View>(R.id.dl_main) as DrawerLayout
        mNavigationView = findViewById<View>(R.id.nav_main) as NavigationView
    }

    private fun setListeners() {
        mNavigationView.setNavigationItemSelectedListener(this)
    }

    override fun onBackPressed() {
        if (mDrawerLayout.isDrawerOpen(GravityCompat.START)) {
            mDrawerLayout.closeDrawer(GravityCompat.START)
        } else {
            val fragment = supportFragmentManager.findFragmentById(R.id.fl_main_container)
            if (!(fragment as BaseFragment?)?.onBackPressed()!!) {
                openScreen(
                    UserListFragment.newInstance(),
                    R.id.nav_users,
                    false
                )
            }
        }

    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {

            R.id.nav_users -> {
                openScreen(
                    UserListFragment.newInstance(),
                    R.id.nav_users,
                    false
                )
            }

            R.id.nav_contacts -> {
                openScreen(
                    AlbumListFragment.newInstance(),
                    R.id.nav_contacts,
                    true
                )
            }

            R.id.nav_page_2 -> {


            }
            R.id.nav_logout -> {


            }
        }
        mDrawerLayout.closeDrawer(GravityCompat.START)
        return true
    }


    private fun initDrawer() {
        val actionBarDrawerToggle = ActionBarDrawerToggle(
            this,
            mDrawerLayout,
            mToolbar,
            R.string.msg_navigation_drawer_open,
            R.string.msg_navigation_drawer_close
        )
        mDrawerLayout.addDrawerListener(actionBarDrawerToggle)
        actionBarDrawerToggle.syncState()
    }

    override fun onRefresh() {
        Toast.makeText(this, "Refresh", Toast.LENGTH_SHORT).show()
        Handler().postDelayed({ mSwipeRefreshLayout!!.isRefreshing = false }, 2000)
    }

}