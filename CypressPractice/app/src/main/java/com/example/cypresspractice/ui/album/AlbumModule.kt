package com.example.cypresspractice.ui.album

import com.example.cypresspractice.data.repositores.album.AlbumDataRepository
import com.example.cypresspractice.data.repositores.album.AlbumLocalDataSource
import com.example.cypresspractice.data.repositores.album.AlbumRemoteDataSource
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module


val albumModule = module {
    single{ AlbumLocalDataSource(get(),get()) }
    single { AlbumRemoteDataSource(get()) }
    single { AlbumDataRepository(get(), get()) }
    viewModel { AlbumViewModel(get()) }
}
