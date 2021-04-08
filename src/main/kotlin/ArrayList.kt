fun main(){
    /*
    val arrayList = ArrayList<String>()
    arrayList.add("One")
    arrayList.add("Two")

    println("~~~~~~~~Print Array List~~~~~~~")

    for (value in arrayList){
        println(value)
    }


    val arrayListCollection: ArrayList<String> = ArrayList(String)(5)
    var list: MutableList<String> = mutableListOf<String>()

    list.add("One")
    list.add("Two")

    arrayListCollection.addAll(list)
    println("~~~~~~~Print ArrayList~~~~~~~")

    val itr = arrayListCollection.iterator()

    while (itr.hasNext()){
        println(itr.next())
    }
    println("Size of arrayListCollection ="+arrayListCollection.size)

     */

    val numList = ArrayList<Double>()
    var total: Double = 0.0
    var avg: Double = 0.0

    numList.add(5.0)
    numList.add(10.0)
    numList.add(7.0)
    numList.add(8.75)
    numList.add(2.58)

    for (nums in numList) {
        println(nums)
        total += nums
    }
    avg = total/numList.size
    println("The average is $avg")






}