import scala.annotation.tailrec

def factorial (n: Int): Int = 
  if (n <=1) 1 
  else n * factorial(n-1)

  factorial(7)

  def anotherFactorial(n: Int):Int = {
    @tailrec
    def go (t:Int, accum:Int): Int =
      if (t <= 1) accum
      else go(t-1, t * accum) // TAIL RECURSION = use recursive call as the LAST expression
      go(n,1)
  }

  anotherFactorial(10)
  // When you need Loops, use _TAIL_ Recursion.

  // Questions:
  // 1. Concatenate a string n times (tail recursive)
  // 2. IsPrime function (tail recursive)
  // 3. Fibonacci function (tail recursive)

  // 1:

  def concatenate(str: String, n: Int) = {
    @tailrec
    def go(t: Int, accum: String): String=
      if(t <= 0) accum
      else go(t-1, str+accum)
      go(n,"")
  }

  concatenate("DeadPool", 2)

 // 2:
 
 def isPrime(n: Int): Boolean = {
  @tailrec
   def go(t: Int, isStillPrime: Boolean): Boolean = 
     if(!isStillPrime) false
     else if (t <= 1) true
     else go(t-1, n%t != 0 && isStillPrime)
     go(n/2,true)
 }

isPrime(2003)
isPrime(629)

 // 3: 
 
 def fibonacci(n:Int): Int = {
   def go(t: Int, last: Int, nextToLast: Int): Int =  // last = n-1 nextToLast = n-2
     if(t >=n) last
     else go(t+1, last + nextToLast , last )

     if (n <=2) 1
     else go(2,1,1)
 }

fibonacci(8)
