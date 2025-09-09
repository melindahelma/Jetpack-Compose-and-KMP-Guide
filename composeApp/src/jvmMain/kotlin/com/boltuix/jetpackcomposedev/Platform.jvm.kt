package com.boltuix.jetpackcomposedev

import java.awt.Desktop
import java.net.URI

class JVMPlatform: Platform {
    override val name: String = "Java ${System.getProperty("java.version")}"
}

actual fun getPlatform(): Platform = JVMPlatform()

actual fun openUri(uri: String) {
    Desktop.getDesktop().browse(URI(uri))
}

