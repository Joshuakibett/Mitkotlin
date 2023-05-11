import kotlin.math.sqrt

fun main(args: Array<String>){
    Hesabu()
    println(sqrt(879.89))
    Myfunction(fname = "Joshua", Age = 98)
    Myfunct2(hah = "Score", m1 = "music", Age = 23)

}
fun Myfunction(fname:String,Age:Int){

    println("My first name is $fname and I am $Age years old.")
}
fun Myfunct2(hah:String,m1:String,Age: Int){
    println("Tyler has a good $hah and is good at making $m1.And hes only $Age")
}

