package ar.imagin.kouraikhryseai.theme

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.Typography
import androidx.compose.ui.graphics.Color
import ar.imagin.kouraikhryseai.theme.colors.KDarkBlue
import ar.imagin.kouraikhryseai.theme.colors.KOceanGreen
import ar.imagin.kouraikhryseai.theme.colors.KOrange
import ar.imagin.kouraikhryseai.theme.colors.generateDefaultDarkColorScheme
import ar.imagin.kouraikhryseai.theme.colors.generateDefaultLightColorScheme

data class KColorConfig(
    val lightColorsScheme: ColorScheme? = null,
    val darkColorsScheme: ColorScheme? = null,
    val primary: Color? = null,
    val secondary: Color? = null,
    val tertiary: Color? = null
) {
    constructor(lightColorsScheme: ColorScheme) : this(
        lightColorsScheme = lightColorsScheme,
        darkColorsScheme = null,
        primary = null,
        secondary = null,
        tertiary = null
    )

    constructor(lightColorsScheme: ColorScheme, darkColorsScheme: ColorScheme) : this(
        lightColorsScheme = lightColorsScheme,
        darkColorsScheme = darkColorsScheme,
        primary = null,
        secondary = null,
        tertiary = null
    )

    constructor(primary: Color, secondary: Color, tertiary: Color) : this(
        lightColorsScheme = generateDefaultLightColorScheme(
            primary = primary,
            secondary = secondary,
            tertiary = tertiary
        ),
        darkColorsScheme = generateDefaultDarkColorScheme(
            primary = primary,
            secondary = secondary,
            tertiary = tertiary
        ),
        primary = primary,
        secondary = secondary,
        tertiary = tertiary
    )

    constructor() : this(
        lightColorsScheme = generateDefaultLightColorScheme(
            primary = KDarkBlue,
            secondary = KOrange,
            tertiary = KOceanGreen
        ),
        darkColorsScheme = generateDefaultDarkColorScheme(
            primary = KDarkBlue,
            secondary = KOrange,
            tertiary = KOceanGreen
        ),
        primary = KDarkBlue,
        secondary = KOrange,
        tertiary = KOceanGreen
    )
}

data class KThemeConfig(
    val colors: KColorConfig = KColorConfig(),
    val typography: Typography = Typography()
)

object KThemeConfigHolder {
    private var themeConfig: KThemeConfig? = null

    val config: KThemeConfig
        get() = themeConfig ?: error("KThemeConfig not initialized")

    fun init(config: KThemeConfig) {
        themeConfig = config
    }
}