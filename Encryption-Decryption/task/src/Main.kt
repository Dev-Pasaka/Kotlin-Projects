package encryptdecrypt

fun main() {
    val mode = readlnOrNull()!!
    var text = readlnOrNull()!!
    val key = readlnOrNull()!!.toInt()
    when(mode){
        "enc"-> encryption(text,key)
        "dec"-> decryption(text,key)
    }

}

fun encryption(text: String, key: Int){
    val plainTextList = text.toMutableList()
    val plainTextCharList = mutableListOf<Char>()
    val unicodesList = ('!'..'~').toMutableList()
    val unicodesCypherPositionList = mutableListOf<Int>()
    val list1 = mutableListOf<Int>()
    val cypherTextList = mutableListOf<Char>()
    for (char in plainTextList){
        plainTextCharList.add(char)
    }
    for (text in plainTextCharList){
        for (unicode in unicodesList){
            if (text == unicode){
                unicodesCypherPositionList.add(text.code+key)
            }
        }
        if (text.code == 32){
            unicodesCypherPositionList.add(32)
        }
    }
    for (cypher in unicodesCypherPositionList){
        if (cypher > 126){
            list1.add(cypher.rem(126))
        }else{
            list1.add(cypher)
        }
    }
    for(index in list1){
        for (unicode in unicodesList){
            if(unicode.code == index){
                cypherTextList.add(unicode)
            }
        }
        if(index == 32 ){
            cypherTextList.add('%')
        }
    }
    val ciphertext = cypherTextList.joinToString("")
    println(ciphertext)
}
fun decryption(text: String, key: Int){
    val cipherText = text.toMutableList()
    val cipherTextCharList = mutableListOf<Char>()
    val unicodesList = ('!'..'~').toMutableList()
    val plainTextPositionList = mutableListOf<Int>()
    val plainTextList = mutableListOf<Char>()
    for (cipher in cipherText){
        cipherTextCharList.add(cipher)
    }

    for (cipher in cipherTextCharList){
        for (unicode in unicodesList){
            if (cipher == unicode){
                plainTextPositionList.add(cipher.code-key)
            }
        }
        if (cipher.code == 37){
            plainTextPositionList.add(37)
        }
    }
    for(index in plainTextPositionList) {
        for (unicode in unicodesList) {
            if (unicode.code == index) {
                plainTextList.add(unicode)
            }
        }
        if(index == 37 ){
            plainTextList.add(' ')
            plainTextList.remove('%')
        }
    }
    val plainText = plainTextList.joinToString("")
    println(plainText)
}