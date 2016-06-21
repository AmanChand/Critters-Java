/**
* CS 3100
* Mouse.java
* Purpose: This class implements from the Critter Interface to 
* show the moves of the Mouse critter.
* @author Aman Chand
*/

public class Mouse implements Critter {

/**
* The character symbol which will be shown on the simulator
* @return the symbol for Mouse
*/
	public char getChar() {
		return 'M';

	}
	
/**
* Declares the moves and which direction Critter will go
*/

	private int moves = 0;
	private int direction = 0;

	
/**
* The amount of moves and which direction critter will move
*/

	public int getMove(CritterInfo info) {

/** 
* The critter will move to the west direction
*/

	if(moves ==0) {
		moves++;
		direction = WEST;
		return direction;

	}

/**
* The critter will move to the north direction
*/

	if(moves ==1) {
		moves = 0;
		direction = NORTH;
		return direction;
	}

/**
* @return to the direction it is moving
*/

	return direction;

	}
}