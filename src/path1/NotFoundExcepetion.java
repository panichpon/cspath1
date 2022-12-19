package path1;

public class NotFoundExcepetion extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NotFoundExcepetion(String errorMessage, Throwable err) {
	    super(errorMessage, err);
	}
}
