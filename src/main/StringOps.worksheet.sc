val str: String = "Hello I am learning Scala"

println(str.charAt(2))
println(str.substring(7,11))
println(str.split(" ").toList)
println(str.startsWith("Hello"))
println(str.replace("", "-"))
println(str.toLowerCase())
println(str.length)


val aNumberString = "2"
val aNumber = aNumberString.toInt
println('a' +: aNumberString :+ 'z') // +: Prepending :+ appending

println(str.reverse)
println(str.take(2))

// s-Interpolators
val name = "DeadPool"
val age = 69

val greeting = s"Hello, my name is $name and I am $age years old."
val anotherGreeting = s"Hello, my name is $name and I am ${age + 1} years old."

// F-Interpolators
val speed = 1.2f
val myth = f"$name is $speed%2.3f fast"

val x = 1.1f

// val showX = f"$x%3d" Throws error

// raw-interpolator

println(raw"This is a \n newline")
val escaped = "This is a \n newline" 
println(raw"$escaped") // Injected raw interpolated values ignores espaced characters
