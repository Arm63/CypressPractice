package com.example.cypresspractice.ui.user

import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.fragment.app.setFragmentResult
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cypresspractice.R
import com.example.cypresspractice.data.model.User
import com.example.cypresspractice.resource.Status
import com.example.cypresspractice.ui.activity.MainActivity
import com.example.cypresspractice.ui.album.AlbumListFragment
import com.example.cypresspractice.ui.fragment.BaseFragment
import kotlinx.android.synthetic.main.fragment_user_list.view.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class UserListFragment : BaseFragment(), UserAdapter.OnItemClickListener{

    val mViewModelUsers by viewModel<UserViewModel>()
    var userAdapter: UserAdapter? = null


    companion object {
        fun newInstance(): UserListFragment = UserListFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_user_list, container, false)

        setActionBarTitle("Users")
        init(view)
        setListeners()
        observeData()

        view.srl_fragment_userlist.setOnRefreshListener {
            doYourUpdate(view)
        }

        return view
    }

    private fun doYourUpdate(view: View) {
        val handler = Handler()
        handler.postDelayed({
            if ( view.srl_fragment_userlist.isRefreshing) {
                view.srl_fragment_userlist.isRefreshing = false
            }
        }, 2000)

    }
    private fun init(view: View) {
        userAdapter = UserAdapter(this)

        view.rv_fragment_userlist.apply {
            setHasFixedSize(true)
            addItemDecoration(DividerItemDecoration(this.context, DividerItemDecoration.VERTICAL))
            layoutManager = LinearLayoutManager(activity)
            adapter = userAdapter
        }
    }

    private fun setListeners() {

    }


    private fun observeData() {

        mViewModelUsers.users.observe(viewLifecycleOwner, {
            it?.let { usersList ->
                userAdapter?.setData(usersList)
            }
        })

        mViewModelUsers.usersResource.observe(viewLifecycleOwner, {
            when (it.status) {
                Status.LOADING -> {

                }

                Status.ERROR -> {
                    Toast.makeText(activity, "Error", Toast.LENGTH_SHORT).show()
                }

                Status.SUCCESS -> {
                    it.data?.let { userList ->
                        mViewModelUsers.insertAll(userList)
                    }
                }
            }
        })

    }

    override fun onItemClick(item: User, position: Int) {
        val result = item.id
        setFragmentResult("requestKey", bundleOf("requestKey" to result.toString()))
        (activity as MainActivity).openScreen(
            AlbumListFragment.newInstance(),
            R.id.nav_users,
            true
        )
    }

}
