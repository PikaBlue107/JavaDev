package tittown;
import java.awt.Color;
import java.util.Random;
import javax.swing.JFrame;

public class TroubleinTerroristsTown {

	public static void main(String[] args) throws InterruptedException {
		Random rand = new Random();
		String[] jobs = {"Innocent","Traitor","Innocent","Innocent"};
		int num1 = rand.nextInt(3);
		int num2;
		int num3;
		//int num4;
		do{
			num2 = rand.nextInt(3);
		}while(num1==num2);
		do{
			num3 = rand.nextInt(3);
		}while(num1==num3||num2==num3);
		/*do{
			num4 = rand.nextInt(4);
		}while(num1==num4||num2==num4||num3==num4);*/
		Color color1 = (num1==1) ? Color.red:Color.green;
		Color color2 = (num2==1) ? Color.red:Color.green;
		Color color3 = (num3==1) ? Color.red:Color.green;
		//Color color4 = (num4==1) ? Color.red:Color.green;
		
		TITTGUI player1 = new TITTGUI("\nPlayer 1:\n"+jobs[num1], color1);
		player1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		player1.setSize(1366,750);
		player1.setVisible(true);
		System.out.println("Player 1:  "+jobs[num1]);
		Thread.sleep(2000);
		player1.setVisible(false);
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
		TITTGUI waiting = new TITTGUI("\nNext person...", Color.yellow);
		waiting.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		waiting.setSize(1366,750);
		waiting.setVisible(true);
		Thread.sleep(5000);
		waiting.setVisible(false);
		TITTGUI player2 = new TITTGUI("\nPlayer 2:\n"+jobs[num2],color2);
		player2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		player2.setSize(1366,750);
		player2.setVisible(true);
		System.out.println("Player 2:  "+jobs[num2]);
		Thread.sleep(2000);
		player2.setVisible(false);
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
		waiting.setVisible(true);
		Thread.sleep(5000);
		waiting.setVisible(false);
		TITTGUI player3 = new TITTGUI("\nPlayer 3:\n"+jobs[num3],color3);
		player3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		player3.setSize(1366,750);
		player3.setVisible(true);
		System.out.println("Player 3:  "+jobs[num3]);
		Thread.sleep(2000);
		player3.setVisible(false);
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
		/*waiting.setVisible(true);
		Thread.sleep(5000);
		waiting.setVisible(false);
		TITTGUI player4 = new TITTGUI("\nPlayer 4:\n"+jobs[num4], color4);
		player4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		player4.setSize(1366,750);
		player4.setVisible(true);
		System.out.println("Player 4:  "+jobs[num4]);
		Thread.sleep(2000);
		player4.setVisible(false);
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n");*/
		TITTGUI closeMe = new TITTGUI("\n\nClose me", Color.blue);
		closeMe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		closeMe.setSize(1366,750);
		closeMe.setVisible(true);
	}

}
