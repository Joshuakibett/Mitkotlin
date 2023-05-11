class mimi(val jina:String,val shule:String,val miaka:Int){

}

fun main(args: Array<String>) {
    val school=mimi(jina = "Joshua", shule = "Nairobi School", miaka = 2019)

    println("My name is ${school.jina}.I went to ${school.shule} in the year ${school.miaka}")

}