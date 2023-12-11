/*Write a program that prints all even numbers between 1 and 100, including them if it is the case.

Input
In this extremely simple problem there is no input.

Output
Print all even numbers between 1 and 100, including them, one by row.*/

import java.util.*

fun main(args: Array<String>) {

    for (i in 1..100){
        if(i%2==0){
            println(i)
        }
    }
}