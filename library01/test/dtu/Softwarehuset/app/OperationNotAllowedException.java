package dtu.Softwarehuset.app;

public class OperationNotAllowedException extends Exception {
	String error;

	public OperationNotAllowedException(String error) {
		this.error = error;
	}
	
	public String getMessage() {
		return error;
	}
	
	public void setMessage(String newMessage) {
		error = newMessage;
	}

}
