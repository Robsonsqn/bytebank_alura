package br.com.alura.bytebank.domain

import br.com.alura.bytebank.interfaces.Autenticavel

class SistemaInterno {

    fun login(entity : Autenticavel, senha: String){
        if(entity.autentica(senha)){
            println("Autenticado com sucesso")
        } else {
            println("Falha na autenticação")
        }
    }
}