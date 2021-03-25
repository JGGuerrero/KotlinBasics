//class User(var firstName: String, var lastName: String, isPlatinum: Boolean) {
//
//    constructor(firstName: String, lastName: String) : this(firstName, lastName, isPlatinum = false) {
//        println("2nd")
//    }
//
//    constructor(firstName: String) : this(firstName, "Unknown") {
//        println("3rd")
//    }
//
///*
//    var fullName = "$firstName $lastName"
//        get() = "Name: $field"
//        set(value) {
//            if (value.startsWith("Jon")) {
//                field = "Jon Doe"
//            } else {
//                field = value
//            }
//        }
//
//
//    var age: Int = 0
//
//    val fullNameLength = fullName.length
//
//    init {
//        println("In init block")
//        println("This class is the class for user $fullName")
//    }
//
// */
//
//
//
//    fun printFullName() {
//        println("$firstName $lastName")
//    }
//
//    fun printWithPrefix(prefix: String) {
//        println("$prefix $lastName")
//    }
//
//    fun updateName(newName: String) {
//        firstName = newName
//    }
//
//    fun firstNameLength() {
//        println(firstName.length)
//    }
//}