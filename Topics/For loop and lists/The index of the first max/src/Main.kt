fun main() {

    val listNum = readLine()!!.toInt()
    val mutList: MutableList<Int> = mutableListOf()
    for (i in 1..listNum) {
        mutList.add(readLine()!!.toInt())
    }
    println(mutList.indexOf(mutList.maxOrNull()))
}