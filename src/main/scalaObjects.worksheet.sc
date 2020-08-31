// Scala does not have class-level Functionality

object Person {
  // "static"/"class" level functionality
  val N_EYES = 2
  def canFly: Boolean = false

  // Factory Method
  def apply(mother: Person, father: Person): Person = new Person("Bobby")
}

class Person (val name: String){
  // Instance Level Functionality
  
}

println(Person.N_EYES)
println(Person.canFly)

// Scala object = SINGLETON Instance

// Object is it's own type + it's own Instance

val mary = Person // Instance of the Person type
val john = Person

println(mary == john) // Mary and John point to the same instance


// Class Person and Object Person = COMPANIONS Pattern

val maryInstance = new Person("Mary")
val johnInstance = new Person("John")

println(maryInstance == johnInstance)

val bobby = Person(maryInstance,johnInstance)
bobby

// Scala Applications = Scala object with
// def main(args: Array[String]): Unit
