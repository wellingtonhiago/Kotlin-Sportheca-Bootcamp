package one.dio.collections

fun main() {
    val salarios = doubleArrayOf(1000.0, 2250.0, 6000.0)

    for (salario in salarios){
        println(salario)
    }

    println("---------------")
    println("maior salario: ${salarios.maxOrNull()}" )
    println("menor salario: ${salarios.minOrNull()}" )
    println("média salario: ${salarios.average()}" )

    val salarioMaior1500 = salarios.filter { it > 1500.0 }
    println("-------------------------")
    println("salarios maior que 1500: $salarioMaior1500")
    println("-------------------------")
    salarioMaior1500.forEach { println(it) }

    println("---------------")
    // Conta os valores em um intervalo
    println(salarios.count { it in 2000.0..6000.0 })

    println("----------------")
    // Encontra o valor e o retorna
    println(salarios.find { it == 2250.0 })
    println(salarios.find { it == 3000.0 })


    println("--------------")
    // Retorna um valor booleano
    println(salarios.any { it == 1000.0 })
    println(salarios.any { it == 500.0 })
}