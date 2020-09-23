class Homework5_2{
	public static void main(String[] args){
	/*(Repeat additions)
	Listing 5.4, SubtractionQuizLoop.java, generates five random subtraction questions.
	Revise the program to generate ten random addition questions for two integers between 1 and 15.
	Display the correct count and test time.*/

	int number1 = 4;
	int number2 = 2;

	System.out.println("What is " + number1 + " - " + number2 + "?");

	int answer = number1 - number2;
	int guess = 2;
	if(guess == answer)
		System.out.println("Correct");
	else
		System.out.println("Incorrect");

	}
}
