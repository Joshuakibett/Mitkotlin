open class Animal(color:String,Age:Int){
    init {
        println("Color is $color")
        println("Age is $Age")
    }
}
class Dog(color: String,Age: Int): Animal(color,Age){
    fun woof(){
        println("Dog makes the sound of woof")
    }

}
class Cat(color: String,Age: Int):Animal(color,Age){
    fun purr(){
        println("Cat makes the sound of purring")
    }
}

class Horse(color: String,Age: Int):Animal(color,Age){
    fun neigh(){
        println("Horses neigh")
    }
}

fun main(args: Array<String>) {
    val d=Dog(color = "Black", Age = 7)
    d.woof()
    val c=Cat(color = "ginger", Age = 6)
    c.purr()
    val h=Horse(color = "Black", Age = 8)
    h.neigh()
}

