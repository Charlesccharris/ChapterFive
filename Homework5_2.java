import java.util.Scanner;

class Homework5_2{
	public static void main(String[] args){
	/*(Repeat additions)
	Listing 5.4, SubtractionQuizLoop.java, generates five random subtraction questions.
	Revise the program to generate ten random addition questions for two integers between 1 and 15.
	Display the correct count and test time.*/

	Scanner input = new Scanner(System.in);
	int round = 0;
	String done = " ";

	for(round = 0; round < 10; round++){
	int number1 = (int)(Math.random() * 100);
	int number2 = (int)(Math.random() * 100);
	number1 = number1 % 15 + 1;
	number2 = number2 % 15 + 1;
	int temp = 0;

	if(number1 < number2){
	temp = number1;
	number1 = number2;
	number2 = temp;
	}

	System.out.print("What is " + number1 + " - " + number2 + "? ");

	int answer = number1 - number2;
	int guess = input.nextInt();

	if(guess == answer)
		System.out.println("Correct");
	else
		System.out.println("Incorrect");

	done += "\n" + number1 + "-" + number2 + "=" + guess + ((number1 - number2 == guess) ? " correct" : " wrong");
	}
	System.out.println(done);
	}
}
