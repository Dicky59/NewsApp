package com.dicky.newsapp.sources.di

import com.dicky.newsapp.sources.presentation.SourcesViewModel
import com.dicky.newsapp.sources.application.SourcesUseCase
import com.dicky.newsapp.sources.data.SourcesDataSource
import com.dicky.newsapp.sources.data.SourcesRepository
import com.dicky.newsapp.sources.data.SourcesService
import org.koin.dsl.module

val sourcesModule = module {

    single<SourcesService> { SourcesService(get()) }
    single<SourcesUseCase> { SourcesUseCase(get()) }
    single<SourcesDataSource> { SourcesDataSource(get()) }
    single<SourcesRepository> { SourcesRepository(get(), get()) }
    single<SourcesViewModel> { SourcesViewModel(get()) }
}