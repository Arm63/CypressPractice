package com.example.cypresspractice.ui.album

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.cypresspractice.R
import com.example.cypresspractice.data.model.Photo
import kotlinx.android.synthetic.main.item_sub_album.view.*

class AlbumSubAdapter(
    var photoList: List<Photo>
) : RecyclerView.Adapter<AlbumSubAdapter.AlbumSubHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlbumSubHolder =
        AlbumSubHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_sub_album, parent, false)
        )

    override fun onBindViewHolder(holder: AlbumSubHolder, position: Int) {
        holder.bind(photoList[position])

    }

    override fun getItemCount(): Int = photoList.size

    inner class AlbumSubHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val requestOption = RequestOptions()
            .placeholder(R.drawable.ic_image_bg)

        fun bind(photo: Photo) {
            Glide.with(itemView.context)
                .applyDefaultRequestOptions(requestOption)
                .load(photo.thumbnailUrl)
                .into(itemView.iv_sub_item)
        }
    }
}