package ar.imagin.kouraikhryseai.theme.dimens

/**.___
    ================================================================================
                    SCREEN COMPATIBILITY: DIMENSION GUIDELINES
    ================================================================================
    To ensure proper support for Smaller Screens, define specific dimensions here.
    As a general rule:
        Multiply default dimensions by the Deltas provided in this file

    SCREEN SIZE QUALIFIERS: DEPRECATED vs RECOMMENDED

    Both (`layout-small`, `layout-normal`, `layout-large`, `layout-xlarge`) AND
        `layout-sw<N>dp` (e.g., `layout-sw320dp`, `layout-sw480dp`, `layout-sw600dp`, `layout-sw720dp`)
    are qualifiers used to define layouts for specific screen sizes.

    The key difference is their era and measurement:
        - **Legacy Qualifiers (Pre-Honeycomb):** `small`, `normal`, `large`, and `extra-large`
    categorized screens based on their diagonal size. These are now **deprecated**.
        - **Modern Qualifiers (Honeycomb+):** `sw<N>dp` (minimum distance between screen edges in dps)
    defines layout resources based on the smallest dimension of the screen,
    regardless of orientation. This provides a more robust and flexible way to target screen sizes.

    In summary, `layout-small` and similar older qualifiers are deprecated.
    The `layout-sw<N>dp` qualifiers should be used instead for modern Android development.

    For comprehensive details on screen compatibility, refer to:
        - Overview: https://developer.android.com/guide/practices/screens_support.html#NewQualifiers
        - Pixel Densities: https://developer.android.com/training/multiscreen/screendensities
        - Display Sizes: https://developer.android.com/develop/ui/compose/layouts/adaptive/support-different-display-sizes
        - Resources overview: https://developer.android.com/guide/topics/resources/providing-resources
    ================================================================================
.--*/
object SWOptimizationConstants {
    /**
     * Delta multiplier for screens smaller than sw360dp.
     * Reduces dimensions to 75% of default size.
     */
    const val SMALL_SCREEN_DELTA = 0.75f

    /**
     * Delta multiplier for screens larger than sw600dp (tablets).
     * Increases dimensions to 150% of default size.
     */
    const val LARGE_SCREEN_DELTA = 1.5f

    /**
     * Common screen width breakpoints in dp.
     * Used for determining which delta to apply.
     */
    object Breakpoints {
        const val SMALL_SCREEN = 360
        const val TABLET = 600
        const val LARGE_TABLET = 840
    }

    /**
     * Returns appropriate delta based on screen width.
     * @param screenWidthDp smallest width of the screen in dp
     */
    fun getDeltaForScreenWidth(screenWidthDp: Int): Float = when {
        screenWidthDp < Breakpoints.SMALL_SCREEN -> SMALL_SCREEN_DELTA
        screenWidthDp >= Breakpoints.TABLET -> LARGE_SCREEN_DELTA
        else -> 1f
    }
}