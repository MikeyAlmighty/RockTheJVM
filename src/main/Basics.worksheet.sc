val x = 1 + 2 //Expression
// Math Operators: + - * / & | << >> >>>

// == != > >= < <=
// logical: ! && || 

// Instructions = Tell Computer what to do (Executed)
// Expressions = Something with a value and/or a Type (Evaluated)

//If expressions resolve in values
//
val age = 19: Int
val isAdult = if(age > 18) "Yes" else "No"

println(isAdult)

// Value of Unit = ()

// SideEffects in Scala are expressions returning () 
// SideEffects: println(), whiles, re-assigning

val codeBlock = {
  val y = 2
  val z = y + 1

  if(z > 2) "hello" else "goodbye"
} 
// Value of a CodeBlock is the value of the last expression

// Questions: 

// 1. Difference between "Hello World" vs println("Hello World")

// "Hell World" value for Type String
// println("Hello World") prints to screen (sideEffect) and is of type Unit

// 2. Value of codeBlock for:
val someValue = {
  2 < 3
} 
// True

val someOtherValue = {
  if (someValue) 239 else 986
  42
} 

