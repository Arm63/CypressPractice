package com.example.cypresspractice.ui.album

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.setFragmentResultListener
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cypresspractice.R
import com.example.cypresspractice.resource.Status
import com.example.cypresspractice.ui.fragment.BaseFragment
import kotlinx.android.synthetic.main.fragment_album_list.view.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class AlbumListFragment : BaseFragment() {

    companion object {
        fun newInstance(): AlbumListFragment = AlbumListFragment()
    }

    val mViewModelAlbum by viewModel<AlbumViewModel>()
    var albumAdapter: AlbumMainAdapter? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_album_list, container, false)
        setActionBarTitle("Albums")

        setFragmentResultListener("requestKey") { key, bundle ->
            val result = bundle.getString("requestKey")?.toInt()!!
            Toast.makeText(context, result.toString(), Toast.LENGTH_SHORT).show()
            init(view)
            setListeners()
            observeData(result)
        }

        return view
    }

    private fun init(view: View) {
        view.rv_fragment_albumlist.apply {
            setHasFixedSize(true)
            addItemDecoration(DividerItemDecoration(this.context, DividerItemDecoration.VERTICAL))
            albumAdapter = AlbumMainAdapter()
            layoutManager = LinearLayoutManager(activity)
            adapter = albumAdapter
        }
    }

    private fun setListeners() {

    }

    private fun observeData(result: Int) {
        mViewModelAlbum.albumsResource.observe(viewLifecycleOwner, {
            when (it.status) {
                Status.LOADING -> {
                }

                Status.ERROR -> {
                    Toast.makeText(activity, "Error", Toast.LENGTH_SHORT).show()
                }
                Status.SUCCESS -> {
                    it.data?.let { photoList ->
                        mViewModelAlbum.insertAllAlbums(photoList)
                    }
                }
            }
        })
        mViewModelAlbum.repository.getAlbumsData(result).observe(viewLifecycleOwner, {
            it?.let { albumList ->
                albumAdapter?.setData(albumList)
            }
        })

//
        mViewModelAlbum.photosResource.observe(viewLifecycleOwner, {
            when (it.status) {
                Status.LOADING -> {
                }

                Status.ERROR -> {
                    Toast.makeText(activity, "Error", Toast.LENGTH_SHORT).show()
                }

                Status.SUCCESS -> {
                    it.data?.let { photoList ->
                        mViewModelAlbum.insertAllPhotos(photoList)
                    }
                }
            }
        })

        mViewModelAlbum.repository.getPhotosById(result).observe(viewLifecycleOwner, {
            it?.let { photoList ->
                albumAdapter?.setPhotoData(photoList)
            }
        })

    }
}