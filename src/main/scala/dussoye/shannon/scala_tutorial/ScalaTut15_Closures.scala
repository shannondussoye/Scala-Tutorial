package dussoye.shannon.scala_tutorial

object ScalaTut15_Closures {
  def main(args: Array[String]): Unit ={
    val divisorVal = 5
    val divisor5 = (num:Double) => num/divisorVal
    printf("5/5="+divisor5(5.0))
  }

}
