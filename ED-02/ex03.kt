fun main()
{
    print("Escreva um número número: ")
    val n1 = readLine()!!.toDouble()

    print("Escreva um segundo número número: ")
    val n2 = readLine()!!.toDouble()

    print("Escreva um terceiro número: ")
    val n3 = readLine()!!.toDouble()

    val numeros = listOf(n1, n2, n3).sorted()

    println("Os números em ordem crescente são: $numeros")
}

