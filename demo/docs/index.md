# KouraiKhryseai

> "These are golden, and in appearance like living young women. There is intelligence in their hearts, and there is speech in them and strength..." — Homer, Iliad 18.417-420

An Android design system library based on Material 3 and the Golden Ratio, built with Jetpack Compose.

## Features

- **Material Design 3** — Full compatibility with Material 3 color schemes, typography, and shapes
- **Golden Ratio Dimensions** — Spacing and sizing following the Fibonacci sequence for natural proportions
- **Padovan Sequence** — Additional sizing system (the Plastic Ratio) for tighter aesthetic options
- **Extended Colors** — Semantic colors beyond Material 3: success, warning, info, and brand
- **Screen Adaptability** — Dimensions automatically scale based on screen width (smallest-width qualifiers)
- **Accessibility Tokens** — Built-in dimensions for touch targets, spacing, and interactive elements

## Quick Start

```kotlin
setContent {
    KTheme {
        // Use KTokens to access all theme tokens
        KTokens.materialColors.primary
        KTokens.extendedColors.success
        KTokens.dimensions.goldenRatio.goldenRatio21
        KTokens.shapes.card
    }
}
```

No initialization required. See [Getting Started](getting-started.md) for details.

## Links

- [Getting Started](getting-started.md)
- [API Reference](api-reference.md)
- [GitHub Repository](https://github.com/josemg08/KouraiKhryseai)
- [Maven Central](https://search.maven.org/artifact/io.github.josemg08/kouraikhryseai)
