package week2;

import java.awt.Color;
import java.util.Random;

/* This program will produce random circles with radnom radius, colors and
 * location 
 */
import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class RandomCircles extends GraphicsProgram {

	//properties of the circles
private static final int NOC = 10;
private static final double MIN_RADIUS = 5;
private static final double MAX_RADIUS = 50;


	public void run () {
		
		RandomGenerator rgen = new RandomGenerator ();
		for (int i = 0; i<NOC; i++) {
			
		
          int x = rgen.nextInt(50, 450);
          int y = rgen.nextInt(50,350);
          int r = rgen.nextInt(5,50);
		
         
		/*println (x);
		println (y);
		println (r);*/
          
		
			GOval circle = new GOval(x, y, r, r);
			circle.setFillColor(rgen.nextColor());
			circle.setFilled(true);

			add(circle);		
			
		}
		}
			
	}

