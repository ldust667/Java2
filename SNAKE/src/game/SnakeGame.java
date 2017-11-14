package game;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class SnakeGame extends Applet implements Runnable ,KeyListener {
	//instantitaion
	Graphics gfx;
	Image img;
	Thread thread;
	Snake snake;
	boolean gameOver=false;
	Token token;
	
	
	
	public void init(){
		//declaration
		this.resize(400,400);
		img=createImage(400,400);
		gfx=img.getGraphics();
		this.addKeyListener(this);
		thread=new Thread(this);
		snake= new Snake();
		token=new Token(snake);
			
		
		thread.start();
	}
	//visual layout
	public void paint(Graphics g){
	gfx.setColor(Color.black);
	gfx.fillRect(0, 0, 400, 400);
	if(!gameOver){
	snake.draw(gfx);
	token.draw(gfx);}
	else{
		gfx.setColor(Color.RED);
		gfx.drawString("Game Over!", 180, 150);
		gfx.drawString("Score: "+token.getScore(),180, 170);
	}
	
	
				
	g.drawImage(img, 0, 0, null);
	}
	//refresh it
	public void  update(Graphics g){
		paint(g);
	}
	//update visual
	public void repaint(Graphics g){
		paint(g);
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(;;){
			
			if(!gameOver){
			snake.Move();
			this.checkGameOver();
			token.snakeCollision();}
			
			this.repaint();
			try {
				if(token.getScore()==0)
				Thread.sleep(40);
				if(token.getScore()!=0){
					Thread.sleep(40-(token.getScore()+2));
					
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
	public void checkGameOver(){
		if(snake.getX()<0||snake.getX()>396){
			gameOver=true;
		}if(snake.getY()<0||snake.getY()>396){
			gameOver=true;
		}
		if(snake.snakeCollison()==true){
			gameOver=true;
		}
		
	}
	
	
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		if(!snake.isMoving()){
			if(e.getKeyCode()==KeyEvent.VK_UP||e.getKeyCode()==KeyEvent.VK_DOWN||e.getKeyCode()==KeyEvent.VK_RIGHT)
			{
				snake.setIsMoving(true);
			}
		}
		
		
		if(e.getKeyCode()==KeyEvent.VK_UP) 
			{if(snake.getydir()!=1){
				snake.setydir(-1);
				snake.setxdir(0);
			}}
		
		if(e.getKeyCode()== KeyEvent.VK_LEFT){	
			if(snake.getxdir()!=1){
			snake.setxdir(-1);
			snake.setydir(0);
		}}
			
		if(e.getKeyCode()== KeyEvent.VK_RIGHT)
			{if(snake.getxdir()!=-1){
				snake.setxdir(1);
				snake.setydir(0);
			}}
			
		if( e.getKeyCode()==KeyEvent.VK_DOWN){	
			if(snake.getydir()!=-1){
				snake.setydir(1);
				snake.setxdir(0);
			}}
		
		
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
