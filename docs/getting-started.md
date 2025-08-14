# Getting Started

This guide will help you integrate KouraiKhryseai into your Android project.

## Installation

### Gradle Setup

Add the following to your app-level `build.gradle` file:

```kotlin
dependencies {
    implementation 'com.yourpackage:kourai-khryseai:1.0.0'
}
```

## Basic Usage

### Initialize the Library

```kotlin
class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        KouraiKhryseai.initialize(this)
    }
}
```

### Using in Activities

```kotlin
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // Use KouraiKhryseai features
        val result = KouraiKhryseai.doSomething()
    }
}
```

## Next Steps

- Explore the [API Reference](api-reference.md) for detailed documentation
- Check out the demo app for working examples
- Review the source code for advanced usage patterns
