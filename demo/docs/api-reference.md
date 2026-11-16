# API Reference

## KTheme

The main theme composable. Wraps `MaterialTheme` and provides extended tokens.

```kotlin
@Composable
fun KTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
)
```

## KTokens

Accessor object for all theme tokens. Use inside a `KTheme` block.

### materialColors

Standard Material 3 `ColorScheme`.

```kotlin
KTokens.materialColors.primary
KTokens.materialColors.surface
KTokens.materialColors.error
```

### extendedColors

Extended semantic colors beyond Material 3.

```kotlin
KTokens.extendedColors.success
KTokens.extendedColors.onSuccess
KTokens.extendedColors.successContainer
KTokens.extendedColors.onSuccessContainer

KTokens.extendedColors.warning
KTokens.extendedColors.info
KTokens.extendedColors.brand
```

### dimensions

Adaptable `KDimensions` that scale automatically based on screen width.

```kotlin
// Spacing (8dp grid)
KTokens.dimensions.spacing.spacing16

// General sizes
KTokens.dimensions.sizes.size24

// Fibonacci sequence (Golden Ratio)
KTokens.dimensions.goldenRatio.goldenRatio21

// Padovan sequence (Plastic Ratio)
KTokens.dimensions.plasticSize.plastic86

// Elevation, radius, borders
KTokens.dimensions.elevation.level1
KTokens.dimensions.radius.radius4
KTokens.dimensions.border.border2

// Accessibility
KTokens.dimensions.accessibilityDimensions.minTouchTarget
```

### typography

Adaptable `Typography` that scales font sizes based on screen width.

```kotlin
KTokens.typography.displayLarge
KTokens.typography.bodyMedium
KTokens.typography.labelSmall
```

### shapes

Custom `ExtendedShapes` for components.

```kotlin
KTokens.shapes.material   // Material 3 Shapes
KTokens.shapes.button
KTokens.shapes.card
KTokens.shapes.bottomSheet
KTokens.shapes.dialog
KTokens.shapes.fab
KTokens.shapes.chip
KTokens.shapes.pill
```

## KThemeConfig

Configuration for `KTheme`. Passed to `KThemeConfigHolder.init()`.

```kotlin
data class KThemeConfig(
    val colors: KColorConfig = KColorConfig(),
    val fontFamily: FontFamily = FontFamily.Default
)
```

## KColorConfig

Color configuration. Defaults to brand colors (KDarkBlue, KOrange, KOceanGreen).

```kotlin
data class KColorConfig(
    var primary: Color? = null,
    var secondary: Color? = null,
    var tertiary: Color? = null,
    var lightColorsScheme: ColorScheme? = null,
    var darkColorsScheme: ColorScheme? = null,
    var lightExtendedColorScheme: ExtendedColorScheme? = null,
    var darkExtendedColorScheme: ExtendedColorScheme? = null
)
```

Provide `primary`, `secondary`, and `tertiary` to auto-generate a full `ColorScheme`, or provide complete `ColorScheme` objects directly.

## KThemeConfigHolder

Singleton holder for `KThemeConfig`.

```kotlin
// Initialize with custom config
KThemeConfigHolder.init(config = KThemeConfig(...))

// Access current config (defaults if not initialized)
KThemeConfigHolder.config
```

## SWOptimizationConstants

Screen width breakpoints and delta multipliers for adaptive dimensions.

| Screen Width | Delta | Effect |
|-------------|-------|--------|
| < 320dp | 0.75 | 75% of default size |
| 320–599dp | 1.0 | Default size |
| ≥ 600dp | 1.5 | 150% of default size |
