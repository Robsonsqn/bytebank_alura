package br.com.alura.bytebank.domain

class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    senha: String,
    var plr: Double,
) : FuncionarioAdmin(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = senha
) {
    override val bonificacao: Double get() = (salario * 0.3) + salario + plr
}