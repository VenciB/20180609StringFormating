package by.htp.stringformat.run;

import by.htp.stringformat.logic.InsertToNewStringWithRegEx;

/** 
 * Task from Blinov, chapter 7, variant A, task 5 
 */

public class AppMain5 {

	private static String newAndFinal;
	
	public static void main(String[] args) {
		
		PrintTwoStrings pts = new PrintTwoStrings();
		String paternText = "(United States)";
		String givenText = "(USA)";
		String originalText = "Fact No. 2: The United States has a partner "
				+ "in the form of the European Union that invests more in "
				+ "the United States than the United States does in it. "
				+ "The E.U.’s foreign direct investment in the United States "
				+ "is $2.56 trillion, compared with $2.38 trillion in "
				+ "the other direction. Seventy percent of all foreign direct "
				+ "investment in the United States comes from Europe.";

		InsertToNewStringWithRegEx itnswre = new InsertToNewStringWithRegEx();
		newAndFinal = itnswre.insertAndCreateWithRegEx(originalText, paternText, givenText );
		pts.printTwoStrings(originalText, newAndFinal, "regular expression" );		

	}

}
