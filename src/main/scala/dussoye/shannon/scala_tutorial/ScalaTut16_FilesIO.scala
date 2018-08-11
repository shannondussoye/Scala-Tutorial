package dussoye.shannon.scala_tutorial

import java.io.PrintWriter
import scala.io.Source

object ScalaTut16_FilesIO {
  def main(args:Array[String]): Unit ={
    val writer = new  PrintWriter("test.txt")
    writer.write("Just some random text \nSome more Random text")
    writer.close()

    val textFromFile = Source.fromFile("test.txt","UTF-8")
    val lineIterator = textFromFile.getLines
    for(line <- lineIterator){
      println(line)
    }
    textFromFile.close()


  }
}
