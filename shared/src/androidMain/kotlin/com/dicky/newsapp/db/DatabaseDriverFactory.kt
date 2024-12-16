package com.dicky.newsapp.db

import android.content.Context
import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.driver.android.AndroidSqliteDriver
import dicky.newsapp.db.NewsAppDatabase

actual class DatabaseDriverFactory(private val context: Context) {

    actual fun createDriver(): SqlDriver =
        AndroidSqliteDriver(
            schema = NewsAppDatabase.Schema,
            context = context,
            name = "NewsApp.Database.db"
        )
}