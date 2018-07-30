// Functions
object ScalaTut7 {
	def main(args: Array[String]) {
		
		// with default value
		def getSum(num1: Int=1, num2: Int=1): Int = {
			num1+num2
		}
		// Call Functions
		println("4+5 = "+getSum(4,5))

		// Call Functions with named arguments
		println("4+5 = " + getSum(num2=5,num1=4))

		// Procedures: Function without return
		def sayHi(): Unit = {
			println("Hi, How are you?")
		}
		sayHi

		// Function with unlimited args
		def getSumExt(args: Int*): Int = {
			 var sum : Int = 0 
			 for (num <- args){
			 	sum += num
			 }
			 sum
		}
		println("Get Sum extended: "+ getSumExt(1,2,3,4,5,6))

		// recursion
		def factorial(num: BigInt): BigInt = {
			if (num <=1)
				1
			else 
				num * factorial(num -1)
		}
		println("Factorial of 4: "+factorial(4))
	}
}