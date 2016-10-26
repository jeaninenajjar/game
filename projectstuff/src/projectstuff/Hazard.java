package projectstuff;

public class Hazard {
  private int xCoordinate;
  private int yCoordinate;
  private int xVelocity;
  private int yVelocity;
  
  
  /**
 * Moves the hazard object one unit to the left in the game.
 
 */
public void moveLeft(){
  	xCoordinate = xCoordinate - 1;
  }
 
 
/**
 * Increase the xVelocity of the hazard by the specified integer increment
 * @param increment the amount the velocity is increased
 */
public void increaseXVelocity(int increment){
  	xVelocity = xVelocity + increment;
  }
}
