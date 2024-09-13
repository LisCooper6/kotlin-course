package org.liscooper.kotlincourse.lesson3

class Homework {
    //
}
val name: String = "Ironman"
val date: String = "16/09/2024"
val venue: String = "Beograd"
var budget: Int = 1000000000
    get () = field
    set (value) {
        if (value >= 1500000000) field = value
    }
const val PARTICIPANTS: Int = 250
var day: Int =  2
lateinit var userinfo: String
val lazyValue: String by lazy {"Status at the beginning of the event"}
lateinit var sponsors: String
const val BUDGET = 1500000000
var internet: Double = 90.4
lateinit var info: String
const val TEAMS: Int = 8
lateinit var tasks: String