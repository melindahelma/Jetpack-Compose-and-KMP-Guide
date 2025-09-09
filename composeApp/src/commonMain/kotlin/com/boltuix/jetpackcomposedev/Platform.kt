package com.boltuix.jetpackcomposedev

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform

expect fun openUri(uri: String)
