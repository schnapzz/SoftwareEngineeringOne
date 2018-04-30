package dtu.sh.model;

public class TimeRegistration {
	
	private String employeeId;
	private double hours;
	
	public TimeRegistration(String employeeId, double hours) {
		this.employeeId = employeeId;
		this.hours = hours;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public double getHours() {
		return hours;
	}

}
