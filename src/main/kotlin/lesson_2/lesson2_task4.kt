package lesson_2

fun main() {
    val baffInPercentages = 20
    val crystalOre = 7
    val ironOre = 11
    val baffForCalculation = baffInPercentages / 100F
    val baffCrystalOre = (crystalOre * baffForCalculation).toInt()
    val baffIronOre = (ironOre * baffForCalculation).toInt()

    println("Baff crystal ore: $baffCrystalOre")
    println("Baff iron ore: $baffIronOre")

}