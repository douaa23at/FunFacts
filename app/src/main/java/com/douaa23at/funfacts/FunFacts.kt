package com.douaa23at.funfacts

import android.graphics.Color
import java.util.*

/**
 * Created by douaa.atouailaa on 22/03/2019.
 */
class FunFacts {
    val facts = arrayOf(
            "Ants stretch when they wake up in the morning.",
            "Ostriches can run faster than horses.",
            "Olympic gold medals are actually made mostly of silver.",
            "You are born with 300 bones; by the time you are an adult you will have 206.",
            "It takes about 8 minutes for light from the Sun to reach Earth.",
            "Some bamboo plants can grow almost a meter in just one day.",
            "The state of Florida is bigger than England.",
            "Some penguins can leap 2-3 meters out of the water.",
            "On average, it takes 66 days to form a new habit.",
            "Mammoths still walked the earth when the Great Pyramid was being built.")
    val colors = arrayOf(
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7"
    )

    fun getFunFact() : String {
        val randomNumberGenerator = Random().nextInt(facts.size)
        return facts[randomNumberGenerator]
    }
    fun getFunFactColor() : Int {
        val randomColorNumber = Random().nextInt(colors.size)
        return Color.parseColor(colors[randomColorNumber])
    }

}