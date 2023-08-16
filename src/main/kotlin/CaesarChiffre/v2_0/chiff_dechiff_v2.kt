package CaesarChiffre.v2_0

/*
fun main() {
    val originalString = "Hello, World!"
    val shiftAmount = 3

    val encryptedString = shiftString(originalString, shiftAmount)
    println("Encoded String: $encryptedString")
}

fun shiftString() {
    println("\nEingabe Text: ")
    val originalString = readln()       //"Hello, World!"
    println("\nEingabe Verschiebung (Zahl): ")
    val shiftAmount = readln().toInt()  //3

}*/




fun main() {

    println(
        "Wählen Sie:" +
                "1 - chiffrieren" +
                "2 - dechiffrieren"
    )
    val rot13 = readln().toInt()

    if (rot13 == 1) {
        //todo


    } else if (rot13 == 2) {
        //todo

    }

    print("\nEingabe Klartext:\t\t\n")
    val originalText = readln()           //"Hello, World!"
    println("Eingabe Verschiebung (Zahl):\t\t")
    val verschiebung = readln().toInt()      //3


    val encryptedString_chiff = shiftString_chiff(originalText, verschiebung)
    println("verschlüsselter Text: $encryptedString_chiff")

    val encryptedString_dechiff = shiftString_dechiff(originalText, verschiebung)
    println("entschlüsselter Text: $encryptedString_dechiff")


}

fun shiftString_chiff(input: String, shiftAmount: Int): String {
        val shiftedChars = input.map { char ->
        when {
            char.isLetter() -> {
                val asciiOffset = if (char.isLowerCase()) 'a'.toInt() else 'A'.toInt()
                val shiftedChar = ((char.toInt() - asciiOffset + shiftAmount) % 26 + 26) % 26 + asciiOffset
                shiftedChar.toChar()
            }
            else -> char
        }
    }
    return String(shiftedChars.toCharArray())
}

fun shiftString_dechiff(input: String, shiftAmount_dechiff: Int): String {
    val shiftedChars = input.map { char ->
        when {
            char.isLetter() -> {
                val asciiOffset = if (char.isLowerCase()) 'a'.toInt() else 'A'.toInt()
                val shiftedChar = ((char.toInt() - asciiOffset - shiftAmount_dechiff) % 26 + 26) % 26 + asciiOffset
                shiftedChar.toChar()
            }
            else -> char
        }
    }
    return String(shiftedChars.toCharArray())
}





