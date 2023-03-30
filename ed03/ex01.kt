class ContaBanco
    (
    val cliente: String,
    val n1: Int,
    val banco: String,
    var saldoConta: Double = 0.0
) {

    fun depositar(valorConta: Double)
    {
        saldoConta += valorConta
        println("O depósito R$%.2f efetivado na conta bancária $n1.".format(valorConta))
    }

    fun retirar(valorC: Double)
    {
        if (saldoConta >= valorC)
        {
            saldoConta -= valorC
            println("O saque R$%.2f efetivado na conta bancária $n1.".format(valorC))
        } else
        {
            println("Saldo da conta é insuficiente $n1.")
        }
    }

    fun transferir(valor: Double, destino: ContaBanco)
    {
        if (saldoConta >= valor)
        {
            saldoConta -= valor
            destino.saldoConta += valor
            println("Transferência de R$%.2f effetivada da conta bancaria $n1 para a conta bancaria ${destino.n1}.".format(valor))
        } else
        {
            println("Saldo disponivel é insuficiente na conta bancaria $n1 para realizar a transferência.")
        }
    }

    fun imprimirExtrato()
    {
        println("Extrato da conta bancaria $n1:")
        println("- Saldo bancario: R$%.2f".format(saldoConta))
    }
}
