package fruits
fun main(args: Array<String>) {
    var fruit=mutableListOf<String>("apple","banana","mango")
    println("fruits list : ${fruit}")
    fruit.add("papaya")
    fruit.add("orange")
    
    println("after list adding: ${fruit}")
}