package rpg;

public class Archer extends Player{

	
	
	private int aimAbility;

	public Archer(int hitPoints,int defensePoints)
	{
		super(hitPoints,defensePoints);
	}
	public int getAimAbility() {
		return aimAbility;
	}

	public void setAimAbility(int aimAbility) {
		if(aimAbility<=100 )
		this.aimAbility = aimAbility;
		else{System.out.print("error: aim ability too high..");}
	}
	
	public void aim(){
		super.attack();
		System.out.println("Focusing...");
		
	}

	
	
}
