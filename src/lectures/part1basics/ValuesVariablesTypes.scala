package lectures.part1basics


object ValuesVariablesTypes extends App{
  val x: Int = 42
//  Vals are immutable
  println(x)

  //  Type Inferred by compiler
  val y = 42
  val aString: String = "DeadPool"

  //  Types
  val aBool: Boolean = true
  val aChar: Char = 't'
  val anInt: Int = 420
  val aShort: Short = 12
  val aLong: Long = 1000000L
  val aFloat: Float = 2.0F
  val aDouble: Double = 6.9

//  Variables
var aVariable:Int = 4
  aVariable = 6
}
