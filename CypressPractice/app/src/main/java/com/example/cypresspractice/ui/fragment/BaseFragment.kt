package com.example.cypresspractice.ui.fragment

import com.example.cypresspractice.ui.activity.BaseActivity
import android.os.Bundle
import androidx.fragment.app.Fragment

abstract class BaseFragment : Fragment() {
    // ===========================================================
    // Constants
    // ===========================================================
    // ===========================================================
    // Fields
    // ===========================================================
    // ===========================================================
    // Constructors
    // ===========================================================
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    // ===========================================================
    // Getter & Setter
    // ===========================================================
    // ===========================================================
    // Methods for/from SuperClass
    // ===========================================================
    // ===========================================================
    // Listeners, methods for/from Interfaces
    // ===========================================================
    // ===========================================================
    // Methods
    // ===========================================================

    protected fun showActionBarIcon() {
        (activity as BaseActivity).showActionBarIcon()
    }

    protected fun setActionBarIcon() {
        (activity as BaseActivity).hideActionBarIcon()
    }

    open fun setActionBarTitle(actionBarTitle: String?) {
        (activity as BaseActivity).setActionBarTitle(actionBarTitle)
    }

    open fun onBackPressed(): Boolean {
        return false
    }


    override fun onDestroyView() {
        super.onDestroyView()
    }
}