package ar.imagin.kouraikhryseai.compose.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

/**.___
 * Material Design 3 Typography with adaptable sp dimensions
 * to adjusts for a better fit in different screens.
 * @fontFamily provide any FontFamily you require, FontFamily.Default by default
 * @delta support value to increase or decrease all sizes
 * check SWOptimizationConstants for more information on screen adaptability
 * __.*/
fun createAdaptableTypography(
    delta: Float = 1f,
    fontFamily: FontFamily = FontFamily.Default
): Typography {
    return Typography(
        //.___ Display styles - for large, high-emphasis text __./
        displayLarge = TextStyle(
            fontFamily = fontFamily,
            fontWeight = FontWeight.Normal,
            fontSize = (57 * delta).sp,
            lineHeight = (64 * delta).sp,
            letterSpacing = (-0.25 * delta).sp
        ),
        displayMedium = TextStyle(
            fontFamily = fontFamily,
            fontWeight = FontWeight.Normal,
            fontSize = (45 * delta).sp,
            lineHeight = (52 * delta).sp,
            letterSpacing = (0 * delta).sp
        ),
        displaySmall = TextStyle(
            fontFamily = fontFamily,
            fontWeight = FontWeight.Normal,
            fontSize = (36 * delta).sp,
            lineHeight = (44 * delta).sp,
            letterSpacing = (0 * delta).sp
        ),

        //.___ Headline styles - for high-emphasis, shorter text __./
        headlineLarge = TextStyle(
            fontFamily = fontFamily,
            fontWeight = FontWeight.Normal,
            fontSize = (32 * delta).sp,
            lineHeight = (40 * delta).sp,
            letterSpacing = (0 * delta).sp
        ),
        headlineMedium = TextStyle(
            fontFamily = fontFamily,
            fontWeight = FontWeight.Normal,
            fontSize = (28 * delta).sp,
            lineHeight = (36 * delta).sp,
            letterSpacing = (0 * delta).sp
        ),
        headlineSmall = TextStyle(
            fontFamily = fontFamily,
            fontWeight = FontWeight.Normal,
            fontSize = (24 * delta).sp,
            lineHeight = (32 * delta).sp,
            letterSpacing = (0 * delta).sp
        ),

        //.___ Title styles - for medium-emphasis text __./
        titleLarge = TextStyle(
            fontFamily = fontFamily,
            fontWeight = FontWeight.Medium,
            fontSize = (22 * delta).sp,
            lineHeight = (28 * delta).sp,
            letterSpacing = (0 * delta).sp
        ),
        titleMedium = TextStyle(
            fontFamily = fontFamily,
            fontWeight = FontWeight.Medium,
            fontSize = (16 * delta).sp,
            lineHeight = (24 * delta).sp,
            letterSpacing = (0.15 * delta).sp
        ),
        titleSmall = TextStyle(
            fontFamily = fontFamily,
            fontWeight = FontWeight.Medium,
            fontSize = (14 * delta).sp,
            lineHeight = (20 * delta).sp,
            letterSpacing = (0.1 * delta).sp
        ),

        //.___ Body styles - for longer-form writing __./
        bodyLarge = TextStyle(
            fontFamily = fontFamily,
            fontWeight = FontWeight.Normal,
            fontSize = (16 * delta).sp,
            lineHeight = (24 * delta).sp,
            letterSpacing = (0.5 * delta).sp
        ),
        bodyMedium = TextStyle(
            fontFamily = fontFamily,
            fontWeight = FontWeight.Normal,
            fontSize = (14 * delta).sp,
            lineHeight = (20 * delta).sp,
            letterSpacing = (0.25 * delta).sp
        ),
        bodySmall = TextStyle(
            fontFamily = fontFamily,
            fontWeight = FontWeight.Normal,
            fontSize = (12 * delta).sp,
            lineHeight = (16 * delta).sp,
            letterSpacing = (0.4 * delta).sp
        ),

        //.___ Label styles - for smaller, utilitarian text __./
        labelLarge = TextStyle(
            fontFamily = fontFamily,
            fontWeight = FontWeight.Medium,
            fontSize = (14 * delta).sp,
            lineHeight = (20 * delta).sp,
            letterSpacing = (0.1 * delta).sp
        ),
        labelMedium = TextStyle(
            fontFamily = fontFamily,
            fontWeight = FontWeight.Medium,
            fontSize = (12 * delta).sp,
            lineHeight = (16 * delta).sp,
            letterSpacing = (0.5 * delta).sp
        ),
        labelSmall = TextStyle(
            fontFamily = fontFamily,
            fontWeight = FontWeight.Medium,
            fontSize = (11 * delta).sp,
            lineHeight = (16 * delta).sp,
            letterSpacing = (0.5 * delta).sp
        )
    )
}