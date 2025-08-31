package ar.imagin.kouraiKhryseai.demo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import ar.imagin.kouraikhryseai.theme.KTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MainScreen()
        }
    }
}

@Composable
private fun MainScreen() {
    KTheme(dynamicColor = false) {
        var selectedTab by remember { mutableIntStateOf(0) }
        val listState = rememberLazyListState()

        Scaffold(
            modifier = Modifier
                .fillMaxSize()
                .windowInsetsPadding(WindowInsets.statusBars),
            containerColor = MaterialTheme.colorScheme.background,
            contentWindowInsets = WindowInsets(0),
            bottomBar = {
                BottomNavigationBar(
                    selectedTab = selectedTab,
                    onTabSelected = { selectedTab = it }
                )
            }
        ) { paddingValues ->
            LazyColumn(
                state = listState,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues)
                    .padding(horizontal = KTheme.dimensions.size.size6),
                verticalArrangement = Arrangement.spacedBy(KTheme.dimensions.size.size6)
            ) {
                item {
                    // Header section
                    Column(
                        modifier = Modifier.padding(vertical = KTheme.dimensions.size.size7),
                        verticalArrangement = Arrangement.spacedBy(KTheme.dimensions.size.size5)
                    ) {
                        Text(
                            text = "Kourai Khryseai",
                            style = MaterialTheme.typography.displaySmall,
                            color = MaterialTheme.colorScheme.onBackground,
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = "Golden Hour Collection",
                            style = MaterialTheme.typography.titleMedium,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                }

                items(createSampleTexts()) { textItem ->
                    TextCard(
                        title = textItem.title,
                        content = textItem.content,
                        category = textItem.category
                    )
                }

                item {
                    // Bottom spacing for navigation bar
                    Box(modifier = Modifier.padding(bottom = KTheme.dimensions.size.size6))
                }
            }
        }
    }
}

@Composable
private fun TextCard(
    title: String,
    content: String,
    category: String
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(KTheme.dimensions.radius.radius4)),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceContainer
        ),
        elevation = CardDefaults.cardElevation(
            defaultElevation = KTheme.dimensions.elevation.level1
        )
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(KTheme.dimensions.size.size7),
            verticalArrangement = Arrangement.spacedBy(KTheme.dimensions.size.size6)
        ) {
            // Category badge
            Text(
                text = category.uppercase(),
                style = MaterialTheme.typography.labelSmall,
                color = MaterialTheme.colorScheme.onPrimaryContainer,
                modifier = Modifier
                    .background(
                        MaterialTheme.colorScheme.primaryContainer,
                        RoundedCornerShape(KTheme.dimensions.radius.radius2)
                    )
                    .padding(
                        horizontal = KTheme.dimensions.size.size5,
                        vertical = KTheme.dimensions.size.size3)
            )

            // Title
            Text(
                text = title,
                style = MaterialTheme.typography.titleLarge,
                color = MaterialTheme.colorScheme.onSurface,
                fontWeight = FontWeight.Medium
            )

            // Content
            Text(
                text = content,
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                lineHeight = MaterialTheme.typography.bodyMedium.lineHeight
            )
        }
    }
}

@Composable
private fun BottomNavigationBar(
    selectedTab: Int,
    onTabSelected: (Int) -> Unit
) {
    val items = listOf(
        BottomNavItem("Home", Icons.Default.Home),
        BottomNavItem("Search", Icons.Default.Search),
        BottomNavItem("Favorites", Icons.Default.Favorite),
        BottomNavItem("Profile", Icons.Default.Person),
        BottomNavItem("Settings", Icons.Default.Settings)
    )

    NavigationBar(
        containerColor = MaterialTheme.colorScheme.surfaceContainer,
        contentColor = MaterialTheme.colorScheme.onSurface,
        modifier = Modifier.windowInsetsPadding(WindowInsets.navigationBars)
    ) {
        items.forEachIndexed { index, item ->
            NavigationBarItem(
                icon = {
                    Icon(
                        imageVector = item.icon,
                        contentDescription = item.label
                    )
                },
                label = {
                    Text(
                        text = item.label,
                        style = MaterialTheme.typography.labelSmall
                    )
                },
                selected = selectedTab == index,
                onClick = { onTabSelected(index) }
            )
        }
    }
}

