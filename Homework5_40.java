class Homework5_40{
	public static void main(String[] args){
	/*(Simulation: heads or tails)
	Write a program that simulates flipping a coin one million times and displays the number of heads and tails.*/
	int rounds = 0;
	int heads = 0;
	int tails = 0;
	double headsOrTails = 0;

	for(rounds = 0; rounds < 1000000; rounds++){
		headsOrTails = Math.random();

		if(headsOrTails < 0.5)
		tails++;
		else
		heads++;
	}

	System.out.println("It was " + tails + " tails and " + heads + " heads!");

	}
}
