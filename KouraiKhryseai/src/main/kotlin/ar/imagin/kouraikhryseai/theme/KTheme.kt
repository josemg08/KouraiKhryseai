package ar.imagin.kouraikhryseai.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalWindowInfo
import ar.imagin.kouraikhryseai.theme.colors.ColorGenerator
import ar.imagin.kouraikhryseai.theme.dimens.AdaptableDimens
import ar.imagin.kouraikhryseai.theme.dimens.KDimensions
import ar.imagin.kouraikhryseai.theme.dimens.SWOptimizationConstants

@Composable
fun KTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    val config = KThemeConfigHolder.config
    val colors = config.colors

    val colorScheme = if (darkTheme && colors.darkColorsScheme != null) {
        colors.darkColorsScheme!!
    } else {
        colors.lightColorsScheme!!
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = config.typography,
        shapes = getShapes().material,
        content = content
    )
}

//.___ Convenience accessors for theme tokens __./
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