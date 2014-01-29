package jimmyg.casino.games;
import java.util.Random;
import java.util.Scanner;
public class Slots {
	public static int play(int money) {
		Scanner input = new Scanner(System.in);
		boolean playAgain = true;
		Random rand = new Random();
		String[] iconOriginal = {"n Apple"," Pear"," Grape"," Banana","n Orange"," Strawberry"," Cherry"," Clover"," Watermelon"," Gold"," Bar"," Seven"};
		int payment = 0;
		int[] paymentList = {0,	1,2,3,5,10,15,20,25,35,50,75,100,10,20,35,50,85,125,175,250,350,500,1000,10000};
		//String[] waffle = new String[4];
		System.out.println("Welcome to Slots!  $5 only per spin!");
		
		do{
			money-=5;
			System.out.println("");
			int outcome1 = rand.nextInt(12);
			int outcome2 = rand.nextInt(12);
			int outcome3 = rand.nextInt(12);
			
			/*int result = 0;
			if (outcome1 == 11&&outcome2 == 11&&outcome3 == 11) 
				result = 24;
			else if (outcome1 == 10&&outcome2 == 10&&outcome3 == 10)
				result = 23;
			else if (outcome1 == 9&&outcome2 == 9&&outcome3 == 9)
				result = 22;
			else if (outcome1 == 8&&outcome2 == 8&&outcome3 == 8)
				result = 21;
			else if (outcome1 == 7&&outcome2 == 7&&outcome3 == 7)
				result = 20;
			else if (outcome1 == 6&&outcome2 == 6&&outcome3 == 6)
				result = 19;
			else if (outcome1 == 5&&outcome2 == 5&&outcome3 == 5)
			result = 18;
			else if (outcome1 == 4&&outcome2 == 4&&outcome3 == 4)
			result = 17;
			else if (outcome1 == 3&&outcome2 == 3&&outcome3 == 3)
			result = 16;
			else if (outcome1 == 2&&outcome2 == 2&&outcome3 == 2)
			result = 15;
			else if (outcome1 == 1&&outcome2 == 1&&outcome3 == 1)
			result = 14;
			else if (outcome1 == 0&&outcome2 == 0&&outcome3 == 0)
			result = 13;
			else if (outcome1 == 11&&outcome2 == 11||outcome3 == 11&&outcome2 == 11) 
			result = 12;
			else if (outcome1 == 10&&outcome2 == 10||outcome3 == 10&&outcome2 == 10) 
			result = 11;
			else if (outcome1 == 9&&outcome2 == 9||outcome3 == 9&&outcome2 == 9) 
			result = 10;
			else if (outcome1 == 8&&outcome2 == 8||outcome3 == 8&&outcome2 == 8) 
			result = 9;
			else if (outcome1 == 7&&outcome2 == 7||outcome3 == 7&&outcome2 == 7) 
			result = 8;
			else if (outcome1 == 6&&outcome2 == 6||outcome3 == 6&&outcome2 == 6) 
			result = 7;
			else if (outcome1 == 5&&outcome2 == 5||outcome3 == 5&&outcome2 == 5) 
			result = 6;
			else if (outcome1 == 4&&outcome2 == 4||outcome3 == 4&&outcome2 == 4) 
			result = 5;
			else if (outcome1 == 3&&outcome2 == 3||outcome3 == 3&&outcome2 == 3) 
			result = 4;
			else if (outcome1 == 2&&outcome2 == 2||outcome3 == 2&&outcome2 == 2) 
			result = 3;
			else if (outcome1 == 1&&outcome2 == 1||outcome3 == 1&&outcome2 == 1) 
			result = 2;
			else if (outcome1 == 0&&outcome2 == 0||outcome3 == 0&&outcome2 == 0) 
			result = 1;*/
			
			if(outcome1==outcome2||outcome2 == outcome3){
				payment = paymentList[outcome2];
			}	
			if(outcome1==outcome2&&outcome2==outcome3){
				payment = paymentList[(outcome2+12)];
			}
			money+=payment;
			System.out.println("You got a" + iconOriginal[outcome1] + ", a" + iconOriginal[outcome2] + ", and a" + iconOriginal[outcome3] + ".  You won $" + payment + ".");
			System.out.println("You now have a total of $" + money + ".  Would you like to play again?");
			System.out.println("Press q to quit, or any other key to continue.");
			if (input.nextLine() == "q") {
				playAgain = false;
			}
			//result = 0;
		}while(playAgain);
		return money;
	}
}
