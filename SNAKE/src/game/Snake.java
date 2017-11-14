package game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.List;
import java.util.ArrayList;

public class Snake {
//20:30 Krohn - educaation how to snake applet
	//variables
	ArrayList <Point> snakePoints;
	int xdir,ydir;
	Boolean isMoving, elongate;
	final int STARTSIZE=20,STARTX=150,STARTY=150;

	
	//arraylist for points
	public Snake(){
		snakePoints=new ArrayList<Point>();
		xdir=0;
		ydir=0;
		isMoving=false;
		elongate=false;
		snakePoints.add(new Point(STARTX,STARTY));
		for(int i=1;i<STARTSIZE;i++){
			snakePoints.add(new Point(STARTX-i*4,STARTY ));
			
		}
	}
	//setters for boolen is moving
	public boolean isMoving(){
		return isMoving;
	}
	
	public void setIsMoving(boolean b){
		isMoving=b;
	}
	//building snake rects
	public void draw(Graphics g){
		g.setColor(Color.red);
		for(Point p: snakePoints )
			g.fillRect(p.getX(), p.getY(), 4, 4);
	}
	//getters and setters
	public int getxdir(){
	return xdir;
}
public int getydir(){
	return ydir;
}
public void setxdir(int xdir){
	this.xdir=xdir;
}
public void setydir(int ydir){
	this.ydir=ydir;
	
}
public int getX(){
	return snakePoints.get(0).getX();
}
public int getY(){
	return snakePoints.get(0).getY();
}

public void Move(){
	if(isMoving){
	Point temp= snakePoints.get(0);
	Point last=snakePoints.get(snakePoints.size()-1);
	Point newStart=new Point(temp.getX()+xdir*4,temp.getY()+ydir*4);
	
	for(int i=snakePoints.size()-1;i>=1;i--){
		snakePoints.set(i, snakePoints.get(i-1));
		
		
	}
	snakePoints.set(0,newStart);
	if(elongate){
		snakePoints.add(last);
		elongate=false;
	}
	
	}
	
}

public boolean snakeCollison(){
	int x=this.getX();
	int y=this.getY();
	for (int i=1;i<snakePoints.size();i++){
		if(snakePoints.get(i).getX()==x&&snakePoints.get(i).getY()==y){
			return true;
		}
		
	}
	return false;
	
	
}
public void setElongate(boolean b){
	elongate=b;
	
}

}
