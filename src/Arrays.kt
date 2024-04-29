fun main(args: Array<String>) {
    val arr1 = arrayOf(13,"Students",12.4,"d")
    val arr2 = arrayOf<Int>(32,656,677,8778,56)
    val arr3 = arrayOf<String>("John","Alex","Peter")

    println(arr1[1])
    println(arr2[3])
    println(arr3[2])
    println(arr1[3])
//modifying an array
    arr1[0] = 26
    println(arr1[0])
    arr3[0] = "Stephen"
    println(arr3[0])

//modifying an array using a set function
val fruits = arrayOf("Banana","Tomato","Mango","Apple")
    fruits.set(1, "Pineapple")
    println(fruits[1])

    fruits.set(0,"Orange")
    println(fruits[0])
    //get function to fetch
    val cars = arrayOf("Benz","Lambo","Toyota")
    println(cars[0])
    println(cars.get(0))
    val employees = arrayOf("Lynnah","Bryant","Lucky","Timothy")
    employees.set(1, "Arlyne")
    println(employees[1])
    println(employees[3])
    println(employees.get(3))
}