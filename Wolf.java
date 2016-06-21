import java.util.Random;

public class Wolf implements Critter, CritterInfo {

	public char getChar() {
		return 'WLF';

	}
	
	public int getMove(CritterInfo info) {
	Random g=new Random();
	int moves;
	moves=g.nextInt(4) +1; 
	int direction = 0;
	
		
	
	switch(moves) {

	case 1: 
	direction = WEST;
	break;
	

	case 2: 
	direction = SOUTH;
	break;
	

	case 3: 
	direction = NORTH;
	break;
	

	case 4: 
	direction = EAST;
	break;
	

	}

	return direction;

	private int x;
	private int y;

	this.x = x;
	this.y = y;

	public int getX(); {
		return x;

	}
	
	public int getY(); {
		return y;
	
	}

	private int direction;

	public char getNeighbor(int direction) {
		return direction;

	private int height = getHeight();
	private int width = getWidth();

	public int getHeight(); {
		return height;

	}

	public int getWidth(); {
		return width;

	}

}

