package org.liscooper.kotlincourse.lesson6

fun main() {
//    determiningTheTypeOfTransport(-1.3)
    println((10 % 2 == 0) || (5 - 3 != 1))
}

//Задача 1

fun seasonВefinition (month: Int) : String {
    val season = when(month){
        in 1..2 -> "Зима"
        in 3..5 -> "Весна"
        in 6..8 -> "Лето"
        in 9..11 -> "Осень"
        12 -> "Зима"
        else -> "invalid month"
    }
    println(season)
    return season
}

//Задача 2

fun ageOfThePet (age: Int) : String {
    if (age < 0) return "Не может быть отрицательным числом"
    val result = when(age){
        0 -> "0"
        1 -> "10.5"
        2 -> "21"
        in 3..30 -> (21 + 4 * (age - 2)).toString()
        else -> "Собаки столько не живут"
    }
    println(result)
    return result
}

fun ageOfThePet1 (age: Int) : Number {
    val result = when(age){
        0 -> 0
        1 -> 10.5
        2 -> 21
        in 3..30 -> (21 + 4 * (age - 2))
        else -> 100000000000000000
    }
    println(result)
    return result
}

//Задача 3

fun determiningTheTypeOfTransport (transport: Double) : String {
    if (transport < 0) return "Не может быть отрицательным числом"
    val result = when(transport){
        in 0.0..1.0 -> "Пешком"
        in 1.0..5.0 -> "Велосипед"
        else -> "Автотранспорт"
    }
    println(result)
    return result
}

//Задача 4

//fun CalculationOfBonusPoints (bonus: )