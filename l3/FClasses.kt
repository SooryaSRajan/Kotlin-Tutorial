package l1.l3

//Class structure
class MyFirstClass {

    val a : Int = 0

    //Secondary Constructor
    constructor(a : Int){
        println("Heyyy")
        println(a)
    }
}

//Primary Constructor
class PrimaryConstructor(a : Int) {

    val b : Int = a
    //Init blocks
    init {
        println("Heyyy")
        println(a)
    }
}

//Extending a class
//A class should be defined as open if it is extended
//A function should be defined open if it is to be overridden later
open class Vehicle(name : String) {
    init {
        println("Vehicle name: $name")
    }
    open fun engine() {
        println("The engine delivers energy to the wheels")
    }
}

class Car(name : String) : Vehicle(name){
    //Not necessary to override
    override fun engine() {
        super.engine()
        println("A car engine is 4-stroke and has 4 to 12 cylinders in it")
    }
}

//Abstract classes
abstract class VehicleAbs {
    //abstract method, implemented later
    abstract fun engine()
    //open function, body can be redefined later
    open fun seats(){
        println("A normal vehicle has a minimum of two seats")
    }
}

class Van : VehicleAbs() {

    //This method should be overridden or
    override fun engine() {
        println("A van engine is 4-stroke and has 4 cylinders in it")

    }

    //Final says this method can't be overridden again
    final override fun seats() {
        super.seats() //Calls super class seats, prints "A normal vehicle has a minimum of two seats"
        println("A van has 8 seats")
    }
}

//Interfaces

interface TwoWheeler{
    fun engineTorque() {
        println("Two wheeler torque")
    }
    var wheelCount : Int
    fun weight()
}

interface EngineType{
    fun engineTorque() {
        println("Engine torque")
    }
    fun engineType(){
        println("Old bikes use 4-stroke engine")
    }
}

//Multiple interfaces can be inherited at the same time, interfaces cannot be initialised or hold data in it

class bike(name : String) : TwoWheeler, Vehicle(name), EngineType {
    override var wheelCount: Int = 0
        get() = field
        set(value) {
            field = value
        }

    override fun weight() {
        println("A bike has a weight around 120 to 250 kilograms")
    }

    //As this method is common to both, this has to be implemented even though it has a body
    override fun engineTorque() {
        super<TwoWheeler>.engineTorque()
        super<EngineType>.engineTorque()
        println("Torque of a bike engine")
    }

    override fun engine() {
        super.engine()
        println("A bike can have an engine from 100 CC to upto 1200CC")
    }

    override fun engineType() {
        super.engineType()
        println("This bike uses a 2-stroke engine")
    }

}

fun main() {
    var classObject = MyFirstClass(0)
    println()
    var classObject2 = PrimaryConstructor(0)
    println()

    val car = Car("Toyota")
    car.engine()
    println()

    //Extending an  abstract class directly
    //The class has to be extended when an object for abstract class is created
    var abs = object : VehicleAbs() {
        override fun engine() {
            println("Engine type")
        }

        override fun seats() {
            super.seats()
            println("Seat count")
        }

    }

    abs.seats()
    abs.engine()
    println()

    //Implementing an interface directly
    //The class has to be implemented when an object for interface is created
    var imp = object : EngineType {
        override fun engineType() {
            super.engineType()
            println("Engine type")
        }

    }
    imp.engineType()
    println()

    var bikeObj = bike("Yamaha")
    bikeObj.engineTorque()
    bikeObj.engine()
    bikeObj.weight()
    println()
}