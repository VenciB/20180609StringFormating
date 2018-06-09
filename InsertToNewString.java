package by.htp.stringformat.logic;

public class InsertToNewString {
	
	private String originalText;
	private String givenText;
	private int step;
	private int currentPosition;
	private int originalTextLength;
	private String tempTextStepByStep = null;
	private String newAndFinal = "";
	
	public InsertToNewString( String originalText, String givenText, int step, int currentPosition ) {
		this.originalText = originalText;
		this.givenText = givenText;
		this.step = step;
		this.currentPosition = currentPosition;
	}
	
	public InsertToNewString( String originalText, String givenText, int step ) {
			this.originalText = originalText;
			this.givenText = givenText;
			this.step = step;
			this.currentPosition = 0;
	}
	
	public String insertAndCreateNewString( ) {
		
		originalTextLength = originalText.length();
		
		while( ( currentPosition ) < originalTextLength ) {
			if( ( currentPosition + step ) == originalTextLength ) {
				tempTextStepByStep = originalText.substring(currentPosition);
				newAndFinal = newAndFinal + tempTextStepByStep + givenText;
				currentPosition += step;
			} else if ( ( currentPosition + step ) < originalTextLength ) {
				tempTextStepByStep = originalText.substring(currentPosition, currentPosition + step);
				newAndFinal = newAndFinal + tempTextStepByStep + givenText;
				currentPosition += step;
			} else if ( ( currentPosition + step ) > originalTextLength ) {
				tempTextStepByStep = originalText.substring(currentPosition);
				newAndFinal = newAndFinal + tempTextStepByStep;
				currentPosition += step;
			} // end if - else if
		
		} // end while loop
		
		return newAndFinal;

	} // end method 
	
} // end class
