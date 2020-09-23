class Homework5_40{
	public static void main(String[] args){
	/*(Simulation: heads or tails)
	Write a program that simulates flipping a coin one million times and displays the number of heads and tails.*/

        int heads = 0;
        int tails = 0;
        int flips = 0;

        System.out.println("This program will flip a coin 1,000,000 times, and display total number of heads and tails");
        while(flips < 1000000){
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
        System.out.println("It was " + heads + " heads and " + tails + " tails");
        }
}

