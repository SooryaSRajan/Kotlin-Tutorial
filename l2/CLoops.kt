package l1.l1

fun main() {

    //Iterating over a range
    for (i in 1 .. 3) {
        println(i)
    }

    //Iterating over a range by 2 steps
    for (i in 0 .. 6 step 2) {
        println(i)
    }

    //Iterating a range in descending order by 2 steps
    for (i in 6 downTo 0 step 2) {
        println(i)
    }

    //Creating an Array and updating value by i = i + 2, generates 1, 3, 5... n, n = 10
    val a = Array(10) {i -> i + 2}
    println(a)

    //Iterating a collection or array
    for (i in a){
        println(i)
    }

    //Prints index of each values from 0 - 9
    for (i in a.indices){
        println(i)
    }

    //Get both value and index while iterating an array
    for ((index, value) in a.withIndex()) {
        println("Index: $index Value: $value")
    }

    var condt = 10

    //Simple while loop
    //Checked first then block executed
    while (condt > 0) {
        println(condt)
        condt--
    }

    //Block executed first then condition checked
    do {
        println(condt)
        condt++
    } while (condt != 10)


}