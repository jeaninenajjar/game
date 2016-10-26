package projectstuff;

public class Hazard extends Movers{
  
  public Hazard(){
	  xpos = 5;
	  ypos = 5;
	  xvel = 15;
	  yvel = 15;
  }
  /**
 * Moves the hazard object one unit to the left in the game.
 * @return void
 */
 
public void moveLeft(){
  	xpos = xpos - 1;
  }
 
public int getxpos() {
	return xpos;
}
public void setxpos(int xpos) {
	this.xpos = xpos;
}
public int getypos() {
	return ypos;
}
public void setypos(int ypos) {
	this.ypos = ypos;
}
public int getxvel() {
	return xvel;
}
public void setxvel(int xvel) {
	this.xvel = xvel;
}
public int getyvel() {
	return yvel;
}
public void setyvel(int yvel) {
	this.yvel = yvel;
}
/**
 * Increase the xvel of the hazard by the specified integer increment.
 * @param increment the amount the velocity is increased
 */
public void increasexvel(int increment){
  	xvel = xvel + increment;
  }
}
