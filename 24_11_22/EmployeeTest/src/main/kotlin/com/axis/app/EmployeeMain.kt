package com.axis.app

import com.axis.database.EmployeeStore
import com.axis.modal.Employee
import com.axis.service.EmployeeService

fun main(){
    var employeeService=EmployeeService().viewAllEmployees()
    var employStore=EmployeeStore()
    for(emp in employeeService){
        println("${emp.id} | ${emp.name}  | ${emp.dept}")
    }
}