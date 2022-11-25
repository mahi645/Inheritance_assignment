package com.axis.database

import com.axis.modal.Employee

class EmployeeStore {
    var employ= mutableListOf<Employee>()
    init{
        employ.add(Employee(1,"varun","Testing"))
        employ.add(Employee(2,"sagar","Automation"))
        employ.add(Employee(3,"raghav","developer"))
    }
    fun data():MutableList<Employee>{
        return employ
    }
}