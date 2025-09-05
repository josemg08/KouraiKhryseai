package ar.imagin.kouraikhryseai.theme.colors

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.core.graphics.ColorUtils

object ColorGenerator {
    fun generateTonalPalette(baseColor: Color): Map<Int, Color> {
        val hSLValues = FloatArray(3)
        ColorUtils.colorToHSL(baseColor.toArgb(), hSLValues)

        return mapOf(
            10 to createHslColor(hSLValues[0], hSLValues[1], 0.05f),
            20 to createHslColor(hSLValues[0], hSLValues[1], 0.10f),
            30 to createHslColor(hSLValues[0], hSLValues[1], 0.15f),
            40 to createHslColor(hSLValues[0], hSLValues[1], 0.20f),
            50 to baseColor,
            60 to createHslColor(hSLValues[0], hSLValues[1], 0.30f),
            70 to createHslColor(hSLValues[0], hSLValues[1], 0.35f),
            80 to createHslColor(hSLValues[0], hSLValues[1], 0.40f),
            90 to createHslColor(hSLValues[0], hSLValues[1], 0.45f),
            95 to createHslColor(hSLValues[0], hSLValues[1], 0.50f),
            99 to createHslColor(hSLValues[0], hSLValues[1], 0.55f)
        )
    }

    private fun createHslColor(hue: Float, saturation: Float, lightness: Float): Color {
        val argb = ColorUtils.HSLToColor(floatArrayOf(hue, saturation, lightness))
        return Color(argb)
    }
}