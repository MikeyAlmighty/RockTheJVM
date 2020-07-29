class Person(val name: String, favouriteMovie: String){
  def likes(movie: String):Boolean = movie == favouriteMovie
  def hangOut(person: Person): String = s"${this.name} is hanging out with ${person.name}"
  def unary_! :String = s"ChimiChangasss"
  def isAlive: Boolean = true
  def apply(): String = s"Hi, my name is ${name} and I like ${favouriteMovie}"
}

val mary = new Person("Mary", "DeadPool")
val tom = new Person("Tom", "Fight Club")
println(mary.likes("DeadPool"))
println(mary hangOut tom) // Infix/Operator Notation

// Methods with a single paramater can be called in Infix/Operator Notation (Syntatic Sugar)

// "operators" in scala

println(1 + 2) 

// All operators are methods

// PreFix notation
val x = -1 // equivalent with 1.unary_-
val y = 1.unary_-

println(!tom)
println(tom.unary_!)
// unary_ prefix only works with - + ~ !

println(mary.isAlive)
println(mary isAlive) // PostFix Notation, used less often as it's more ambiguous

// apply
println(mary.apply())
println(mary()) // Equivalent ^

