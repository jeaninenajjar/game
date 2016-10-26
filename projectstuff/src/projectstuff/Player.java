package projectstuff;

public class Player extends Movers{
	
		

	int xpos ;
	 int ypos ;
	 int xvel ;
	 int yvel ;
	 int salinity ;
	 int salmin ;
	 int salmax ;
	 String tool;
	 int life ; 
	 String state;
	 
	 
	 Player(int xpos, int ypos, int xvel, int yvel, int salinity, int salmin, int salmax, String tool,  String state) {
			super(xpos, ypos, xvel, yvel);
			this.salinity = salinity;
			this.salmin = salmin;
			this.salmax = salmax;
			this.tool = tool;
			this.state = state;
	 }
	 
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

	
	
