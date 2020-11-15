package com.example.cypresspractice.ui.activity
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import com.example.cypresspractice.R
import com.example.cypresspractice.util.FragmentTransactionManager
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.include_toolbar.*

abstract class BaseActivity : AppCompatActivity() {


    private val LOG_TAG = BaseActivity::class.java.simpleName

    var mToolbar: Toolbar? = null
    private var mTabLayout: TabLayout? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutResource())
        findViews()

        if (mToolbar != null) {
            setSupportActionBar(mToolbar)
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
            supportActionBar?.setHomeButtonEnabled(true)
            supportActionBar?.setDisplayShowTitleEnabled(false)
        }
    }


    private fun findViews() {
        mTabLayout = findViewById(R.id.ctl)
        mToolbar = findViewById(R.id.tb)
    }

    protected abstract fun getLayoutResource(): Int

    open fun setActionBarTitle(title: String?) {
        tv_toolbar_title.text = title
    }

    open fun hideActionBarIcon() {
        supportActionBar!!.setDisplayHomeAsUpEnabled(false)
    }

    open fun showActionBarIcon() {
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
    }

    fun openScreen(fragment: Fragment, item: Int, addToBackStack: Boolean) {
        FragmentTransactionManager.displayFragment(
            supportFragmentManager,
            fragment,
            R.id.fl_main_container,
            addToBackStack
        )
    }

}