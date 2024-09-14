package org.liscooper.kotlincourse.lasson4

import java.lang.IllegalArgumentException


val myInt: Int = 2147483647

val myFloat: Float = Float.MAX_VALUE

val myLong: Long = 9223372036854775807

val myShort: Short = Short.MAX_VALUE

val myByte: Byte = 127

val myDouble: Double = 1.7976931348623157

val isKotlinFun: Boolean = true

val latter: Char = Char.MAX_VALUE

val text: String = "Hello, Kotlin"

val numbers: Array<Int> = arrayOf(1, 2, 3)
val strings: List<String> = listOf("one", "two", "one")
val doubles: Set<Double> = setOf(23.3, 56.8)

val keysToValues: Map<String, String> = mapOf(
    "Ключ 1" to "Значение 1"
    "Ключ 2" to "Значение 2"
)
val anuthing: Any = false

fun printMessage(massage: String) {
    println(massage)
}

fun fail(message: String): Nothing {
    throw IllegalArgumentException(message)
}
