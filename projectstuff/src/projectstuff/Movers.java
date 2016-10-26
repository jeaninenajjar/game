package projectstuff;

public class Movers {

	static int xpos = 0;
	static int ypos = 0;
	
	
   /**
    * moveX updates the x position with the given velocity
   @author Jeanine
 * @param vel
 * @return xpos
 */
public static int moveX(int vel){
    xpos+= vel;
	 return xpos;
   }
	
   
   /**
    * moveY updates the Y position with the given velocity
    * @author Jeanine
 * @param vel
 * @return ypos
 */
public static int moveY(int vel){
	 ypos+= vel;
	 return ypos;
   }
	
	
	public static void main(String[] args){
		
	System.out.println(moveX(3));
	System.out.println(moveX(4));
	System.out.println(moveY(3));
	System.out.println(moveY(4));
	
	
		
		
	}
	
	
	
	
	
	
	
	
}
