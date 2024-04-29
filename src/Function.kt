fun main(args: Array<String>) {
    hello("Gerald")
    hello("Ann")
    hello("Stephen")
    hello("John")
    calculateAge(23)
    calculateAge(21)
    calculateAge(46)
    calculateAge1(1999,2024)
    println(add(34.5,56.0))
    println(birthdayGreeting("Gerald",21))
    println(multiply(42,21))
    println(person("Lynnah",19))
    println()

}
fun hello(name: String){
    println("Hello $name")
}
fun calculateAge(age: Int){
    println("You are $age years old")
}
fun calculateAge1(birthYear: Int, currentYear: Int){
    println("You were born in the year $birthYear")
    println("We were in the year $currentYear")
}
fun add(num1: Double,num2: Double): Double {
    val summation = num1+num2
    return summation
}
fun birthdayGreeting(name: String,age:Int): String {
    val a = "Hey $name"
    val b = "Congratulations you are $age years"
    return "$a\n$b"

}
fun multiply(length: Int,width: Int): Int{
    val multiplication = length*width
    return multiplication
}
fun person(name: String, age: Int, company: String="emobilis"): String{
    val profile = "Employee $name is of age $age and works at $company"
    return "$profile"
}

