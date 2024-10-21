package com.example.mod2demo4

open class Sport(
    open val name: String,
    val type: String,
    val nbPlayer: Int = 2
) {
    private var _isIndoor: Boolean = false
    var isIndoor: Boolean
        get() = _isIndoor
        set(value) {
            _isIndoor = value
        }

    open fun displayMatch(): String {
        return "Le match de $name a commencé !"
    }
}

class SportCo(name: String, nbPlayer: Int) : Sport(name, "Collectif", nbPlayer){

    override fun displayMatch() : String{
        return super.displayMatch()  + " et est $type"
    }
}

fun main() {

    val hockeyOnIce = Sport(type = "Collectif", name = "Hockey sur glace", nbPlayer = 6)

    println(hockeyOnIce.displayMatch())
    hockeyOnIce.isIndoor = true
    println(hockeyOnIce.isIndoor)
    println(hockeyOnIce.displayMatch())

    val basket = SportCo(name = "Basket", nbPlayer = 5)
    println(basket.displayMatch())

}

