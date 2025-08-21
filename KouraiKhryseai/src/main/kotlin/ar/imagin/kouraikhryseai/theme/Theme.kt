package ar.imagin.kouraikhryseai.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext

private val DarkColorScheme = darkColorScheme(
    primary = KOceanGreen80,
    onPrimary = KOceanGreen10,
    primaryContainer = KOceanGreen30,
    onPrimaryContainer = KOceanGreen90,

    secondary = KOrange80,
    onSecondary = KOrange10,
    secondaryContainer = KOrange30,
    onSecondaryContainer = KOrange90,

    tertiary = KOrange70,
    onTertiary = KOrange10,
    tertiaryContainer = KOrange20,
    onTertiaryContainer = KOrange95,

    error = Error80,
    onError = OnError,
    errorContainer = ErrorContainer,
    onErrorContainer = OnErrorContainer,

    background = KDarkBlue10,
    onBackground = KDarkBlue90,
    surface = KDarkBlue10,
    onSurface = KDarkBlue90,

    surfaceVariant = NeutralVariant30,
    onSurfaceVariant = NeutralVariant80,

    outline = NeutralVariant60,
    outlineVariant = NeutralVariant30,

    scrim = Scrim,

    inverseSurface = KDarkBlue90,
    inverseOnSurface = KDarkBlue10,
    inversePrimary = KOceanGreen40,

    surfaceDim = KDarkBlue10,
    surfaceBright = KDarkBlue40,
    surfaceContainerLowest = KDarkBlue10,
    surfaceContainerLow = KDarkBlue20,
    surfaceContainer = KDarkBlue30,
    surfaceContainerHigh = KDarkBlue40,
    surfaceContainerHighest = KDarkBlue50,
)

private val LightColorScheme = lightColorScheme(
    primary = KOceanGreen40,
    onPrimary = Color.White,
    primaryContainer = KOceanGreen90,
    onPrimaryContainer = KOceanGreen10,

    secondary = KOrange40,
    onSecondary = Color.White,
    secondaryContainer = KOrange90,
    onSecondaryContainer = KOrange10,

    tertiary = KOrange60,
    onTertiary = Color.White,
    tertiaryContainer = KOrange95,
    onTertiaryContainer = KOrange10,

    error = Error40,
    onError = Color.White,
    errorContainer = Error90,
    onErrorContainer = KOrange10,

    background = Neutral99,
    onBackground = Neutral10,
    surface = Neutral99,
    onSurface = Neutral10,

    surfaceVariant = NeutralVariant90,
    onSurfaceVariant = NeutralVariant30,

    outline = NeutralVariant50,
    outlineVariant = NeutralVariant80,

    scrim = Scrim,

    inverseSurface = Neutral20,
    inverseOnSurface = Neutral95,
    inversePrimary = KOceanGreen80,

    surfaceDim = NeutralVariant90,
    surfaceBright = Neutral99,
    surfaceContainerLowest = Color.White,
    surfaceContainerLow = Neutral95,
    surfaceContainer = Neutral90,
    surfaceContainerHigh = NeutralVariant90,
    surfaceContainerHighest = NeutralVariant80,
)

@Composable
fun KTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = false, // Disabled by default to maintain brand identity
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    val extendedColors = if (darkTheme) DarkExtendedColors else LightExtendedColors

    CompositionLocalProvider(
        LocalExtendedColors provides extendedColors
    ) {
        MaterialTheme(
            colorScheme = colorScheme,
            typography = Typography,
            shapes = Shapes,
            content = content
        )
    }
}

// Convenience accessors for theme tokens
object KTheme {
    val spacing: KSpacing
        @Composable get() = KSpacing

    val elevation: KElevation
        @Composable get() = KElevation

    val dimensions: KDimensions
        @Composable get() = KDimensions

    val shapes: KShapes
        @Composable get() = KShapes
}
