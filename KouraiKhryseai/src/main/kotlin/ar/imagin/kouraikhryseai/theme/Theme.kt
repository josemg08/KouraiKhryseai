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
    primary = KKOceanGreen80,
    onPrimary = KKOceanGreen10,
    primaryContainer = KKOceanGreen30,
    onPrimaryContainer = KKOceanGreen90,

    secondary = KKOrange80,
    onSecondary = KKOrange10,
    secondaryContainer = KKOrange30,
    onSecondaryContainer = KKOrange90,

    tertiary = KKOrange70,
    onTertiary = KKOrange10,
    tertiaryContainer = KKOrange20,
    onTertiaryContainer = KKOrange95,

    error = Error80,
    onError = OnError,
    errorContainer = ErrorContainer,
    onErrorContainer = OnErrorContainer,

    background = KKDarkBlue10,
    onBackground = KKDarkBlue90,
    surface = KKDarkBlue10,
    onSurface = KKDarkBlue90,

    surfaceVariant = NeutralVariant30,
    onSurfaceVariant = NeutralVariant80,

    outline = NeutralVariant60,
    outlineVariant = NeutralVariant30,

    scrim = Scrim,

    inverseSurface = KKDarkBlue90,
    inverseOnSurface = KKDarkBlue10,
    inversePrimary = KKOceanGreen40,

    surfaceDim = KKDarkBlue10,
    surfaceBright = KKDarkBlue40,
    surfaceContainerLowest = KKDarkBlue10,
    surfaceContainerLow = KKDarkBlue20,
    surfaceContainer = KKDarkBlue30,
    surfaceContainerHigh = KKDarkBlue40,
    surfaceContainerHighest = KKDarkBlue50,
)

private val LightColorScheme = lightColorScheme(
    primary = KKOceanGreen40,
    onPrimary = Color.White,
    primaryContainer = KKOceanGreen90,
    onPrimaryContainer = KKOceanGreen10,

    secondary = KKOrange40,
    onSecondary = Color.White,
    secondaryContainer = KKOrange90,
    onSecondaryContainer = KKOrange10,

    tertiary = KKOrange60,
    onTertiary = Color.White,
    tertiaryContainer = KKOrange95,
    onTertiaryContainer = KKOrange10,

    error = Error40,
    onError = Color.White,
    errorContainer = Error90,
    onErrorContainer = KKOrange10,

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
    inversePrimary = KKOceanGreen80,

    surfaceDim = NeutralVariant90,
    surfaceBright = Neutral99,
    surfaceContainerLowest = Color.White,
    surfaceContainerLow = Neutral95,
    surfaceContainer = Neutral90,
    surfaceContainerHigh = NeutralVariant90,
    surfaceContainerHighest = NeutralVariant80,
)

@Composable
fun KKTheme(
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
object KKTheme {
    val spacing: KKSpacing
        @Composable get() = KKSpacing

    val elevation: KKElevation
        @Composable get() = KKElevation

    val dimensions: KKDimensions
        @Composable get() = KKDimensions

    val shapes: KKShapes
        @Composable get() = KKShapes
}
