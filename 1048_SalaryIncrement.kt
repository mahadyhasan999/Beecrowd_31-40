
/*The company ABC decided to give a salary increase to its employees, according to the following table:
Salary	Readjustment Rate
       0 - 400.00 --------15%
  400.01 - 800.00---------12%
 800.01 - 1200.00---------10%
1200.01 - 2000.00----------7%
    Above 2000.00----------4%

Read the employee's salary, calculate and print the new employee's salary,
 as well the money earned and the increase percentual obtained by the employee,
  with corresponding messages in Portuguese, as the below example.
Input
The input contains only a floating-point number, with 2 digits after the decimal point.

Output
Print 3 messages followed by the corresponding numbers (see example) informing the new salary,
 the among of money earned (both must be shown with 2 decimal places) and the percentual obtained by the employee.
  Note:
   Novo salario:  means "New Salary"
 Reajuste ganho: means "Money earned"
  Em percentual: means "In percentage"
*/


import java.util.Scanner
import kotlin.math.roundToInt
fun main(args: Array<String>) {
    val read = Scanner(System.`in`)
    val salary = read.nextFloat()

    var newSalary = 00.00
    var bonus = 0.0
    var percentage = 0.0

    if (salary in 0.0..400.00){
        percentage = 15.00
        bonus = salary * (percentage/100)
        newSalary= salary + bonus
    }
    else if (salary in 400.01..800.00){
        percentage = 12.00
        bonus = salary * (percentage/100)
        newSalary= salary + bonus
    }
    else if (salary in 800.01..1200.00){
        percentage = 10.00
        bonus = salary * (percentage/100)
        newSalary= salary + bonus
    }
    else if (salary in 1200.01..2000.00){
        percentage = 7.00
        bonus = salary * (percentage/100)
        newSalary= salary + bonus
    }
    else if (salary>2000.00){
        percentage = 4.00
        bonus = salary * (percentage/100)
        newSalary= salary + bonus
    }
    val percent = percentage.roundToInt()

    println("Novo salario: ${"%.2f".format(newSalary)}\n" +
            "Reajuste ganho: ${"%.2f".format(bonus)}\n" +
            "Em percentual: $percent %")
}