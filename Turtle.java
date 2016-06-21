/**
* CS 3100
* Turtle.java
* Purpose: This class implements from the Critter Interface to 
* show the moves of the Turtle critter.
* @author Aman Chand
*/

public class Turtle implements Critter {

/**
* The character symbol which will be shown on the simulator
* @return the symbol for Turtle
*/
	
	public char getChar() {
		return 'T';

	}

/**
* Declares the moves and which direction Critter will go
*/
	
	private int moves = 4;
	private int direction = 4;

/**
* The amount of moves and which direction critter will move
*/

	public int getMove(CritterInfo info) {

/** 
* The critter will move to the south direction
*/
	if(moves ==4) {
		moves++;
		direction = SOUTH;
		return direction;

	}

/** 
* The critter will move to the west direction
*/

	if(moves ==3) {
		moves = 4;
		direction = WEST;
		return direction;
	}
	
/** 
* The critter will move to the north direction
*/
	if(moves ==2) {
		moves = 4;
		direction = NORTH;
		return direction;
	}

/** 
* The critter will move to the east direction
*/
	if(moves ==1) {
		moves = 4;
		direction = EAST;
		return direction;
	}

/**
* @return to the direction it is moving
*/
	return direction;

	}
}