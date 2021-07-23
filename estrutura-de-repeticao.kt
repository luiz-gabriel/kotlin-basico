fun main()
{
    //downTo()
    //until()
    //step(2)
    leters()
}

fun downTo()
{
    for(i in 0 downTo 20){
        print("$i ")
    }
}

fun until()
{
    for(i in 1 until 20){
        print("$i ")
    }
}

fun step(num:Int){
    for(i in 0.. 20 step num){
        print("$i ")
    }
}

fun leters()
{
    val sArray = "Olha essa string aaaaaaaaa"
    for(l in sArray)
    {
        println(l.toUpperCase())
    }
}