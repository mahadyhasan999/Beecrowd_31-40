/*Read the start time and end time of a game, in hours and minutes
 (initial hour, initial minute, final hour, final minute).
  Then print the duration of the game, knowing that the game can begin
   in a day and finish in another day,

Obs.: With a maximum game time of 24 hours and the minimum game time of 1 minute.

Input
Four integer numbers representing the start and end time of the game.

Output
Print the duration of the game in hours and minutes, in this format:
 “O JOGO DUROU XXX HORA(S) E YYY MINUTO(S)” .
  Which means: the game lasted XXX hour(s) and YYY minutes.*/



import java.util.Scanner

fun main(args: Array<String>) {
    val read = Scanner(System.`in`)
    val startHour = read.nextInt()
    val startMinute = read.nextInt()
    val endHour = read.nextInt()
    val endMinute = read.nextInt()

    val durationHours: Int
    val durationMinutes: Int
    val duration: Int

    val startTime = startHour * 60 + startMinute
    val endTime = endHour * 60 + endMinute

//     Calculate the duration
    duration = if (endTime > startTime) {
        endTime - startTime
    }
    else {
//     The game ended on the next day
        (24 * 60 - startTime) + endTime
    }

//    Convert back to hours and minutes
            durationHours = duration / 60
            durationMinutes = duration % 60

    println("O JOGO DUROU $durationHours HORA(S) E $durationMinutes MINUTO(S)")
}