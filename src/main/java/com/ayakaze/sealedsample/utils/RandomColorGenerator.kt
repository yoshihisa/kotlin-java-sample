package com.ayakaze.sealedsample.utils

import com.ayakaze.sealedsample.Color
import com.ayakaze.sealedsample.EmeraldGreen
import java.util.Random


class RandomColorGenerator {
    fun generate(): Color {
        val colorList: List<Color> = listOf(
                Color.Red,
                Color.Green,
                Color.Blue,
                Color.Custom("#FF00BF"),
                EmeraldGreen()
        )
        val random = Random().nextInt(colorList.size)
        return colorList[random]
    }
}