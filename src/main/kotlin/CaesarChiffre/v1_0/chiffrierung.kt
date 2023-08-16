package CaesarChiffre.v1_0

object StringShift {
    fun shiftString1(input: String, shiftAmount: Int): String {
        val shiftedString = StringBuilder()
        for (c in input.toCharArray()) {
            if (Character.isLetter(c)) {
               val base = if (Character.isLowerCase(c)) 'a' else 'A'
                val shiftedChar = (((c.code - base.code + shiftAmount) % 26 + 26) % 26 + base.code).toChar()
                shiftedString.append(shiftedChar)
            } else {
                shiftedString.append(c)
            }
        }
        return shiftedString.toString()
    }

    fun shiftString2(input: String, shiftAmount: Int): String {
        val shiftedString = StringBuilder()
        for (c in input.toCharArray()) {
            if (Character.isLetter(c)) {
                val base = if (Character.isLowerCase(c)) 'a' else 'A'
                val shiftedChar = (((c.code - base.code + shiftAmount) % 26 + 26) % 26 + base.code).toChar()
                shiftedString.append(shiftedChar)
            } else {
                shiftedString.append(c)
            }
        }
        return shiftedString.toString()
    }

    @JvmStatic
    fun main(args: Array<String>) {

        print("\nWähle aus: 1 = Chiffrierung\n")
        println("Wähle aus: 2 = Dechiffrierung\n")
        val rot13 = readln().toInt()

        fun chiffrierung() {
            println("\nGib den Klartext ein:  ")
            val originalString = readln()
            println("Gib den Rotationswert (Zahl) ein:  ")
            val shiftAmount = readln().toInt()

            val encryptedString = shiftString1(originalString, shiftAmount)
            println("Encoded String: $encryptedString")
            Thread.sleep(1000)

        }

        fun dechiffrierung(input: String,shiftAmount: Int) {
            println("Gib den Klartext ein:  ")
            val originalString = readln()
            println("Gib den Rotationswert (Zahl) ein:  ")
            val shiftAmount = readln().toInt()

            val decryptedString = shiftString2(originalString, shiftAmount)
            println("Decoded String: $decryptedString")

        }


        if (rot13 == 1) {
            chiffrierung()
        } else {
            //TODO anpassen
        }

    }
}
