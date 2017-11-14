package rpg;

public class Player {
	private int hitPoints;
	private int defensePoints;
	public int getHitPoints() {
		return hitPoints;
	}
	public Player(int hitPoints,int defensePoints)
	{
		this.hitPoints=hitPoints;
		this.defensePoints=defensePoints;
	}
	public void aim()
	{
		System.out.println("....");
	}
	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}
	public int getDefensePoints() {
		return defensePoints;
	}
	public void setDefensePoints(int defensePoints) {
		this.defensePoints = defensePoints;
	}
	public void attack(){
		
		System.out.println("Attacking");
		
	}
	public void castSpell(){
		
		
		
	}
	


}
