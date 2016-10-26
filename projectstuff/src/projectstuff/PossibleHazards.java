package projectstuff;

import java.util.ArrayList;

public class PossibleHazards{
	ArrayList<Hazard> hazards;

	/**constructor for the possible hazards class which contains 
	 * all of the possible hazards that can spawn in a given round
	 * 
	 */
	public PossibleHazards(){
		this.hazards = new ArrayList<Hazard>();
	}


	/**
	 * @param hazards 
	 * hazards are an array of all possible hazards
	 * Sets the array containing all of the possible hazards
	 */
	
	public void setpossibleHazards(ArrayList<Hazard> hazards){
		this.hazards = hazards;
	}

	/**
	 * an array of all possible hazards
	 * @return void
	 * gets the possible Hazards from the array list
	 */ 
	public ArrayList<Hazard> getpossibleHazards(){
		return this.hazards;
	}

	/**
	 * @param hazard
	 * an array of all possible hazards
	 * adds a single hazard to the array
	 * 
	 */
	public void addHazard(Hazard hazard){
		hazards.add(hazard);
	}

	/**
	 * @param index
	 * index is an int that represents the position we want in the array
	 * Removes a hazard from the array at the given index
	 */
	public void removeHazard(int index){
		hazards.remove(index);
	}

	/**
	 * select a random hazard in array
	 */
	public void selectRandom(){
		
	}
}