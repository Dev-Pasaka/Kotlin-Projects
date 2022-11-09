package encryptdecrypt

fun main() {

    /** PLAINTEXT INPUT8*/
    val plainText = readlnOrNull()!!.toMutableList()
    /** ENCRYPTION KEY*/
    var key = readlnOrNull()!!.toInt()

    /** LIST OF ALPHABETS*/
    val alphabetList = ('a'..'z').toMutableList()
    val cypherTextIndexList = mutableListOf<Int>()
    var cypherTextList = mutableListOf<Char>()
    val list1 = mutableListOf<Int>()

    for (text in plainText){
        for (alpha in alphabetList){
            if (text == alpha){
                cypherTextIndexList.add(alphabetList.indexOf(text)+key)
            }
        }
        if (text.code == 32){
            cypherTextIndexList.add(0)
        }
    }
    for (cypher in cypherTextIndexList){
        if (cypher > 25){
            list1.add(cypher.rem(26))
        }else if (cypher == 0 ){
           list1.add(cypher)
        }
        else{
            list1.add(cypher)
        }
    }
    for (index in list1){
        for (alpha in alphabetList){
            if (alphabetList[index] == alpha ){
                cypherTextList.add(alpha)
            }
        }
        if(index == 0 ){
            cypherTextList.add(' ')
            cypherTextList.remove('a')
        }

    }
    println(cypherTextList.joinToString(""))

}