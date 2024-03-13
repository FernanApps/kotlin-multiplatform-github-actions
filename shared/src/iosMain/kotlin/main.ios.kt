import androidx.compose.ui.window.ComposeUIViewController
import com.example.ffmpegkit.FFmpegKitConfig
import platform.UIKit.UIDevice

actual fun getPlatformName(): String {
    val s =  "iOS"
    return FFmpegKitConfig.getVersion()
}

fun MainViewController() = ComposeUIViewController { App() }
