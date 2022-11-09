fun main() {
    val unsortedListIntegers = readLine()!!.toCharArray().map(Character::getNumericValue)
    val p_m= readLine()!!.toCharArray().map(Character::getNumericValue)
    var newPm = mutableListOf<Int>()
    if (p_m != null) {
        for (pm in p_m){
            newPm.add(pm)

        }


    }
    if (unsortedListIntegers.contains(p_m[0]) && unsortedListIntegers.contains(p_m[1]))
    {
        println("YES")
        println(newPm.joinToString(" "))

    }else{
        println("NO")
    }

}