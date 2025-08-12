package ar.imagin.kouraiKhryseai.demo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import ar.imagin.kouraikhryseai.theme.KouraiKhryseaiTheme

/**___.
 * Created by Jose Gonzalez
__.*/
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MainScreen()
        }
    }
}

@Composable
private fun MainScreen() {
    KouraiKhryseaiTheme {
        Text("test")
    }
}