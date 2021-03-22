class Person(name: String, num: String) {
    var userName: String = name
    var number: String = num
    var data: String = ""

    init {
        data = name + num
    }

    fun addNumbers(a: Int, b: Int): Int {
        return a + b
    }
}
