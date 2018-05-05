package dtu.sh.Exceptions;

public class OperationNotAllowedException extends Exception {

	/**
	 * Helena
	 */
	private static final long serialVersionUID = 1L;
	
	public OperationNotAllowedException() {
	    super("Something went wrong :(");
  }
	
	public OperationNotAllowedException(String errorMsg) {
	    super(errorMsg);
  }

}
