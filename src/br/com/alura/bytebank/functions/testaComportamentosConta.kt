package br.com.alura.bytebank.functions
import br.com.alura.bytebank.domain.*

fun testaComportamentosConta() {
    var enderecoRob = Endereco("Rua buenos", 123, "ut", "sa", "sp", "01230125")
    val robson = Cliente(nome = "Robson", cpf = "0123467890", senha = "robson", endereco = enderecoRob)
    val conta = ContaCorrente(titular = robson, numero = 11231)
    println("Bem vindo ${conta.titular.nome}")
    conta.deposita(200.20)
    conta.saca(150.00)
    println("Endereço de ${conta.titular.nome} é ${conta.titular.endereco.logradouro}")
    println()

    val maria = Cliente(nome = "Maria", cpf = "123456789", senha = "maria")
    val contaMaria = ContaPoupanca(titular = maria, numero = 879465)
    println("Bem vindo ${contaMaria.titular.nome}")
    contaMaria.deposita(200.00)
    contaMaria.saca(150.00)
    conta.transfere(10.00, contaMaria)
    println("Endereço de ${contaMaria.titular.nome} é ${contaMaria.titular.endereco.logradouro}")
    println()

    val joao = Cliente(nome = "Joao", cpf = "74185296312", senha = "joao")
    val contaJoao = ContaSalario(titular = joao, numero = 85201)
    println("Bem vindo ${contaJoao.titular.nome}")
    contaJoao.deposita(200.00)
    contaJoao.saca(150.00)
    println("Endereço de ${contaJoao.titular.nome} é ${contaJoao.titular.endereco.logradouro}")
    println()

}