package ar.imagin.kouraikhryseai.compose.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.luminance
import androidx.compose.ui.tooling.preview.Preview

/**
 * A preview component that showcases the extended color palette of the theme.
 */
@Composable
fun ExtendedColorsShowcase() {
    val colors = KTokens.extendedColors
    val dimensions = KTokens.dimensions
    val shapes = KTokens.shapes

    val colorItems = listOf(
        "Success" to colors.success,
        "On Success" to colors.onSuccess,
        "Success Container" to colors.successContainer,
        "On Success Container" to colors.onSuccessContainer,
        "Warning" to colors.warning,
        "On Warning" to colors.onWarning,
        "Warning Container" to colors.warningContainer,
        "On Warning Container" to colors.onWarningContainer,
        "Info" to colors.info,
        "On Info" to colors.onInfo,
        "Info Container" to colors.infoContainer,
        "On Info Container" to colors.onInfoContainer,
        "Brand" to colors.brand,
        "On Brand" to colors.onBrand,
        "Brand Container" to colors.brandContainer,
        "On Brand Container" to colors.onBrandContainer,
    )

    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = Modifier
            .fillMaxWidth()
            .padding(dimensions.plasticSize.plastic16),
        verticalArrangement = Arrangement.spacedBy(dimensions.size.size8),
        horizontalArrangement = Arrangement.spacedBy(dimensions.size.size8)
    ) {
        items(colorItems) { (name, color) ->
            ColorItem(name = name, color = color, shape = shapes.card)
        }
    }
}

@Composable
private fun ColorItem(name: String, color: Color, shape: androidx.compose.ui.graphics.Shape) {
    val dimensions = KTokens.dimensions
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(dimensions.plasticSize.plastic86)
            .background(color, shape),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = name,
            color = if (color.luminance() > 0.5f) Color.Black else Color.White,
            style = MaterialTheme.typography.labelMedium
        )
    }
}

@Preview(showBackground = true, name = "Extended Colors - Light")
@Composable
private fun ExtendedColorsPreviewLight() {
    KTheme(darkTheme = false) {
        ExtendedColorsShowcase()
    }
}

@Preview(showBackground = true, name = "Extended Colors - Dark")
@Composable
private fun ExtendedColorsPreviewDark() {
    KTheme(darkTheme = true) {
        ExtendedColorsShowcase()
    }
}
