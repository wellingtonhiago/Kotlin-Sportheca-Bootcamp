package one.dio.digionebank

fun main() {
    val digiOneBank = Banco("Banco Joias", numero = 6)

    println(digiOneBank.nome)
    println(digiOneBank.numero)

    // Criando uma cópia do objeto é possível alterar um valor imutável
    val digiOneBank2 = digiOneBank.copy(nome = "Banco Vingadores")
    println(digiOneBank2)
}