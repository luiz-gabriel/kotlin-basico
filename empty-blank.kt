fun main()
{
 val s =""
 val l = "    "
 println(s.isEmpty())
 // true

 println(s.isBlank())
 // true
 println(s.isNullOrBlank() || s.isNullOrEmpty())
 // true

 println(l.isEmpty())
 // false
 println(l.isBlank())
 // true
}