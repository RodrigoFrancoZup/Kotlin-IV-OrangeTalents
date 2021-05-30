package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Endereco

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
