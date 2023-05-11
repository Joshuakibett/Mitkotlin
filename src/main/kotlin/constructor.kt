class Students(val name:String,var gender:String,val Age:Int){

}

fun main(args: Array<String>) {
    val myobj=Students(name = "Joshua", gender = "funny", Age =79)
    val w1=Students(name = "Cupcake", Age = 12, gender = "male")

    println("Student name is ${myobj.name},and he is ${myobj.Age},plus hes ${myobj.gender}")
    println("${w1.name} is a ferrocious dog.Hes ${w1.gender} and has lived for ${w1.Age}")

}