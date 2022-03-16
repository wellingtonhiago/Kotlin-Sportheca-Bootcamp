package one.dio.digionebank.testes

import one.dio.digionebank.ClienteTipo

fun main() {
    ClienteTipo.values().forEach { elemento ->
        println("${elemento.name} - ${elemento.descricao}")
    }
    ClienteTipo.values().forEach { it: ClienteTipo ->
        println("${it.name} - ${it.descricao}")
    }

    val pf =ClienteTipo.PF
    val pj = ClienteTipo.PJ
    
    println("Enum: ${pf.name} - ${pf.descricao}")
    println("Enum: ${pj.name} - ${pj.descricao}")

}