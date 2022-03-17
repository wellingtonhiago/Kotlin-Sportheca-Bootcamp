package one.dio.collections

fun main() {
    val nivelPoder = DoubleArray(3)
    nivelPoder[0] = 1000.0
    nivelPoder[1] = 2000.0
        nivelPoder[2] = 4000.0

    nivelPoder.forEach {
        println(it)
    }

    println("-------------------------")
    // forEachIndexed nos da a garantia que estamos iterando e modificando o valor naquele indice internamente
    nivelPoder.forEachIndexed{index, nivelPoderPlus -> nivelPoder[index] = nivelPoderPlus * 1.1 }


    nivelPoder.forEach {
        println(it)
    }
}