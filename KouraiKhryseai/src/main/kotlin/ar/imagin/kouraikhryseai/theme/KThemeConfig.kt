package ar.imagin.kouraikhryseai.theme

import androidx.compose.ui.graphics.Color
import androidx.compose.material3.Typography
import ar.imagin.kouraikhryseai.theme.colors.DarkBlue10
import ar.imagin.kouraikhryseai.theme.colors.DarkBlue20
import ar.imagin.kouraikhryseai.theme.colors.DarkBlue30
import ar.imagin.kouraikhryseai.theme.colors.DarkBlue40
import ar.imagin.kouraikhryseai.theme.colors.DarkBlue50
import ar.imagin.kouraikhryseai.theme.colors.DarkBlue90
import ar.imagin.kouraikhryseai.theme.colors.Error40
import ar.imagin.kouraikhryseai.theme.colors.Error80
import ar.imagin.kouraikhryseai.theme.colors.Error90
import ar.imagin.kouraikhryseai.theme.colors.ErrorContainer
import ar.imagin.kouraikhryseai.theme.colors.Neutral10
import ar.imagin.kouraikhryseai.theme.colors.Neutral20
import ar.imagin.kouraikhryseai.theme.colors.Neutral90
import ar.imagin.kouraikhryseai.theme.colors.Neutral95
import ar.imagin.kouraikhryseai.theme.colors.Neutral99
import ar.imagin.kouraikhryseai.theme.colors.NeutralVariant30
import ar.imagin.kouraikhryseai.theme.colors.NeutralVariant50
import ar.imagin.kouraikhryseai.theme.colors.NeutralVariant60
import ar.imagin.kouraikhryseai.theme.colors.NeutralVariant80
import ar.imagin.kouraikhryseai.theme.colors.NeutralVariant90
import ar.imagin.kouraikhryseai.theme.colors.OceanGreen40
import ar.imagin.kouraikhryseai.theme.colors.OceanGreen80
import ar.imagin.kouraikhryseai.theme.colors.OnError
import ar.imagin.kouraikhryseai.theme.colors.OnErrorContainer
import ar.imagin.kouraikhryseai.theme.colors.Orange10
import ar.imagin.kouraikhryseai.theme.colors.Scrim
import ar.imagin.kouraikhryseai.theme.colors.SemanticColorScheme
import ar.imagin.kouraikhryseai.theme.colors.Transparent

data class KColorConfig(
    val primary: Color = Color(0xFF20373b),
    val secondary: Color = Color(0xFFff8800),
    val tertiary: Color = Color(0xFF161620),
    val lightColors: SemanticColorScheme = SemanticColorScheme(
        background = Neutral99,
        onBackground = Neutral10,
        surface = Neutral99,
        onSurface = Neutral10,
        surfaceVariant = NeutralVariant90,
        onSurfaceVariant = NeutralVariant30,
        surfaceTint = OceanGreen40,
        inverseSurface = Neutral20,
        inverseOnSurface = Neutral95,
        error = Error40,
        onError = OnError,
        errorContainer = Error90,
        onErrorContainer = Orange10,
        outline = NeutralVariant50,
        outlineVariant = NeutralVariant80,
        scrim = Scrim,
        surfaceBright = Neutral99,
        surfaceDim = NeutralVariant90,
        surfaceContainer = Neutral90,
        surfaceContainerHigh = NeutralVariant90,
        surfaceContainerHighest = NeutralVariant80,
        surfaceContainerLow = Neutral95,
        surfaceContainerLowest = Transparent
    ),
    val darkColors: SemanticColorScheme = SemanticColorScheme(
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
        onError = OnError,
        errorContainer = ErrorContainer,
        onErrorContainer = OnErrorContainer,
        outline = NeutralVariant60,
        outlineVariant = NeutralVariant30,
        scrim = Scrim,
        surfaceBright = DarkBlue40,
        surfaceDim = DarkBlue10,
        surfaceContainer = DarkBlue30,
        surfaceContainerHigh = DarkBlue40,
        surfaceContainerHighest = DarkBlue50,
        surfaceContainerLow = DarkBlue20,
        surfaceContainerLowest = DarkBlue10
    )
)

data class KThemeConfig(
    val colors: KColorConfig = KColorConfig(),
    val typography: Typography = Typography()
)

object KThemeConfigHolder {
    private var _config: KThemeConfig? = null

    val config: KThemeConfig
        get() = _config ?: error("KThemeConfig not initialized")

    fun init(config: KThemeConfig) {
        _config = config
    }
}