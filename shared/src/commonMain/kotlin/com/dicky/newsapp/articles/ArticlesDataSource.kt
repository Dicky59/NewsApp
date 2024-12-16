package com.dicky.newsapp.articles

import dicky.newsapp.db.NewsAppDatabase

class ArticlesDataSource(private val database: NewsAppDatabase) {

    fun getAllArticles(): List<ArticleRaw> =
        database.newsAppDatabaseQueries.selectAllArticles(::mapToArticleRaw).executeAsList()

    fun insertArticles(articles: List<ArticleRaw>) {
        database.newsAppDatabaseQueries.transaction {
            articles.forEach { articleRaw ->
                insertArticle(articleRaw)
            }
        }
    }

    fun clearArticles() =
        database.newsAppDatabaseQueries.removeAllArticles()

    private fun insertArticle(articleRaw: ArticleRaw) {
        database.newsAppDatabaseQueries.insertArticle(
            articleRaw.title,
            articleRaw.desc,
            articleRaw.date,
            articleRaw.imageUrl
        )
    }

    private fun mapToArticleRaw(
        title: String,
        desc: String?,
        date: String,
        url: String?
    ): ArticleRaw =
        ArticleRaw(
            title,
            desc,
            date,
            url
        )
}