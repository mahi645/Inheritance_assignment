package com.axis.service

import com.axis.modal.Employee
import com.axis.database.EmployeeStore
class EmployeeService {

    var employUtil=EmployeeStore()
    fun viewAllEmployees():MutableList<Employee>{
        return employUtil.data()
    }
}