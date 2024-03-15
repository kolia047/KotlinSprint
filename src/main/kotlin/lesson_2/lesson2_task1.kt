package lesson_2

fun main() {
    val numberOfStudents = 4F
    val studentFirst = 3
    val studentSecond = 4
    val studentThree = 3
    val studentFour = 5
    val average = (studentFirst + studentSecond + studentThree + studentFour) / numberOfStudents

    println(String.format("%.2f", average))
}