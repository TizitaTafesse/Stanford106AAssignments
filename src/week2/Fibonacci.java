package week2;

import acm.program.*;

public class Fibonacci extends ConsoleProgram {

	
	private static final int MAX_TERM_VALUE = 10000;

	public void run() {
		/* fib1 will print 0.
		 * fib2 will print 1.
		 * fibnum will sum up fib1 and fib 2
		 */
		
		println ("This program lists the fibunacci sequence");
		
	int fib1 = (0);
	
	int fib2 = (1);
	  
	
	    
	    while (fib1 < MAX_TERM_VALUE) {
	  		println(fib1);

	   
	    	int fibnum = fib1 + fib2;
	    	fib1 = fib2;
	    	fib2 = fibnum;
	    	

	    }

}
}

