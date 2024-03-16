package lesson_2

fun main() {
    val baff = 0.2F
    val crystalOre = 7
    val ironOre = 11
    val baffCrystalOre = (crystalOre * baff).toInt()
    val baffIronOre = (ironOre * baff).toInt()

    println("Baff crystal ore: $baffCrystalOre")
    println("Baff iron ore: $baffIronOre")

}