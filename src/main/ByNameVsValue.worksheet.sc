// Value is computed before call
// Same value used everywhere
def byValue(x: Long) = {
  println(x)
  println(x)
}

// Expression is passed literally
// Expression is evaluated at every use within
def byName(x : => Long) = {
  println(x)
  println(x)
}


byValue(System.nanoTime()) // Gets calculated then sent in
byName(System.nanoTime()) // Gets sent in
