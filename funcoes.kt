fun main()
{
    println("Digite o seu primeiro nome:")
    val name = readLine()!!

    println("Digite o seu segundo nome:")
    val lastName =  readLine()!!

    println("Bem vindo " + getFullName(name,lastName).toLowerCase());
}

fun getFullName(n:String, l:String): String = "$n $l";
