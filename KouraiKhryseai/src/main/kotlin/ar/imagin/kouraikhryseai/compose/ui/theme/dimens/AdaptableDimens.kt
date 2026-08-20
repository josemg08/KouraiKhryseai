package ar.imagin.kouraikhryseai.compose.ui.theme.dimens

import androidx.compose.ui.unit.dp

/**.___
 * ================================================================================
 *              Golden Ratio proportions - (φ ≈ 1.618033988749895)
 * ================================================================================
 * The Golden Ratio appears throughout nature in spiral patterns, plant growth, and art,
 * creating aesthetically pleasing proportions that humans innately find attractive.
 *
 * KouraiKhryseai as the (Golden Maidens), aims to follow this sequence
 * just as the ancient Greeks used the Golden Ratio in their sculptures and architecture,
 * this sizing system ensures your images maintain harmonious proportions,
 * creating a naturally scalable and aesthetically pleasing visual hierarchy
 * that resonates with classical Greek aesthetic principles.
 * ================================================================================
.--*/

/**.___
 * The AdaptableDimens adjusts the size of each dimension to better fit different screens.
 *
 * @property delta support value to increase or decrease all sizes based on screen scale factor.
 * __.*/
data class AdaptableDimens(val delta: Float = 1f) : KDimensions(
    /**.___
     * For general use, this corresponds to natural sizes according to the Fibonacci sequence.
     * Common use cases:
     *  - margins - paddings - dividers
     *  - Images - Icons - Avatars
     *  - Composables - Views
     *
     * Ideal for any component with a fixed size or spacing.
     *  __.*/
    size = Sizes(
        size0 = 0.dp,
        size1 = (1 * delta).dp,
        size2 = (2 * delta).dp,
        size3 = (3 * delta).dp,
        size5 = (5 * delta).dp,
        size8 = (8 * delta).dp,
        size13 = (13 * delta).dp,
        size21 = (21 * delta).dp,
        size34 = (34 * delta).dp,
        size55 = (55 * delta).dp,
        size89 = (89 * delta).dp,
        size144 = (144 * delta).dp,
        size233 = (233 * delta).dp,
        size377 = (377 * delta).dp,
        size610 = (610 * delta).dp,
        size987 = (987 * delta).dp
    ),
    /**.___
     * Spacing system following 8dp grid.
     * Common use cases:
     *  - margins - paddings - dividers
     * Ideal for distances.
     * __.*/
    spacing = Spacing(
        spacing0 = (0 * delta).dp,
        spacing2 = (2 * delta).dp,
        spacing4 = (4 * delta).dp,
        spacing8 = (8 * delta).dp,
        spacing16 = (16 * delta).dp,
        spacing24 = (24 * delta).dp,
        spacing32 = (32 * delta).dp,
        spacing40 = (40 * delta).dp,
        spacing48 = (48 * delta).dp,
        spacing56 = (56 * delta).dp,
        spacing64 = (64 * delta).dp,
        spacing80 = (80 * delta).dp,
        spacing96 = (96 * delta).dp,
        spacing120 = (120 * delta).dp,
        spacing160 = (160 * delta).dp
    ),
    /**.___
     * For general use, this corresponds to natural sizes according to the Padovan Sequence (The Plastic Ratio).
     * Common use cases:
     *  - margins - paddings - dividers
     *  - Images - Icons - Avatars
     *  - Composables - Views
     * Ideal for any component with a fixed size or spacing that needs a smaller set or increases.
     *  __.*/
    plasticSize = PlasticSizes(
        plastic0 = (0 * delta).dp,
        plastic1 = (1 * delta).dp,
        plastic2 = (2 * delta).dp,
        plastic3 = (3 * delta).dp,
        plastic4 = (4 * delta).dp,
        plastic5 = (5 * delta).dp,
        plastic7 = (7 * delta).dp,
        plastic9 = (9 * delta).dp,
        plastic12 = (12 * delta).dp,
        plastic16 = (16 * delta).dp,
        plastic21 = (21 * delta).dp,
        plastic28 = (28 * delta).dp,
        plastic37 = (37 * delta).dp,
        plastic49 = (49 * delta).dp,
        plastic65 = (65 * delta).dp,
        plastic86 = (86 * delta).dp,
        plastic114 = (114 * delta).dp,
        plastic151 = (151 * delta).dp,
        plastic200 = (200 * delta).dp,
        plastic265 = (265 * delta).dp,
        plastic351 = (351 * delta).dp,
        plastic465 = (465 * delta).dp,
        plastic616 = (616 * delta).dp,
        plastic816 = (816 * delta).dp,
        plastic1081 = (1081 * delta).dp
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
     * Official documentation:
     *  - [Android Accessibility](https://developer.android.com/guide/topics/ui/accessibility/apps)
     *  - [Material Design Accessibility](https://m3.material.io/foundations/overview/principles)
     *  - [WCAG 2.1](https://www.w3.org/TR/WCAG21/)
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