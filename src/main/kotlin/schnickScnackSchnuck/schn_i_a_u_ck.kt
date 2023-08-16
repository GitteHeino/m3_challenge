package schnickScnackSchnuck

//TODO schnick schnack schnuck


/*
Suchen Sie sich ein Symbol (Stein, Schere, Papier, mit der Hand geformt)
und klicken Sie darauf. Der Computer wählt per Zufall.


 */

fun main() {
spiel()
}


fun spiel() {
    println("Wähle ein Symbol: 1 = Stein, 2 = Schere, 3 = Papier: ")
    val spieler = readln().toInt()
    when {
        spieler == 1 -> println("Stein")
        spieler == 2 -> println("Schere")
        spieler == 3 -> println("Papier")
    }



/*    val options = listOf("Stein", "Schere", "Papier")*/
    val options = listOf(1, 2, 3)
    val randomIndex = (0 until options.size).random()
    val intelliJ = options[randomIndex].toInt()
    when {
        intelliJ == 1 -> println("IntelliJ zeigt: Stein")
        intelliJ == 2 -> println("IntelliJ zeigt: Schere")
        intelliJ == 3 -> println("IntelliJ zeigt: Papier")
    }

    /*println("IntelliJ zeigt $intelliJ")*/

    if (intelliJ == spieler) {
        println("Unentschieden! Nochmal?")
    }else
    when {
        intelliJ == 0 && spieler == 1 -> println("intelliJ gewinnt!")
        intelliJ == 0 && spieler == 2 -> println("Spieler gewinnt!")
        intelliJ == 1 && spieler == 0 -> println("Spieler gewinnt!")
        intelliJ == 1 && spieler == 2 -> println("intelliJ gewinnt!")
        intelliJ == 2 && spieler == 0 -> println("intelliJ gewinnt!")
        intelliJ == 2 && spieler == 1 -> println("Spieler gewinnt!")
    }
}