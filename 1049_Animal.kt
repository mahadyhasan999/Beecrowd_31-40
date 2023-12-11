/*In this problem, your job is to read three Portuguese words.
 These words define an animal according to the table below, from left to right.
  After, print the chosen animal defined by these three words.
  Input
The input contains 3 words, one by line, that will be used to identify the animal, according to the above table, with all letters in lowercase.

Output
Print the animal name according to the given input.
*/

fun main(arge: Array<String>) {

    val a = readlnOrNull()
    val b = readlnOrNull()
    val c = readlnOrNull()

    if(a=="vertebrado"){
        if(b =="ave"){
            if(c =="carnivoro"){
                println("aguia")
            }
            if(c =="onivoro"){
                println("pomba")
            }
        }
        if(b =="mamifero"){
            if(c =="onivoro"){
                println("homem")
            }
            if(c =="herbivoro"){
                println("vaca")
            }
        }
    }
    if(a =="invertebrado"){
        if(b=="inseto"){
            if(c=="hematofago"){
                println("pulga")
            }
            if(c=="herbivoro"){
                println("lagarta")
            }
        }
        if(b=="anelideo"){
            if(c=="hematofago"){
                println("sanguessuga")
            }
            if(c=="onivoro"){
                println("minhoca")
            }
        }
    }
}