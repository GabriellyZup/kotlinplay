
fun main() {
//    https://www.youtube.com/watch?v=dzUc9vrsldM

    //println("Hello World!")


//    val x = 5
//    println(x)

//    val x: Float = 5f
//    println(x)

//    val x: Double = 5.123
//    println(x)

//    val x: Boolean = true
//    println(x)

//    var x = "Hello World!"
//    println(x)

//    var x = "Hello World!"
//    x = "Olá Mundo!"
//    println(x)

//    var x = 5
//    var y = 1
//    println(x - y)

//    var x = 5
//    x++
//    var y = 1
//    println(x - y)

//    var x = 5
//    x += 5
//    var y = 1
//    println(x - y)

//    val x = 5
//    val y = 1
//    println (x < y)

//    val x = 5
//    val y = 1
//    println ("compare ${x == y}")

//    val x = 5
//    val y = 1
//    val areNumbersTheSame = x == y
//    println (areNumbersTheSame)
//
//    val x = 10
//    val y = 8
//    println(x % 2 == 0)

//    val x = 10
//    val y = 8
//    println("Is x an even number? ${x % 2 == 0}")

//    val x = 10
//    val y = 5
//    val areBothEven = y % 2 == 0 && x % 2 == 0
//    println("Is x an even number? $areBothEven")

//    println("Please enter a number: ")
//    val input = readln()
//    println("You've entered $input")

//    println("Please enter a number: ")
//    val input = readln()
//    val inputAsInteger = input.toInt()
//
//    val isEven = inputAsInteger % 2 == 0
//    println("You've entered $input")
//    println("Is the number even? $isEven")

//    println("Please enter a number: ")
//    val input = readln()
//    val inputAsInteger = input.toIntOrNull() ?: 0 //?: 0 signif que se null é pre definido como 0
//
//    val isEven = inputAsInteger!! % 2 == 0 // !!da a log que foi null
//    println("You've entered $inputAsInteger")
//    println("Is the number even? $isEven")
// //escolhe se vai usar !! ou ?: 0 - os dois ao mesmo tempo, fica valendo 0

//    println("Please enter a number: ")
//    val input = readln()
//    val inputAsInteger = input.toIntOrNull()?.rem(2)?.equals(0)
////.rem ve se é remained com sobra 0 (par)
//
//    println("You've entered $input")
//    println("is even?  $inputAsInteger")

//42´´
//    println("Please enter a number: ")
//    val input = readln()
//    val inputAsInteger = input.toIntOrNull()?.inc()
////.inc valida se o valor anterior não é nulo, entao se for valido ele inc
//
//    println("You've entered $input")
//    println("The incremental number is $inputAsInteger")


//    print ("please enter a number: ")
//    val input = readln()
//    val inputAsInteger = input.toIntOrNull()
//    println("You've entered $input")
//
//    if(inputAsInteger != null) {
//        val isEven = inputAsInteger %2 == 0
//
//        if (isEven) {
//            println ("The number is even!")
//        } else {
//            println ("The number is odd!")
//        }
//    } else {
//        println("Enter a valid number!")

    //evitar if else, usar output quando for varios.



//    print ("please enter a number: ")
//    val input = readln()
//    val inputAsInteger = input.toIntOrNull()
//    println("You've entered $input")
//
//    if(inputAsInteger != null) {
//        val output = if (inputAsInteger %2 == 0){
//            "The number is even!"
//        } else {
//           "The number is odd!"
//        }
//        println(output)
//    } else {
//        println("Enter a valid number!")
//
//    }

//    println ("please, enter a number: ")
//    val input = readln()
//    val inputAsInterger = input.toIntOrNull()
//    println("You've entered $input")
//
//    if (inputAsInterger != null) {
//        val output = when {
//            inputAsInterger % 2 == 0 -> "The number is even!"
//            inputAsInterger < 10 -> "The number is odd and less than 10"
//            else -> "The number is odd and at last 11"
//        }
//
//        println(output)
//
//    } else {
//        println("enter a valid number!")
//    }


//    println ("please, enter a number: ")
//    val input = readln()
//    val inputAsInterger = input.toIntOrNull()
//    println("You've entered $input")
//
//    val output = when(inputAsInterger){
//        null -> "enter a valid number!"
//        3 -> "the number is three!"
//        5 -> "the number is five!"
//        in 4..20 -> "the number is between 10 and 20."
//        else -> "random number"
//    }
//        println(output)




//_____________________
//    1h try catch rever

//1h15 arrays

//    println ("please, enter a number: ")
//    val input = readln()
//    val inputAsInterger = input.toIntOrNull()
//    println("You've entered $input")
//
//    val favoriteNumbers = intArrayOf(1, 2, 3, 4, 5)
//    favoriteNumbers[2] = 3
//
//    if(inputAsInterger != null && inputAsInterger in 0..favoriteNumbers.lastIndex){
//        println("your number is ${favoriteNumbers[inputAsInterger]}")
//
//    } else {
//        println("that index doesn't exist")
//    }
//

//    println ("How many numbers will you enter? ")
//    val amountOfNumbers = readln().toIntOrNull() ?: 0
//
//
//    val numbers = mutableListOf<Int>()
//
//    for (i in 0 until amountOfNumbers){
//        println("Please enter number #${i + 1}")
//        val number = readln().toIntOrNull() ?: continue
//        numbers.add(number)
//    }
//
//    for (number in numbers) {
//        println(number)
//    }

//    1.53 lambda funcion

    //fiter char

//    println("enter a string")
//    val input = readln()
//
//    val favoriteNumbers = intArrayOf(1,2,3,4)
//    val evenNumbers = favoriteNumbers.filter {it % 2 == 0}
//
//    val lettersOnly = input.myFilter {
//        it.isLetter()
//    }
//
//    //println(evenNumbers)
//    println(lettersOnly)
//}
//
//fun String.myFilter(predicate: (Char) -> Boolean): String {
//    return buildString {
//        for (char in this@myFilter){
//            if (predicate(char)) {
//                append(char)
//            }
//        }
//
//    }


    //classes oop 2h


    // Crio uma lista de números de 1 a 9
    //val numbers = (1..9).toList()

    // Crio uma lista fixa de números
    //val numbers = listOf(2, 5, 26, 888, 65, 120, 355)

    println("Enter numbers separated by space:")
    val input = readln()

    // Divido a string em partes, converto cada parte para Int e crio a lista
    //split(" "): divide a string em partes usando espaço como separador.
    //mapNotNull { it.toIntOrNull() }: tenta converter cada parte para Int.
    //toIntOrNull(): retorna o número se conseguir converter, ou null se for letra ou algo inválido.
    //mapNotNull: remove todos os nulls, ou seja, só entram na lista os valores que são números válidos
    val numbers = input.split(" ").mapNotNull { it.toIntOrNull() }

    // Filtro apenas os números pares da lista
    val evenNumbers = numbers.filter { it % 2 == 0 }

    // Imprimo os números pares encontrados
    println("The even numbers are: $evenNumbers")

    // Faço a soma dos números pares
    val sumOfEvens = evenNumbers.sum()

    // Imprimo o resultado da soma
    println("The sum of even numbers is: $sumOfEvens")


}







