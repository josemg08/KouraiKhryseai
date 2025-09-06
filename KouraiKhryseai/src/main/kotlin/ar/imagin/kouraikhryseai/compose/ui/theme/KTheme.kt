package ar.imagin.kouraikhryseai.compose.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalInspectionMode
import androidx.compose.ui.platform.LocalWindowInfo
import ar.imagin.kouraikhryseai.compose.ui.theme.colors.ExtendedColorScheme
import ar.imagin.kouraikhryseai.compose.ui.theme.dimens.AdaptableDimens
import ar.imagin.kouraikhryseai.compose.ui.theme.dimens.KDimensions
import ar.imagin.kouraikhryseai.compose.ui.theme.dimens.SWOptimizationConstants

val LocalExtendedColors = staticCompositionLocalOf<ExtendedColorScheme> {
    error("No ExtendedColors provided")
}

@Composable
fun KTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    if (LocalInspectionMode.current) {
        try {
            KThemeConfigHolder.config
        } catch (_: IllegalStateException) {
            KThemeConfigHolder.init(config = KThemeConfig())
        }
    }
    val config = KThemeConfigHolder.config
    val colors = config.colors

    lateinit var colorScheme: ColorScheme
    lateinit var kColorScheme: ExtendedColorScheme

    if (darkTheme && colors.darkColorsScheme != null) {
        colorScheme = colors.darkColorsScheme!!
        kColorScheme = colors.darkExtendedColorScheme!!
    } else {
        colorScheme = colors.lightColorsScheme!!
        kColorScheme = colors.lightExtendedColorScheme!!
    }

    CompositionLocalProvider(
        LocalExtendedColors provides kColorScheme
    ) {
        MaterialTheme(
            colorScheme = colorScheme,
            typography = KTokens.typography,
            shapes = getShapes().material,
            content = content
        )
    }
}

/**.___ Convenience accessors for theme tokens __.*/
object KTokens {
    val shapes @Composable get() = getShapes()

    val materialColors @Composable get() = MaterialTheme.colorScheme

    val dimensions: KDimensions
        @Composable get() {
            val windowInfo = LocalWindowInfo.current
            val screenWidthDp = with(LocalDensity.current) {
                windowInfo.containerSize.width.toDp()
            }.value.toInt()

            return AdaptableDimens(
                delta = SWOptimizationConstants.getDeltaForScreenWidth(screenWidthDp)
            )
        }

    val typography: Typography
        @Composable get() {
            val windowInfo = LocalWindowInfo.current
            val screenWidthDp = with(LocalDensity.current) {
                windowInfo.containerSize.width.toDp()
            }.value.toInt()

            val delta = SWOptimizationConstants.getDeltaForScreenWidth(screenWidthDp)
            val config = KThemeConfigHolder.config

            return createAdaptableTypography(
                delta = delta,
                fontFamily = config.fontFamily
            )
        }
}

val KTokens.extendedColors: ExtendedColorScheme
    @Composable
    @ReadOnlyComposable
    get() = LocalExtendedColors.current