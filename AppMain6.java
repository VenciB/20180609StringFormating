package by.htp.stringformat.run;

import by.htp.stringformat.logic.InsertToNewStringWithRegEx;

public class AppMain6 {

	private static String newAndFinal;
	private static int sign = 1;
	private static int step = 3;
	
	public static void main(String[] args) {
		
		PrintTwoStrings pts = new PrintTwoStrings();
		String originalText = "Now # we do # and # more ## end.";
		String paternText = "#";
		String givenText = "";
		
		InsertToNewStringWithRegEx itnswre = new InsertToNewStringWithRegEx();
		newAndFinal = itnswre.insertAndCreateWithRegExWithSign(originalText, paternText, givenText, sign, step );
		pts.printTwoStrings(originalText, newAndFinal, "regular expression" );		

	}

}
