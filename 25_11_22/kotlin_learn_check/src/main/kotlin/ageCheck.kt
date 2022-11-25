fun main(){
    var lambda1:(Int)->String={age->
        if(age<18) "non adult"
        else if(age>=18 && age<=55) "adult"
        else "senior citizen"
    }
    var res:String=lambda1(30)
    println(res)
}