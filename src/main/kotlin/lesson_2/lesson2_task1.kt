package lesson_2

fun main() {
    val numberOfStudents = 4
    val studentFirst = 3
    val studentSecond = 4
    val studentThree = 3
    val studentFour = 5
    val average: Float = (studentFirst + studentSecond + studentThree + studentFour).toFloat() / numberOfStudents

    println(String.format("%.2f", average))
}