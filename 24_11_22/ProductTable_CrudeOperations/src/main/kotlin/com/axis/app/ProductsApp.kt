package com.axis.app

import com.axis.modal.ProductModal
import com.axis.service.ProductService
import com.axis.util.ProductUtil
import java.util.Scanner

fun main(){
    var productService=ProductService()
    //var productUtil=ProductUtil()
    var scanner=Scanner(System.`in`)
    //var product=ProductModal(1,"mobile",12000,2)

    //var column1=productService.insertData(product)
    //var column2=productUtil.view()
    println("=====================ProductDemo===============================")
    while(true){
        println("1.insert\t2.delete\t3.display\t4.update\t5.exit")
        println("enter value between 1 to 4: ")
        val choice=scanner.nextInt()
        when(choice){
            1->{
                println("enter values to insert: ")
                println("enter id to insert: ")
                var id:Int=scanner.nextInt()
                println("enter name to insert: ")
                var name:String=scanner.next()
                println("enter price to insert: ")
                var price:Int=scanner.nextInt()
                println("enter itemsCount to insert: ")
                var itemsCount:Int=scanner.nextInt()
                productService.insertData(ProductModal(id,name,price,itemsCount))
            }
            2->{
                println("=========================delete==========================")
                println("enter id to delete")
                var id:Int=scanner.nextInt()
                productService.deleteData(id)
            }
            3->{
                println("============================display=======================")
                productService.display()
            }
            4->{
                println("==========================update==========================")
                println("enter id to update: ")
                var id:Int=scanner.nextInt()
                println("enter name to update: ")
                var name:String=scanner.nextLine()
                println("enter price to update: ")
                var price:Int=scanner.nextInt()
                println("enter itemsCount to update: ")
                var itemsCount:Int=scanner.nextInt()
                productService.updateTable(ProductModal(id,name,price,itemsCount))
            }
            5->{
                println("Program ends ")
                System.exit(0)
            }
        }

    }

}