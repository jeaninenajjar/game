package projectstuff;

import java.lang.Math;

public class Enemy1 extends Hazard{
  public Enemy1(int xpos, int ypos, int xvel, int yvel){
  	super(xpos, ypos, xvel, yvel);
  }
  
  public void moveLeft(){
  	this.xpos = xpos-1;
  	this.ypos = (int)(Math.sin(xpos))*10;
  }
}