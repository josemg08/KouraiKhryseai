package ar.imagin.kouraikhryseai.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalWindowInfo
import ar.imagin.kouraikhryseai.theme.colors.ExtendedColorScheme
import ar.imagin.kouraikhryseai.theme.dimens.AdaptableDimens
import ar.imagin.kouraikhryseai.theme.dimens.KDimensions
import ar.imagin.kouraikhryseai.theme.dimens.SWOptimizationConstants

val LocalExtendedColors = staticCompositionLocalOf<ExtendedColorScheme> {
    error("No ExtendedColors provided")
}

@Composable
fun KTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
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
            typography = config.typography,
            shapes = getShapes().material,
            content = content
        )
    }
}

/**.___ Convenience accessors for theme tokens __.*/
object KTokens {
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

    val shapes @Composable get() = getShapes()

    val materialColors @Composable get() = MaterialTheme.colorScheme
}

val KTokens.extendedColors: ExtendedColorScheme
    @Composable
    @ReadOnlyComposable
    get() = LocalExtendedColors.current