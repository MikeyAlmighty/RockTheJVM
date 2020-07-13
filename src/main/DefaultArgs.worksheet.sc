import scala.annotation.tailrec

// Default values same as in JS
def factorial(n: Int, accum: Int = 1): Int ={
    if(n <=1) accum
    else factorial(n-1, n * accum) 
}

factorial(10)

def savePicture(format: String = "jpg", width: Int, height: Int = 1080): Unit = println("Saving picture")

savePicture(width = 800) // Allows use of Default Args for format, height 

// Cannot ommit leading params, compiler gets confused

savePicture(height = 600,width = 800) // SideFeature: Order does not matter


