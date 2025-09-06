package ar.imagin.kouraiKhryseai.demo

import android.app.Application
import androidx.compose.ui.text.font.FontFamily
import androidx.core.content.res.ResourcesCompat
import ar.imagin.kouraikhryseai.compose.ui.theme.KThemeConfig
import ar.imagin.kouraikhryseai.compose.ui.theme.KThemeConfigHolder

class DemoApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        val lunnaFontFamily =
            ResourcesCompat.getFont(this, R.font.lunna)?.let {
                FontFamily(it)
            } ?: FontFamily.Default

        KThemeConfigHolder.init(
            config = KThemeConfig(
                fontFamily = lunnaFontFamily
            )
        )
    }

}