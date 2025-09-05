package ar.imagin.kouraikhryseai.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalWindowInfo
import ar.imagin.kouraikhryseai.theme.colors.ColorGenerator
import ar.imagin.kouraikhryseai.theme.colors.Orange10
import ar.imagin.kouraikhryseai.theme.colors.Orange30
import ar.imagin.kouraikhryseai.theme.colors.Orange80
import ar.imagin.kouraikhryseai.theme.colors.Orange90
import ar.imagin.kouraikhryseai.theme.dimens.AdaptableDimens
import ar.imagin.kouraikhryseai.theme.dimens.KDimensions
import ar.imagin.kouraikhryseai.theme.dimens.SWOptimizationConstants

@Composable
fun KTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    val config = KThemeConfigHolder.config
    val colors = config.colors

    // Generate palettes
    val primaryPalette = ColorGenerator.generateTonalPalette(colors.primary)
    val secondaryPalette = ColorGenerator.generateTonalPalette(colors.accent) // accent as secondary
    val tertiaryPalette = ColorGenerator.generateTonalPalette(colors.secondary) // secondary as tertiary

    val semanticColors = if (darkTheme) colors.darkColors else colors.lightColors

    val colorScheme = if (darkTheme) {
        darkColorScheme(
            primary = primaryPalette[80]!!,
            onPrimary = primaryPalette[10]!!,
            primaryContainer = secondaryPalette[80]!!,
            onPrimaryContainer = Color.Black,

            secondary = secondaryPalette[80]!!,
            onSecondary = secondaryPalette[10]!!,
            secondaryContainer = secondaryPalette[30]!!,
            onSecondaryContainer = secondaryPalette[90]!!,

            tertiary = tertiaryPalette[70]!!,
            onTertiary = tertiaryPalette[10]!!,
            tertiaryContainer = tertiaryPalette[20]!!,
            onTertiaryContainer = tertiaryPalette[95]!!,

            error = semanticColors.error,
            onError = semanticColors.onError,
            errorContainer = semanticColors.errorContainer,
            onErrorContainer = semanticColors.onErrorContainer,

            background = semanticColors.background,
            onBackground = semanticColors.onBackground,
            surface = semanticColors.surface,
            onSurface = semanticColors.onSurface,
            surfaceVariant = semanticColors.surfaceVariant,
            onSurfaceVariant = semanticColors.onSurfaceVariant,
            surfaceTint = semanticColors.surfaceTint,
            inverseSurface = semanticColors.inverseSurface,
            inverseOnSurface = semanticColors.inverseOnSurface,
            inversePrimary = primaryPalette[40]!!,
            outline = semanticColors.outline,
            outlineVariant = semanticColors.outlineVariant,
            scrim = semanticColors.scrim,
            surfaceBright = semanticColors.surfaceBright,
            surfaceDim = semanticColors.surfaceDim,
            surfaceContainerLowest = semanticColors.surfaceContainerLowest,
            surfaceContainerLow = semanticColors.surfaceContainerLow,
            surfaceContainer = semanticColors.surfaceContainer,
            surfaceContainerHigh = semanticColors.surfaceContainerHigh,
            surfaceContainerHighest = semanticColors.surfaceContainerHighest
        )
    } else {
        lightColorScheme(
            primary = primaryPalette[40]!!,
            onPrimary = Color.White,
            primaryContainer = primaryPalette[90]!!,
            onPrimaryContainer = primaryPalette[10]!!,

            secondary = secondaryPalette[40]!!,
            onSecondary = Color.White,
            secondaryContainer = secondaryPalette[90]!!,
            onSecondaryContainer = secondaryPalette[10]!!,

            tertiary = tertiaryPalette[60]!!,
            onTertiary = Color.White,
            tertiaryContainer = tertiaryPalette[95]!!,
            onTertiaryContainer = tertiaryPalette[10]!!,

            error = semanticColors.error,
            onError = semanticColors.onError,
            errorContainer = semanticColors.errorContainer,
            onErrorContainer = semanticColors.onErrorContainer,

            background = semanticColors.background,
            onBackground = semanticColors.onBackground,
            surface = semanticColors.surface,
            onSurface = semanticColors.onSurface,
            surfaceVariant = semanticColors.surfaceVariant,
            onSurfaceVariant = semanticColors.onSurfaceVariant,
            surfaceTint = semanticColors.surfaceTint,
            inverseSurface = semanticColors.inverseSurface,
            inverseOnSurface = semanticColors.inverseOnSurface,
            inversePrimary = primaryPalette[80]!!,
            outline = semanticColors.outline,
            outlineVariant = semanticColors.outlineVariant,
            scrim = semanticColors.scrim,
            surfaceBright = semanticColors.surfaceBright,
            surfaceDim = semanticColors.surfaceDim,
            surfaceContainerLowest = semanticColors.surfaceContainerLowest,
            surfaceContainerLow = semanticColors.surfaceContainerLow,
            surfaceContainer = semanticColors.surfaceContainer,
            surfaceContainerHigh = semanticColors.surfaceContainerHigh,
            surfaceContainerHighest = semanticColors.surfaceContainerHighest
        )
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = config.typography,
        shapes = getShapes().material,
        content = content
    )
}

//.___ Convenience accessors for theme tokens __./
object KTokens {
    val dimensions: KDimensions
        @Composable get() {
            val windowInfo = LocalWindowInfo.current
            val screenWidthDp = with(LocalDensity.current) {
                windowInfo.containerSize.width.toDp()
            }.value.toInt()

            return AdaptableDimens(
                delta = SWOptimizationConstants.getDeltaForScreenWidth(screenWidthDp)
            )
        }

    val shapes @Composable get() = getShapes()

    val materialColors @Composable get() = MaterialTheme.colorScheme
}