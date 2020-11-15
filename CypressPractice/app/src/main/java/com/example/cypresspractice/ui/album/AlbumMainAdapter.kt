package com.example.cypresspractice.ui.album

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.cypresspractice.R
import com.example.cypresspractice.data.model.Album
import com.example.cypresspractice.data.model.Photo
import kotlinx.android.synthetic.main.item_main_album.view.*

class AlbumMainAdapter : RecyclerView.Adapter<AlbumMainAdapter.AlbumMainHolder>() {

    private var albumList = emptyList<Album>()
    private var photoList = emptyList<Photo>()
    private val viewPool = RecyclerView.RecycledViewPool()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlbumMainHolder =
        AlbumMainHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_main_album, parent, false)
        )

    override fun onBindViewHolder(holder: AlbumMainHolder, position: Int) {
        holder.bind(albumList[position])
    }

    override fun getItemCount(): Int = albumList.size


    //----------------------------------------------------------------------------------------------
    inner class AlbumMainHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(item: Album) {
            itemView.tv_album_title.text = item.title
            itemView.rv_sub_album.apply {
                setHasFixedSize(true)
                layoutManager = LinearLayoutManager(itemView.rv_sub_album.context,LinearLayoutManager.HORIZONTAL,false)
                adapter = AlbumSubAdapter(photoList)
            }
        }
    }

    fun setData(newList: List<Album>) {
        albumList = newList
        notifyDataSetChanged()
    }
    fun setPhotoData(newList: List<Photo>) {
        photoList = newList
        notifyDataSetChanged()
    }

}