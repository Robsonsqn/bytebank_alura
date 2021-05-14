package br.com.alura.bytebank.domain

abstract class Conta(
    val titular: Cliente,
    val numero: Int
) {
    var saldo = 0.00
        protected set(valor) {
            if (valor > 0.0) {
                field = valor
            }
        }

    fun deposita(valor: Double) {
        this.saldo += valor
        println("${this.titular.nome} recebeu R\$ $valor. Agora seu saldo é de R\$ ${this.saldo} .")
    }

    open fun saca(valor: Double) {
        if (this.possivelSacar(valor)) {
            this.saldo -= valor
            println("Houve uma cobrança de R\$ $valor no saldo de ${this.titular.nome}. Agora o saldo é de R\$ ${this.saldo} .")
        } else {
            println("Não foi possivel fazer a cobrança de R\$ $valor do saldo de ${this.titular.nome}.")
        }
    }

    private fun possivelSacar(valor: Double): Boolean {
        return valor <= this.saldo
    }

}