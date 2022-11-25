class Account(var accNo:String,var balance:Int,var accType:String){

    fun withdraw(amount:Int){
        val res=balance - amount
        println("remaining amount after withdraw of $amount: $res")
    }
    fun deposit(amount1:Int){
        val depositAmount=balance+amount1
        println(" amount after deposit of $amount1: $depositAmount")
    }
    var total_balance=0
    fun rateOfIntrest(){
        if(accType=="Current"){
            total_balance=(balance*110)/100
            println("Cuurent account balance after rate of intrest: $total_balance")
        }
        else{
            total_balance=(balance*106)/100
            println("savings account balance after rate of intrest: $total_balance")
        }
    }
    fun getBalance(){
        println(total_balance)
    }

}
fun main(){
    var account=Account("b123",20000,"Current")
    account.deposit(3000)
    account.rateOfIntrest()
    account.getBalance()
}