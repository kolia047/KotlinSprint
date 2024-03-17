package lesson_3

fun main() {
    val firstName = "Татьяна"
    var lastName = "Андреева"
    val surname = "Сергеевна"
    var age = 20

    println("$lastName $firstName $surname, $age")

    age += 2
    lastName = "Сидорова"

    println("$lastName $firstName $surname, $age")
}