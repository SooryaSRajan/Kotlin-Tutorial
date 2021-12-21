package l1.l1

fun main() {

    //A modifiable list of elements is created
    val fruits = mutableListOf("banana", "avocado", "apple", "kiwifruit") //Creates a mutable list
    fruits.add("Orange") //Adds data to list
    fruits.add("banana") //Adds data to list
    println()
    println(fruits.get(0)) //Gets data from at specified index

    for(i in fruits){
        println(i) //Prints all fruits
    }

    println()
    //A set cannot hold duplicate values unlike a list
    val stringSet = mutableSetOf("one", "two", "three")
    stringSet.add("four")
    stringSet.add("two") //Will not add again as two already exists
    for(i in stringSet){
        println(i) //Prints set values
    }

    //A set of key value pair, key can be used to access value
    val mutMap = mutableMapOf("Av" to 1, "Bv" to 2, "Cv" to 3)
    mutMap.put("Dv", 4) //Maps key Dv to value 4

    println("All keys: ${mutMap.keys}")
    println("All values: ${mutMap.values}")
    if ("Cv" in mutMap) println("Value of Cv exists in map, value to key: ${mutMap["Cv"]}")
    if (1 in mutMap.values) println("The value 1 is in the map")
    if (mutMap.containsValue(1)) println("The value 1 is in the map") // same as previous

    println(mutMap.get("Av")) //Returns 1
    println(mutMap.get("Ev")) //Returns null as key Ev doesn't exist


    val map = mapOf("Av" to 1, "Bv" to 2, "Cv" to 3) //Creates non-mutable map, same as above but new values cannot be added later
    val fruitsNonMut = listOf("banana", "avocado", "apple", "kiwifruit") //Creates non-mutable list, same as above but new values cannot be added later
    val stringSetNonMut = setOf("one", "two", "three") //Creates non-mutable set, same as above but new values cannot be added later



}