fun main(args:Array<String>){
// this is a for loop

    for (i in 5..32){
        println("loop : $i")
    }
    val myarr= arrayOf("ab","cd","ef","gh",2.45)

for (n in myarr){
    println(n)
}
// this is a while loop
    var num = 10
    var num2 = 6
    var num3 = 100
    while (num>=0){
        println("loop : $num")
        num--
    }
    while(num2 <= 10) {
        println("loop : $num2")

    }
    do {
        println("loop :$num3")
        num3++
    }while (num2>=105)


}