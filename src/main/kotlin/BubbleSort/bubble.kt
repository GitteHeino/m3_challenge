package BubbleSort


/*
Beispiel:
Gib eine Liste von Zahlen durch Komma getrennt ein:
6,9,4,0,3,5,1,2,8,7
Sortierte Liste: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
Ist die Liste lückenlos? true

Gib eine Liste von Zahlen durch Komma getrennt ein:
11,5,4,7,2,8,9,21
Sortierte Liste: [2, 4, 5, 7, 8, 9, 11, 21]
Ist die Liste lückenlos? false

*/

fun main() {
    println("Gib eine Liste von Zahlen durch Komma getrennt ein:")
    val input = readLine()
    val zahlen = input?.split(",")?.map { it.toInt() }?.toMutableList()

    if (zahlen != null) {
        bubbleSort(zahlen)
        println("Sortierte Liste: $zahlen")

        val istLückenlos = isListLückenlos(zahlen)
        println("Ist die Liste lückenlos?\t\n")
        if(!istLückenlos) {
            println("Leider nein!")
        } else{
            println("JA!!")
        }
    } else {
        println("Ungültige Eingabe")
    }

}



fun bubbleSort(zahlen: MutableList<Int>) {
    val n = zahlen.size                            // ermittelt Anzahl der Zahlen in der Liste
    for (i in 0 until n - 1) {
        for (zahl in 0 until n - i - 1) {
            if (zahlen[zahl] > zahlen[zahl + 1]) {
                val temp = zahlen[zahl]
                zahlen[zahl] = zahlen[zahl + 1]
                zahlen[zahl + 1] = temp
            }

        }
    }
}

fun isListLückenlos(zahlen: List<Int>): Boolean {
    for (i in 0 until zahlen.size - 1) {     // Durchlaauf durch alle Zahlen der bubbleSort-Liste
        if (zahlen[i + 1] - zahlen[i] != 1) {      // vergleicht, ob der Abstand der Zahl[i] um 1 größer ist als [i + 1]
            return false                           //
        }
    }
    return true
}


