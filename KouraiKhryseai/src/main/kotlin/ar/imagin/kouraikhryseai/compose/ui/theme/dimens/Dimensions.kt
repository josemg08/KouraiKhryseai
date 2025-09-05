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
    val spacing1: Dp,
    val spacing2: Dp,
    val spacing3: Dp,
    val spacing4: Dp,
    val spacing5: Dp,
    val spacing6: Dp,
    val spacing7: Dp,
    val spacing8: Dp,
    val spacing9: Dp,
)

/**.___
 * For general use, this correspond to natural sizes according to the Fibonacci sequence
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
    val size4: Dp,
    val size5: Dp,
    val size6: Dp,
    val size7: Dp,
    val size8: Dp,
    val size9: Dp,
    val size10: Dp,
    val size11: Dp,
    val size12: Dp,
    val size13: Dp,
    val size14: Dp,
    val size15: Dp
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
