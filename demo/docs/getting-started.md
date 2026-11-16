# Getting Started

## Installation

Add the dependency to your `build.gradle` or `build.gradle.kts`:

=== "Groovy"

    ```groovy
    implementation 'io.github.josemg08:kouraikhryseai:1.0.3'
    ```

=== "Kotlin DSL"

    ```kotlin
    implementation("io.github.josemg08:kouraikhryseai:1.0.3")
    ```

=== "Version Catalog"

    ```toml
    [versions]
    kouraikhryseai = "1.0.3"

    [libraries]
    kouraikhryseai = { group = "io.github.josemg08", name = "kouraikhryseai", version.ref = "kouraikhryseai" }
    ```

    ```kotlin
    implementation(libs.kouraikhryseai)
    ```

## Version Compatibility

| Version | Kotlin | Notes |
|---------|--------|-------|
| `1.0.3` | 2.1.0 | Binary-compatible with Kotlin 2.1.0+ consumers |
| `1.0.2` | 2.4.10 | Requires Kotlin 2.4.0+ to consume |
| `1.0.1` | 2.4.10 | Requires Kotlin 2.4.0+ to consume |

If your project uses Kotlin 2.1.0–2.3.x, use **1.0.3**. If your project uses Kotlin 2.4.0+, you can use either version.

## Quick Start

Wrap your content in `KTheme` and access tokens through `KTokens` — no initialization required:

```kotlin
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KTheme {
                Surface(color = KTokens.materialColors.background) {
                    Text(
                        text = "Hello KouraiKhryseai",
                        color = KTokens.extendedColors.success
                    )
                }
            }
        }
    }
}
```

## Optional Configuration

To customize colors or fonts, initialize `KThemeConfigHolder` in your `Application` class:

### Custom Colors

```kotlin
KThemeConfigHolder.init(
    config = KThemeConfig(
        colors = KColorConfig(
            primary = Color(0xFF6750A4),
            secondary = Color(0xFF625B71),
            tertiary = Color(0xFF7D5260)
        )
    )
)
```

### Custom Font

```kotlin
val fontFamily = ResourcesCompat.getFont(this, R.font.yourFont)
    ?.let { FontFamily(it) } ?: FontFamily.Default

KThemeConfigHolder.init(
    config = KThemeConfig(
        fontFamily = fontFamily
    )
)
```

The font automatically uses the correct dimensions for scaling according to screen width.
