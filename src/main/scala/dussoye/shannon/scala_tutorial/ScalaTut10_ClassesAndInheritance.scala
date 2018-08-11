package dussoye.shannon.scala_tutorial

object ScalaTut10_ClassesAndInheritance {
  def main(args: Array[String]): Unit ={

    // Calling class method 1
    val rover = new Animal
    rover.setName("Rover")
    rover.setSound("Woof")
    printf("%s says %s\n",rover.getName,rover.getSound)

    //Calling class method 2
    val whiskers = new Animal("Whiskers","Meow")
    println(s"${whiskers.getName} with id ${whiskers.id} says ${whiskers.getSound}")
    println(whiskers.toString())

    // class dog

    val spike = new Dog("Spike","Woof","Grrrr")
    println(spike.toString())

  } // End of Main

  class Animal(var name: String, var sound: String){
    this.setName(name) // constructor

    val id = Animal.newIdNum

    def getName(): String = name
    def getSound(): String = sound

    def setName(name: String): Unit ={
      if(!(name.matches(".*\\d+.*")))
        this.name = name
      else
        this.name = "No Name"
    }
    def setSound(sound: String): Unit ={
      this.sound = sound
    }

    //if sound is not passed
    def this(name: String){
      this("No Name","No Sound")
      this.setName(name)
    }

    //if name/sound is not passed
    def this(){
      this("No Name","No Sound")
    }

    // Override a function
    override def toString(): String={
      return "%s with the id %d says %s".format(this.name,this.id,this.sound)
    }
  } // end of animal

  object Animal{
    private var idNumber =0
    private def newIdNum = {idNumber +=1; idNumber}
  }


  // Inheritance if class is final, it cannot be inherited, Dog class with inherit the Animal class
  class Dog(name: String, sound: String, growl: String) extends Animal(name,sound){

    def this(name: String, sound: String){
      this("No Name",sound,"No Growl") // if no growl is passed over
      this.setName(name)
    }

    def this(name: String){
      this("No Name","No Sound","No Sound")  // if only name is passed over
      this.setName(name)
    }

    def this(){
      this("No Name", "No Sound", "No growl")
    }

    override def toString(): String = {
      return "%s with the id %d says %s or %s".format(this.name,this.id,this.sound,this.growl)
    }
  }



}
