package lesson_4

const val NUMBER_OF_TABLES = 13
fun main() {
    val todayReservation = 13
    val tomorowFree = 4
    val tomorowReservation = NUMBER_OF_TABLES - tomorowFree

    println("Доступность столиков на сегодня: ${NUMBER_OF_TABLES > todayReservation}")
    println("Доступность столиков на завтра: ${NUMBER_OF_TABLES > tomorowReservation}")

}