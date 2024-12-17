package com.dicky.newsapp.sources.presentation

import com.dicky.newsapp.sources.application.Source

data class SourcesState (
    val sources: List<Source>,
    val loading: Boolean = false,
    val error: String? = null
)
