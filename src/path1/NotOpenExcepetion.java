package path1;

public class NotOpenExcepetion extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NotOpenExcepetion(String errorMessage, Throwable err) {
	    super(errorMessage, err);
	}
}
