package com.boltuix.jetpackcomposedev

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Typography
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import jetpackcomposedev.composeapp.generated.resources.Res
import jetpackcomposedev.composeapp.generated.resources.quicksand_bold
import jetpackcomposedev.composeapp.generated.resources.quicksand_medium
import jetpackcomposedev.composeapp.generated.resources.quicksand_regular
import jetpackcomposedev.composeapp.generated.resources.quicksand_semi_bold
import org.jetbrains.compose.resources.Font
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun quicksandFontFamily() = FontFamily(
    Font(Res.font.quicksand_regular, weight = FontWeight.Light),
    Font(Res.font.quicksand_regular, weight = FontWeight.Normal),
    Font(Res.font.quicksand_medium, weight = FontWeight.Medium),
    Font(Res.font.quicksand_semi_bold, weight = FontWeight.SemiBold),
    Font(Res.font.quicksand_bold, weight = FontWeight.Bold)
)

@Composable
fun customTypography(fontFamily: FontFamily) = Typography(
    headlineLarge = MaterialTheme.typography.headlineLarge.copy(
        fontFamily = fontFamily,
        fontSize = 32.sp,
        letterSpacing = 0.5.sp
    ),
    titleMedium = MaterialTheme.typography.titleMedium.copy(
        fontFamily = fontFamily,
        fontSize = 20.sp,
        letterSpacing = 0.25.sp
    ),
    titleSmall = MaterialTheme.typography.titleSmall.copy(
        fontFamily = fontFamily,
        fontSize = 18.sp,
        letterSpacing = 0.15.sp
    ),
    bodySmall = MaterialTheme.typography.bodySmall.copy(
        fontFamily = fontFamily,
        fontSize = 14.sp,
        letterSpacing = 0.1.sp
    )
)

@Composable
@Preview
fun App() {
    val quicksand = quicksandFontFamily()
    MaterialTheme(
        colorScheme = if (isSystemInDarkTheme()) darkColorScheme() else lightColorScheme(),
        typography = customTypography(quicksand)
    ) {
        ResponsiveGridScreen()
    }
}
