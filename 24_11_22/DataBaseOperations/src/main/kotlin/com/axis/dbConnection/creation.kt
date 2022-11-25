package com.axis.dbConnection

fun main(){
    val dBconnection=DbConnection()
    val connection=dBconnection.connect()
    println("connection estaablished successfully")

    val stmt=connection.createStatement()
    stmt.executeUpdate("create table student(id int,name varchar(50));")
    println("table created")
}