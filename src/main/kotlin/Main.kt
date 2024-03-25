fun main(){
printList("Barnie bakes brown bagels and buns")
    takeInArray(1,3, 5,6)
    isPalidrome("poop")
}

fun printList(word:String){
    println(word.toList())
}

fun takeInArray(array: Array<Int>){
    var results =array.count()
    var sum=array.sum()
    var avg= array.average()
    println(results)
    println(sum)
    println(avg)

}

fun isPalidrome(word:String): Boolean{
var word= "poop"
    if {
        word=="poop"
        println(true)
    }
    else {println(false)}
    return word

}
