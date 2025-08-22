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

open class DimensDefault(
    /**.___
     * Spacing system following 8dp grid
     * Common use cases:
     *  - margins - paddings - dividers
     * Ideal for distances
     * __.*/
    spacing: Spacing = Spacing(
        spacing0 = 0.dp,
        spacing1 = 1.dp,
        spacing2 = 2.dp,
        spacing3 = 4.dp,
        spacing4 = 8.dp,
        spacing5 = 16.dp,
        spacing6 = 24.dp,
        spacing7 = 32.dp,
        spacing8 = 48.dp,
        spacing9 = 64.dp
    ),
    /**.___
     * For general use, this correspond to natural sizes according to the Fibonacci sequence
     * Common use cases:
     *  - Images - Icons - Avatars
     *  - Composables - Views
     * Ideal for any component with a fixed size
     *  __.*/
    componentSize: ComponentSizes = ComponentSizes(
        none = 0.dp,
        tiny = 1.dp,
        xxxSmall = 2.dp,
        xxSmall = 3.dp,
        xSmall = 5.dp,
        small = 8.dp,
        medium = 13.dp,
        large = 21.dp,
        xLarge = 34.dp,
        xxLarge = 55.dp,
        xxxLarge = 89.dp,
        huge = 144.dp,
        xHuge = 233.dp,
        xxHuge = 377.dp,
        xxxHuge = 610.dp,
        colossal = 987.dp
    ),
    /**.___ Elevation tokens for consistent shadows, following Material Design __.*/
    elevation: Elevation = Elevation(
        level0 = 0.dp,
        level1 = 2.dp,
        level2 = 4.dp,
        level3 = 8.dp,
    ),
    /**.___ Radius tokens for consistent corners __.*/
    radius: Radius = Radius(
        radius0 = 0.dp,
        radius1 = 4.dp,
        radius2 = 8.dp,
        radius3 = 12.dp,
        radius4 = 16.dp,
    ),
    /**.___ Line tokens for strokes and borders __.*/
    border: Borders = Borders(
        border1 = 1.dp,
        border2 = 2.dp,
        border3 = 4.dp
    ),
    /**.___
     * Dimensions to achieve the best results for most users, including people with accessibility needs.
     * Offial documentation:
     *  - Android -> https://developer.android.com/guide/topics/ui/accessibility/apps
     *  - Material Design -> https://m3.material.io/foundations/overview/principles
     *  - (WCAG) 2.1 -> https://www.w3.org/TR/WCAG21/
     *  __.*/
    accessibilityDimensions: AccessibilityDimensions = AccessibilityDimensions(
        // Minimum touch target size (48x48dp)
        minTouchTarget = 48.dp,
        // Recommended spacing between touchable elements
        minTouchTargetSpacing = 8.dp,
        // Minimum text element height for better touch targets
        minTextElementHeight = 48.dp,
        // Minimum width for interactive elements like buttons
        minInteractiveElementWidth = 64.dp,
        // Recommended size for important icons
        accessibleIconSize = 24.dp,
        // Minimum FAB size
        minFabSize = 56.dp,
        // Touch safe area padding
        touchSafeAreaPadding = 12.dp
    )
) : KDimensions(
    spacing = spacing,
    imageSize = componentSize,
    elevation = elevation,
    radius = radius,
    border = border,
    accessibilityDimensions = accessibilityDimensions
)