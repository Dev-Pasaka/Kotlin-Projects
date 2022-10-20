
fun main() {
    var plainText = ("we found a treasure")


    val alphabetList = ('a'..'z').toList()

    var cypherText = mutableListOf<String>()
    var cypherTextIndexes = mutableListOf<Int>()

    for (text in plainText){
        cypherTextIndexes.add(25-alphabetList.indexOf(text))
    }
    for (cypher in cypherTextIndexes){
        if (cypher == 26){
            cypherText.add(" ")
            continue
        }
        cypherText.add(alphabetList[cypher].toString())



    }
    val formattedCypherText = cypherText.joinToString(separator = "")
    println("$formattedCypherText!")



}