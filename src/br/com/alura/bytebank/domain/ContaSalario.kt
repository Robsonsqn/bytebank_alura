package br.com.alura.bytebank.domain

class ContaSalario(
    titular: Cliente,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
) {
} 