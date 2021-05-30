package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Endereco

fun main() {
    println("início main")

    val entrada: String = "1.9"
    val valorConvertido: Double? = try {
        entrada.toDouble()
    }catch (e: NumberFormatException){
        println("Problema na conversão")
        null
    }

    val valorComTaxa: Double? = if(valorConvertido != null){
        valorConvertido + 0.10
    }else{
        null
    }

    if(valorComTaxa != null){
        println("O valor com taxa $valorComTaxa")
    }else{
        println("Valor ficou nulo")
    }

    funcao1()
    println("fim main")
}

fun funcao1() {
    println("início funcao1")
    funcao2()
    println("fim funcao1")
}

fun funcao2() {
    println("início funcao2")
    for (i in 1..5) {
        println(i)
    }
    try {
        val endereco = Any()
        endereco as Endereco
    } catch (e: ClassCastException) {
        println("ClassCastException foi pegada")
        e.printStackTrace()
    }
    println("fim funcao2")
}