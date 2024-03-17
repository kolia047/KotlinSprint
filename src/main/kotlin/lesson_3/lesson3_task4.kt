package lesson_3

fun main() {
    var whenceGo = "E2"
    var whereGo = "E4"
    var moveNumber = 1
    var move = "$whenceGo-$whereGo, $moveNumber"

    println(move)

    whenceGo = "D2"
    whereGo = "D3"
    moveNumber++
    move = "$whenceGo-$whereGo, $moveNumber"

    println(move)
}