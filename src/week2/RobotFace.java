package week2;

import java.awt.Color;

import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class RobotFace extends GraphicsProgram {

	private static final int HEAD_WIDTH = 100;
	private static final int HEAD_HEIGHT = 150; 
	private static final int EYE_RADIUS = 10;
	private static final int MOUTH_WIDTH = 50;
	private static final int MOUTH_HEIGHT = 20; 
	
	public void run () {
		int x = getWidth() / 2 - HEAD_WIDTH / 2 ;
		int y = getHeight() / 2 - HEAD_HEIGHT /2 ;
		
        GRect face = new GRect(x, y, HEAD_WIDTH, HEAD_HEIGHT);
        add(face);
            
				face.setFillColor(Color.gray);
				face.setFilled(true);
				
			int lefteyex = x + HEAD_WIDTH/8;
			int lefteyey = y + HEAD_HEIGHT/4;
			
		GOval eye = new GOval (lefteyex, lefteyey, 25, 25);
		eye.setFillColor(Color.yellow);
		eye.setFilled(true);
		add(eye);
 		
		 int righteyex = x + HEAD_WIDTH*5/8;
		int righteyey = y + HEAD_HEIGHT/4;
		
		GOval eye2 = new GOval (righteyex, righteyey, 25, 25);
		eye2.setFillColor(Color.yellow);
		eye2.setFilled(true);
		add(eye2); 
		
		int lipsx = x + MOUTH_WIDTH/2;
	    int lipsy = y + MOUTH_HEIGHT*5;
	      
	      GRect Mouth = new GRect (lipsx, lipsy, MOUTH_WIDTH, MOUTH_HEIGHT);
	      
	      
	      Mouth.setFillColor(Color.white);
	      Mouth.setFilled(true);
	      
	      add (Mouth);
	      
		}
	}
         
	
