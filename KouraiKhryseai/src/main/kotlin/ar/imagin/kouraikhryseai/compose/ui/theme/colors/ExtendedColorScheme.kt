package ar.imagin.kouraikhryseai.compose.ui.theme.colors

import androidx.compose.ui.graphics.Color

/**
 * A color scheme that extends the standard Material3 ColorScheme with additional semantic colors.
 * This includes success, warning, info, and custom brand colors, following the Material3 color system pattern.
 *
 * Use `KTokens.extendedColors` to access these colors within a `KTheme`.
 *
 * @property success Color used to indicate a successful operation or state.
 * @property onSuccess Color used for text and icons displayed on top of the success color.
 * @property successContainer Muted color for success elements, providing less emphasis than [success].
 * @property onSuccessContainer Color used for text and icons displayed on top of the [successContainer] color.
 *
 * @property warning Color used to indicate a warning or a state that requires attention.
 * @property onWarning Color used for text and icons displayed on top of the warning color.
 * @property warningContainer Muted color for warning elements, providing less emphasis than [warning].
 * @property onWarningContainer Color used for text and icons displayed on top of the [warningContainer] color.
 *
 * @property info Color used to indicate an informative state or message.
 * @property onInfo Color used for text and icons displayed on top of the info color.
 * @property infoContainer Muted color for info elements, providing less emphasis than [info].
 * @property onInfoContainer Color used for text and icons displayed on top of the [infoContainer] color.
 *
 * @property brand The primary custom brand color.
 * @property onBrand Color used for text and icons displayed on top of the brand color.
 * @property brandContainer Muted color for brand elements, providing less emphasis than [brand].
 * @property onBrandContainer Color used for text and icons displayed on top of the [brandContainer] color.
 */
data class ExtendedColorScheme(
    val success: Color,
    val onSuccess: Color,
    val successContainer: Color,
    val onSuccessContainer: Color,
    val warning: Color,
    val onWarning: Color,
    val warningContainer: Color,
    val onWarningContainer: Color,
    val info: Color,
    val onInfo: Color,
    val infoContainer: Color,
    val onInfoContainer: Color,
    val brand: Color,
    val onBrand: Color,
    val brandContainer: Color,
    val onBrandContainer: Color,
)

/**.___
 * Default light KColorScheme from provided colors following Material Design.
__.*/
internal fun getDefaultLightExtendedColors(): ExtendedColorScheme {
    return ExtendedColorScheme(
        success = Color(0xFF146C2E),
        onSuccess = Color.White,
        successContainer = Color(0xFFA6F2AA),
        onSuccessContainer = Color(0xFF002106),
        warning = Orange40,
        onWarning = Color.White,
        warningContainer = Orange90,
        onWarningContainer = Orange10,
        info = Color(0xFF0061A4),
        onInfo = Color.White,
        infoContainer = Color(0xFFD1E4FF),
        onInfoContainer = Color(0xFF001D36),
        brand = OceanGreen40,
        onBrand = Color.White,
        brandContainer = OceanGreen90,
        onBrandContainer = OceanGreen10,
    )
}

/**.___
 * Default dark KColorScheme from provided colors following Material Design.
__.*/
internal fun getDefaultDarkExtendedColors(): ExtendedColorScheme {
    return ExtendedColorScheme(
        success = Color(0xFF8ADB8F),
        onSuccess = Color(0xFF00390E),
        successContainer = Color(0xFF00531C),
        onSuccessContainer = Color(0xFFA6F2AA),
        warning = Orange80,
        onWarning = Orange10,
        warningContainer = Orange30,
        onWarningContainer = Orange90,
        info = Color(0xFF9ECAFF),
        onInfo = Color(0xFF003258),
        infoContainer = Color(0xFF00497D),
        onInfoContainer = Color(0xFFD1E4FF),
        brand = OceanGreen80,
        onBrand = OceanGreen10,
        brandContainer = OceanGreen30,
        onBrandContainer = OceanGreen90,
    )
}
