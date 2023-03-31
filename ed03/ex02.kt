fun main() {
    val conta1 = EstudoDirigido3("Pedro Henrique Deodato", 2500.0, "111111", "01234")
    val conta2 = EstudoDirigido3("Lázaro Gomes da Silva", 1200.0, "222222", "56789")


    conta1.imprimirExtrato()
    conta2.imprimirExtrato()

    println("Conta 1")
    conta1.depositar(400.0)
    conta1.sacar(300.0)
    conta1.transferencia(300.0, conta2)
    println()

    println("Conta 2")
    conta2.depositar(500.0)
    conta2.sacar(1000.0)
    conta2.transferencia(400.0, conta1)
    println()

    conta1.imprimirExtrato()
    conta2.imprimirExtrato()
}


