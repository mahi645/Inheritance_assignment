fun main(){
    var c:Int=0
    for(i:Int in 0..100){
        if(i%3==0 && i%5==0){
            c=c+1
        }
    }
    println("count of numbers between 1 to 100 divisable by 3 and 5: $c")
}