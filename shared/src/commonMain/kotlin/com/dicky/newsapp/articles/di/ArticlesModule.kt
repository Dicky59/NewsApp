package com.dicky.newsapp.articles.di

import com.dicky.newsapp.articles.data.ArticlesDataSource
import com.dicky.newsapp.articles.data.ArticlesRepository
import com.dicky.newsapp.articles.data.ArticlesService
import com.dicky.newsapp.articles.application.ArticlesUseCase
import com.dicky.newsapp.articles.presentation.ArticlesViewModel
import org.koin.dsl.module

val articlesModule = module {

    single<ArticlesService> { ArticlesService(get()) }
    single<ArticlesUseCase> { ArticlesUseCase(get()) }
    single<ArticlesViewModel> { ArticlesViewModel(get()) }
    single<ArticlesDataSource> { ArticlesDataSource(get()) }
    single<ArticlesRepository> { ArticlesRepository(get(), get()) }
}