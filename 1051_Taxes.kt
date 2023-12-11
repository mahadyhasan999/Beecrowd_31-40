import java.util.Scanner

fun main(args: Array<String>) {
    val read = Scanner(System.`in`)
    val salary = read.nextFloat()

    when {
        salary <= 2000.00 -> println("Isento")
        salary <= 3000.00 -> {
            val taxable = salary - 2000.00
            val tax = taxable * 0.08
            println("R$ %.2f".format(tax))
        }
        salary <= 4500.00 -> {
            val taxable1 = salary - 3000.00
            val tax1 = taxable1 * 0.18
            val tax2 = (salary - 2000 - taxable1) * 0.08
            println("R$ %.2f".format(tax1 + tax2))
        }
        else -> {
            val taxable1 = salary - 4500.00
            val tax1 = taxable1 * 0.28
            val taxable2 = salary - 3000.00 - taxable1
            val tax2 = taxable2 * 0.18
            val tax3 = (salary - 2000 - taxable1 - taxable2) * 0.08
            println("R$ %.2f".format(tax1 + tax2 + tax3))
        }
    }


//        if (salary in 0.0..2000.00){
//            println("Isento")
//        }
//        else if (salary in 2000.01..3000.00){
//            var taxable = salary - 2000.00
//            var tax = taxable * 0.08
//            println("R$ ${"%.2f".format(tax)}")
//        }
//        else if (salary in 3000.01..4500.00){
//            var taxable1 = salary - 3000.00
//            var tax1 = taxable1 * 0.18
//            var taxable2 = salary - 2000 - taxable1
//            var tax2 = (taxable2 * 0.08) + tax1
//
//            println("R$ ${"%.2f".format(tax2)}")
//        }
//        else if (salary>4500.00){
//            var taxable1 = salary - 4500.00
//            var tax1 = taxable1 * 0.28
//            var taxable2 = salary - 3000.00 - taxable1
//            var tax2 = taxable2 * 0.18
//            var taxable3 = salary - 2000 - taxable1- taxable2
//            var tax3 = (taxable3 * 0.08) + tax1 + tax2
//
//            println("R$ ${"%.2f".format(tax3)}")
//        }
}
