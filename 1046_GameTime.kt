

/*Read the start time and end time of a game, in hours. Then calculate the duration of the game,
 knowing that the game can begin in a day and finish in another day, with a maximum duration of 24 hours.
  The message must be printed in portuguese “O JOGO DUROU X HORA(S)” that means “THE GAME LASTED X HOUR(S)”

Input
Two integer numbers representing the start and end time of a game.

Output
Print the duration of the game as in the sample output.*/

import java.util.Scanner

fun main(args: Array<String>) {
    val read = Scanner(System.`in`)
    val start = read.nextInt()
    val end = read.nextInt()
    var duration: Int = 0

    if (end > start){
        duration = end - start
    }else{
        duration = (24-start)+end
    }
    println("O JOGO DUROU $duration HORA(S)")
}