fun main(args: Array<String>) {
    val age = 20
    if (age<18){
        println("You are not qualified to vote")
    }else{
        println("You are eligible to vote")
    }
    val number = 3
    if (number==1){
        println("Oops you lost the game")
    }else if (number==2){
        println("Oops you are almost there")
    }else if (number==3){
        println("Congratulations you just won 1 Million")
    }else{
        println("$number is not a valid number ")
    }
// when statement
   var y = 1
   when(y){
       1 -> println("Oops you lost the game")
       2 -> println("Oops you are almost there")
       3 -> println("Congratulations you just won 1 Million")
       else -> println("$number is not a valid number")
   }

    var height = 157
    var weight = 55
    val BMI :Int = height/weight
    println(BMI)
    if (BMI<18){
        println()
    }








}