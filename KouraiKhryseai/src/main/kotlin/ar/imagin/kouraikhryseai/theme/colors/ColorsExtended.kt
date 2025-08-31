package ar.imagin.kouraikhryseai.theme.colors

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import ar.imagin.kouraikhryseai.theme.KTokens

data class KExtendedColors(
    // Success colors follow Material3 patterns
    val success: Color,
    val onSuccess: Color,
    val successContainer: Color,
    val onSuccessContainer: Color,
    // Warning colors follow Material3 patterns
    val warning: Color,
    val onWarning: Color,
    val warningContainer: Color,
    val onWarningContainer: Color,
    // Info colors follow Material3 patterns
    val info: Color,
    val onInfo: Color,
    val infoContainer: Color,
    val onInfoContainer: Color,
    // Brand colors follow Material3 patterns
    val brand: Color,
    val onBrand: Color,
    val brandContainer: Color,
    val onBrandContainer: Color,
)

val LocalExtendedColors = staticCompositionLocalOf<KExtendedColors> {
    error("No ExtendedColors provided")
}

// Light theme colors using Material3 color rules
val LightExtendedColors = KExtendedColors(
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

// Dark theme colors using Material3 color rules
val DarkExtendedColors = KExtendedColors(
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

val KTokens.extendedColors: KExtendedColors
    @Composable
    @ReadOnlyComposable
    get() = LocalExtendedColors.current