package ar.imagin.kouraikhryseai.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Shape

data class ExtendedShapes(
    val material: Shapes,
    val button: Shape,
    val card: Shape,
    val bottomSheet: Shape,
    val dialog: Shape,
    val fab: Shape,
    val chip: Shape,
    val pill: Shape
)

@Composable
fun getShapes() = ExtendedShapes(
    material = Shapes(
        extraSmall = RoundedCornerShape(KTheme.dimensions.radius.radius2),
        small = RoundedCornerShape(KTheme.dimensions.radius.radius3),
        medium = RoundedCornerShape(KTheme.dimensions.radius.radius4),
        large = RoundedCornerShape(KTheme.dimensions.radius.radius5),
        extraLarge = RoundedCornerShape(KTheme.dimensions.size.size8)
    ),
    button = RoundedCornerShape(KTheme.dimensions.radius.radius4),
    card = RoundedCornerShape(KTheme.dimensions.radius.radius5),
    bottomSheet = RoundedCornerShape(
        topStart = KTheme.dimensions.size.size8,
        topEnd = KTheme.dimensions.size.size8
    ),
    dialog = RoundedCornerShape(KTheme.dimensions.size.size7),
    fab = RoundedCornerShape(KTheme.dimensions.radius.radius5),
    chip = RoundedCornerShape(KTheme.dimensions.radius.radius3),
    pill = RoundedCornerShape(50)
)