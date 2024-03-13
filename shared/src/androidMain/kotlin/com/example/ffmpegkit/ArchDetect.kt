package com.example.ffmpegkit

actual object ArchDetect {
    actual fun getArch() = com.arthenica.ffmpegkit.AbiDetect.getAbi()
}


fun main() {
    println(com.arthenica.ffmpegkit.AbiDetect.getAbi())
}