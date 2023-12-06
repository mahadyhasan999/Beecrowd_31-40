/*Read 3 double numbers (A, B and C) representing the sides of a triangle and arrange them
 in decreasing order, so that the side A is the biggest of the three sides.
  Next, determine the type of triangle that they can make, based on the following cases always writing
   an appropriate message:
if A ≥ B + C, write the message: NAO FORMA TRIANGULO
if A2 = B2 + C2, write the message: TRIANGULO RETANGULO
if A2 > B2 + C2, write the message: TRIANGULO OBTUSANGULO
if A2 < B2 + C2, write the message: TRIANGULO ACUTANGULO
if the three sides are the same size, write the message: TRIANGULO EQUILATERO
if only two sides are the same and the third one is different, write the message: TRIANGULO ISOSCELES
Input
The input contains three double numbers, A (0 < A) , B (0 < B) and C (0 < C).

Output
Print all the classifications of the triangle presented in the input.*/

import java.util.*
fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)
    var A = reader.nextDouble()
    var B = reader.nextDouble()
    var C = reader.nextDouble()

    val sortedList = listOf(A, B, C).sortedDescending()

    A = sortedList[0]
    B = sortedList[1]
    C = sortedList[2]

    if (A >= B + C) println("NAO FORMA TRIANGULO")
    else{
        if (A * A == B * B + C * C) println("TRIANGULO RETANGULO")
        if (A * A > B * B + C * C) println("TRIANGULO OBTUSANGULO")
        if (A * A < B * B + C * C) println("TRIANGULO ACUTANGULO")
        if (A == B && B == C) println("TRIANGULO EQUILATERO")
        if ((A == B && B != C) || (C == A && C != B) || (B == C && C != A)) println("TRIANGULO ISOSCELES")
    }

//    if (A >= B + C) {
//        println("NAO FORMA TRIANGULO")
//    }else{
//
//        if (A * A == B * B + C * C) {
//            println("TRIANGULO RETANGULO")
//        }
//        if (A * A > B * B + C * C) {
//            println("TRIANGULO OBTUSANGULO")
//        }
//        if (A * A < B * B + C * C) { println("TRIANGULO ACUTANGULO")
//        }
//        if (A == B && B == C) {
//            println("TRIANGULO EQUILATERO")
//        }
//        if ((A == B && B != C) || (C == A && C != B) || (B == C && C != A)) {
//            println("TRIANGULO ISOSCELES")
//        }
//    }
}