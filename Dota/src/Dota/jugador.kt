package Dota//inserta el jugador
abstract class jugador (val name: String, val noJugador : Int) {
    var isOnline : Boolean = false
    fun open() {
        isOnline = true
    }
}
