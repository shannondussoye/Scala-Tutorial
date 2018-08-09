package dussoye.shannon.scala_tutorial

object ScalaTut9 {
    def main(args: Array[String]) {
      //Key value pairs: Immutable
      val employees = Map("Manager" -> "Bob Smith" , "Secretary" -> "Sue Brown")
      if(employees.contains("Manager"))
        printf("Manager: %s\n",employees("Manager"))
    }

}
