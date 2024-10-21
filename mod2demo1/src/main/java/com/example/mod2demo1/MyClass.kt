package com.example.mod2demo1

//fun main() {
//    println("Hello World !");
//
//    val value : Int = 10;
//    //value = 15;  pas possible
//
//
//    //inférrence de type par défaut sinon typage manuelle avec le : Int
//    var value2 : Int = 50;
//    value2 = 45;
//
//    //type Any pour pouvoir modifier la valeur
//    //sans se soucier du type
//    var value3 : Any = "Coucou";
//    value3 = 45;
//}


//fun main(){
//    //lazy
//    var word = "world";
//
//    val message by lazy { "Hello $word" }
//
//    println(message);
//
//    word = "Michel";
//
//    println(message);
//}

fun main(){

    //gestion du null
    var word : String? = null;
    //elvis operator
    println(word?.length ?: "Par défaut");

    //!! assure au compilateur que ce n'est pas null
    println(word!!.length);

    var word2 = null;
    println(word2);
}











