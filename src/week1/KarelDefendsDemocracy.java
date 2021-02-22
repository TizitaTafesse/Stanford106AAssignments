package week1;

import stanford.karel.*;

public class KarelDefendsDemocracy extends SuperKarel {

	public void run() {
		/*
		 * Karel will be doing the following. If there is a beeper in the center, he
		 * ignores any tasks and moves forward. If there is no beeper in the center,
		 * karel checks the left side and if there is a beeper karel picks it. Karel
		 * then checks the right side to see if there is any beeper there and if there
		 * is , he pickes that up too.
		 */
// 
		while (frontIsClear()) {
			move();
			
			if (noBeepersPresent()) {
				removeChad();
				pickBeeper();
			}
			  move();
		}
		
		
//		move();
//		if (beepersPresent()) {
//			move();
//			move();
//			while (noBeepersPresent()) {
//				turnRight();
//				move();
//				if (beepersPresent()) {
//					pickBeeper();
//
//				}
//				pickBeeper();
//				break;
//			}
//		}
		
	}
	
	private void removeChad() {
		turnLeft();
		move();
		turnAround();
		move();
		move();
		turnAround();
		move();
		turnRight();
		
	}
	
	private void pickBeeper() {

	        while (beepersPresent()) {
	        	pickBeeper(); {
	        	else move();
	        }
	}
}
	}