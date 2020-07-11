def aFunction(a: String, b: Int) : String ={
  a + " " + b
}

def aParamlessFunc(): Int = 42

println(aFunction("DeadPool", 69))

println(aParamlessFunc)

def aRepeatedFunc(a:String, n: Int): String = {
  if(n == 1) a else a + aRepeatedFunc(a,n-1)
}

println(aRepeatedFunc("DeadPool",2))

// Questions:
// 1. A greeting function (name, age) => "Hi, my name is $name and I am $age years old"
// 2. Factorial function 1 * 2 * 3 * .... * n
// 3. Fibonacci Function f(1) f(1) f(n) = (fn-1) + (fn-2)
// 4. Tests if a number is prime.

// 1: 

def greeting(name: String, age: Int): Unit =
  println(s"Hi my name is $name and I am $age years old")

greeting("Wade Wilson", 69)

// 2:

def factorial(n: Int): Int = 
  if(n <= 0) 1 else n*factorial(n-1)


factorial(5)

// 3:

def fibonacci(n: Int): Int = 
  if(n <= 2)1 else   fibonacci(n-1) + fibonacci(n-2)

fibonacci(4)


// 4:

def isPrime(n: Int): Boolean = {
  def isPrimeUntil(t: Int): Boolean ={
    if (t <= 1) true
    else n % t != 0 && isPrimeUntil(t-1)
  }
  isPrimeUntil(n/2)
}


isPrime(16)
isPrime(3)
isPrime(11)
