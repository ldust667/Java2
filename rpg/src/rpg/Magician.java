package rpg;

public class Magician extends Player {
	
	public Magician(int hitPoints, int defensePoints) {
		super(hitPoints, defensePoints);
		// TODO Auto-generated constructor stub
	}
	private int magicPoints;

	public int getMagicPoints() {
		return magicPoints;
	}

	public void setMagicPoints(int magicPoints) {
		if(magicPoints<=100)
		this.magicPoints = magicPoints;
		else{
			System.out.println("too many magic points..");
		}
	}
public void castSpell(){
	
	super.attack();
	System.out.println("Casting a spell..");
	
}

	

}