private data class BottomNavItem(
    val label: String,
    val icon: ImageVector
)

private data class TextItem(
    val title: String,
    val content: String,
    val category: String
)

private fun createSampleTexts(): List<TextItem> = listOf(
    TextItem(
        title = "Ocean Depths",
        content = "Beneath the rolling waves lies a world of mysteries, where ancient currents carry tales of forgotten civilizations and golden treasures await discovery.",
        category = "Poetry"
    ),
    TextItem(
        title = "Golden Dawn",
        content = "As the first rays of sunlight pierce through the morning mist, the world awakens with a symphony of colors that dance across the horizon like liquid gold.",
        category = "Nature"
    ),
    TextItem(
        title = "Digital Dreams",
        content = "In the realm of code and creativity, we craft experiences that bridge the gap between imagination and reality, building tomorrow's interfaces today.",
        category = "Technology"
    ),
    TextItem(
        title = "Ancient Wisdom",
        content = "The philosophers of old understood that true knowledge comes not from answers, but from the courage to ask the right questions in the darkness.",
        category = "Philosophy"
    ),
    TextItem(
        title = "Starlit Journeys",
        content = "Every star in the night sky tells a story of cosmic wonder, reminding us that we are all made of stardust and connected by the infinite tapestry of space.",
        category = "Astronomy"
    ),
    TextItem(
        title = "Creative Flow",
        content = "Art is the language of the soul, speaking truths that words cannot express and painting emotions in hues that touch the deepest parts of our being.",
        category = "Art"
    ),
    TextItem(
        title = "Mountain Echoes",
        content = "High among the peaks where eagles soar, the silence speaks volumes about the majesty of nature and our small but significant place within it.",
        category = "Adventure"
    ),
    TextItem(
        title = "Urban Symphony",
        content = "City lights flicker like neurons in a vast brain, each one representing a dream, a hope, a story unfolding in the endless human experiment of civilization.",
        category = "Urban Life"
    )
)

@Preview
@Composable
private fun MainScreenPreview() {
    KTheme(dynamicColor = false) {
        var selectedTab by remember { mutableIntStateOf(0) }
        val listState = rememberLazyListState()

        Scaffold(
            modifier = Modifier
                .fillMaxSize()
                .windowInsetsPadding(WindowInsets.statusBars),
            containerColor = MaterialTheme.colorScheme.background,
            contentWindowInsets = WindowInsets(0),
            bottomBar = {
                BottomNavigationBar(
                    selectedTab = selectedTab,
                    onTabSelected = { selectedTab = it }
                )
            }
        ) { paddingValues ->
            LazyColumn(
                state = listState,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues)
                    .padding(horizontal = KTheme.dimensions.size.size6),
                verticalArrangement = Arrangement.spacedBy(KTheme.dimensions.size.size6)
            ) {
                item {
                    // Header section
                    Column(
                        modifier = Modifier.padding(vertical = KTheme.dimensions.size.size7),
                        verticalArrangement = Arrangement.spacedBy(KTheme.dimensions.size.size5)
                    ) {
                        Text(
                            text = "Kourai Khryseai",
                            style = MaterialTheme.typography.displaySmall,
                            color = MaterialTheme.colorScheme.onBackground,
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = "Golden Hour Collection",
                            style = MaterialTheme.typography.titleMedium,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                }

                items(createSampleTexts()) { textItem ->
                    TextCard(
                        title = textItem.title,
                        content = textItem.content,
                        category = textItem.category
                    )
                }

                item {
                    // Bottom spacing for navigation bar
                    Box(modifier = Modifier.padding(bottom = KTheme.dimensions.size.size6))
                }
            }
        }
    }
}
