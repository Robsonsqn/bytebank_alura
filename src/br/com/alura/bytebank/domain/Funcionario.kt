package br.com.alura.bytebank.domain

abstract class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double,
) {
    abstract val bonificacao: Double

    override fun toString(): String {
        return "${this.nome} de cpf ${this.cpf} tem bonificacao de ${this.bonificacao}"
    }
}