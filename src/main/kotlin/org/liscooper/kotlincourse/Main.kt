package com.liscoper.org.liscooper.kotlincourse

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val name = "Kotlin"
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    println("Hello, " + name + "!")

    for (i in 1..5) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        println("i = $i")
    }
}
val name: String = "Alisa"

var age: Int =  25

const val PI = 3.14

lateinit var userinfo: String

val lazyValue: String by lazy {"Hello, this is a lazy string"}

var speed: Double? = null

var count: Int = 0
        get () = field
    set (value) {
        if (value >= 0) field = value
    }

fun countUp() {
    count = -1
}

val chassis: String = "1234abc"

var colour: String = "Blue"

var distance: Double = 0.0

lateinit var owner: String

const val WHEELS: Int = 4

val report: String by lazy {""}

var fuel: Double = 0.0
    get() = field
    set(value) {
        if (value >= 0) field += value
    }
