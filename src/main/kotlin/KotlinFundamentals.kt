import jdk.swing.interop.SwingInterOpUtils

// test
// from laptop

fun main(){
    /*

    var x = 15
    do{ // DO block will occur at least once and will then check the while condition to see if it will run again
        println("$x")
        x++
    } while (x <= 10)
    println("do while loop is done")


    var feltTemp = "cold"
    var roomTemp = 10
    while (feltTemp == "cold") {
        roomTemp++
        if (roomTemp > 19) {
            feltTemp = "comfy"
        }
        println("it is now $roomTemp, which is $feltTemp")
    }


    println()
    println("for i in 1 until 10: -> ")
    for (i in 1 until 10) {    // can also use for(num in 1..10), for(i in 1 until 10)
        println("$i")
    }


    println()

    println("for num in 1..10: -> ")
    for (num in 1..10) {
        print("$num ")
    }

    println()

    println() // line break

    println("down in 10 downTo 1: -> ")
    for (down in 10 downTo 1) {
        print("$down ")
    }

    println()

    println()

    println("steps in 10 downTo 1 step 2: -> ")
    for (steps in 10 downTo 1 step 2) { // The step keyword will allow you to skip certain amounts of steps in the iteration
        print("$steps ")
    }
    println()
    println()


    // TODO: Exercise - Loops
    for (powerLevel in 1 until 10) {
        if (powerLevel == 9) {
            println("IT'S OVER 9000!!!")
        } else {
            print("$powerLevel")
        }

    }
    var humidityLevel: Int = 80
    var humidity: String = "Humid"
    while (humidity == "Humid") {
        humidityLevel -= 5
        println("humidity has been decreased: it is now $humidityLevel")
        if (humidityLevel <= 60) {
            humidity = "Comfy"
            println("the humidity level is $humidityLevel and it is $humidity")
        }
    }




    // Functions

    myFunction("This is a parameter")

    val result = addUp(5, 3)
    println("result is $result")

    println(avgNum(85.0, 15.0))





    // Nullables

//    var name: String = "Josh"
    var nullableName: String? = "Josh"
//    nullableName = null

//    var length = name.length
    var length2 = nullableName?.length // this is the same as the if statement below: If the nullableName variable is not null, then store the length in length2, otherwise store null in length2
//    println(nullableName?.toLowerCase())
//    nullableName?.let { println(it.length) }

//    if (nullableName != null) {
//        var lengthNull = nullableName.length
//    } else {
//        null
//    }

    // Elvis operator -> ?:
    val name = nullableName ?: "Guest" // if nullableName is empty, then use the default value: "Guest"
    println(name)

    println(nullableName!!.toUpperCase())

     */


/*
//    var josh: Person = Person("Josh", "G")
//    var defaultPerson = Person()
//    var oneNamePerson = Person(lastName = "Sauceda")

//    var myPhone = MobilePhone("Android", "Samsung", "Galaxy S9+")
//    var applePhone = MobilePhone("iOS", "Apple", "iPhone X")

    var josh: Person = Person("Josh", "G", 31)
    josh.hobby = "Skateboard"
    josh.age = 32
    println("Josh is ${josh.age} years old")
    josh.stateHobby()

    var john : Person = Person ("John", "Doe")
    john.hobby = "Playing video games"
    john.stateHobby()

    */
/*
    var myCar = Car()
    myCar.owner
    println(myCar.myBrand)
    myCar.maxSpeed = 240
    println("Max speed is ${myCar.maxSpeed}")
    myCar.myModel
    println(myCar.myModel)

 */

    /*
// classes and objects practice
    Person("Josh")
    Person(23, "Josh")

    val box1 = Box()
    val box2 = Box()
    val box3 = Box()

    box1.height = 7
    println("height: ${box1.height}")
    box2.open()
    box2.fillContents()

     */
/*
    // data classes
    val user1 = User(1, "Josh")

//    val name = user1.name
//    println(name)
    user1.name = "Michael"

    val user2 = User(1, "Michael")

    println(user1 == user2)

    println("User Details: $user1")

    val updatedUser = user1.copy(name="Josh")
    println(updatedUser)
    println(user1)

    println(updatedUser.component1()) // prints first component: id
    println(updatedUser.component2()) // prints second component: name

    val(id, name) = updatedUser // this is the same as assigning two values separately
    println(id)
    println(name)

 */

    /*
    val newPhone = MobilePhone("Android", "Samsung", "Galaxy S9+")
    val newPhone2 = MobilePhone("Apple", "iPhone", "X")
    println(newPhone.chargeBattery())
    println(newPhone.chargeBattery())
    println(newPhone.chargeBattery())
    println(newPhone.chargeBattery())
    println("--------------------")
    println(newPhone2.chargeBattery())

     */


    var audiA3 = Car("A3", "Audi", 200.0)
    var teslaS = ElectricCar("S-model", "Tesla", 85.0, 240.0)
    teslaS.chargeType = "Type2"
    teslaS.extendRange(200.0)

    // polymorphism
    audiA3.drive(200.0)
    teslaS.drive(200.0)
    teslaS.drive()

    teslaS.brake()
    audiA3.brake()


}
/*

// Method - a Method is a function within a class
// functions written outside of the Main function

fun myFunction(message: String) {
    println(message)
}

//  parameters&their Types     :Type of the return
fun addUp(a: Int, b: Int) : Int {
    return a + b
}


fun avgNum (num1: Double, num2: Double): Double {
    return (num1+num2)/2
}

 */


