package week4;

import java.io.BufferedReader;

import acm.program.ConsoleProgram;


public class Histograms extends ConsoleProgram {
	
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
public void run() {
 initHistogram();
 readScoresIntoHistogram3();
 printHistogram2();
 }
private void printHistogram2() {
	// TODO Auto-generated method stub
	
}
private void readScoresIntoHistogram3() {
	// TODO Auto-generated method stub
	
}

 private void initHistogram() {
 int[] histogramArray = new int[11];
 for (int i = 0; i <= 10; i++) {
 histogramArray[i] = 0;
 }
 }
 
 private int[] histogramArray;

 private static final String DATA_FILE = "MidtermScores.txt";
} 
