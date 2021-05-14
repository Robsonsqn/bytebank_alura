package br.com.alura.bytebank.domain

class ContaPoupanca(
    titular: Cliente,
    numero: Int
) : ContaTransferivel(
    titular = titular,
    numero = numero
) {
}