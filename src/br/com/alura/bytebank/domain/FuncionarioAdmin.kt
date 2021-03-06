package br.com.alura.bytebank.domain

import br.com.alura.bytebank.interfaces.Autenticavel

abstract class FuncionarioAdmin(
    nome: String,
    cpf: String,
    salario: Double,
    protected val senha: String
)  : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
), Autenticavel {
    override fun autentica(senha: String): Boolean {
        return this.senha == senha
    }
}