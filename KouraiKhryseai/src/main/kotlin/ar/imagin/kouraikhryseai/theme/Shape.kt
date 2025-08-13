package ar.imagin.kouraikhryseai.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import androidx.compose.ui.unit.dp

val Shapes = Shapes(
    extraSmall = RoundedCornerShape(4.dp),
    small = RoundedCornerShape(8.dp),
    medium = RoundedCornerShape(12.dp),
    large = RoundedCornerShape(16.dp),
    extraLarge = RoundedCornerShape(28.dp)
)

// Custom brand shapes for specific use cases
object KKShapes {
    val button = RoundedCornerShape(12.dp)
    val card = RoundedCornerShape(16.dp)
    val bottomSheet = RoundedCornerShape(topStart = 28.dp, topEnd = 28.dp)
    val dialog = RoundedCornerShape(24.dp)
    val fab = RoundedCornerShape(16.dp)
    val chip = RoundedCornerShape(8.dp)
    val pill = RoundedCornerShape(50)
}
