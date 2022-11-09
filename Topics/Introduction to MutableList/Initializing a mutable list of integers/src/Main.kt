fun main() {

    val numbers = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    for (index in numbers.lastIndex downTo(0) step 2) {
        println("$index: ${numbers[index]}")
    }
}