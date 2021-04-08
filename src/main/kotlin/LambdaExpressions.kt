fun main(){

    // regular function
    addNumbers(5, 8)

    // Lambda Expression
    println(sum(5, 8))

    // Simplified lambda expression
    sum2(5, 8)

}

// regular function
fun addNumbers(a: Int, b: Int){
    val total = a + b
    println(total)

}

// Lambda Expression
val sum: (Int, Int) -> Int = {a: Int, b: Int -> a + b}
// Can be simplified
val sum2 = {a: Int, b: Int -> println("The simplified expression: ${a + b}")}