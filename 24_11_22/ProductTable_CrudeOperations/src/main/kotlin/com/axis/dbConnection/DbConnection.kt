package com.axis.dbConnection
import java.sql.Connection
import java.sql.DriverManager


class DbConnection {
    fun connect():Connection{
        val myurl="jdbc:mysql://localhost:3306/kotlindb"
        val connection=DriverManager.getConnection(myurl,"root","M@hesw@ri645")
        return connection
    }

}