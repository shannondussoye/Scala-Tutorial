package dussoye.shannon.scala_tutorial

object ScalaTut17_Exceptions {
  def main(args:Array[String]): Unit ={
    def divideNums(num1: Int,num2: Int) = try{
        (num1/num2)
      } catch {
        case ex : java.lang.ArithmeticException => "Can't divide by zero"
      } finally {
        // clean up after exceptions
      }
    println("3/0="+divideNums(3,0))

  }
}
