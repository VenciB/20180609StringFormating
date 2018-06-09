package by.htp.stringformat.run;

public class PrintTwoStrings {
	
	public void printTwoStrings( String originalText, String newAndFinal, String message ) {
		System.out.println( message.toUpperCase() + ":" );
		System.out.println( "#### Printing original string:");
		System.out.println( originalText );
		System.out.println( "----------------------------------------" );
		System.out.println( "#### Printing string created with " + message + ":");
		System.out.println( newAndFinal );
		System.out.println( "========================================" );
	}

}
