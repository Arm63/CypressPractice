package com.example.cypresspractice.ui.user

import com.example.cypresspractice.data.repositores.user.UserDataRepository
import com.example.cypresspractice.data.repositores.user.UserLocalDataSource
import com.example.cypresspractice.data.repositores.user.UserRemoteDataSource
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

object UserModule {
    val userModule = module {
        single { UserLocalDataSource(get()) }
        single { UserRemoteDataSource(get()) }
        single { UserDataRepository(get(), get()) }
        viewModel { UserViewModel(get()) }
    }

}