fun main()
{
    println("Digite o seu nome: ")
    val name: String = readLine()!!

    println(name)
    
}

fun String.UpperCaseName(n:String) = this[n]{ it.uppercase()}