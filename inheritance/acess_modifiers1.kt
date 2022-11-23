fun main(args: Array<String>) {
   
   var animal=Animal()
   //println(animal.a) can't possible due to a is private
   println(animal.b)
   //println(animal.c) cannot possible.because c is protected .
   println(animal.d)
   //animal.check()
   var animal2=Cat()
   animal2.check2()
   
   var goat=Goat()
   goat.check3()
}
open class Animal{
    private val a=2
    internal val b=4
    protected val c=7
    val d=3
    fun check(){
        println(a)
        println(b)
        println(c)
        println(d)
    }
}
class Cat{
    var animal1=Animal()
    fun check2(){
       // println(animal1.a)
        println(animal1.b)
       // println(animal1.c)
        println(animal1.d)
    
    }
}
class Goat:Animal(){
    fun check3(){
        println(c)
    }
}