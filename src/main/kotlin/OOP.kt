class Stubborn{
    //data member
    private var nambari=5
// member function
    fun calculate():Int{
        return nambari *nambari

    }
}

fun main(args: Array<String>) {
    //This is an object
    val myobje=Stubborn()
    println(myobje.calculate())
}



