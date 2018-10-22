package Dota//inserta el equipo
class equipo<T> (val life : jugadorAleatorio<T>) where T : jugador {
    var isRunning: Boolean = false
    fun runForrest() {
        isRunning = true
    }

    fun sayTheLineForrest(): String {
        val picked = life.pickOne()

        if (picked == null) {
            return "no se ha elegido"
        }

        return "juego con jugadores completos \n${picked}"
    }
}