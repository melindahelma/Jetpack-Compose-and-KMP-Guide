package com.boltuix.jetpackcomposedev

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Jetpack Compose and KMP Guide",
    ) {
        App()
    }
}