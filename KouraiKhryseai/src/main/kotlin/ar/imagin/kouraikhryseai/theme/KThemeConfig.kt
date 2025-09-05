package ar.imagin.kouraikhryseai.theme

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.Typography
import androidx.compose.ui.graphics.Color
import ar.imagin.kouraikhryseai.theme.colors.ExtendedColorScheme
import ar.imagin.kouraikhryseai.theme.colors.KDarkBlue
import ar.imagin.kouraikhryseai.theme.colors.KOceanGreen
import ar.imagin.kouraikhryseai.theme.colors.KOrange
import ar.imagin.kouraikhryseai.theme.colors.generateDefaultDarkColorScheme
import ar.imagin.kouraikhryseai.theme.colors.generateDefaultLightColorScheme
import ar.imagin.kouraikhryseai.theme.colors.getDefaultDarkExtendedColors
import ar.imagin.kouraikhryseai.theme.colors.getDefaultLightExtendedColors

data class KColorConfig(
    var primary: Color? = null,
    var secondary: Color? = null,
    var tertiary: Color? = null,
    var lightColorsScheme: ColorScheme? = null,
    var darkColorsScheme: ColorScheme? = null,
    var lightExtendedColorScheme: ExtendedColorScheme? = null,
    var darkExtendedColorScheme: ExtendedColorScheme? = null
) {
    init {
        primary = primary ?: KDarkBlue
        secondary = secondary ?: KOrange
        tertiary = tertiary ?: KOceanGreen

        if (darkColorsScheme == null && lightColorsScheme == null) {
            darkColorsScheme = generateDefaultDarkColorScheme(
                primary = primary!!,
                secondary = secondary!!,
                tertiary = tertiary!!
            )
        }

        if (lightColorsScheme == null) {
            lightColorsScheme = generateDefaultLightColorScheme(
                primary = primary!!,
                secondary = secondary!!,
                tertiary = tertiary!!
            )
        }

        if (darkExtendedColorScheme == null && lightExtendedColorScheme == null) {
            darkExtendedColorScheme = getDefaultDarkExtendedColors()
        }

        if (lightExtendedColorScheme == null) {
            lightExtendedColorScheme = getDefaultLightExtendedColors()
        }
    }
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