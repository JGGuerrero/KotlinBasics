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

     */

    for (i in 1 until 10) {    // can also use for(num in 1..10), for(i in 1 until 10)
        println("$i")
    }

    for (num in 1..10) {
        print("$num ")
    }

    println() // line break

    for (down in 10 downTo 1) {
        print("$down ")
    }





}

