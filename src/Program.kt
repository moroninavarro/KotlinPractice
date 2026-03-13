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

//This call our function calculator, calling all the project.
calculator()
}

//My data class Operation contain all the data of the operation
data class Operation(
    val number1: Int,
    val number2: Int,
    val operator: Int
)

//My calculator function basically contains all the callings of my classes, this
//function contains all the logic of the calculator functionality. Asking the user for numbers and
//the operation he wants to do. At the end there is an option to repeat the process and to do another operation
fun calculator(){
//My do-while loop contain all the steps of the calculator
//Printing the input to the number1, then displaying the menu class and at the end
//Asking for the number2. After that there is an option to restart and perform another operation
   var again : String
    do{
        print("Enter the First number: ")
        val number1 = readLine()!!.toInt()

        clearScreen()
        menu()
        val operation = readLine()!!.toInt()


        clearScreen()
        print("Enter the Second number: ")
        val number2 = readLine()!!.toInt()

    val operationInfo = Operation(number1, number2, operation)

        when (operationInfo.operator) {
            1 -> Sum(operationInfo.number1, operationInfo.number2).showSum()
            2 -> Subtraction(operationInfo.number1, operationInfo.number2).showSubtraction()
            3 -> Multiply(operationInfo.number1, operationInfo.number2).showMultiply()
            4 -> Divide(operationInfo.number1, operationInfo.number2).showDivide()
            else -> println("Invalid operation")
        }

        print("Do another operation? (y/n) ")
       again = readln()
    } while (again.lowercase() == "y" || again.lowercase() == "yes")

}

//My clearScreen function help us to clean the screen printing 50 spaces after the
//user select the numbers and select an operation
fun clearScreen() {
  repeat(50)
  {println()}
    }

//This function is my menu, this allows the user to see all the available operations and select one.
fun menu(){
    println("Calculator")
    println("1. Sum")
    println("2. Subtraction")
    println("3. Multiply")
    println("4. Divide")
    print("Choose an operation: ")
}

//My Sum class has 2 arguments for the numbers that the user chooses, then the function contains
//all the logic to sum both numbers and print the result
class Sum(val number1:Int, val number2:Int){
    fun showSum() {
        val result = number1 + number2
        println("Result $number1 + $number2 = $result")
    }
}

//My Subtraction class has 2 arguments for the numbers that the user chooses, then the function
//contains all the logic to subtract the number2 from number1 and print the result
class Subtraction(val number1:Int, val number2:Int) {
    fun showSubtraction() {
        val result = number1 - number2
        println("Result $number1 - $number2 = $result")
    }
}

//My Multiply class has 2 arguments for the numbers that the user chooses, then the function
//contains all the logic to multiply both numbers and print the result
class Multiply(val number1:Int, val number2:Int){
    fun showMultiply() {
        val result = number1 * number2
        println("Result $number1 * $number2 = $result")
    }
}

//My Divide class has 2 arguments for the numbers that the user chooses, then the function
//contains all the logic to divide number1 by number2 and print the result
class Divide(val number1:Int, val number2:Int){
    fun showDivide() {
        val result = number1 / number2
        println("Result $number1 / $number2 = $result")
    }
}