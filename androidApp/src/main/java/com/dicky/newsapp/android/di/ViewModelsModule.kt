package com.dicky.newsapp.android.di

import com.dicky.newsapp.articles.presentation.ArticlesViewModel
import org.koin.core.module.dsl.viewModel

import org.koin.dsl.module

val viewModelsModule = module {

    viewModel { ArticlesViewModel(get()) }
}