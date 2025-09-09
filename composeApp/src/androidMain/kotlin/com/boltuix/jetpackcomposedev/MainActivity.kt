package com.boltuix.jetpackcomposedev

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.view.WindowCompat

class MainActivity : ComponentActivity() {
    private lateinit var updateHelper: InAppUpdateHelper


    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)

        updateHelper = InAppUpdateHelper(this)
        // Check for update immediately when app starts
        updateHelper.checkForUpdate(immediate = true)

        WindowCompat.setDecorFitsSystemWindows(window, false)  // Edge-to-edge
        // window.statusBarColor = androidx.compose.ui.graphics.Color.Transparent.toArgb()  // Transparent
        window.statusBarColor = androidx.compose.ui.graphics.Color(0xFFEADDFF).toArgb()

        setContent {
            App()
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: android.content.Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        updateHelper.handleActivityResult(requestCode, resultCode, data)
    }

}

@Preview
@Composable
fun AppAndroidPreview() {
    App()
}