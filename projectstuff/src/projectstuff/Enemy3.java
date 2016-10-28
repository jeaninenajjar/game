package projectstuff;

import java.lang.Math;

public class Enemy3 extends Hazard{
  public Enemy3(int xpos, int ypos, int xvel, int yvel){
  	super(xpos, ypos, xvel, yvel);
  }
  public Enemy3(){
	  super(200,200,1,1);
  }
  
  public void moveLeft(){
  	this.xpos = xpos-xvel;
  //	this.ypos = (int)Math.cos(xpos)*(15);
  }
}