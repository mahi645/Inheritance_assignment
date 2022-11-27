package com.axis.util

import com.axis.dbConnection.DbConnection
import com.axis.modal.ProductModal

class ProductUtil {
    val dbConnection= DbConnection()
    val connection=dbConnection.connect()
    //

    fun addData(product: ProductModal){

        val prestmt=connection.prepareStatement("insert into product values(?,?,?,?)")

        //var product= mutableListOf<ProductModal>()
        prestmt.setInt(1,product.id)
        prestmt.setString(2,product.name)
        prestmt.setInt(3,product.price)
        prestmt.setInt(4,product.itemsCount)
        val result=prestmt.executeUpdate()

        if(result>0){
             println("$result rows inserted")
        }else{
            println("not inserted")
        }
    }
    fun view() {
        val stmt = connection.prepareStatement("select *from product ")
        val res = stmt.executeQuery()
        val products = mutableListOf<ProductModal>()


        while (res.next()) {
            val id = res.getInt("id")
            val name = res.getString("name")
            val price = res.getInt("price")
            val itemsCount = res.getInt("itemsCount")

            products.add(ProductModal(id, name, price, itemsCount))
        }
        for (product in products) {
            println(product)
        }
    }
    fun deleteName(id:Int){
        val stmt=connection.prepareStatement("delete from product where id=?")
        val res=stmt.executeUpdate()
        stmt.setInt(1,id)
        if(res>0){
            println("$res rows deeted")
        }
        else{
            println("not found")
        }
    }
    fun updateData(product:ProductModal){
        var stmt=connection.prepareStatement("update product set id=?,name=?,price=?,itemsCount=?;")

        stmt.setInt(1,product.id)
        stmt.setString(2,product.name)
        stmt.setInt(3,product.price)
        stmt.setInt(4,product.itemsCount)
        var res=stmt.executeUpdate()
        if(res>0){
            println("$res rows updated")
        }
        else{
            println("no rows updated")
        }

    }

}