/*Read an integer number between 1 and 12, including. Corresponding to this number, you must print the month of the year, in english, with the first letter in uppercase.

Input
The input contains only an integer number.

Output
Print the name of the month according to the input number, with the first letter in uppercase.*/

import java.util.Scanner
fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    var month = scan.nextInt()

    if (month == 1) println("January")
    if (month == 2) println("February")
    if (month == 3) println("March")
    if (month == 4) println("April")
    if (month == 5) println("May")
    if (month == 6) println("June")
    if (month == 7) println("July")
    if (month == 8) println("August")
    if (month == 9) println("September")
    if (month == 10) println("October")
    if (month == 11) println("November")
    if (month == 12) println("December")
}
