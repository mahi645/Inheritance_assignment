fun main(args: Array<String>) {
    var cat=Cat()
    cat.method()
    var dog=Dog()
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
    var num3=15
    fun check(){
        println("single child class method")
        println(num2)
    }
}
class Cat:Animal(){
    fun method(){
        println("heirarchial level inheritance")
        println(num1)
        
    }
}