const val MIN_AGE = 16
const val MAX_AGE = 58
fun main()
{
    /*
    val lista = listOf(2,6,8,16,25,89)
    val number = (1..34).random()

    println(number)
    println(number in lista)
    */

    var age = (10..100).random()

    println(age)
    println(age in MIN_AGE..MAX_AGE)
    println(age >= MIN_AGE && age <= MAX_AGE)
}