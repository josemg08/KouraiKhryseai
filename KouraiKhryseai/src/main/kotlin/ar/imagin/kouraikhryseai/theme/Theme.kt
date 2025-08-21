package ar.imagin.kouraikhryseai.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.platform.LocalContext
import ar.imagin.kouraikhryseai.theme.colors.DarkColorScheme
import ar.imagin.kouraikhryseai.theme.colors.DarkExtendedColors
import ar.imagin.kouraikhryseai.theme.colors.LightColorScheme
import ar.imagin.kouraikhryseai.theme.colors.LightExtendedColors
import ar.imagin.kouraikhryseai.theme.colors.LocalExtendedColors

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
            shapes = Shapes,
            content = content
        )
    }
}

//.___ Convenience accessors for theme tokens __./
object KTheme {
    val spacing: KSpacing
        @Composable get() = KSpacing

    val elevation: KElevation
        @Composable get() = KElevation

    val dimensions: KDimensions
        @Composable get() = KDimensions

    val shapes: KShapes
        @Composable get() = KShapes
}
