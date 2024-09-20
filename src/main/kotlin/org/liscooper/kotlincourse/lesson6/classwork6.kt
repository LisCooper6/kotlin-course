package org.liscooper.kotlincourse.lesson6

fun main() {
//    val number = 6
//    if (number > 5) {
//        println("Число больше 5")
//    } else {
//        println("Число меньше или равно 5")
//    }
    convertMark(78)
}

fun checkPassword (password: String) : Boolean {
    if (password. length <= 8 ) return false
//    if (checkSymbols(password)) return true
//    return false
    return checkSymbols(password)
}
fun checkSymbols (password: String) : Boolean {
    return false
}

fun convertMark (mark: Int) : String {
    val result = when(mark){
        in 0..20 -> "F"
        in 21..40 -> "E"
        in 41..60 -> "D"
        in 61..80 -> "C"
        in 81..90 -> "B"
        in 91..100 -> "A"
        else -> "invalid mark"
    }
    return result
}
