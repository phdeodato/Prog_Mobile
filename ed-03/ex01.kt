class EstudoDirigido3(
    val cliente: String,
    var saldoDaConta: Double,
    val numeroConta: String,
    val numeroAgencia: String
) {
    fun depositar(valor: Double)
    {
        saldoDaConta += valor
        println("O depósito do R$$valor foi concluído com êxito.")
    }
    fun sacar(valor: Double)
    {
        if (saldoDaConta >= valor)
        {
            saldoDaConta -= valor
            println("O saque no valor de R$$valor foi concluido com sucesso")
        } else
        {
            println("Você não possui saldo para realizar o saque")
        }
    }
    fun transferencia(valor: Double, contaRecebe: EstudoDirigido3)
    {
        if (saldoDaConta >= valor)
        {
            saldoDaConta -= valor
            contaRecebe.saldoDaConta += valor
            println("A transferência no valor de: R$$valor foi concluída")
        } else
        {
            println("Você não possuí saldo para realizar a transferência")
        }
    }
    fun imprimirExtrato()
    {
        println("Extrato Bancário")

        println("Nome do cliente: $cliente")

        println("Número da conta: $numeroConta")

        println("Número da agência: $numeroAgencia")

        println("Valor de saldo disponível: R$$saldoDaConta")
        println()
    }

}
fun main()
{
    val conta1 = EstudoDirigido3("Pedro Henrique Deodato", 2500.0, "111111", "01234")
    val conta2 = EstudoDirigido3("Lázaro Gomes da Silva", 1200.0, "222222", "56789")

    conta1.imprimirExtrato()
    conta2.imprimirExtrato()

    conta1.depositar(1300.0)
    conta1.sacar(500.0)
    conta1.transferencia(100.0, conta2)
    conta1.imprimirExtrato()

    conta2.imprimirExtrato()
}