package one.dio.collections

fun main() {
    val personagens = Array<String>(3){""}
    personagens[0] = "Thanos"
    personagens[1] = "Saitama"
    personagens[2] = "Goku"

    println("------------------")

    for (nomes in personagens){
        print("[$nomes]")
    }

    println("\n---------------")

    personagens.sort()
    personagens.forEach {
        print("[$it]")
    }

    println("\n---------------")

    val personagens2 = arrayOf("Vegeta", "Wolverine", "Seiya")
    personagens2.sort()
    personagens2.forEach {
        print("[$it]")
    }

}