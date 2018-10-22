package Dota//inserta los heroes
data class heroe(val nombre: String, val tipo: String) {
    override fun toString(): String {
        return """
            name: ${nombre}
            sugarContent: ${tipo}
        """.trimIndent()
    }
}
