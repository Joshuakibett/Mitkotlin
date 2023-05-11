class basic{
    var num1=6
    var num2=3


    fun calculate():Int{
        return num1/num2
    }
}

fun main(args: Array<String>) {
    val w1=basic()
    println(w1.calculate())
}