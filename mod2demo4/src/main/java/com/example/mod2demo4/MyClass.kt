package com.example.mod2demo4

class Sport(
    val name: String,
    val type: String,
    val nbPlayer: Int = 2
) {
    private var _isIndoor: Boolean = false
    var isIndoor: Boolean
        get() = _isIndoor
        set(value) {
            _isIndoor = value
        }

    fun displayMatch(): String {
        return "Le match de $name a commencé !"
    }
}

fun main() {

    val hockeyOnIce = Sport(type = "Collectif", name = "Hockey sur glace", nbPlayer = 6)

    println(hockeyOnIce.displayMatch())
    hockeyOnIce.isIndoor = true
    println(hockeyOnIce.isIndoor)
    println(hockeyOnIce.displayMatch())

}

