package day40_exception;

public class InvalidEmailIdCheckedException extends Exception {

	
	
	private static final long serialVersionUID = 1L; 
	// java exception'larin tekrarsiz olmasini saglamak icin her exception'a bir kod verir

	   InvalidEmailIdCheckedException(String message) {
		
		super(message);
	}

	

}
