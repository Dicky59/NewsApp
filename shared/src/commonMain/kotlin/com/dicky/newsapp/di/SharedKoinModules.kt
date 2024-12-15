package com.dicky.newsapp.di

import com.dicky.newsapp.articles.di.articlesModule

val sharedKoinModules = listOf(
    articlesModule,
    networkModule
)