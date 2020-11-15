package com.example.cypresspractice.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter
import com.example.cypresspractice.R
import com.example.cypresspractice.data.model.ScreenItem
import kotlinx.android.synthetic.main.layout_screen.view.*

class IntroViewPagerAdapter(var context: Context, var screenList: ArrayList<ScreenItem>) :
    PagerAdapter() {

    override fun getCount(): Int = screenList.size

    override fun isViewFromObject(view: View, `object`: Any): Boolean = view == `object`

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val layoutScreen = inflater.inflate(R.layout.layout_screen, null)


        layoutScreen.tv_title.text = screenList[position].title
        layoutScreen.tv_description.text = screenList[position].description
        layoutScreen.img_screen.setImageResource(screenList[position].screenImageView)
        container.addView(layoutScreen)

        return layoutScreen
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View?)
    }
}