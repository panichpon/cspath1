package path1;

public class MisMatchException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MisMatchException(String errorMessage, Throwable err) {
	    super(errorMessage, err);
	}
}
