fun main(){
    var list = MutableList(readln().toInt()) { readln().toInt() }
    val last = list.remove(list.last())
    val newList = mutableListOf<Int>()
    for(num in list){
        var index = 1
        newList.add(index, num)
        index++
    }
    println(newList.joinToString(" "))


}