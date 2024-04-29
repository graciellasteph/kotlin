fun main(args: Array<String>) {
    val obj1 = Cars("vitz","Toyota","1990")
    val obj2 = Cars("Ford","Mustang","1990")

    println(obj1.model)
    println(obj2.brand)

    val person1 = Person("Joshua",15)
    println(person1.canVote(15))
    val person2 = Person("Esther",22)
    person2.canVote(22)
    val person3 = Person("Kinuthia",67)
    person3.canVote(67)

    val student1 = Student("Lynnah",89)



    val product1 = Product("Sugar",299.9,12)
    val totalcost = product1.calculateTotalCost()
    println(totalcost)
    val product2 = Product("Maize",250.0,1)
    val calculatedcost = product2.calculateTotalCost()
    println(calculatedcost)
}
class Cars(val model:String,val brand:String,val year:String){
//    val model = ""
//   val brand = ""
//    val year = ""
}
class Person(val name: String,val age: Int){
    fun canVote(age: Int){
        if (age<18){
            println("You cannot vote")
        }else{
            println("You can vote")
        }
    }
}
class Student(val name: String,val grade:  Int)
    fun promotionLevel(grade: Int){
        if (grade<80){
            println("Proceeding grade")
        }
        if (grade<60-79){
            println("Average proceeding grade")
        }
        if (grade<50-69){
            println("Fair proceeding grade")
        }else{
            println("Retaking grade")
        }
    }
class Product(
    val name: String,
    val price: Double,
    val quantity: Int
){
    fun calculateTotalCost(): Double{
        return price * quantity
    }
}