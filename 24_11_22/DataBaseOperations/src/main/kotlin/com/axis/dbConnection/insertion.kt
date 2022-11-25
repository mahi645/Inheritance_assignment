package com.axis.dbConnection

fun main(){
    val dBconnection=DbConnection()
    val connection=dBconnection.connect()

    val stmt=connection.createStatement()
    val res1=stmt.executeUpdate("insert into student values(1,'arun')")
    val res2=stmt.executeUpdate("insert into student values(2,'bala')")

    if(res1>0 && res2>0){
        println("2 columns inserted")
    }
    else{
        println("not inserted")
    }

    val query=connection.prepareStatement("select *from student")
    val res=query.executeQuery()

    val student1= mutableListOf<Student>()
    while(res.next()){
        val id=res.getInt("id")
        val name=res.getString("name")
        student1.add(Student(id,name))
    }


    for(student in student1){
        println("${student.id}  ${student.name}")
    }


}