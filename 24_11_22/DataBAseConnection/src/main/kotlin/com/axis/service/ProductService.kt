package com.axis.service

import com.axis.dbConnection.DbConnection
import com.axis.modal.ProductModal
import com.axis.util.ProductUtil

class ProductService {
    val dbConnection = DbConnection()
    val connection = dbConnection.connect()

    val productUtil=ProductUtil()
    fun insertData(product:ProductModal){
        productUtil.addData(product)
    }
    fun deleteData(id:Int){
        productUtil.deleteName(id)
    }
    fun updateTable(product:ProductModal){
        productUtil.updateData(product)
    }
    fun display(){
        productUtil.view()
    }
    fun exitProgram(){

    }

}
    //
/*
    fun addData(product:ProductModal):String{

        val prestmt=connection.prepareStatement("insert into product values(?,?,?,?)")
        //var product= mutableListOf<ProductModal>()
        prestmt.setInt(1,product.id)
        prestmt.setString(2,product.name)
        prestmt.setInt(3,product.price)
        prestmt.setInt(4,product.itemsCount)

        val result=prestmt.executeUpdate()
        if(result>0){
            return ("inserted")
        }else{
            return ("not inserted")
        }
    }
    fun view():MutableList<ProductModal>{
        val stmt=connection.prepareStatement("select *from products ")
        val res=stmt.executeQuery()
        val products=mutableListOf<ProductModal>()

        while(res.next()){
            val id=res.getInt("id")
            val name=res.getString("name")
            val price=res.getInt("price")
            val itemsCount=res.getInt("itemsCount")

            products.add(ProductModal(id,name,price,itemsCount))
        }
        return products


    }


}
*/