package projectstuff;

import java.util.*;
/**
* Board is the array in which the characters and
* objects are placed. Attributes include:
* <ul>
* <li>The array that will represent the board
* <li>The player that is playing the game
* <li>
* </ul>
* @author Jarrett Levin
*/
public class Board{
	Object[][] array;
	Player player;
	PossibleHazards possiblehazards;
	
	/**
	 * This is a constructor for the Board class.
	 * It initializes the array to a 40x20 2d array,
	 * It initializes the player to a default Player,
	 * and initializes possiblehazards to a default
	 * PossibleHazards.
	 */
	public Board(){
		Object[][] arr = new Object[40][20];
		int[][] salarr = new int[40][20];
		Player acrab = new Player();
		PossibleHazards ph = new PossibleHazards();
		player = acrab;
		possiblehazards = ph;
	}
	/** This method returns a part of the array given a coordinate
	 * @param x  the x coordinate of the specified tile
	 * @param y  The y coordinate of the specified tile
	 * @return String the specified file.
	 */
	public Object getTile(int x, int y){
		return array[x][y];
	}
	/**
	 * This method determines if there has been
	 * a collision detected or not.
	 * @return True if a collision occurred,
	 *         False if a collision has not occurred;
	 */
	public boolean iscollision(){
		return true;
	}
	/**
	 * This method determines what to do
	 * in the case of a collision.
	 * @return void
	 */
	public void oncollision(){
		
	}
	/**
	* The method used for wiping the board clean.
	* Use this method after every round.
	* 
	* @param section  The section of the screen you want to wipe
	*                 If text is null, wipe nothing.  If text is
	*                 "right", wipe right half of screen, and so
	*                 on for left, top, bottom, middle, and all.
	* @return void
	*/
	public void boardwipe(String section){
		
	}
}