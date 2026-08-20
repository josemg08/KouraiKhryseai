package ar.imagin.kouraikhryseai.compose.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.platform.LocalConfiguration
import ar.imagin.kouraikhryseai.compose.ui.theme.colors.ExtendedColorScheme
import ar.imagin.kouraikhryseai.compose.ui.theme.dimens.AdaptableDimens
import ar.imagin.kouraikhryseai.compose.ui.theme.dimens.KDimensions
import ar.imagin.kouraikhryseai.compose.ui.theme.dimens.SWOptimizationConstants

val LocalExtendedColors = staticCompositionLocalOf<ExtendedColorScheme> {
    error("No ExtendedColors provided")
}

/**
 * The main entry point for the KouraiKhryseai theme.
 * Wraps the [MaterialTheme] and provides additional tokens like [ExtendedColorScheme] and adaptable dimensions.
 *
 * @param darkTheme Whether the theme should use dark colors. Defaults to [isSystemInDarkTheme].
 * @param dynamicColor Whether to use dynamic color (Android 12+).
 * @param content The composable content to be themed.
 *
 * Example usage:
 * ```kotlin
 * KTheme {
 *     Surface(color = KTokens.materialColors.background) {
 *         Text(
 *             text = "Hello KouraiKhryseai",
 *             color = KTokens.extendedColors.success
 *         )
 *     }
 * }
 * ```
 */
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
            typography = KTokens.typography,
            shapes = getShapes().material,
            content = content
        )
    }
}

/**.___
 * Accessor for all theme tokens including Material3 colors, extended colors, typography, and dimensions.
 * Use these tokens to maintain consistency across your application.
 *
 * Available tokens:
 * - [materialColors]: Standard Material Design 3 color scheme.
 * - [extendedColors]: Custom semantic colors (success, warning, info, brand).
 * - [typography]: Adaptable text styles.
 * - [dimensions]: Adaptable spacing, sizes, and radius.
 * - [shapes]: Custom corner shapes for components.
 __.*/
object KTokens {
    /**
     * Accessor for the current [ExtendedShapes].
     */
    val shapes @Composable get() = getShapes()

    /**
     * Accessor for the current Material3 [ColorScheme].
     */
    val materialColors @Composable get() = MaterialTheme.colorScheme

    /**
     * Accessor for adaptable [KDimensions].
     * Dimensions are automatically scaled based on the screen width to provide a consistent UI across devices.
     */
    val dimensions: KDimensions
        @Composable get() {
            val configuration = LocalConfiguration.current
            val screenWidthDp = configuration.screenWidthDp

            return AdaptableDimens(
                delta = SWOptimizationConstants.getDeltaForScreenWidth(screenWidthDp)
            )
        }

    /**
     * Accessor for adaptable [Typography].
     * Typography scales its font sizes based on screen width using a delta factor.
     */
    val typography: Typography
        @Composable get() {
            val configuration = LocalConfiguration.current
            val screenWidthDp = configuration.screenWidthDp

            val delta = SWOptimizationConstants.getDeltaForScreenWidth(screenWidthDp)
            val config = KThemeConfigHolder.config

            return createAdaptableTypography(
                delta = delta,
                fontFamily = config.fontFamily
            )
        }
}

/**
 * Extension property to access [ExtendedColorScheme] from [KTokens].
 * Contains additional semantic colors like success, warning, and info.
 */
val KTokens.extendedColors: ExtendedColorScheme
    @Composable
    @ReadOnlyComposable
    get() = LocalExtendedColors.current