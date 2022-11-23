fun main(){

    var employee=mutableListOf<Employee>()
    employee.add(Employee(1,"uma","ECE",20000,23))
    employee.add(Employee(2,"anu","Mech",30000,22))
    employee.add(Employee(3,"rahim","CSE",34333,23))
    for(employ in employee){
        println("${employ.id} ${employ.name} ${employ.dept} ${employ.salary} ${employ.age} ")
    }
}
class Employee(var id:Int,var name:String,var dept:String,var salary:Int,var age:Int){

}