package com.example.cypresspractice.ui.user

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cypresspractice.R
import com.example.cypresspractice.data.model.User
import kotlinx.android.synthetic.main.item_user.view.*

class UserAdapter(
    var onItemClickListener: OnItemClickListener
) : RecyclerView.Adapter<UserAdapter.UserHolder>() {

    private var userList = emptyList<User>()

    inner class UserHolder(
        itemView: View,
        private var onItemClickListener: OnItemClickListener
    ) : RecyclerView.ViewHolder(itemView) {
        fun bind(item: User) {
            itemView.tv_username.text = item.username
            itemView.tv_email.text = item.email

            itemView.tv_username.setOnClickListener {
                onItemClickListener.onItemClick(userList[adapterPosition], adapterPosition)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserHolder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_user, parent, false)
        return UserHolder(view, onItemClickListener)
    }


    override fun onBindViewHolder(holder: UserHolder, position: Int) {
        holder.bind(userList[position])
    }

    override fun getItemCount(): Int = userList.size

    fun setData(newList: List<User>) {
        userList = newList
        notifyDataSetChanged()
    }

    interface OnItemClickListener {
        fun onItemClick(item: User, position: Int)

    }

}