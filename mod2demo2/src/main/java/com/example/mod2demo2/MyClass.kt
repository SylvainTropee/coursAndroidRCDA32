package com.example.mod2demo2

//fun main() {
//
//    //conditions
//    val age = 18;
//
//    val message = if (age == 18) {
//        "Majeur";
//    } else {
//        "Mineur";
//    }
//    println(message)
//}

//fun main() {
//    //when = switch
//    var age : Any = "45"
//
//    when(age){
//        1,2 -> println("C'est un bébé !")
//        in 2..18 -> println("C'est un enfant !")
//        is Int -> println("Ce n'est plus un enfant !")
//        else -> println("C'est autre chose")
//    }
//}

fun main() {

    val africanCountries = arrayOf("Ouganda", "Togo", "Guinée", "Angola", "Maroc")

    //foreach
    for (country in africanCountries) {
        println(country)
    }

    //foreach avec clé
    for ((index,country) in africanCountries.withIndex()) {
        print(index)
        println(country)
    }

    //for classique
    for(i in 1..10){
        println(i)
    }

    println("-------")
    //downTo pour la décrémentation, step pour modifier le pas
    for(j in 10 downTo 1 step 2){
        println(j)
    }


    //mutableListOf -> list modifiable, listof -> liste non modifiable
    var asianCountries = mutableListOf("Chine", "Japon", "Corée", "Singapour", "Inde", "Pakistan")

    var list = List(45) {
        "Item $it"
    }
    for(item in list){
        println(item)
    }

}







