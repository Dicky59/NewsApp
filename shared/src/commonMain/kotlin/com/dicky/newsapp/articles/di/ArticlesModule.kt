package com.dicky.newsapp.articles.di

import com.dicky.newsapp.articles.ArticlesService
import com.dicky.newsapp.articles.ArticlesUseCase
import com.dicky.newsapp.articles.ArticlesViewModel
import org.koin.dsl.module

val articlesModule = module {

    single<ArticlesService> { ArticlesService(get()) }
    single<ArticlesUseCase> { ArticlesUseCase(get()) }
    single<ArticlesViewModel> { ArticlesViewModel(get()) }
}