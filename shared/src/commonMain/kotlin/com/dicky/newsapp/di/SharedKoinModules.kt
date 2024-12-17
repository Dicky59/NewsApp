package com.dicky.newsapp.di

import com.dicky.newsapp.articles.di.articlesModule
import com.dicky.newsapp.sources.di.sourcesModule

val sharedKoinModules = listOf(
    articlesModule,
    sourcesModule,
    networkModule
)