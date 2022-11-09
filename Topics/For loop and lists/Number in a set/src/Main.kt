fun main() {
    // write your code here
    /**SET OF N NUMBERS*/

    val m = readLine()!!.toInt()

    var setOfN = mutableListOf<Int>(4,1,2,3)
    if (setOfN.size == setOfN[0] && setOfN.size>1 && setOfN.contains(m)){
        println("YES")
    }else{
        println("NO")
    }




}