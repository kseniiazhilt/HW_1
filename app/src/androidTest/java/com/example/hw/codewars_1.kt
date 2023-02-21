package com.example.hw//import kotlin.math.abs
//
//fun elevator(left: Int, right: Int, call: Int): String {
//    val distanceLeft = abs(call - left)
//    val distanceRight = abs(call - right)
//    return if(distanceLeft < distanceRight) "left" else "right"
//}
//
//fun main() {
//    elevator(0, 1, 0) // => "left"
//    elevator(0, 1, 1) // => "right"
//    elevator(0, 1, 2) // => "right"
//    elevator(0, 0, 0) // => "right"
//    elevator(0, 2, 1) // => "right"
//}