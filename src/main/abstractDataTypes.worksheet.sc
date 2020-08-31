abstract class Animal {
  val creatureType: String = "Wild"
  def eat: Unit
}

// Abstract classes can not be instantiated

class Dog extends Animal {
  override val creatureType: String = "K9"
  def eat = println("Crunch Crunch")
}

// Traits

trait Carnivore {
  def eat(animal:Animal): Unit
  val preferredMeal: String = "Fresh Meat"
}

trait ColdBlooded

class Crocodile extends Animal with Carnivore with ColdBlooded {
  override val creatureType: String = "Croc"
  def eat: Unit = println("nom nom nom")
  def eat(animal: Animal): Unit = println(s"I'm a Croc and I'm eating a ${animal.creatureType}")
}

val dog = new Dog
val croc = new Crocodile
croc.eat(dog)

// 1. Traits do not have Constructor Paramters
// 2. You can only extend one class, but multiple traits may be inherited by the same class

// 3. Traits = Behaviour (Abstract Class = Type of a thing)
// Traits describe what they do
