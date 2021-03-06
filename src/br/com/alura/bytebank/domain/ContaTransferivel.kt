package br.com.alura.bytebank.domain

abstract class ContaTransferivel(
    titular: Cliente,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
){

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            super.saca(valor)
            destino.deposita(valor)
            return true
        }
        return false
    }

} 