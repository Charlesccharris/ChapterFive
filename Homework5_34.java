import java.util.Scanner;

class Homework5_34 {
	public static void main(String[] args){
	/*(Game: scissor, rock, paper)
	Programming Exercise 3.17 gives a program that plays the scissor-rock-paper game.
	Revise the program to let the user continuously play until either the user or the computer wins more than two times than its opponent.*/

	Scanner input = new Scanner(System.in);

	int round = 1;
        int tied = 0;
        int won = 0;
        int lost = 0;
        char Rock = 'r';
        char Paper = 'p';
        char Scissor = 's';

        while(round == 1){
	if(won > lost + 1 || lost > won + 1){
		System.out.print("Game over\n Your final score was " + won + " wins " + tied + " ties and " + lost + " losses.");
		if(won>lost){
		System.out.println("You won!");
		round = 0;
		}
		else{
		System.out.println("You lost!");
		round = 0;
		}
	}
	else{
        int number1 = (int)(Math.random() * 100);
        int computerHand = number1 % 3;
        System.out.print("\n(r)ock, (p)aper, (s)cissors : ");

        char guess = input.next().charAt(0);

                if(guess != Rock && guess != Paper && guess != Scissor){
                System.out.println("Really, " + guess + "? You had one job.");
                System.exit(1);
                }
                else if(computerHand == 0){
                System.out.print("Computer tossed scissors, ");
                        if(guess == Scissor){
                        System.out.println("so you tied");
                        tied ++;
                        }
                        else if(guess == Rock){
                        System.out.println("so you won");
                        won ++;
                        }
			else if(guess == Paper){
			System.out.print("so you lost");
			lost ++;
			}
		}
		else if(computerHand == 1){
		System.out.print("Computer tossed rock, ");
			if(guess == Scissor){
			System.out.println("so you lost.");
			lost ++;
			}
			else if(guess == Rock){
			System.out.println("so you tied");
			tied ++;
			}
			else if(guess == Paper){
			System.out.println("so you won");
			won ++;
			}
		}
		else if(computerHand == 2){
		System.out.print("Computer tossed paper, ");
			if(guess == Scissor){
			System.out.println("so you won");
			won ++;
			}
			else if(guess == Rock){
			System.out.println("so you lost");
			lost ++;
			}
			else if(guess == Paper){
			System.out.println("so you tied");
			tied ++;
			}
		}
	}
	}
	}
}
