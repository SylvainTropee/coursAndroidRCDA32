package com.example.mod2tp


fun main(){

average2();
}


fun average(){

    println("Entrez le nombre de valeurs :")
    var nbNotes  = readln().toInt();

    var totalNote : Float = 0.0f;

    for(i in 1..nbNotes){
        println("Valeur :")
        totalNote += readln().toFloat()
    }

    val average = String.format("%.2f", totalNote / nbNotes)
    println("La moyenne est " + average)
}

fun average2(){

    var note : Float = 0f
    var totalNote : Float = 0.0f;
    var cpt : Int = 0;
    do {
        print("Note (-1 pour terminer)")
        note = readln().toFloat()
        if(note != -1f){
            totalNote += note
            cpt++;
        }

    }while (note != -1f)

    val average = String.format("%.2f", totalNote / cpt)
    println("La moyenne est " + average)

}









