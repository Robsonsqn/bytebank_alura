package br.com.alura.bytebank.domain

class CalculadoraBonificacao {
    var total: Double = 0.0
        private set

    fun registra(funcionario: Funcionario){
        this.total += funcionario.bonificacao
    }

    override fun toString(): String {
        return "Valor total de bonificacao é de ${this.total}"
    }
}