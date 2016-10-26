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
	int[][] array;
	int BOARDHEIGHT = 20;
	final int BOARDWIDTH = 40;
	
	/**
	 * This is a constructor for the Board class.
	 * It initializes the array to a 40x20 2d array,
	 * It initializes the player to a default Player,
	 * and initializes possiblehazards to a default
	 * PossibleHazards.
	 */
	public Board(){
		int[][] arr = new int[BOARDWIDTH][BOARDHEIGHT];
		for(int i=0; i<BOARDHEIGHT; i++){
			for(int j=0; j<BOARDWIDTH; j++){
				arr[i][j]=0;
			}
		}
		arr[BOARDWIDTH/2][0]=1;
		arr[BOARDWIDTH/2+1][0]=1;
		arr[BOARDWIDTH/2-1][0]=1;
		arr[BOARDWIDTH/2][20]=-1;
		arr[BOARDWIDTH/2+1][20]=-1;
		arr[BOARDWIDTH/2-1][20]=-1;
	}
	/** This method returns a part of the array given a coordinate
	 * @param x  the x coordinate of the specified tile
	 * @param y  The y coordinate of the specified tile
	 * @return String the specified file.
	 */
	public int getTile(int x, int y){
		return array[x][y];
	}
}