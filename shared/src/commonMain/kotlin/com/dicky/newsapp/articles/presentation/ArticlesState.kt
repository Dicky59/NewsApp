package com.dicky.newsapp.articles.presentation

import com.dicky.newsapp.articles.application.Article

data class ArticlesState (
    val articles: List<Article> = listOf(),
    val loading: Boolean = false,
    val error: String? = null
)