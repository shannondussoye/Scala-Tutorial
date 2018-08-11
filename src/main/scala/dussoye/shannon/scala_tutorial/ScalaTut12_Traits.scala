package dussoye.shannon.scala_tutorial

object ScalaTut12_Traits {
  def main(args: Array[String]): Unit ={
    val superman = new Superhero("Superman")
    println(superman.fly)
    println(superman.hitByBullet)
    println(superman.richochet(2500))
  }

  trait Flyable{
    def fly : String
  }

  trait BulletProof{
    def hitByBullet : String

    def richochet(startSpeed : Double) : String = {
      "This bullet richochets at a speed of %.1f ft/set".format(startSpeed*.75)
    }
  }

  class Superhero(val name: String) extends Flyable with BulletProof{
    def fly = "%s flies through the air".format(this.name)

    def hitByBullet = "The bullet bounces off of %s".format(this.name)
  }

}
