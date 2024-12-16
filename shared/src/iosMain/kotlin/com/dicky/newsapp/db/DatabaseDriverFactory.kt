package com.dicky.newsapp.db

import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.driver.native.NativeSqliteDriver
import dicky.newsapp.db.NewsAppDatabase

actual class DatabaseDriverFactory() {

    actual fun createDriver(): SqlDriver =
        NativeSqliteDriver(
            schema = NewsAppDatabase.Schema,
            name = "NewsAppDatabase.db"
        )
}