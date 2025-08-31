package ar.imagin.kouraikhryseai.theme.dimens

/**.___
    ================================================================================
                 Golden Ratio proportions - (φ ≈ 1.618033988749895)
    ================================================================================
    The Golden Ratio appears throughout nature in spiral patterns, plant growth, and art,
    creating aesthetically pleasing proportions that humans innately find attractive.

    KouraiKhryseai as the (Golden Maidens), aims to follow this sequence
    just as the ancient Greeks used the Golden Ratio in their sculptures and architecture,
    this sizing system ensures your images maintain harmonious proportions,
    creating a naturally scalable and aesthetically pleasing visual hierarchy
    that resonates with classical Greek aesthetic principles.
    ================================================================================
.--*/

import androidx.compose.ui.unit.dp

/**.___
 * The AdaptableDimens adjusts the size of each dimension to better fit different screens.
 * @delta support value to increase or decrease all sizes
 * __.*/
data class AdaptableDimens(val delta: Float = 1f) : KDimensions(
    /**.___
     * For general use, this correspond to natural sizes according to the Fibonacci sequence
     * Common use cases:
     *  - margins - paddings - dividers
     *  - Images - Icons - Avatars
     *  - Composables - Views
     * Ideal for any component with a fixed size or spacing
     *  __.*/
    size = Sizes(
        size0 = 0.dp,
        size1 = (1 * delta).dp,
        size2 = (2 * delta).dp,
        size3 = (3 * delta).dp,
        size4 = (5 * delta).dp,
        size5 = (8 * delta).dp,
        size6 = (13 * delta).dp,
        size7 = (21 * delta).dp,
        size8 = (34 * delta).dp,
        size9 = (55 * delta).dp,
        size10 = (89 * delta).dp,
        size11 = (144 * delta).dp,
        size12 = (233 * delta).dp,
        size13 = (377 * delta).dp,
        size14 = (610 * delta).dp,
        size15 = (987 * delta).dp
    ),
    /**.___ Elevation tokens for consistent shadows, following Material Design __.*/
    elevation = Elevation(
        level0 = 0.dp,
        level1 = (2 * delta).dp,
        level2 = (4 * delta).dp,
        level3 = (8 * delta).dp
    ),
    /**.___ Radius tokens for consistent corners __.*/
    radius = Radius(
        radius0 = 0.dp,
        radius1 = (2 * delta).dp,
        radius2 = (4 * delta).dp,
        radius3 = (8 * delta).dp,
        radius4 = (12 * delta).dp,
        radius5 = (16 * delta).dp
    ),
    /**.___ Line tokens for strokes and borders __.*/
    border = Borders(
        border1 = (1 * delta).dp,
        border2 = (2 * delta).dp,
        border3 = (4 * delta).dp
    ),
    /**.___
     * Dimensions to achieve the best results for most users, including people with accessibility needs.
     * Offial documentation:
     *  - Android -> https://developer.android.com/guide/topics/ui/accessibility/apps
     *  - Material Design -> https://m3.material.io/foundations/overview/principles
     *  - (WCAG) 2.1 -> https://www.w3.org/TR/WCAG21/
     *  __.*/
    accessibilityDimensions = AccessibilityDimensions(
        // Minimum touch target size (48x48dp)
        minTouchTarget = (48 * delta).dp,
        // Recommended spacing between touchable elements
        minTouchTargetSpacing = (8 * delta).dp,
        // Minimum text element height for better touch targets
        minTextElementHeight = (48 * delta).dp,
        // Minimum width for interactive elements like buttons
        minInteractiveElementWidth = (64 * delta).dp,
        // Recommended size for important icons
        accessibleIconSize = (24 * delta).dp,
        // Minimum FAB size
        minFabSize = (56 * delta).dp,
        // Touch safe area padding
        touchSafeAreaPadding = (12 * delta).dp
    )
)