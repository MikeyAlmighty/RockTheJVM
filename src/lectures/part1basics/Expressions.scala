package lectures.part1basics

object Expressions extends App{
  val x = 1 + 2 // Expression
  println(x)

//  + - * / & | ^ << >> >>> Arithmetic operators

  println(x == 3)
//   == != < <= > >= Comparison operators

  println(!(1 == x))
//   ! && || Logical operators

  // Instruction = Tell compiler what to do change variable, print to console
  // Expression = Has value and/or Type

//  If expression
  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3
  println(aConditionedValue)
  var aVariable =1
  val aWeirdValue = (aVariable = 3) // Unit == void
  println(aWeirdValue)
}
