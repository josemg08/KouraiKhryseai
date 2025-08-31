package ar.imagin.kouraikhryseai.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalWindowInfo
import ar.imagin.kouraikhryseai.theme.colors.DarkColorScheme
import ar.imagin.kouraikhryseai.theme.colors.DarkExtendedColors
import ar.imagin.kouraikhryseai.theme.colors.LightColorScheme
import ar.imagin.kouraikhryseai.theme.colors.LightExtendedColors
import ar.imagin.kouraikhryseai.theme.colors.LocalExtendedColors
import ar.imagin.kouraikhryseai.theme.dimens.AdaptableDimens
import ar.imagin.kouraikhryseai.theme.dimens.KDimensions
import ar.imagin.kouraikhryseai.theme.dimens.SWOptimizationConstants

@Composable
fun KTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = false, // Disabled by default to maintain brand identity
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    val extendedColors = if (darkTheme) DarkExtendedColors else LightExtendedColors

    CompositionLocalProvider(
        LocalExtendedColors provides extendedColors
    ) {
        MaterialTheme(
            colorScheme = colorScheme,
            typography = Typography,
            shapes = getShapes().material,
            content = content
        )
    }
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