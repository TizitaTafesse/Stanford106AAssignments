package week3;

import acm.program.ConsoleProgram;

public class DeleteCharactersFromString extends ConsoleProgram {
	
	public void run() {
		// this code will remove all characters of the String
		String removeAllOccurrences (String str; char ch){
			String Outcome = "";
			for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ch) {
			Outcome += str.charAt(i);
			}
			}
			println ( Outcome );
			}

	}
	
}
