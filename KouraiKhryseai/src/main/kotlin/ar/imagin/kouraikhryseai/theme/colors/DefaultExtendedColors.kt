package ar.imagin.kouraikhryseai.theme.colors

import androidx.compose.ui.graphics.Color

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