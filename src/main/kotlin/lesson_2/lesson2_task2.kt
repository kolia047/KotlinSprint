package lesson_2

fun main() {

    val employesCount = 50
    val salary = 30000
    val internCount = 30
    val salaryIntern = 20000

    val salaryEmployes = employesCount * salary
    val allSalary = salaryEmployes + (internCount * salaryIntern)
    val averageEmployeeSalary = allSalary / (employesCount + internCount)

    println(salaryEmployes)
    println(allSalary)
    println(averageEmployeeSalary)

}