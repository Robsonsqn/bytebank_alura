package br.com.alura.bytebank.domain

class ContaCorrente(
    titular: Cliente,
    numero: Int
) : ContaTransferivel (
    titular = titular,
    numero = numero
){
    override fun saca(valor: Double){
        val valorComTaxa = valor + 0.10
        super.saca(valorComTaxa)
    }
}