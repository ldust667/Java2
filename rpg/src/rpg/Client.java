package rpg;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Player myPlayer=new Player(10,10);
		//Archer arc = new Archer(10,10);
		myPlayer=new Archer(10,10);
		//myPlayer=new Archer();
		myPlayer.setDefensePoints(23);
		myPlayer.setHitPoints(40);
		myPlayer.aim();
		myPlayer=new Magician(20,20);
		myPlayer.castSpell();
		
	}

}
