package com.dicky.newsapp.di

import app.cash.sqldelight.db.SqlDriver
import com.dicky.newsapp.db.DatabaseDriverFactory
import dicky.newsapp.db.NewsAppDatabase
import org.koin.dsl.module

val databaseModule = module {

    single<SqlDriver> { DatabaseDriverFactory().createDriver() }

    single<NewsAppDatabase> { NewsAppDatabase(get()) }
}