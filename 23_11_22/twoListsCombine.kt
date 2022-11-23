fun main(){
    var javaBatch=mutableListOf<String>("anil","gopal","ankit","manish")
    var kotlinBatch=mutableListOf<String>("ankit","kumar","manish","rahul")

    println("javBatch: ${javaBatch}")
    println("kotlinBatch: ${kotlinBatch}")

    kotlinBatch.removeAll(javaBatch) //removing common elements from kotlinBatch 
    javaBatch.addAll(kotlinBatch)
    javaBatch.sort() //sorting
    println(javaBatch)
}