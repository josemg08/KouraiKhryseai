# API Reference

This page provides detailed documentation for the KouraiKhryseai API.

## Core Classes

### KouraiKhryseai

The main entry point for the library.

#### Methods

##### `initialize(context: Context)`
Initializes the library with the application context.

**Parameters:**
- `context` - Application context

**Example:**
```kotlin
KouraiKhryseai.initialize(this)
```


##### `doSomething(): String`
Performs the main library function.

**Returns:**
- `String` - Result of the operation

**Example:**
```kotlin
val result = KouraiKhryseai.doSomething()
```

## Configuration Classes

### KouraiKhryseaiConfig

Configuration options for the library.

#### Builder Methods

##### `setDebugMode(enabled: Boolean)`
Enables or disables debug mode.

##### `setTimeout(milliseconds: Long)`
Sets the operation timeout.

##### `build()`
Creates the configuration object.

**Example:**
```kotlin
val config = KouraiKhryseaiConfig.Builder()
    .setDebugMode(true)
    .setTimeout(5000)
    .build()
```

## Constants

### KouraiKhryseaiConstants

```kotlin
object KouraiKhryseaiConstants {
    const val DEFAULT_TIMEOUT = 3000L
    const val VERSION = "1.0.0"
}
```
