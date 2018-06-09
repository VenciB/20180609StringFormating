package by.htp.stringformat.logic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InsertToNewStringWithRegEx {
	
	public String insertAndCreateWithRegEx( String originalText, String paternText, String givenText ) {
	    Pattern p = Pattern.compile( paternText, Pattern.DOTALL );
	    Matcher m = p.matcher( originalText );
	    return m.replaceAll(  "$1" + givenText );
	} // end insertAndCreateWithRegEx
	
	public String insertAndCreateWithRegExWithSign( String originalText, String paternText, String givenText, int sign, int step ) {
		String toReturn = "";
	    Pattern p;
	    Matcher m;
	    if( sign == 1 ) {
	    	givenText = paternText;
	    	paternText = "(.{" + step + "})"; // should compile patern: "(.{3})"
	    	p = Pattern.compile( paternText, Pattern.DOTALL );
		    m = p.matcher( originalText );
	    	toReturn = m.replaceAll(  "$1" + givenText );
	    }
	    else if ( sign == 0 ) {
	    	paternText = "(" + paternText + ")";
	    	p = Pattern.compile( paternText, Pattern.DOTALL );
		    m = p.matcher( originalText );
	    	toReturn = m.replaceAll( givenText );
	    }
	    return toReturn;
	}
	
}