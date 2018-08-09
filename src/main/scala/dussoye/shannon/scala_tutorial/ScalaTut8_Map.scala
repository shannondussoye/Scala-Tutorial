package dussoye.shannon.scala_tutorial

object ScalaTut8_Map {
    def main(args: Array[String]) {
      //Key value pairs: Immutable
      //Create Map
      val employees = Map("Manager" -> "Bob Smith" , "Secretary" -> "Sue Brown")

      // Check if key exist
      if(employees.contains("Manager"))
        printf("Manager: %s\n",employees("Manager"))

      //create a mutable Map
      val customers = collection.mutable.Map(100 -> "Paul Smith",101 -> "Sally Smith")
      printf("Customer 1: %s\n",customers(100))

      //Update name
      customers(100)="Tom Marks"

      //add new customer
      customers(102)="Megan Swift"

      //Print Map
      for((k,v) <- customers)
        printf("%d : %s \n", k,v)
    }

}
