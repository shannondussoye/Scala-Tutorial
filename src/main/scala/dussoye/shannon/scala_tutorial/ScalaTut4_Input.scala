package dussoye.shannon.scala_tutorial

import scala.io.StdIn

object ScalaTut4_Input {
	def main(args: Array[String]) {
		var numberGuess = 0
		do{
			print("Guess a number: ")
			// readLine to string then convert to Int
			numberGuess = StdIn.readInt()
		} while(numberGuess!=15)

		// using printf
		printf("You guessed the secret number %d\n",15)
	}
}
