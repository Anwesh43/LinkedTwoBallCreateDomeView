package com.example.twoballcreatedomeview

import android.view.View
import android.view.MotionEvent
import android.app.Activity
import android.content.Context
import android.graphics.Color
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.RectF

val colors : Array<Int> = arrayOf(
    "#f44336",
    "#01579B",
    "#00C853",
    "#FFC107",
    "#2962FF"
).map {
    Color.parseColor(it)
}.toTypedArray()
val parts : Int = 4
val scGap : Float = 0.02f / parts
val strokeFactor : Float = 90f
val sizeFactor : Float = 3.9f
val delay : Long = 20
val deg : Float = 180f
val startDeg : Float = 270f
val sweepDeg : Float = 60f
val backColor : Int = Color.parseColor("#BDBDBD")
val rFactor : Float = 18.4f

fun Int.inverse() : Float = 1f / this
fun Float.maxScale(i : Int, n : Int) : Float = Math.max(0f, this - i * n.inverse())
fun Float.divideScale(i : Int, n : Int) : Float = Math.min(n.inverse(), maxScale(i, n)) * n
