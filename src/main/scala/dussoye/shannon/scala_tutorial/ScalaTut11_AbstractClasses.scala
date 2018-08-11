package dussoye.shannon.scala_tutorial

object ScalaTut11_AbstractClasses {

  def main(args: Array[String]): Unit ={

    // Class Wolf
    val fang = new Wolf("Fang")
    fang.moveSpeed = 36.0
    println(fang.move)
  }
  // Abstract Class
  abstract class Mamal(val name: String){
    var moveSpeed: Double
    def move: String
  }

  class Wolf(name:String) extends Mamal(name){
    var moveSpeed=35.0
    def move = "The Wolf %s runs %.2f mph".format(this.name,this.moveSpeed)
  }

}
