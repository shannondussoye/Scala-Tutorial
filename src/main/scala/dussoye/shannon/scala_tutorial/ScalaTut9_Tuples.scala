package dussoye.shannon.scala_tutorial
//Tuples: Multiple types of datatype
object ScalaTut9_Tuples {
  def main(args: Array[String]): Unit ={
    var tupleMarge = (103,"Marge Simpson",10.25)
    printf("%s owes us $%.2f\n", tupleMarge._2,tupleMarge._3)

    // Iterate through tuple
    tupleMarge.productIterator.foreach{i=> println(i)}

    // Convert tuple to string
    println(tupleMarge.toString())
  }

}
