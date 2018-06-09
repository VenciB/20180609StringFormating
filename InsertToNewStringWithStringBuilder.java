package by.htp.stringformat.logic;

public class InsertToNewStringWithStringBuilder {
	
	private String originalText;
	private String givenText;
	private int step;
	private int currentPosition;
	private int originalTextLength;
	private String tempTextStepByStep = null;
	private StringBuilder sb;
	private String newAndFinal = "";
	
	public InsertToNewStringWithStringBuilder( String originalText, String givenText, int step, int currentPosition ) {
		this.originalText = originalText;
		this.givenText = givenText;
		this.step = step;
		this.currentPosition = currentPosition;
	}
	
	public InsertToNewStringWithStringBuilder( String originalText, String givenText, int step ) {
			this.originalText = originalText;
			this.givenText = givenText;
			this.step = step;
			this.currentPosition = 0;
	}
	
	public String insertAndCreateWithStringBuilder( ) {
		
		originalTextLength = originalText.length();
		sb = new StringBuilder();
		
		while( ( currentPosition ) < originalTextLength ) {
			if( ( currentPosition + step ) == originalTextLength ) {
				tempTextStepByStep = originalText.substring(currentPosition);
				sb.append( tempTextStepByStep + givenText );
				currentPosition += step;
			} else if ( ( currentPosition + step ) < originalTextLength ) {
				tempTextStepByStep = originalText.substring(currentPosition, currentPosition + step);
				sb.append( tempTextStepByStep + givenText );
				currentPosition += step;
			} else if ( ( currentPosition + step ) > originalTextLength ) {
				tempTextStepByStep = originalText.substring(currentPosition);
				sb.append( tempTextStepByStep );
				currentPosition += step;
			} // end if - else if
		
		} // end while loop
		
		newAndFinal = sb.toString();
		return newAndFinal;

	} // end method 

} // end class