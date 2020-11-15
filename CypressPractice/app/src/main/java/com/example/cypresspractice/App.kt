package com.example.cypresspractice

import android.app.Application
import com.example.cypresspractice.data.api.createApiModule
import com.example.cypresspractice.data.db.user.dbUserModule
import com.example.cypresspractice.ui.album.albumModule
import com.example.cypresspractice.ui.user.UserModule.userModule
import com.example.cypresspractice.util.Constant.BASE_URL
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@App)
            modules(
                listOf(
                    createApiModule(BASE_URL),
                    dbUserModule,
                    albumModule,
                    userModule

                )
            )
        }
    }
}