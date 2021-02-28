package week3;
import DecimalFormart;


import acm.program.ConsoleProgram;

public class AddCommasToNumberStrings extends ConsoleProgram {
	
 // This program will separate the digits entered by user into groups of three.	
		public String AddCommasToNumberStrings(String index) {
		    String result = "";
		    for (int i=1; i <= index.length(); ++i) {
		        char ch = index.charAt(index.length() - i);
		        if (i % 3 == 1 && i > 1) {
		            result = "," + result;
		        }
		        result = ch + result;
		    }

		    return result;
		}
	}
