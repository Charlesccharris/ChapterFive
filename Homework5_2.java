import java.util.Scanner;

class Homework5_2{
	public static void main(String[] args){
	/*(Repeat additions)
	Listing 5.4, SubtractionQuizLoop.java, generates five random subtraction questions.
	Revise the program to generate ten random addition questions for two integers between 1 and 15.
	Display the correct count and test time.*/

	Scanner input = new Scanner(System.in);
	int round = 0;
	long startTime = System.currentTimeMillis();
	String done = " ";
	int wins = 0;
	int totalRounds = 0;

	System.out.print("How many rounds of subtraction: ");
	totalRounds = input.nextInt();

	for(round = 0; round < totalRounds; round++){
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

	if(guess == answer){
		System.out.println("Correct");
		wins++;
	}
	else
		System.out.println("Incorrect");

	done += "\n" + number1 + "-" + number2 + "=" + guess + ((number1 - number2 == guess) ? " correct" : " wrong");
	}
	long endTime = System.currentTimeMillis();
	long totalTime = endTime - startTime;

	System.out.println("Number of questions answered right: " + wins + "\nTest time was " + totalTime/1000 + " seconds\n" +done);
	}
}
