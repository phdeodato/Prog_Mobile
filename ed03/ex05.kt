interface BoletoBancario
{
    fun imprimeBoleto(valor: Double)
}
open class BoletoEx5(val cliente: String) : BoletoBancario
{
    override fun imprimeBoleto(valor: Double)
    {
        println("Boleto Bancário referente a mensalidade da faculdade")
        println()
        println("Nome do cliente: $cliente")
        println("Valor do boleto a ser pago: R$ $valor")
        println("Codigo do boleto:")
        println("78642.65865.78965.45879.54865.00056")
        println()
        println("Obs: valor à vista e sem desconto")
    }
}
fun main()
{
    val minhaConta = BoletoEx5("Maicon Douglas Silva")
    minhaConta.imprimeBoleto(881.0)
}
