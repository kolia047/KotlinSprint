package lesson_1

fun main() {
    val numberOfSeconds = 6480
    val seconds: Int = numberOfSeconds % 60
    val minute: Int = (numberOfSeconds / 60) % 60
    val hour: Int = numberOfSeconds / 3600
    val result = String.format("%02d:%02d:%02d", hour, minute, seconds)

    println(result)
}