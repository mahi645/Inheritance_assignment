fun main(args: Array<String>) {
    var cat=Cat()
    cat.method()
    

}
open class Animal{
    val num1=10
    val num2=12
    fun test1(){
        println(num1)
        println("parent method one")
        
    }
}
open class Dog:Animal(){
    var num3=15
    fun check(){
        println("single child class method")
        println(num2)
    }
}
class Cat:Dog(){
    fun method(){
        println("muti level inheritance")
        println(num3)
        println(num1)
        
    }
}