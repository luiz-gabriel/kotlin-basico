fun main()
{
    var f: Boolean = true;
    var a = 9;
    var b = 6;
    var g = "f";
    val number = a?: b?: 0;
    val grade = (0..10).random();

    val minValue = if(a > b){
        println("b($b) é o menor valor")
        b
    }else if(a < b){
        println("a($a) é o menor valor")
        a
    }else{
        println("Os valores são iguais")
        b
    }

    when{
        f == true -> {
            println("f($f) é true")
        }else -> {
            println("f($f) é falso")
        }
    }

    when(g){
        "f" ->{
            println("ok")
        }else ->{
            println("Erro")
        }
    }

    println(number)

    println(grade.checkNote())
}

fun Int.checkNote(): String{
    println("nota $this")
    
    return when(this){
        in 0..4 -> "Ruim"
        in 5..7 -> "Mediano"
        in 8..9 -> "Bom"
        10 -> "Excelente"
        else -> "Indefinido"
    }
}