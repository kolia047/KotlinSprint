package lesson_2

const val NUMBER_OF_MINUTES_IN_HOUR = 60
fun main() {
    val departureHour = 9
    val departureMinutes = 39
    val travelTime = 457

    val amountTimeInMinutes = (departureHour * NUMBER_OF_MINUTES_IN_HOUR) + departureMinutes + travelTime
    val arrivalHour = amountTimeInMinutes / NUMBER_OF_MINUTES_IN_HOUR
    val arrivalMinutes = amountTimeInMinutes % NUMBER_OF_MINUTES_IN_HOUR

    println(String.format("%02d:%02d", arrivalHour, arrivalMinutes))
}