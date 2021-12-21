package l1

fun main() {
    /**
     * Basic Data Types in Kotlin
     * Numbers:
    Integers:
    Byte - 8 bits
    Short - 16 bits
    Int - 32 bits
    Long - 64 bits

    Floating-points:
    Float - 32 bits
    Double - 64 bits

    Boolean values:
    Boolean - holds true or false

    Character:
    Char - 1 byte, holds an ASCII character
    Strings:
    String- Array of characters,
     */


    //val or var used to define local variables
    //val creates read only values, which means the values cannot be modified

    val a: Int = 1  // Data type is explicitly defined and value is assigned immediately
    //a += 21 //Error, as val cannot be modified after initialisation
    val b = 2   // Data type is not specified and is inferred from the type of the assigned value
    val c: Int  // Value is assigned later
    c = 3 //No error here as this is the first time variable 'c' has been initialised


    //var creates values that can be modified later
    var d: Int = 31
    d+= 13

    var char: Char = 'C' //Character assignment

    var str: String = "Hello" //String assignment
    var str_raw : String = """
        Heyyy there 
        I am a string which can hold multiple lines
        The trimIndent function is automatically added and removed the space added by indentation
    """.trimIndent()

    var float: Float = 123.3F //The F in the end says that the value is a floating point value
    var double: Double = 271321.21321
    // var double_inc: Double = 123 //Incorrect assignment, 123.0 should be assigned instead

    var bool: Boolean = true

}