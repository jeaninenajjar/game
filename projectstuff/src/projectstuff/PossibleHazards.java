package projectstuff;

import java.util.ArrayList;
import java.util.Random;

public class PossibleHazards{
	Hazard[] hazards;
	int HAZARD_NUM = 5;

	/**constructor for the possible hazards class which contains 
	 * all of the possible hazards that can spawn in a given round
	 * 
	 */
	public PossibleHazards(){
		this.hazards = new Hazard[HAZARD_NUM];
	}
	public void generateHazards(){
		Random gen = new Random();
		for(int i=0; i<hazards.length; i++){
			switch(gen.nextInt(3)){
			case 0:
				hazards[i]= new Enemy1(350, gen.nextInt(350)+1, 1, 1);
				break;
			case 1:
				hazards[i] = new Enemy2(350, gen.nextInt(350)+1, 1, 1);
				break;
			case 2:
				hazards[i] = new Enemy3(350, gen.nextInt(350)+1, 1, 1);
				break;
			}
		}
	}
	/**
	 * @param hazards 
	 * hazards are an array of all possible hazards
	 * Sets the array containing all of the possible hazards
	 */
	
	public void setpossibleHazards(Hazard[] hazards){
		this.hazards = hazards;
	}

	/**
	 * an array of all possible hazards
	 * @return void
	 * gets the possible Hazards from the array list
	 */ 
	public Hazard[] getpossibleHazards(){
		return this.hazards;
	}
	public void moveLeft(){
		for(int i=0; i<hazards.length; i++){
			hazards[i].moveLeft();
		}
	}
	/**
	 * @param hazard
	 * an array of all possible hazards
	 * adds a single hazard to the array
	 * 
	 */
	public void addHazard(Hazard hazard){
//		hazards.;
	}

	/**
	 * @param index
	 * index is an int that represents the position we want in the array
	 * Removes a hazard from the array at the given index
	 */
	public void removeHazard(int index){
//		hazards.remove(index);
	}

	/**
	 * select a random hazard in array
	 */
//	public Hazard selectRandom(){
//		Random gen = new Random();
////		return hazards.get(gen.nextInt(hazards.size()));
//	}
}