/*Read an integer number that is the code number for phone dialing.
 Then, print the destination according to the following table:

If the input number isn’t found in the above table, the output must be:
"DDD nao cadastrado"
That means “DDD not found” in Portuguese language.

Input
The input consists in a unique integer number.

Output
Print the city name corresponding to the input DDD.
 Print DDD nao cadastrado if doesn't exist corresponding DDD to the typed number.*/

import java.util.*

fun main(arge: Array<String>) {

    val read = Scanner(System.`in`)
    val a = read.nextInt()

    when (a) {
        61 -> println("Brasilia")
        71 -> println("Salvador")
        11 -> println("Sao Paulo")
        21 -> println("Rio de Janeiro")
        32 -> println("Juiz de Fora")
        19 -> println("Campinas")
        27 -> println("Vitoria")
        31 -> println("Belo Horizonte")
        else -> println("DDD nao cadastrado")
    }

//    if(a== 61) println("Brasilia")
//    else if(a== 71) println("Salvador")
//    else if(a== 11) println("Sao Paulo")
//    else if(a== 21) println("Rio de Janeiro")
//    else if(a== 32) println("Juiz de Fora")
//    else if(a== 19) println("Campinas")
//    else if(a== 27) println("Vitoria")
//    else if(a== 31) println("Belo Horizonte")
//    else println("DDD nao cadastrado")
}