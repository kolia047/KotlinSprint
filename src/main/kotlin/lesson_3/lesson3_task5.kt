package lesson_3

fun main() {
    val str = "D2-D4;0"
    val splitStr = str.split('-', ';')
    val whenceGo = splitStr[0]
    val whereGo = splitStr[1]
    val moveNumber = splitStr[2]

    println(whenceGo)
    println(whereGo)
    println(moveNumber)


}