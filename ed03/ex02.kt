fun main() {
    // Cria duas contas bancárias
    val conta1 = ContaBanco("Pedro Henrique Deodato", 1234, "003", 3400.0)
    val conta2 = ContaBanco("Miriam Deodato", 5678, "079", 1000.0)

    // Imprime o extrato inicial das contas
    conta1.imprimirExtrato()
    conta2.imprimirExtrato()

    // Realiza algumas operações bancárias na conta 1
    conta1.depositar(500.0)
    conta1.imprimirExtrato()
    conta1.retirar(200.0)
    conta1.imprimirExtrato()

    // Realiza algumas operações bancárias na conta 2
    conta2.transferir(100.0, conta1)
    conta2.imprimirExtrato()
    conta2.retirar(600.0) // saldo insuficiente
    conta2.imprimirExtrato()
}