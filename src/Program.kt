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


    println("Enter the First number: ")
    val number1 = readLine()!!.toInt()

    clearScreen()
    menu()
    val operation = readLine()!!.toInt()


    clearScreen()
    println("Enter the Second number: ")
    val number2 = readLine()!!.toInt()


    when (operation) {
        1 -> Sum(number1, number2).showSum()
        2 -> Subtraction(number1, number2).showSubtraction()
        3 -> Multiply(number1, number2).showMultiply()
        4 -> Divide(number1, number2).showDivide()
        else -> println("Invalid operation")
    }

}





//My classes
fun clearScreen() {
    repeat(30){
        println()
    }
}

fun menu(){
    println("Calculator")
    println("1. Sum")
    println("2. Subtraction")
    println("3. Multiply")
    println("4. Divide")
    println("Choose an operation:")


}

class Sum(val number1:Int, val number2:Int){
    fun showSum() {
        val result = number1 + number2
        println("Result = $result")
    }
}

class Subtraction(val number1:Int, val number2:Int){
    fun showSubtraction() {
        val result = number1 - number2
        println(result)
    }
}


class Multiply(val number1:Int, val number2:Int){
    fun showMultiply() {
        val result = number1 * number2
        println(result)
    }
}

class Divide(val number1:Int, val number2:Int){
    fun showDivide() {
        val result = number1 / number2
        println(result)
    }
}