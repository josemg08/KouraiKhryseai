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
 * For general use, sizes increasing in pair intervals.
 * Common use cases:
 *  - Images - Icons - Avatars
 *  - Composables - Views
 * Ideal for any component with a fixed size
 *  __.*/
@Immutable
data class Sizes(
    val size0: Dp,
    val size1: Dp,
    val size2: Dp,
    val size4: Dp,
    val size6: Dp,
    val size8: Dp,
    val size10: Dp,
    val size12: Dp,
    val size16: Dp,
    val size18: Dp,
    val size20: Dp,
    val size24: Dp,
    val size28: Dp,
    val size32: Dp,
    val size36: Dp,
    val size40: Dp,
    val size48: Dp,
    val size56: Dp,
    val size64: Dp,
    val size80: Dp,
    val size96: Dp,
    val size120: Dp,
    val size160: Dp,
    val size200: Dp,
    val size240: Dp,
    val size280: Dp,
    val size320: Dp,
    val size360: Dp,
    val size400: Dp,
    val size480: Dp,
    val size560: Dp,
    val size640: Dp,
    val size720: Dp,
    val size800: Dp,
    val size960: Dp,
    val size1200: Dp
)

/**.___
 * For general use, this corresponds to natural sizes according to the Fibonacci sequence (φ ≈ 1.618033988749895)
 * With the golden ratio, we can create aesthetically pleasing proportions that resonate with classical Greek aesthetic principles.
 * Common use cases:
 *  - Images - Icons - Avatars
 *  - Composables - Views
 * More limited than sizes, but ideal to keep consistency and aesthetic proportions.
 *  __.*/
@Immutable
data class Fibonacci(
    val goldenRatio0: Dp,
    val goldenRatio1: Dp,
    val goldenRatio2: Dp,
    val goldenRatio3: Dp,
    val goldenRatio5: Dp,
    val goldenRatio8: Dp,
    val goldenRatio13: Dp,
    val goldenRatio21: Dp,
    val goldenRatio34: Dp,
    val goldenRatio55: Dp,
    val goldenRatio89: Dp,
    val goldenRatio144: Dp,
    val goldenRatio233: Dp,
    val goldenRatio377: Dp,
    val goldenRatio610: Dp,
    val goldenRatio987: Dp
)

/**.___
 * This corresponds to the Padovan Sequence (The Plastic Ratio) a sequence based on Fibonacci but one that keeps the numbers closer together.
 * To be utilized when more precise and closer numbers are a must, while maintaining aesthetic proportions and symmetry similar to the Golden Ratio.
 * Common use cases:
 *  - Images - Icons - Avatars
 *  - Composables - Views
 * More limited than sizes, but with more options than the golden ratio, ideal to keep consistency and aesthetic proportions.
 *  __.*/
@Immutable
data class Padovan(
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
 * Official documentation:
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
