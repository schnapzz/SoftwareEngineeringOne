package dtu.library.Exceptions;

public class OperationNotAllowedException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public OperationNotAllowedException() {
	    super("Wrong Input");
  }
	
	public OperationNotAllowedException(String errorMsg) {
	    super(errorMsg);
  }

}
