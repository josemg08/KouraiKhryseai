package ar.imagin.kouraiKhryseai.demo

import android.app.Application
import ar.imagin.kouraikhryseai.compose.ui.theme.KThemeConfig
import ar.imagin.kouraikhryseai.compose.ui.theme.KThemeConfigHolder

class DemoApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        KThemeConfigHolder.init(
            config = KThemeConfig()
        )
    }

}