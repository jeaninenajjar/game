package projectstuff;

public class Player extends Movers{
	 int xpos = 0;
	 int ypos = 0;
	 int xvel = 0;
	 int yvel = 0;
	 int salinity = 0;
	 int salmin = 0;
	 int salmax = 0;
	 String tool = "";
	 int life = 0; //probably start this on 3
	 String animal = "";
	 String state = "";
	 
	 
	 
	/**@author Jeanine
	 * Subtracts 1 from Life. if Life is 0 do not subtract.
	 */
	public void LoseLife(){
	   if (life == 0){
		   return;
	   }
	   else{
		   life -= 1; 
	   }}
	 
	
	/**@author Jeanine
	 * 
	 * changes the state of the player to invincible
	 */
	 public void Invincibility(){
		 state = "invincible";		 
		 
	 }
	 
	 /**@author Jeanine
		 * changes state of the player to be in speedup mode
		 */
	 public void SpeedUp(){
		state = "speedup";
		//will put actual speeding up in the board?
		 
	 }
	 
	 /**@author Jeanine
		 * Changes the salinity from increasing to decreasing
		 */ 
	 public void FlipSalinity(){
		 salinity = salinity * -1;
		 
	 }
	 
	 /**@author Jeanine
		 * changes the tool depending on what it is, will cycle through it.
		 */
	 public void SwitchTool(){
		 if (tool.equals("recycle")){
			 tool = "compost";}
		 else if (tool.equals("compost")){
		     tool = "trash";}
		 else {
		     tool = "recycle";}
		 
		
			 
			 
		 }
		 
	 }

	
	
