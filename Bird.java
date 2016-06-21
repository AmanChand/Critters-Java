import java.util.Random;

/**
* CS 3100
* Bird.java
* Purpose: This class implements from the Critter Interface to 
* show the moves of the Bird critter.
* @author Aman Chand
*/

public class Bird implements Critter {

/**
* The character symbol which will be shown on the simulator
* @return the symbol for Bird
*/
	public char getChar() {
		return 'B';

	}
	
/**
* The amount of moves and which random direction critter will move
*/

	public int getMove(CritterInfo info) {
	Random g=new Random();
	int moves;
	moves=g.nextInt(4) +1; 
	int direction = 0;
	
/**
* The moves switch
*/		
	
	switch(moves) {

/**
* Critter moves to the east direction
*/
	case 1: 
	direction = EAST;
	break;
	
/**
* Critter moves to the north direction
*/
	case 2: 
	direction = NORTH;
	break;
	
/**
* Critter moves to the south direction
*/
	case 3: 
	direction = SOUTH;
	break;
	
/**
* Critter moves to the west direction
*/
	case 4: 
	direction = WEST;
	break;
	

	}
/**
* @return to the direction it is moving
*/
	return direction;


}

}