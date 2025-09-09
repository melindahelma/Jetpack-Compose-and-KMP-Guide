package com.boltuix.jetpackcomposedev

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.ripple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.hapticfeedback.HapticFeedback
import androidx.compose.ui.hapticfeedback.HapticFeedbackType
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalHapticFeedback
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import jetpackcomposedev.composeapp.generated.resources.Res
import jetpackcomposedev.composeapp.generated.resources.placeholder
import org.jetbrains.compose.resources.painterResource

@Composable
fun GridItemCard(item: GridItem, fraction: Float) {
    val haptic: HapticFeedback = LocalHapticFeedback.current

    // 🎯 Condition check
    val isComposeDev = item.title.contains("Jetpack Compose Dev", ignoreCase = true)

    // 🎨 Dynamic colors
    val backgroundColor = if (isComposeDev) Color(0xFF58499E) else MaterialTheme.colorScheme.surface
    val imageColor = if (isComposeDev) Color(0xFF58499E) else Color(0xFFfdfcfd)
    val textColor = if (isComposeDev) Color.White else MaterialTheme.colorScheme.onSurface

    Card(
        modifier = Modifier
            .fillMaxWidth(fraction)
            .clip(CubicBezierCardShape())
            .clickable(
                interactionSource = remember { MutableInteractionSource() },
                indication = ripple(bounded = true),
                onClick = {
                    haptic.performHapticFeedback(HapticFeedbackType.LongPress)
                    openUri(item.url)
                }
            )
            .shadow(
                elevation = 12.dp,
                shape = CubicBezierCardShape(),
                ambientColor = Color(0xFFE1BEE7),
                spotColor = Color(0xFFAB47BC)
            ),
        shape = CubicBezierCardShape(),
        colors = CardDefaults.cardColors(containerColor = backgroundColor),
        elevation = CardDefaults.cardElevation(defaultElevation = 0.dp)
    ) {
        Column(
            horizontalAlignment = Alignment.Start,
            modifier = Modifier
                .fillMaxWidth()
                .padding(all = 4.dp)
        ) {
            if (item.imageUrl != null) {
                Image(
                    painter = painterResource(item.imageUrl!!),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(imageColor)
                        .height(250.dp),
                    contentScale = ContentScale.Inside
                )
            }
            Text(
                item.title,
                style = MaterialTheme.typography.titleSmall.copy(color = textColor),
                modifier = Modifier.padding(top = 16.dp, start = 16.dp, end = 16.dp)
            )
            Spacer(Modifier.height(4.dp))
            Text(
                item.desc,
                style = MaterialTheme.typography.bodySmall.copy(
                    letterSpacing = 1.0.sp,
                    color = textColor
                ),
                modifier = Modifier.padding(horizontal = 16.dp)
            )
            Spacer(Modifier.height(30.dp))
        }
    }
}
