// Single Class Inheritance

class Animal {
  // private def eat = println("Nom Nom")
  def eat = println("Nom Nom") // Only accessible in SUPER and SUB classes

  val creatureType = "wild"
}

class Cat extends Animal {
  def crunch = {
    eat
    println("Crunch Crunch")
  }
}

val cat = new Cat

// Constructors

class Person(name: String, age: Int){
  def this(name:String) = this(name,0)
}

class Adult(name: String, age: Int, idCard: String) extends Person(name)
//When you instantiate a direct class, instantiate by calling parent class First


class Dog(override val creatureType: String) extends Animal {
  override def eat = println("Crunch, Crunch")
}

val dog = new Dog("K9")
dog.eat

dog.creatureType

// Type substitution (Polymorphism)

val unknownAnimal: Animal = new Dog("K9")
unknownAnimal.eat
// Overridden implementation of Eat
// Method call goes to most overriden call if possible

// Overriding: Supplying different implementation in derived class 
// OverLoading: Supplying multiple methods with different signatures with the same name in the same class

// Preventing overrides:
// 1 = Use Final on Member
// 2 = Use Final on the entire Class
// 3 = seal the class = extend classes in THIS file, prevent extension in Other files
