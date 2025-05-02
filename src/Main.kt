
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

    println("Please enter a number: ")
    val input = readln()
    val inputAsInteger = input.toIntOrNull()?.inc()
//.inc valida se o valor anterior não é nulo, entao se for valido ele inc

    println("You've entered $input")
    println("The incremental number is $inputAsInteger")

42´´


}