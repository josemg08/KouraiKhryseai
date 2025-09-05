package ar.imagin.kouraikhryseai.theme.colors

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.core.graphics.ColorUtils

object ColorGenerator {
    fun generateTonalPalette(baseColor: Color): Map<Int, Color> {
        val hsl = FloatArray(3)
        ColorUtils.colorToHSL(baseColor.toArgb(), hsl)

        return mapOf(
            10 to createHslColor(hsl[0], hsl[1], 0.10f),
            20 to createHslColor(hsl[0], hsl[1], 0.20f),
            30 to createHslColor(hsl[0], hsl[1], 0.30f),
            40 to createHslColor(hsl[0], hsl[1], 0.40f),
            50 to baseColor,
            60 to createHslColor(hsl[0], hsl[1], 0.60f),
            70 to createHslColor(hsl[0], hsl[1], 0.70f),
            80 to createHslColor(hsl[0], hsl[1], 0.80f),
            90 to createHslColor(hsl[0], hsl[1], 0.90f),
            95 to createHslColor(hsl[0], hsl[1], 0.95f),
            99 to createHslColor(hsl[0], hsl[1], 0.99f)
        )
    }

    private fun createHslColor(hue: Float, saturation: Float, lightness: Float): Color {
        val argb = ColorUtils.HSLToColor(floatArrayOf(hue, saturation, lightness))
        return Color(argb)
    }
}