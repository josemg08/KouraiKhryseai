package ar.imagin.kouraikhryseai.compose.ui.theme

import androidx.compose.material3.ColorScheme
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import ar.imagin.kouraikhryseai.compose.ui.theme.colors.ExtendedColorScheme
import ar.imagin.kouraikhryseai.compose.ui.theme.colors.KDarkBlue
import ar.imagin.kouraikhryseai.compose.ui.theme.colors.KOceanGreen
import ar.imagin.kouraikhryseai.compose.ui.theme.colors.KOrange
import ar.imagin.kouraikhryseai.compose.ui.theme.colors.generateDefaultDarkColorScheme
import ar.imagin.kouraikhryseai.compose.ui.theme.colors.generateDefaultLightColorScheme
import ar.imagin.kouraikhryseai.compose.ui.theme.colors.getDefaultDarkExtendedColors
import ar.imagin.kouraikhryseai.compose.ui.theme.colors.getDefaultLightExtendedColors

/**
 * Configuration for the color palette of the theme.
 * Allows overriding primary, secondary, and tertiary colors to generate a full [ColorScheme],
 * or providing custom [ColorScheme] and [ExtendedColorScheme] directly.
 */
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

/**
 * Full configuration for [KTheme].
 * @property colors Color configuration.
 * @property fontFamily Global font family for the theme.
 */
data class KThemeConfig(
    val colors: KColorConfig = KColorConfig(),
    val fontFamily: FontFamily = FontFamily.Default
)

/**
 * Singleton holder for [KThemeConfig].
 * Must be initialized via [init] before [KTheme] is used if custom configuration is needed.
 */
object KThemeConfigHolder {
    private var themeConfig: KThemeConfig? = null

    /**
     * Returns the current [KThemeConfig]. If not initialized, returns a default configuration.
     */
    val config: KThemeConfig
        get() {
            if (themeConfig == null) {
                themeConfig = KThemeConfig()
            }
            return themeConfig!!
        }

    /**
     * Initializes the theme with a custom configuration.
     * This should ideally be called once, e.g., in the `Application.onCreate` or at the entry point of the app.
     */
    fun init(config: KThemeConfig) {
        themeConfig = config
    }
}