package br.com.alura.bytebank.domain

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    senha: String
) : FuncionarioAdmin(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = senha
) {
    override val bonificacao: Double get() = (salario * 0.2) + salario
}