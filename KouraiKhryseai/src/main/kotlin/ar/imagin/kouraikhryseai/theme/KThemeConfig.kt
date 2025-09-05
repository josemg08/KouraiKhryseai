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
    var lightColorsScheme: ColorScheme? = null,
    var darkColorsScheme: ColorScheme? = null,
    var primary: Color? = null,
    var secondary: Color? = null,
    var tertiary: Color? = null
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