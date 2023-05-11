open class wazazi{
    val mama="She likes cooking"
    val baba="He likes watching football"
}
class boy:wazazi(){
    fun mvulana(){
        println(baba)
    }
}
class girl:wazazi(){
    fun msichana(){
        println(mama)
    }
}

fun main(args: Array<String>) {
    val kijanaobj=boy()
    kijanaobj.mvulana()
    
    val kobj=girl()
    kobj.msichana()
}