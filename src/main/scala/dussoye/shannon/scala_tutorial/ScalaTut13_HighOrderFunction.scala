package dussoye.shannon.scala_tutorial

import scala.math._

object ScalaTut13_HighOrderFunction {

  def main(args: Array[String]): Unit ={
    val log10Func = log10 _
    println(log10Func(1000))

    List(1000.0,10000.0).map(log10Func).foreach(println)
  }

  List(1,2,3,4,5).map((x: Int)=>x*50).foreach(println)

  List(1,2,3,4,5).filter(_%2==0).foreach(println)

  

}
