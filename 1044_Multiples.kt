/*Read two integer values (A and B). After, the program should print the message
 "Sao Multiplos" (are multiples) or "Nao sao Multiplos" (aren’t multiples), corresponding to the read values.

Input
The input has two integer numbers.

Output
Print the relative message to the input as stated above.*/

import java.util.*

fun main(args: Array<String>) {
    val read = Scanner(System.`in`)
    val A = read.nextInt()
    val B = read.nextInt()

    if (B % A == 0 || A % B == 0)
    {
        println("Sao Multiplos")
    }
    else
    {
        println("Nao sao Multiplos")
    }
}