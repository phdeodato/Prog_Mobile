
data class ContasBanco(val nomeCliente: String, val saldo: Double)
fun main()
{
    val contas = listOf(
        ContasBanco("Paulo", 1500.0),
    ContasBanco("Luis", 250.0),
    ContasBanco("Marcia", 300000.0),
    ContasBanco("Renato", 10000.0),
    ContasBanco("Roberto", 8651.0)
    )

    val contasPorSaldo = contas.sortedBy { it.saldo }
    println("Saldos em ordem crescente:")
    contasPorSaldo.forEach { println("${it.nomeCliente}: R$ ${it.saldo}") }

    val contasPorNome = contas.sortedBy { it.nomeCliente }
    println("Contas em ordem alfabética:")
    contasPorNome.forEach { println("${it.nomeCliente}: R$ ${it.saldo}")}
}
