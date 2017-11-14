
public class Gameboard {
 public static final String[][] gameboard=new String[10][10];
 public static final int NUMBER_OF_ROWS=10;
 public static final int NUMBER_OF_COLUMNS=10;
 public static final String OccupiedSpace="=";
 public static final String UnoccupiedSpace="-";
 public static final String HitSpace="X";
 public static final String MissedSpace="O";

public static void placeShip(String shipName,int c1,int c2,String direction ){
	
	
	if(shipName==ship.NAME_OF_HELM&&direction=="vertical")
		{for (int i=0;i<ship.SIZE_OF_HELM;i++){
			if(Gameboard.gameboard[(c1+i)-1][c2-1]==Gameboard.UnoccupiedSpace)
				Gameboard.gameboard[(c1+i)-1][c2-1]=Gameboard.OccupiedSpace;}}
	if(shipName==ship.NAME_OF_HELM&&direction!="vertical")
		{for (int i=0;i<ship.SIZE_OF_HELM;i++){
			if(Gameboard.gameboard[c1-1][(c2+i)-1]==Gameboard.UnoccupiedSpace)
				Gameboard.gameboard[c1-1][(c2+i)-1]=Gameboard.OccupiedSpace;}}
	
	if(shipName==ship.NAME_OF_FOOT&&direction=="vertical")
	{for (int i=0;i<ship.SIZE_OF_FOOT;i++){
		if(Gameboard.gameboard[(c1+i)-1][c2-1]==Gameboard.UnoccupiedSpace)
			Gameboard.gameboard[(c1+i)-1][c2-1]=Gameboard.OccupiedSpace;}}
if(shipName==ship.NAME_OF_FOOT&&direction!="vertical")
	{for (int i=0;i<ship.SIZE_OF_FOOT;i++){
		if(Gameboard.gameboard[c1-1][(c2+i)-1]==Gameboard.UnoccupiedSpace)
			Gameboard.gameboard[c1-1][(c2+i)-1]=Gameboard.OccupiedSpace;}}


if(shipName==ship.NAME_OF_DINGY&&direction=="vertical")
{for (int i=0;i<ship.SIZE_OF_DINGY;i++){
	if(Gameboard.gameboard[(c1+i)-1][c2-1]==Gameboard.UnoccupiedSpace)
		Gameboard.gameboard[(c1+i)-1][c2-1]=Gameboard.OccupiedSpace;}}
if(shipName==ship.NAME_OF_DINGY&&direction!="vertical")
{for (int i=0;i<ship.SIZE_OF_DINGY;i++){
	if(Gameboard.gameboard[c1-1][(c2+i)-1]==Gameboard.UnoccupiedSpace)
		Gameboard.gameboard[c1-1][(c2+i)-1]=Gameboard.OccupiedSpace;}}



if(shipName==ship.NAME_OF_DESTROYER&&direction=="vertical")
{for (int i=0;i<ship.SIZE_OF_DESTROYER;i++){
if(Gameboard.gameboard[(c1+i)-1][c2-1]==Gameboard.UnoccupiedSpace)
	Gameboard.gameboard[(c1+i)-1][c2-1]=Gameboard.OccupiedSpace;}}
if(shipName==ship.NAME_OF_DESTROYER&&direction!="vertical")
{for (int i=0;i<ship.SIZE_OF_DESTROYER;i++){
if(Gameboard.gameboard[c1-1][(c2+i)-1]==Gameboard.UnoccupiedSpace)
	Gameboard.gameboard[c1-1][(c2+i)-1]=Gameboard.OccupiedSpace;}}


if(shipName==ship.NAME_OF_CRUISER&&direction=="vertical")
{for (int i=0;i<ship.SIZE_OF_CRUISER;i++){
if(Gameboard.gameboard[(c1+i)-1][c2-1]==Gameboard.UnoccupiedSpace)
	Gameboard.gameboard[(c1+i)-1][c2-1]=Gameboard.OccupiedSpace;}}
if(shipName==ship.NAME_OF_CRUISER&&direction!="vertical")
{for (int i=0;i<ship.SIZE_OF_CRUISER;i++){
if(Gameboard.gameboard[c1-1][(c2+i)-1]==Gameboard.UnoccupiedSpace)
	Gameboard.gameboard[c1-1][(c2+i)-1]=Gameboard.OccupiedSpace;}}

}}
