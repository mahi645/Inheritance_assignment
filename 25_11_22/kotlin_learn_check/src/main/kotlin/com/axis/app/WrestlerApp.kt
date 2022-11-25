package com.axis.app

import com.axis.service.WrestlerService

fun main(){
    var wrestlerService=WrestlerService()
    wrestlerService.displayWeight200gt()
    println("=========================")
    wrestlerService.displayAge35()
    wrestlerService.displayAll()

}