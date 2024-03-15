package lesson_2

fun main() {
    val employes = 50
    val salary = 30000
    val intern = 30
    val salaryIntern = 20000

    val salaryEmployes = employes * salary
    val allSalary = salaryEmployes + (intern * salaryIntern)
    val averageEmployeeSalary = allSalary / (employes + intern)

    println(salaryEmployes)
    println(allSalary)
    println(averageEmployeeSalary)
}