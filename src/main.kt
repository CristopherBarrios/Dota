import Dota.*

fun main(args: Array<String>) {
    //muestra los heros
}
    val inicia = jugadorAleatorio<heroe>(arrayListOf<heroe>(
            heroe("Abaddon","Strength"),
            heroe("Alchemist", "Strength"),
            heroe("Axe",  "Strength"),
            heroe("Beastmaster",  "Strength"),
            heroe("Brewmaster",  "Strength"),
            heroe("Britleback",  "Strength"),
            heroe("Centaur Warrunner",  "Strength"),
            heroe("Chaos Knight",  "Strength"),
            heroe("Clockwerk",  "Strength"),
            heroe("Doom",  "Strength"),
            heroe("Anti-Mage",  "Agility"),
            heroe("Arc Warden",  "Agility"),
            heroe("Bloodseeker",  "Agility"),
            heroe("Bounty Hunter",  "Agility"),
            heroe("Broodmother",  "Agility"),
            heroe("Ancient Apparition",  " Intelligence"),
            heroe("Bane",  " Intelligence"),
            heroe("Batrider",  " Intelligence"),
            heroe("Chen",  " Intelligence"),
            heroe("Crystal Maiden",  " Intelligence")
    ))

    val forrest = equipo<jugador>(jugadorAleatorio());
    println(forrest.sayTheLineForrest())
    println(forrest.sayTheLineForrest())
    println(forrest.sayTheLineForrest())
    println(forrest.sayTheLineForrest())
    println(forrest.sayTheLineForrest())


    println("juegar")

    val boxOfPaletas = jugadorAleatorio<torre>(arrayListOf<torre>(
            torre(true),
            torre(false),
            torre(false)
    ));

    val forrest2 = equipo<jugador>(jugadorAleatorio());
    println(forrest2.sayTheLineForrest())
    println(forrest2.sayTheLineForrest())
    println(forrest2.sayTheLineForrest())
    println(forrest2.sayTheLineForrest())
    println(forrest2.sayTheLineForrest())




