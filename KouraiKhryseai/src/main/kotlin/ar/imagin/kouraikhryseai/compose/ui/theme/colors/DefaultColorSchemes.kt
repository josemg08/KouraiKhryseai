package ar.imagin.kouraikhryseai.compose.ui.theme.colors

import androidx.compose.material3.ColorScheme
import androidx.compose.ui.graphics.Color

/**.___
 * Generates default light ColorScheme from provided colors following Material Design.
__.*/
internal fun generateDefaultLightColorScheme(
    primary: Color,
    secondary: Color,
    tertiary: Color
): ColorScheme {
    val primaryPalette = ColorGenerator.generateTonalPalette(primary)
    val secondaryPalette = ColorGenerator.generateTonalPalette(secondary)
    val tertiaryPalette = ColorGenerator.generateTonalPalette(tertiary)

    return ColorScheme(
        primary = primaryPalette[40]!!,
        onPrimary = Color.White,
        primaryContainer = primaryPalette[90]!!,
        onPrimaryContainer = primaryPalette[10]!!,
        inversePrimary = primaryPalette[80]!!,
        secondary = secondaryPalette[40]!!,
        onSecondary = Color.White,
        secondaryContainer = secondaryPalette[90]!!,
        onSecondaryContainer = secondaryPalette[10]!!,
        tertiary = tertiaryPalette[60]!!,
        onTertiary = Color.White,
        tertiaryContainer = tertiaryPalette[95]!!,
        onTertiaryContainer = tertiaryPalette[10]!!,
        background = Neutral99,
        onBackground = Neutral10,
        surface = Neutral99,
        onSurface = Neutral10,
        surfaceVariant = NeutralVariant90,
        onSurfaceVariant = NeutralVariant30,
        surfaceTint = tertiaryPalette[40]!!,
        inverseSurface = Neutral20,
        inverseOnSurface = Neutral95,
        error = Error40,
        onError = Color.White,
        errorContainer = Error90,
        onErrorContainer = OnErrorContainer,
        outline = NeutralVariant50,
        outlineVariant = NeutralVariant80,
        scrim = Scrim,
        surfaceBright = Neutral99,
        surfaceContainer = Neutral90,
        surfaceContainerHigh = NeutralVariant90,
        surfaceContainerHighest = NeutralVariant80,
        surfaceContainerLow = Neutral95,
        surfaceContainerLowest = Transparent,
        surfaceDim = NeutralVariant90,
    )
}

/**.___
 * Generates default dark ColorScheme from provided colors following Material Design.
__.*/
internal fun generateDefaultDarkColorScheme(
    primary: Color,
    secondary: Color,
    tertiary: Color
): ColorScheme {
    val primaryPalette = ColorGenerator.generateTonalPalette(primary)
    val secondaryPalette = ColorGenerator.generateTonalPalette(secondary)
    val tertiaryPalette = ColorGenerator.generateTonalPalette(tertiary)

    return ColorScheme(
        primary = primaryPalette[80]!!,
        onPrimary = primaryPalette[10]!!,
        primaryContainer = secondaryPalette[80]!!,
        onPrimaryContainer = Color.Black,
        inversePrimary = primaryPalette[40]!!,
        secondary = secondaryPalette[80]!!,
        onSecondary = secondaryPalette[10]!!,
        secondaryContainer = secondaryPalette[30]!!,
        onSecondaryContainer = secondaryPalette[90]!!,
        tertiary = tertiaryPalette[70]!!,
        onTertiary = tertiaryPalette[10]!!,
        tertiaryContainer = tertiaryPalette[20]!!,
        onTertiaryContainer = tertiaryPalette[95]!!,
        background = DarkBlue10,
        onBackground = DarkBlue90,
        surface = DarkBlue10,
        onSurface = DarkBlue90,
        surfaceVariant = NeutralVariant30,
        onSurfaceVariant = NeutralVariant80,
        surfaceTint = OceanGreen80,
        inverseSurface = DarkBlue90,
        inverseOnSurface = DarkBlue10,
        error = Error80,
        onError = Color.Black,
        errorContainer = ErrorContainer,
        onErrorContainer = OnErrorContainer,
        outline = NeutralVariant60,
        outlineVariant = NeutralVariant30,
        scrim = Scrim,
        surfaceBright = DarkBlue40,
        surfaceContainer = DarkBlue30,
        surfaceContainerHigh = DarkBlue40,
        surfaceContainerHighest = DarkBlue50,
        surfaceContainerLow = DarkBlue20,
        surfaceContainerLowest = DarkBlue10,
        surfaceDim = DarkBlue10,
    )
}