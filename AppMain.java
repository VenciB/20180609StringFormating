package by.htp.stringformat.run;

import by.htp.stringformat.logic.InsertToNewString;
import by.htp.stringformat.logic.InsertToNewStringWithRegEx;
import by.htp.stringformat.logic.InsertToNewStringWithStringBuilder;

/** 
 * Task from Blinov, chapter 7, variant A, task 4
 * done in 3 variants, with:
 * 1) regular String replacement,
 * 2) StringBuilder, and
 * 3) RegEx 
 */

public class AppMain {

	private static String originalText = "Very nice weather today, isn't it?";
	private static String givenText = "abc";
	private static int step = 3;
	private static String newAndFinal;
	
	public static void main(String[] args) {
		
		PrintTwoStrings pts = new PrintTwoStrings();
		
		InsertToNewString itns = new InsertToNewString( originalText, givenText, step );
		newAndFinal = itns.insertAndCreateNewString();
		pts.printTwoStrings(originalText, newAndFinal, "regular string replacement" );
		
		InsertToNewStringWithStringBuilder itnswsb = new InsertToNewStringWithStringBuilder( originalText, givenText, step );
		newAndFinal = itnswsb.insertAndCreateWithStringBuilder();
		pts.printTwoStrings(originalText, newAndFinal, "string builder" );
		
		InsertToNewStringWithRegEx itnswre = new InsertToNewStringWithRegEx();
		String paternText = "(.{" + step + "})"; // should compile patern: "(.{3})"
		newAndFinal = itnswre.insertAndCreateWithRegEx(originalText, paternText, givenText );
		pts.printTwoStrings(originalText, newAndFinal, "regular expression" );
	}
}
