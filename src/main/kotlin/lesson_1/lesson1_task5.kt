package lesson_1

const val NUMBER_OF_SECONDS_IN_A_HOUR = 3600
const val NUMBER_OF_SECONDS_IN_A_MINUTE = 60

fun main() {

    val numberOfSeconds = 6480
    val seconds: Int = numberOfSeconds % NUMBER_OF_SECONDS_IN_A_MINUTE
    val minute: Int = (numberOfSeconds / NUMBER_OF_SECONDS_IN_A_MINUTE) % NUMBER_OF_SECONDS_IN_A_MINUTE
    val hour: Int = numberOfSeconds / NUMBER_OF_SECONDS_IN_A_HOUR
    val result = String.format("%02d:%02d:%02d", hour, minute, seconds)

    println(result)
}