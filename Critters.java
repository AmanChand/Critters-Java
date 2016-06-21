public class Critters {

	public static void main(String []args) {

	int i=0,alive;

	boolean bird_live=true; //flag to idicate bird is alive.
	boolean frog_live=true;
	boolean mouse_live=true;
	boolean turtle_live=true;
	boolean wolf_live=true;


	Random g = new Random();
	Bird b = new Bird();
	Frog f = new Frog();
	Mouse m =new Mouse();
	Turtle t = new Turtle();
	Wolf w = new Wolf();


	for(i=0;i<15;i++) {

	if(bird_live)
	b.move();


	if(frog_live)
	f.move();


	if(mouse_live)
	m.move();

	if(turtle_live)
	t.move();


	if(wolf_live)
	w.move();

	System.out.println();


	if(b.x == f.x && b.y == f.y && bird_live && frog_live) //collision detection


{

	bird_live=false;
	frog_live=false;

	System.out.println("-----> bird frog collision");

	alive=g.nextInt(2);


	if(alive ==0) {

	System.out.println("------> simulator chose to alive bird");

	bird_live=true;

	}


	else


	{

	System.out.println("------> simulator chose to alive frog");

	frog_live=true;

	}


}


if(b.x == m.x && b.y == m.y && bird_live && mouse_live)

{

	bird_live=false;

	mouse_live=false;

	System.out.println("-----> bird mouse collision");

	alive=g.nextInt(2);


	if(alive ==0)

	{

	System.out.println("------> simulator chose to alive bird");

	bird_live=true;

	}


	else


	{

	System.out.println("------> simulator chose to alive mouse");

	mouse_live=true;

	}

	}


	if(b.x == t.x && b.y == t.y && bird_live && turtle_live)

	{

	bird_live=false;

	turtle_live=false;

	System.out.println("-----> bird turtle collision");

	alive=g.nextInt(2);


	if(alive ==0)

	{

	System.out.println("------> simulator chose to alive bird");

	bird_live=true;

	}


	else

	
	{

	System.out.println("------> simulator chose to alive turtle");

	turtle_live=true;

	}

	}


	if(b.x == w.x && b.y == w.y && bird_live && wolf_live)

	{

	bird_live=false;

	wolf_live=false;

	System.out.println("-----> bird wolf collision");

	alive=g.nextInt(2);


	if(alive ==0)

{

	System.out.println("------> simulator chose to alive bird");

	bird_live=true;

	}


	else


{

	System.out.println("------> simulator chose to alive wolf");

	wolf_live=true;

	}

	}





	if(f.x == m.x && f.y == m.y && frog_live && mouse_live)

{

frog_live=false;

mouse_live=false;

System.out.println("-----> frog mouse collision");

alive=g.nextInt(2);


if(alive ==0)

{

System.out.println("------> simulator chose to alive frog");

frog_live=true;

}


else


{

System.out.println("------> simulator chose to alive mouse");

mouse_live=true;

}

}


if(f.x == t.x && f.y == t.y && frog_live && turtle_live)

{

frog_live=false;

turtle_live=false;

System.out.println("-----> frog turtle collision");

alive=g.nextInt(2);


if(alive ==0)

{

System.out.println("------> simulator chose to alive frog");

frog_live=true;

}


else


{

System.out.println("------> simulator chose to alive turtle");

turtle_live=true;

}

}


if(f.x == w.x && f.y == w.y && frog_live && wolf_live)

{

frog_live=false;

wolf_live=false;

System.out.println("-----> frog wolf collision");

alive=g.nextInt(2);


if(alive ==0)

{

System.out.println("------> simulator chose to alive frog");

frog_live=true;

}


else


{

System.out.println("------> simulator chose to alive wolf");

wolf_live=true;

}

}




if(m.x == t.x && m.y == t.y && mouse_live && turtle_live)

{

mouse_live=false;

turtle_live=false;

System.out.println("-----> mouse turtle collision");

alive=g.nextInt(2);


if(alive ==0)

{

System.out.println("------> simulator chose to alive mouse");

mouse_live=true;

}


else


{

System.out.println("------> simulator chose to alive turtle");

turtle_live=true;

}

}


if(m.x == w.x && m.y == w.y && mouse_live && wolf_live)

{

mouse_live=false;

wolf_live=false;

System.out.println("-----> mouse wolf collision");

alive=g.nextInt(2);


if(alive ==0)

{

System.out.println("------> simulator chose to alive mouse");

mouse_live=true;

}


else


{

System.out.println("------> simulator chose to alive wolf");

wolf_live=true;

}


}

}


}

}
