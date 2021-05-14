package br.com.alura.bytebank.functions

import br.com.alura.bytebank.domain.*

fun testaComportamentosFuncionario() {
    var funcionario = Analista(nome = "Antonio", cpf = "47218107874", salario = 1100.00)
    var gerente = Gerente(nome = "Oswaldo", cpf = "01234567890", salario = 2200.00, senha = "oswaldo")
    var diretor = Diretor(nome = "Barbara", cpf = "74185296300", salario = 3300.00, senha = "barbara", plr = 220.00)
    var cliente = Cliente(nome = "Robson", cpf = "74196385212", senha = "robson")
    println(funcionario)
    println(gerente)
    println(diretor)
    var calculadora = CalculadoraBonificacao()
    calculadora.registra(funcionario)
    calculadora.registra(gerente)
    calculadora.registra(diretor)
    println(calculadora)
    var sistemaInterno = SistemaInterno()
    sistemaInterno.login(gerente, "oswaldo")
    sistemaInterno.login(cliente, "robson")
}
