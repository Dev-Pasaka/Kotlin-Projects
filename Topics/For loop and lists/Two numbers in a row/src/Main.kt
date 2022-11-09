fun main() {
    val s = List(readLine()!!.toInt()) { readLine()!! }.joinToString(" ")
    val (a, b) = readLine()!!.split(" ")
    println(if ("$a $b" in s || "$b $a" in s) "NO" else "YES")
}