package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Endereco

fun main() {
    var endereco: Endereco? = null

    // não podemos acessar properties/membros de  null, codigo abaixo a IDE não deixa nem "escrever"
    // endereco.bairro


    // Codigo a seguir força executar, acessar membro/propertie de null,mas vai dar Exception!
    // endereco!!.bairro

    //Codigos abaixo roda, poide estaos fazendo um call safe,
    //Colocamos um "?" na referencia, logo se ela tiver valor mostrará, se estiver nulo escreverá null
    println("1" + endereco?.logradouro)
    println("2" +endereco?.logradouro?.length)

    //Safe call com Let
    endereco.let {
        println("3" +it?.logradouro)
    }

    //Safe call com Let e Lambda
    //Só entra no método se não for null
    endereco?.let { apelido: Endereco ->
        println("4" +apelido.logradouro.length)
    }

    //Elvis Operator
    //Só entra no método se não for null
    endereco?.let {
        val tamanhoComplemento: Int = it.complemento?.length ?: 0
        println("5" +tamanhoComplemento)
    }

    //Safe Cast
    //Se o Cast não for possível a referencia recebe null!
    var palavra: String = "1,7"
    var numero: Int? = palavra as? Int
    println("6" +numero)

}







