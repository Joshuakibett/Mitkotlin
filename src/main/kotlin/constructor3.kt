fun main(args: Array<String>) {
    val obj=Student ("Joshua",32)
}
class Student{
    constructor(name:String,age:Int){
        println("Student Name: ${name.toUpperCase()}")
        println("Student Age: $age")
    }
}