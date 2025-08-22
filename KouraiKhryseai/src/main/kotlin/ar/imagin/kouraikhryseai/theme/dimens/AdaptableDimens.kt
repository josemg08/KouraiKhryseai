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
     * Spacing system following 8dp grid
     * Common use cases:
     *  - margins - paddings - dividers
     * Ideal for distances
     * __.*/
    spacing = Spacing(
        spacing0 = 0.dp,
        spacing1 = (1 * delta).dp,
        spacing2 = (2 * delta).dp,
        spacing3 = (4 * delta).dp,
        spacing4 = (8 * delta).dp,
        spacing5 = (16 * delta).dp,
        spacing6 = (24 * delta).dp,
        spacing7 = (32 * delta).dp,
        spacing8 = (48 * delta).dp,
        spacing9 = (64 * delta).dp
    ),
    /**.___
     * For general use, this correspond to natural sizes according to the Fibonacci sequence
     * Common use cases:
     *  - Images - Icons - Avatars
     *  - Composables - Views
     * Ideal for any component with a fixed size
     *  __.*/
    componentSize = ComponentSizes(
        none = 0.dp,
        tiny = (1 * delta).dp,
        xxxSmall = (2 * delta).dp,
        xxSmall = (3 * delta).dp,
        xSmall = (5 * delta).dp,
        small = (8 * delta).dp,
        medium = (13 * delta).dp,
        large = (21 * delta).dp,
        xLarge = (34 * delta).dp,
        xxLarge = (55 * delta).dp,
        xxxLarge = (89 * delta).dp,
        huge = (144 * delta).dp,
        xHuge = (233 * delta).dp,
        xxHuge = (377 * delta).dp,
        xxxHuge = (610 * delta).dp,
        colossal = (987 * delta).dp
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
        radius1 = (4 * delta).dp,
        radius2 = (8 * delta).dp,
        radius3 = (12 * delta).dp,
        radius4 = (16 * delta).dp
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