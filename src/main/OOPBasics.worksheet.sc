val person = new Person("John", 69)
// person.age Age is a class paramater but not a class member accessed by dot operator

println(person.greet("Jack"))
println(person.greet())

// Constructor
class Person(name: String, age: Int) {
  def greet(name: String) = println(s"${this.name} says hi to $name")

  // Constructor Overloading
  def greet() = println(s"${this.name} says hi")
}


// Question
// Implement Novel and Writer

// Writer: first name, surname, year
//      - method fullname
//
// Novel: name, year of release, author
// - authorAge (at yearOfRelease)
// - isWrittenBy(author)
// - copy  (new year of Release) = returns new instance of Novel

val alan = new Writer("Alan", "Wake", 1970)
alan.showFullname()

val swanLake = new Novel("Swan Lake", 1999, alan )

swanLake.authorAge()
swanLake.isWrittenBy()
swanLake.copy(2001)

class Writer(firstName: String, surname: String,val year: Int){
  def showFullname(): String = s"$firstName $surname"
}

class Novel(name: String, yearOfRelease: Int, author: Writer){
  def authorAge(): Int = yearOfRelease-author.year
  def isWrittenBy(): String = s"${author.showFullname()}"
  def copy(newRelease: Int): Novel = new Novel(name,newRelease,author)
}

// Question
// Counter class 
// - Receives an int Value
// - Method to retrieve current count
// - Method to increment/decrement which returns new Counter
// - Overload increment/decrement to receive an amount (i.e.: add by 5)

val counter = new Counter
counter.increment.increment.increment.increment.getCurrCount()
counter.increment(10).getCurrCount()
class Counter(val count: Int = 0){
  def getCurrCount(): Int = count 

  def increment(): Counter = {
    println("Incrementing")
    new Counter(this.count + 1)
  }

  def decrement(): Counter = {
    println("Decrementing")
    new Counter(this.count - 1)
  }

  def increment(n: Int): Counter = if(n <= 0) this else increment.increment(n-1)
  def decrement(n: Int): Counter = if(n <= 0) this else decrement.decrement(n-1)
}

