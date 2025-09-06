package ar.imagin.kouraikhryseai.compose.ui.theme

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
        extraSmall = RoundedCornerShape(KTokens.dimensions.radius.radius2),
        small = RoundedCornerShape(KTokens.dimensions.radius.radius3),
        medium = RoundedCornerShape(KTokens.dimensions.radius.radius4),
        large = RoundedCornerShape(KTokens.dimensions.radius.radius5),
        extraLarge = RoundedCornerShape(KTokens.dimensions.size.size8)
    ),
    button = RoundedCornerShape(KTokens.dimensions.radius.radius4),
    card = RoundedCornerShape(KTokens.dimensions.radius.radius5),
    bottomSheet = RoundedCornerShape(
        topStart = KTokens.dimensions.size.size8,
        topEnd = KTokens.dimensions.size.size8
    ),
    dialog = RoundedCornerShape(KTokens.dimensions.size.size7),
    fab = RoundedCornerShape(KTokens.dimensions.radius.radius5),
    chip = RoundedCornerShape(KTokens.dimensions.radius.radius3),
    pill = RoundedCornerShape(50)
)