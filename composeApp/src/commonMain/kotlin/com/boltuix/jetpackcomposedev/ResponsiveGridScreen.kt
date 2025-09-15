package com.boltuix.jetpackcomposedev

import androidx.compose.animation.core.Easing
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridItemSpan
import androidx.compose.foundation.lazy.staggeredgrid.items
import androidx.compose.foundation.lazy.staggeredgrid.rememberLazyStaggeredGridState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.Chat
import androidx.compose.material.icons.automirrored.rounded.LibraryBooks
import androidx.compose.material.icons.automirrored.rounded.LiveHelp
import androidx.compose.material.icons.automirrored.rounded.MenuBook
import androidx.compose.material.icons.automirrored.rounded.Subject
import androidx.compose.material.icons.filled.ElectricBolt
import androidx.compose.material.icons.rounded.AllInclusive
import androidx.compose.material.icons.rounded.Category
import androidx.compose.material.icons.rounded.CheckCircle
import androidx.compose.material.icons.rounded.Close
import androidx.compose.material.icons.rounded.Code
import androidx.compose.material.icons.rounded.Dashboard
import androidx.compose.material.icons.rounded.Navigation
import androidx.compose.material.icons.rounded.Rocket
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material.icons.rounded.TextFields
import androidx.compose.material.icons.rounded.TipsAndUpdates
import androidx.compose.material.icons.rounded.TouchApp
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.key.KeyEventType
import androidx.compose.ui.input.key.key
import androidx.compose.ui.input.key.onKeyEvent
import androidx.compose.ui.input.key.type
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import jetpackcomposedev.composeapp.generated.resources.Res
import jetpackcomposedev.composeapp.generated.resources.logo
import org.jetbrains.compose.resources.painterResource
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.material.icons.filled.Bolt
import androidx.compose.runtime.key

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ResponsiveGridScreen() {
    var selectedCategory by remember { mutableStateOf("All") }
    var searchQuery by remember { mutableStateOf("") }
    var shouldAnimate by remember { mutableStateOf(true) }
    val keyboardController = LocalSoftwareKeyboardController.current
    val categories = DataSource.categories
    val items = DataSource.items
    val filteredItems = if (searchQuery.isNotEmpty()) {
        items.filter { item ->
            val queryWords = searchQuery.trim().split("\\s+".toRegex()).filter { it.isNotEmpty() }
            val descriptionWords = item.desc.split("\\s+".toRegex()).map { it.trim() }
            queryWords.all { query ->
                item.title.contains(query, ignoreCase = true) ||
                        descriptionWords.any { it.contains(query, ignoreCase = true) } ||
                        item.category.contains(query, ignoreCase = true)
            }
        }
    } else if (selectedCategory == "All") {
        items
    } else {
        items.filter { item ->
            item.category == selectedCategory
        }
    }

    // Animation for logo: bounce (scale) and rotate
    val scale by animateFloatAsState(
        targetValue = if (shouldAnimate) 1.2f else 1f,
        animationSpec = tween(durationMillis = 600, easing = FastOutSlowInEasing),
        label = "LogoScale"
    )
    val rotation by animateFloatAsState(
        targetValue = if (shouldAnimate) 360f else 0f,
        animationSpec = tween(durationMillis = 800, easing = FastOutSlowInEasing),
        label = "LogoRotation"
    )
    LaunchedEffect(Unit) {
        shouldAnimate = false // Trigger animation only once
    }

    BoxWithConstraints(modifier = Modifier.fillMaxSize().safeDrawingPadding()) {
        val isDesktop = this.maxWidth > 600.dp
        val gradient = if (isSystemInDarkTheme()) {
            Brush.linearGradient(
                colors = listOf(Color(0xff010917), Color(0xff110239))
            )
        } else {
           /* Brush.linearGradient(
                colors = listOf(Color(0xFFEADDFF), Color(0xFFEADDFF), Color(0xffb3a5ec))
            )*/
            Brush.linearGradient(
                colors = listOf(Color(0xFFEADDFF),
                    Color(0xFFEADDFF),
                    Color(0xFFEADDFF),
                    Color(0xffb3a5ec))
            )
        }

        val gridState: LazyStaggeredGridState = rememberLazyStaggeredGridState()
        LazyVerticalStaggeredGrid(
            columns = StaggeredGridCells.Adaptive(minSize = 300.dp),
            state = gridState,
            modifier = Modifier.fillMaxSize().background(gradient),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            verticalItemSpacing = 16.dp,
            contentPadding = PaddingValues(start = 16.dp, top = if (isDesktop) 16.dp else 0.dp, end = 16.dp, bottom = 80.dp)
        ) {
            item(span = StaggeredGridItemSpan.FullLine) {
                if (isDesktop) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp, vertical = 8.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.Top
                    ) {
                        Column(
                            modifier = Modifier.width(this@BoxWithConstraints.maxWidth * 0.5f),
                            horizontalAlignment = Alignment.Start
                        ) {
                            Image(
                                painter = painterResource(Res.drawable.logo),
                                contentDescription = "Banner",
                                modifier = Modifier
                                    .width(150.dp)
                                    .height(100.dp)
                                    .scale(scale)
                                    .rotate(rotation),
                                contentScale = ContentScale.Fit
                            )
                            Text(
                                text = "Learn Compose with BoltUIX",
                                style = MaterialTheme.typography.headlineMedium.copy(
                                    letterSpacing = 0.1.sp
                                ),
                                color = if (isSystemInDarkTheme()) Color(0xFFFAF6FF) else Color(0xFF41367F),
                                textAlign = TextAlign.Start,
                                modifier = Modifier.padding(top = 8.dp)
                            )
                            Text(
                                text = "Modern development toolkit with quick notes - Quick guide made simplified for developers",
                                style = MaterialTheme.typography.bodySmall.copy(
                                    letterSpacing = 1.8.sp
                                ),
                                color = MaterialTheme.colorScheme.onSurfaceVariant,
                                textAlign = TextAlign.Start,
                                modifier = Modifier.padding(top = 8.dp)
                            )
                        }
                        OutlinedTextField(
                            value = searchQuery,
                            onValueChange = { searchQuery = it },
                            modifier = Modifier
                                .width(250.dp)
                                .height(48.dp),
                            leadingIcon = {
                                Icon(
                                    imageVector = Icons.Rounded.Search,
                                    contentDescription = "Search",
                                    tint = MaterialTheme.colorScheme.onSurfaceVariant,
                                    modifier = Modifier.size(18.dp)
                                )
                            },
                            trailingIcon = {
                                if (searchQuery.isNotEmpty()) {
                                    IconButton(onClick = { searchQuery = "" }) {
                                        Icon(
                                            imageVector = Icons.Rounded.Close,
                                            contentDescription = "Clear search",
                                            tint = MaterialTheme.colorScheme.onSurfaceVariant,
                                            modifier = Modifier.size(18.dp)
                                        )
                                    }
                                }
                            },
                            placeholder = {
                                Text(
                                    text = "Search topic...",
                                    color = MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.5f),
                                    style = MaterialTheme.typography.bodySmall
                                )
                            },
                            textStyle = MaterialTheme.typography.bodySmall.copy(
                                color = MaterialTheme.colorScheme.onSurface
                            ),
                            shape = RoundedCornerShape(45),
                            singleLine = true
                        )
                    }
                } else {
                    Column(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(
                            painter = painterResource(Res.drawable.logo),
                            contentDescription = "Banner",
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(200.dp)
                                .scale(scale)
                                .rotate(rotation),
                            contentScale = ContentScale.Fit
                        )
                        Text(
                            text = "Learn Compose with BoltUIX",
                            style = MaterialTheme.typography.headlineMedium.copy(
                                letterSpacing = 0.1.sp
                            ),
                            color = if (isSystemInDarkTheme()) Color(0xFFFAF6FF) else Color(0xFF41367F),
                            textAlign = TextAlign.Center,
                            modifier = Modifier.padding(start = 16.dp, end = 16.dp)
                        )
                        Text(
                            text = "Modern development toolkit with quick notes - Quick guide made simplified for developers",
                            style = MaterialTheme.typography.bodySmall.copy(
                                letterSpacing = 1.8.sp
                            ),
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            textAlign = TextAlign.Center,
                            modifier = Modifier.padding(bottom = 8.dp, start = 32.dp, end = 32.dp)
                        )
                        OutlinedTextField(
                            value = searchQuery,
                            onValueChange = { searchQuery = it },
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 24.dp),
                            leadingIcon = {
                                Icon(
                                    imageVector = Icons.Rounded.Search,
                                    contentDescription = "Search",
                                    tint = MaterialTheme.colorScheme.onSurfaceVariant
                                )
                            },
                            trailingIcon = {
                                if (searchQuery.isNotEmpty()) {
                                    IconButton(onClick = { searchQuery = "" }) {
                                        Icon(
                                            imageVector = Icons.Rounded.Close,
                                            contentDescription = "Clear search",
                                            tint = MaterialTheme.colorScheme.onSurfaceVariant
                                        )
                                    }
                                }
                            },
                            placeholder = {
                                Text(
                                    text = "Search topic...",
                                    color = MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.5f)
                                )
                            },
                            textStyle = MaterialTheme.typography.bodyMedium.copy(
                                color = MaterialTheme.colorScheme.onSurface
                            ),
                            shape = RoundedCornerShape(45),
                            singleLine = true
                        )
                    }
                }
            }
            item(span = StaggeredGridItemSpan.FullLine) {
                Box {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(58.dp)
                    )
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .horizontalScroll(rememberScrollState())
                            .padding(horizontal = 16.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        categories.forEach { category ->
                            val isSelected = selectedCategory == category
                            Surface(
                                modifier = Modifier
                                    .padding(end = 8.dp)
                                    .clip(RoundedCornerShape(50))
                                    .clickable {
                                        selectedCategory = category
                                        searchQuery = "" // Clear search when category is selected
                                        keyboardController?.hide() // Close keyboard
                                    },
                                color = if (isSelected) MaterialTheme.colorScheme.primaryContainer
                                else MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.6f),
                                tonalElevation = if (isSelected) 4.dp else 0.dp,
                                shadowElevation = 0.dp
                            ) {
                                Row(
                                    verticalAlignment = Alignment.CenterVertically,
                                    modifier = Modifier.padding(horizontal = 14.dp, vertical = 8.dp)
                                ) {
                                    Icon(
                                        imageVector = when (category) {
                                            "All" -> Icons.Rounded.AllInclusive
                                            "Actions" -> Icons.Rounded.TouchApp
                                            "Communication" -> Icons.AutoMirrored.Rounded.Chat
                                            "Containment" -> Icons.Rounded.Dashboard
                                            "Navigation" -> Icons.Rounded.Navigation
                                            "Selection" -> Icons.Rounded.CheckCircle
                                            "Material Components" -> Icons.Rounded.Category
                                            "Text inputs" -> Icons.Rounded.TextFields
                                            "Tips" -> Icons.Rounded.TipsAndUpdates
                                            "Beginner" -> Icons.AutoMirrored.Rounded.Subject
                                            "Experienced" -> Icons.AutoMirrored.Rounded.Subject
                                            "Codelabs" -> Icons.Rounded.Code
                                            "Compose Samples" -> Icons.Rounded.Rocket
                                            "Roadmap" -> Icons.AutoMirrored.Rounded.LibraryBooks
                                            "Quick Guides" -> Icons.Default.ElectricBolt
                                            "Compose Template" -> Icons.Default.Bolt
                                            "KMP Template" -> Icons.Default.Bolt
                                            "KMP" -> Icons.AutoMirrored.Rounded.LiveHelp
                                            "Books" -> Icons.AutoMirrored.Rounded.MenuBook
                                            else -> Icons.Rounded.Category
                                        },
                                        contentDescription = null,
                                        modifier = Modifier.size(18.dp),
                                        tint = if (isSelected) MaterialTheme.colorScheme.onPrimaryContainer
                                        else MaterialTheme.colorScheme.onSurfaceVariant
                                    )
                                    Spacer(Modifier.width(6.dp))
                                    Text(
                                        text = category,
                                        color = if (isSelected) MaterialTheme.colorScheme.onPrimaryContainer
                                        else MaterialTheme.colorScheme.onSurfaceVariant,
                                        style = MaterialTheme.typography.labelLarge.copy(
                                            letterSpacing = 0.8.sp
                                        )
                                    )
                                }
                            }
                        }
                    }
                }
            }
            items(filteredItems) { item ->
                GridItemCard(item = item, fraction = 1f)
            }
        }
    }
}