package ar.imagin.kouraikhryseai.theme

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

// Extended color palette for brand-specific colors
data class KExtendedColors(
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

val LocalExtendedColors = staticCompositionLocalOf {
    KExtendedColors(
        success = Color.Unspecified,
        onSuccess = Color.Unspecified,
        successContainer = Color.Unspecified,
        onSuccessContainer = Color.Unspecified,
        warning = Color.Unspecified,
        onWarning = Color.Unspecified,
        warningContainer = Color.Unspecified,
        onWarningContainer = Color.Unspecified,
        info = Color.Unspecified,
        onInfo = Color.Unspecified,
        infoContainer = Color.Unspecified,
        onInfoContainer = Color.Unspecified,
        brand = Color.Unspecified,
        onBrand = Color.Unspecified,
        brandContainer = Color.Unspecified,
        onBrandContainer = Color.Unspecified,
    )
}

// Light theme extended colors
val LightExtendedColors = KExtendedColors(
    success = Color(0xFF146C2E),
    onSuccess = Color.White,
    successContainer = Color(0xFFA6F2AA),
    onSuccessContainer = Color(0xFF002106),
    warning = Color(0xFFB25F00),
    onWarning = Color.White,
    warningContainer = Color(0xFFFFDCC2),
    onWarningContainer = Color(0xFF381C00),
    info = Color(0xFF0061A4),
    onInfo = Color.White,
    infoContainer = Color(0xFFD1E4FF),
    onInfoContainer = Color(0xFF001D36),
    brand = KOceanGreen40,
    onBrand = Color.White,
    brandContainer = KOceanGreen90,
    onBrandContainer = KOceanGreen10,
)

// Dark theme extended colors
val DarkExtendedColors = KExtendedColors(
    success = Color(0xFF8ADB8F),
    onSuccess = Color(0xFF00390E),
    successContainer = Color(0xFF00531C),
    onSuccessContainer = Color(0xFFA6F2AA),
    warning = Color(0xFFFFB68A),
    onWarning = Color(0xFF5C2E00),
    warningContainer = Color(0xFF834600),
    onWarningContainer = Color(0xFFFFDCC2),
    info = Color(0xFF9ECAFF),
    onInfo = Color(0xFF003258),
    infoContainer = Color(0xFF00497D),
    onInfoContainer = Color(0xFFD1E4FF),
    brand = KOceanGreen80,
    onBrand = KOceanGreen10,
    brandContainer = KOceanGreen30,
    onBrandContainer = KOceanGreen90,
)

// Extension property to access extended colors
val MaterialTheme.extendedColors: KExtendedColors
    @Composable
    @ReadOnlyComposable
    get() = LocalExtendedColors.current
