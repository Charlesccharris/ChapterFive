import java.util.Scanner;

class Homework5_40{
	public static void main(String[] args){
	/*(Simulation: heads or tails)
	Write a program that simulates flipping a coin one million times and displays the number of heads and tails.*/
	Scanner input = new Scanner(System.in);

        int heads = 0;
        int tails = 0;
        int flips = 0;
	int totalFlips = 0;

	System.out.print("Insert a number: ");
	totalFlips = input.nextInt();

	System.out.print("Now choose a multiplier, (H)undreds, (T)housands, (M)illions: ");
	char choice = input.next().charAt(0);
	choice = Character.toUpperCase(choice);

	if(choice == 'H')
		totalFlips *= 100;
	else if(choice == 'T')
		totalFlips *= 1000;
	else if(choice == 'M')
		totalFlips *= 1000000;
	else{
		System.out.println("That's not a valid input.");
		System.exit(1);
	}
        System.out.println("This program will flip a coin " + totalFlips + " times, and display total number of heads and tails");

	while(flips < totalFlips){
	int coin = (int)(Math.random() * 10 % 2);
	        if(coin == 0){
		heads++;
		flips++;
	        }
	        else if(coin == 1){
		tails++;
		flips++;
	        }
        }
        System.out.println("The outcome is " + heads + " heads and " + tails + " tails");
        }
}

