import java.util.Scanner
fun main(args: Array<String>) {
    println("Please type your name here: ")
    val enteredName = readLine()
    println("You have entered your name as $enteredName")

    println("Please enter your age: ")
    val enteredAge = Integer.valueOf(readLine())
    println("You have $enteredAge years old")

    val read = Scanner(System.`in`)
    println("Enter your physics marks: ")
    val enteredMarks = read.nextInt()
    println("You got $enteredMarks in physics")

    println("Please enter your BMI: ")
    val enteredBmi = read.nextFloat()
    println("Your BMI is $enteredBmi")

    println("What's your mid_score?: ")
    val enteredScore = read.nextFloat()
    println("Your mid_score is $enteredScore")

    println("What's your final_score?: ")
    val enteredF_score = read.nextFloat()
    println("Your final_score is $enteredF_score")

    val mid_score = 10.5
    val finalscore= 45.7
    var addition = mid_score+ finalscore
    println(addition)
    var subtract = finalscore-mid_score
    println(subtract)

}