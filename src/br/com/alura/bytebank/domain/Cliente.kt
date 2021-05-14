package br.com.alura.bytebank.domain

import br.com.alura.bytebank.interfaces.Autenticavel

class Cliente (
    val nome: String,
    val cpf: String,
    private val senha: String,
    var endereco: Endereco = Endereco()
) : Autenticavel {
    override fun autentica(senha: String): Boolean {
        return this.senha == senha
    }
}