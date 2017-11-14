
public class Client {

	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//game board
		//String[] gameBoardX=new String[10];//array of ten elements
		
		//two demension
		
		
		System.out.println("Gameboard.gameboard[0].length: " +Gameboard.gameboard[0].length);
		System.out.println("Gameboard.gameboard.length: " +Gameboard.gameboard.length);
		
		//populate whole game board with dashes
		String vertical="vertical";
		
		ship shipCruiser=new ship(ship.SIZE_OF_CRUISER,ship.NAME_OF_CRUISER);
		ship shipDestroyer=new ship(ship.SIZE_OF_DESTROYER,ship.NAME_OF_DESTROYER);
		ship shipHelm=new ship(ship.SIZE_OF_HELM,ship.NAME_OF_HELM);
		ship shipFoot=new ship(ship.SIZE_OF_FOOT,ship.NAME_OF_FOOT);
		ship shipDingy=new ship(ship.SIZE_OF_DINGY,ship.NAME_OF_DINGY);
		
		
		for(int i=0;i<Gameboard.gameboard.length;i++){
			
			
			for(int j=0;j<Gameboard.gameboard[i].length;j++){
				Gameboard.gameboard[i][j]=Gameboard.UnoccupiedSpace;	
			}
			
		}
		
	
	Gameboard.placeShip("Helm", 4, 4, vertical);
	
           
	
		//assign an individual space
		
	//output game feild
	for (int i=0;i<Gameboard.gameboard.length;i++){
		
		for(int j=0;j<Gameboard.gameboard[i].length;j++){
			System.out.print(Gameboard.gameboard[i][j]);	
			}
		//end row
		System.out.println();
	}
	
	
	
	
	

		
		
	

}}
