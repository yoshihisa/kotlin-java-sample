package com.ayakaze.sealedsample

sealed class Color {
    object Red : Color()
    object Green : Color()
    object Blue : Color()
    data class Custom(val colorCode: String) : Color()
}
class EmeraldGreen: Color() {
    val colorCode : String = "#00A968"
    fun toInteger(): Int = 0x00A968
}