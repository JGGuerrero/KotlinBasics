import kotlin.math.max

// An abstract class cannot be instantiated
// (You cannot create objects of an abstract class)
// You can inherit subclasses from an abstract class
// The members (properties and methods) of an abstract class are non-abstract
// Unless you explicitly use the abstract keyword to make them abstract

abstract class Mammal(private val name: String, private val origin: String, private val weight: Double) { // Concrete (non-abstract) Properties

    // Abstract property (Must be overridden by Subclasses)
    abstract var maxSpeed: Double

    // Abstract Methods (Must be implemented by Subclasses)
    abstract fun run()
    abstract fun breathe()

    // Concrete (Non abstract) Method
    fun displayDetails() {
        println("Name: $name, Origin: $origin, Weight: $weight, Max Speed:  $maxSpeed")
    }
}

class Human(name: String, origin: String, weight: Double, override var maxSpeed: Double): Mammal(name, origin, weight) {

    override fun run() {
        // code to run
        println("Runs on two legs")

    }

    override fun breathe() {
        // code to breathe
        println("Breath through mouth or nose")
    }
}

class Elephant(name: String, origin: String, weight: Double, override var maxSpeed: Double): Mammal(name, origin, weight) {

    override fun run() {
        // code to run
        println("Runs on four legs")

    }

    override fun breathe() {
        // code to breathe
        println("Breathes through the trunk")
    }
}

fun main(){
    val human = Human("Josh", "America", 160.0, 25.0)

    val elephant = Elephant("Gray", "Africa", 2500.0, 29.0)

    // val mammal = Mammal("John", "China", 165.0, 15.0) // cannot use since it is an abstract class

    human.run()
    elephant.run()

    human.breathe()
    elephant.breathe()
}