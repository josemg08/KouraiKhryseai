package ar.imagin.kouraikhryseai.theme.colors

import androidx.compose.material3.darkColorScheme
import androidx.compose.ui.graphics.Color

val DarkColorScheme = darkColorScheme(
    primary = KOceanGreen80,
    onPrimary = KOceanGreen10,
    primaryContainer = KOrange80,
    onPrimaryContainer = Color.Black,

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