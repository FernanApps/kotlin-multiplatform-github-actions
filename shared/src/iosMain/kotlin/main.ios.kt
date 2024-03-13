import androidx.compose.ui.window.ComposeUIViewController
import platform.UIKit.UIDevice

actual fun getPlatformName(): String {
    val s =  "iOS"
    println("Printing :::::::::: XXXXX")
    return s
}

fun MainViewController() = ComposeUIViewController { App() }
