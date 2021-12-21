package l3

//A function with parameters and return types defined
fun sum(a: Int, b: Int): Int {
    return a + b
}

//Function with expression instead of body, return type is inferred from assigned type
fun getString(a: Int) = "Hey, I return a string for your number $a"

//Function with Unit as return types, it indicates that the function doesn't return anything
fun getSumUnitType(a: Int, b: Int): Unit {
    println(" $a + $b = ${a + b}")
}

//Return type Unit can be omitted and still mean the same
fun getSumNoneType(a: Int, b: Int) {
    println(" $a + $b = ${a + b}")
}

//By assigning values to the parameters, default values will be taken if not provided
fun getSumDefaultTypes(a: Int = 32, b: Int) {
    println(" $a + $b = ${a + b}")
}

//Function with variable number of arguments
fun getSumOfParam(vararg vs: Int) : Int{
    //The parameter can be iterated
    var sum = 0
    for(i in vs){
        println(i)
        sum += i
    }

    return sum
}

/**
 * Add example for arrow functions
 */

//Generic functions
fun <T> makeList(vararg v: T): List<T> {
    val a = mutableListOf<T>()

    for(i in v){
        a.add(i)
    }

    return a
}


fun main() {

    println("Sum of 12 and 46: ${sum(12, 46)}")
    println(getString(32))
    getSumUnitType(12,32)
    getSumNoneType(321, 12)
    getSumDefaultTypes(b = 431) //value b alone can be passed by explicitly specifying b = val
    println("Sum of 1 + 2 + 3: ${getSumOfParam(1, 2, 3)}")
    println("Sum of 77 + 88: ${getSumOfParam(77, 88)}")

    val intList = makeList(1, 2, 3, 4, 5) //Returns list of type int
    val strList = makeList("A", "B", "C") //Returns list of type String

    for (i in intList){
        println(i)
    }

    for (i in strList){
        println(i)
    }


}