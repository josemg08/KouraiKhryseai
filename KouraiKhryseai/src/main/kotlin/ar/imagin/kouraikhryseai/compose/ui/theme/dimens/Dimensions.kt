package ar.imagin.kouraikhryseai.compose.ui.theme.dimens

import androidx.compose.runtime.Immutable
import androidx.compose.ui.unit.Dp

/**.___
 * Spacing system following 8dp grid
 * Common use cases:
 *  - margins - paddings - dividers
 * Ideal for distances
 * __.*/
@Immutable
data class Spacing(
    val spacing0: Dp,
    val spacing2: Dp,
    val spacing4: Dp,
    val spacing8: Dp,
    val spacing16: Dp,
    val spacing24: Dp,
    val spacing32: Dp,
    val spacing40: Dp,
    val spacing48: Dp,
    val spacing56: Dp,
    val spacing64: Dp,
    val spacing80: Dp,
    val spacing96: Dp,
    val spacing120: Dp,
    val spacing160: Dp
)

/**.___
 * For general use, this corresponds to natural sizes according to the Fibonacci sequence (φ ≈ 1.618033988749895)
 * With the golden ratio, we can create aesthetically pleasing proportions that resonate with classical Greek aesthetic principles.
 * Common use cases:
 *  - margins - paddings - dividers
 *  - Images - Icons - Avatars
 *  - Composables - Views
 * Ideal for any component with a fixed size or spacing
 *  __.*/
@Immutable
data class Sizes(
    val size0: Dp,
    val size1: Dp,
    val size2: Dp,
    val size3: Dp,
    val size5: Dp,
    val size8: Dp,
    val size13: Dp,
    val size21: Dp,
    val size34: Dp,
    val size55: Dp,
    val size89: Dp,
    val size144: Dp,
    val size233: Dp,
    val size377: Dp,
    val size610: Dp,
    val size987: Dp
)

/**.___
* This corresponds to the Padovan Sequence (The Plastic Ratio) a sequence based on Fibonacci but one that keeps the numbers closer together.
* To be utilized when more precise and closer numbers are a must, while maintaining aesthetic proportions and symmetry similar to the Golden Ratio.
* Common use cases:
*  - margins - paddings - dividers
*  - Images - Icons - Avatars
*  - Composables - Views
* Ideal for any component with a fixed size or spacing that needs a smaller set or increases
*  __.*/
@Immutable
data class PlasticSizes(
    val plastic0: Dp,
    val plastic1: Dp,
    val plastic2: Dp,
    val plastic3: Dp,
    val plastic4: Dp,
    val plastic5: Dp,
    val plastic7: Dp,
    val plastic9: Dp,
    val plastic12: Dp,
    val plastic16: Dp,
    val plastic21: Dp,
    val plastic28: Dp,
    val plastic37: Dp,
    val plastic49: Dp,
    val plastic65: Dp,
    val plastic86: Dp,
    val plastic114: Dp,
    val plastic151: Dp,
    val plastic200: Dp,
    val plastic265: Dp,
    val plastic351: Dp,
    val plastic465: Dp,
    val plastic616: Dp,
    val plastic816: Dp,
    val plastic1081: Dp
)

/**.___ Elevation tokens for consistent shadows, following Material Design __.*/
@Immutable
data class Elevation(
    val level0: Dp,
    val level1: Dp,
    val level2: Dp,
    val level3: Dp
)

/**.___ Radius tokens for consistent corners __.*/
@Immutable
data class Radius(
    val radius0: Dp,
    val radius1: Dp,
    val radius2: Dp,
    val radius3: Dp,
    val radius4: Dp,
    val radius5: Dp
)

/**.___ Line tokens for strokes and borders __.*/
@Immutable
data class Borders(
    val border1: Dp,
    val border2: Dp,
    val border3: Dp
)

/**.___
 * Dimensions to achieve the best results for most users, including people with accessibility needs.
 * Offial documentation:
 *  - Android -> https://developer.android.com/guide/topics/ui/accessibility/apps
 *  - Material Design -> https://m3.material.io/foundations/overview/principles
 *  - (WCAG) 2.1 -> https://www.w3.org/TR/WCAG21/
 *  __.*/
@Immutable
data class AccessibilityDimensions(
    // Minimum touch target size (48x48dp)
    val minTouchTarget: Dp,
    // Recommended spacing between touchable elements
    val minTouchTargetSpacing: Dp,
    // Minimum text element height for better touch targets
    val minTextElementHeight: Dp,
    // Minimum width for interactive elements like buttons
    val minInteractiveElementWidth: Dp,
    // Recommended size for important icons
    val accessibleIconSize: Dp,
    // Minimum FAB size
    val minFabSize: Dp,
    // Touch safe area padding
    val touchSafeAreaPadding: Dp
)
