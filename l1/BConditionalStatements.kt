package l1.l1

fun main() {

    //If conditions:
    val a: Int = 12

    if(a >= 12){
        println("a is greater than or equal to 12")
    }
    else{
        println("a is less than 12")
    }

    //There are no ternary operators in Kotlin as if conditions can return a value directly, hence working like a ternary operation
    val result = if (a == 12) "The values are equal" else "The values are not equal"
    println(result)

    //Nested if:

    if(a > 12) print("Greater than 12")
    else if (a == 12) println("Equal to 12")
    else println("Less than 12")

    //when, conditional expression similar to switch case from C programming

    when (a) {
        10 -> print("x equals 10")
        11 -> print("x equals 11")
        12 -> print("x equals 12")

        //Else defines the default value to print when none of the choices match, it is not necessary to be included
        else -> {
            print("X doesn't match any of the values")
        }
    }

    //The when conditional statement can also be used in multiple values and ranges

    when (a) {
        10, 11, 12 -> print("X is 10 or 11 or 12")
        else -> print("Doesn't match any values")
    }

    when (a) {
        in 10..12 -> print("a is in the range")
        else -> print("A is not in the range")
    }

    //The when conditional statement can work like an if else-if chain if no value is passed
    var b = 321
    when {
        a == 12 -> print("A equals 12")
        b % 2 == 0 -> print("B is even and A doesn't equal 12")
        else -> print("A is not 12 and B is odd")
    }


}