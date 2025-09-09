package com.boltuix.jetpackcomposedev

class WasmPlatform: Platform {
    override val name: String = "Web with Kotlin/Wasm"
}

actual fun getPlatform(): Platform = WasmPlatform()

actual fun openUri(uri: String) {
    js("window.open(uri, '_blank')")
}