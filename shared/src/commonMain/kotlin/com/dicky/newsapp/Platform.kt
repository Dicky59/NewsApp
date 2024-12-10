package com.dicky.newsapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform