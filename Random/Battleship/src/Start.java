
public class Start {
	public boolean tellWhichShipHit = true;
	public static void main(String[] args){
		Player player1 = new Player();
		Player player2 = new Player();
		player1.setUpGrid();
		player2.setUpGrid();
		while(true){
			player2.checkSquare(player1.getGuessAndFire());
			
		}
	}
	public boolean getShipHitRule(){
		return tellWhichShipHit;
	}
}
