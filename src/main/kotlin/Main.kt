fun main(){
        val human=Human("Abigael", 23,60.3,)
    human.eat(3)
    println(human.weight)
    human.speak("Grateful to be here!")
    human.birthday(1)
    println(human.age)
    var person=Person("Ivy","Jones","ivyjones@yahoo.com","0721567245","sillyivy2023")
    println(person.email)
    println(person.password)

}
class Human(var name:String, var age:Int, var weight:Double) {

    fun eat (foodWeight: Int) {
        println("I am eating $foodWeight kgs of food.")
        weight+= foodWeight

    }

    fun speak(speech: String) {
       println(speech)
    }

    fun birthday(birthday:Int) {
        age+=birthday

    }
}

    data class Person(val firstName: String, val lastName: String, val email: String, val phoneNumber: String,val password: String){





    }


