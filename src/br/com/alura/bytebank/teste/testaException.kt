package br.com.alura.bytebank.teste

class testaException {
    fun testaException() {
        val entrada: String = "1.9"
        val valorConvertido: Double? = try {
            entrada.toDouble()
        } catch (e: NumberFormatException) {
            println("Problema na conversão")
            null
        }

        val valorComTaxa: Double? = if (valorConvertido != null) {
            valorConvertido + 0.10
        } else {
            null
        }

        if (valorComTaxa != null) {
            println("O valor com taxa $valorComTaxa")
        } else {
            println("Valor ficou nulo")
        }
    }
}