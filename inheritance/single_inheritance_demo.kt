fun main(args: Array<String>) {
    var dog=Dog()
    dog.check()
    dog.test1()

}
open class Animal{
    val num1=10
    val num2=12
    fun test1(){
        println(num1)
        println("parent method one")
        
    }
}
class Dog:Animal(){
    fun check(){
        println("single child class method")
        println(num2)
    }
}