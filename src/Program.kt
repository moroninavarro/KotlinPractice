fun main() {
    println("Welcome to my Basis Calculator!")
    // Welcome!
    // Basically, the functionality of this calculator consist of inserting the first number
    // then you chose an operation
    // and after that a second number, at the end you will receive the result of your numbers according
    //to the operation you chose
    println("Instructions:")
    println("Select the first number, then you will chose an operation, and then the second number.")
    println("")
    println("Enter the first number: ")
    val number1 = readLine()!!.toInt()

    clearScreen()
    menu()


}
fun clearScreen() {
    repeat(30){
        println()
    }
}

fun menu(){
    val sum = "1. Sum"
    val rest = "2. Rest"
    val multiply = "3. Multiply"
    val divide = "4. Divide"

    println("Calculator")
    println(sum)
    println(rest)
    println(multiply)
    println(divide)
    println("Choose an operation:")
    val operation = readLine()!!.toInt()

}

class Sum(val number1:Int, val number2:Int){
    fun showSum() {
        println(number1 + number2)
    }
}

class Rest(val number1:Int, val number2:Int){
    fun showRest() {
        println(number1 - number2)
    }
}


class Multiply(val number1:Int, val number2:Int){
    fun showMultiply() {
        println(number1 * number2)
    }
}

class Divide(val number1:Int, val number2:Int){
    fun showDivide() {
        println(number1 / number2)
    }
}