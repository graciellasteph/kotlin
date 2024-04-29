fun main(args: Array<String>) {
    val child1 = Child()
    child1.myfunction()

    val dog1 = Dog("Black",12)
}
open class Parent() {
    val x = 5
}
class Child: Parent(){
    fun myfunction(){
        println(x)
    }
}
open class Animal(val color: String,val age: Int){
    init {
        println("Color is $color")
        println("Age is $age")
    }
}
class Dog( color: String, age: Int): Animal(color,age){
    fun woof(){
        println("The dog makes woof sound")
    }

}