// CLASSES and INITIALIZERS
/*
class Person (firstName: String = "John", lastName: String = "Doe") { // constructors allow us to add values to our objects when we create an object of our class
    // MEMBER variable - Properties
    var age: Int? = null
    var hobby : String = "Watching Netflix"
    var firstName: String? = null



    init {  // As soon as the Person class is called, the init will run
        this.firstName = firstName
        println("Initialized a new person object with firstName = $firstName and lastName = $lastName")
    }

    // Member Secondary Constructor
    constructor(firstName: String, lastName: String, age: Int): this(firstName, lastName) {
        this.age = age
        println("Initialized a new person object with firstName = $firstName and lastName = $lastName and $age")
    }

    // Member functions - Methods
    fun stateHobby(){
        println("$firstName's hobby is $hobby")
    }
}

 */
/*
class Car() {
    lateinit var owner: String

    val myBrand: String = "BMW"
        get() {         // custom getter
            return field.toLowerCase()
        }

    var maxSpeed: Int = 250
        set(value) {
            field = if (value > 0) value else throw IllegalArgumentException("Max speed must be greater than zero")
        }

    var myModel: String = "M5"
        private set // can only change the value of myModel within the class. cannot assign a new value outside of this class


    init {
        this.myModel = "M3" // myModel can be changed here, but not outside of this class since it is private set
        owner = "Frank"
    }
}

 */


/*
class MobilePhone (osName: String, brand: String, model: String) {

    private var battery: Double = (Math.random()*25)
    private var batteryInt: Int = battery.toInt()

    init {
        println("osName: $osName " +
                "\nBrand: $brand " +
                "\nModel: $model ")
        println()
    }

    fun chargeBattery(){ // TODO: Lesson 58 Challenge charge battery
        println("The current charge of the phone is: $batteryInt%")
        if (this.batteryInt > 70 && this.batteryInt != 100) {
            var charge = 100 - this.batteryInt
            this.batteryInt += charge
            println("The phone was charged by $charge%")
            println("The phone now has ${this.batteryInt}% battery")
        } else if (this.batteryInt == 100){
            println("The battery is already at ${this.batteryInt}%. No need to charge.")
        } else {
            this.batteryInt += 30
            println("The phone was charged by 30%")
            println("The phone now has ${this.batteryInt}% battery")
        }
    }
}

 */


/*
// Kotlin Classes, objects, data classes, constructors
class Person (name: String) {

    var age: Int = 0

    init {
        println("The name of Person is $name and age is $age")
    }

    constructor(age: Int, name: String) : this(name) { // secondary constructors must have the args of the first constructor. You can pass the inherited args by using ": this(args)"
        println("secondary constructor :")
        println("name: $name")
        println("age: $age")
    }




}

 */

/*
// data classes
data class User(val id: Long, var name: String)

 */

// Inheritance
// the class that inherits the features of another class is called the Sub-class or Child-class or Derived-class
// the class whose features are inherited are called the Super-class or Parent-class or Base-class

// Vehicle is the Super class, parent class, or base
/*
open class Vehicle(){ // class needs to be open in order to be inheritable
    //properties
    //methods
}

 */

interface Drivable {
    val maxSpeed: Double
    fun drive(): String
    fun brake(){
        println("The drivable is braking")
    }
}


// Car is the sub class, derived class, or child class of Vehicle
// Car is also the super class, parent class, or base class of ElectricCar
open class Car(val name: String, val brand: String, override val maxSpeed: Double) : Drivable{
    open var range: Double = 0.0

    fun extendRange(amount: Double){
        if(amount > 0) {
            range+= amount
        }
    }

    open fun drive(distance: Double) {
        println("Drove for $distance km")
    }

    override fun drive(): String {
        return "Driving the interface drive"
    }
}
// ElectricCar is the child class, sub class, or derived class of Car
class ElectricCar(name: String, brand: String, batteryLife: Double, maxSpeed: Double) : Car(name, brand, maxSpeed){ // the sub class must have the parameters of the parent class, but can also have extra parameters

    var chargeType: String = "Type1"
    override var range = batteryLife * 6


    override fun drive(distance: Double) {
        println("Drove for $distance km on Electricity")

    }

    override fun drive(): String{
        return "Drove for $range km on electricity"
    }

    override fun brake() {
        super.brake()
        println("Brake from inside electric car")
    }
}


