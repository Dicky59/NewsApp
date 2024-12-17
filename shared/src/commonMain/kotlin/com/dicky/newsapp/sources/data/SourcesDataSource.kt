package com.dicky.newsapp.sources.data

import dicky.newsapp.db.NewsAppDatabase

class SourcesDataSource(private val db: NewsAppDatabase) {

    fun getAllSources(): List<SourceRaw> =
        db.newsAppDatabaseQueries.selectAllSources(::mapSource).executeAsList()

    fun clearSources() =
        db.newsAppDatabaseQueries.removeAllSources()

    private fun mapSource(
        id: String,
        name: String,
        desc: String,
        language: String,
        country: String
    ): SourceRaw {
        return SourceRaw(
            id,
            name,
            desc,
            language,
            country
        )
    }

    internal fun createSources(sources: List<SourceRaw>) {
        db.newsAppDatabaseQueries.transaction {
            sources.forEach { source ->
                insertSource(source)
            }
        }
    }

    private fun insertSource(source: SourceRaw) {
        db.newsAppDatabaseQueries.insertSource(
            source.id,
            source.name,
            source.desc,
            source.language,
            source.country,
        )
    }
}