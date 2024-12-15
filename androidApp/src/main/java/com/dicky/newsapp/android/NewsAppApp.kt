package com.dicky.newsapp.android

import android.app.Application
import com.dicky.newsapp.android.di.viewModelsModule
import com.dicky.newsapp.di.sharedKoinModules
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class NewsAppApp: Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin()
    }

    private fun initKoin() {
        val modules = sharedKoinModules + viewModelsModule

        startKoin {
            androidContext(this@NewsAppApp)
            modules(modules)
        }
    }
}