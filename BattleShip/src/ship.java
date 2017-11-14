
public class ship {
	public static final byte SIZE_OF_DESTROYER=2;
	public static final byte SIZE_OF_HELM=3;
	public static final byte SIZE_OF_CRUISER=6;
	public static final byte SIZE_OF_FOOT=5;
	public static final byte SIZE_OF_DINGY=4;
	
	// ship names
	public static final String NAME_OF_DESTROYER="Destroyer";
	public static final String NAME_OF_HELM="Helm";
	public static final String NAME_OF_CRUISER="Cruiser";	
	public static final String NAME_OF_FOOT="Foot";
	public static final String NAME_OF_DINGY="Dingy";
	
	//data members
	private byte shipSize;
	private String shipName;
	
	//constructor
	public ship(){
		
	
	}
	
	public ship(byte shipSize, String shipName){
	this.shipSize=shipSize;
	this.shipName=shipName;
	}
	
	
	
}
