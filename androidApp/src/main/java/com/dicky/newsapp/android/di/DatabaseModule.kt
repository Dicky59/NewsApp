package com.dicky.newsapp.android.di

import app.cash.sqldelight.db.SqlDriver
import com.dicky.newsapp.db.DatabaseDriverFactory
import dicky.newsapp.db.NewsAppDatabase
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val databaseModule = module {

    single<SqlDriver> { DatabaseDriverFactory(androidContext()).createDriver() }

    single<NewsAppDatabase> { NewsAppDatabase(get()) }
}