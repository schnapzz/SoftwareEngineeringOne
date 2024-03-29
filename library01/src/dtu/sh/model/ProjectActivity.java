package dtu.sh.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import dtu.sh.Exceptions.IllegalWeekNumberFormatException;
import dtu.sh.Exceptions.OperationNotAllowedException;


// Mikkel
public class ProjectActivity extends Activity {

	private int priority;

	// Mikkel
	private List<Employee> employees = new ArrayList<Employee>() {
		{
			add(new Employee("Mikk"));
			add(new Employee("abcd"));
		}
	};
	private List<TimeRegistration> timeRegistrations = new ArrayList<TimeRegistration>() {
		{			
		}
	};

	// Mikkel
	public ProjectActivity(String title, String description, int priority) {
		super(title, description);
		this.priority = priority;
		timeRegistrations = new ArrayList<TimeRegistration>();
	}

	// Mikkel
	public ProjectActivity(String title, String description, int priority, int start, int end, List<Employee> employees) {

		super(title, description, start, end);
		
		this.priority = priority;
		this.employees = employees;
		
//		timeRegistrations = new ArrayList<TimeRegistration>();
	}

	// Mikkel
	public boolean employeeWithIdExists(String loggedInEmployeeId) {

		assert loggedInEmployeeId != null;

		for (Employee employee : getEmployees()) {
			if (employee.getID().equals(loggedInEmployeeId)) {
				return true;
			}
		}
		return false;
	}

	// Mikkel
	public int numberOfTimeRegistrations() {
		return timeRegistrations.size();
	}

	// Mikkel
	public void registerHours(String employeeId, double hours) throws OperationNotAllowedException {

		assert employeeId.toCharArray().length == 4;

		if (isHoursProperlyFormatted(hours)) {

			TimeRegistration timeRegistration = new TimeRegistration(employeeId, hours);
			timeRegistrations.add(timeRegistration);		
		}
	}

	// Mikkel
	private boolean isHoursProperlyFormatted(double hours) throws OperationNotAllowedException {

		boolean properFormat = false;
		if (isHoursPositive(hours) && isHoursWithoutHalfHourAccuracy(hours)) {
			properFormat = true;
		}
		return properFormat;
	}

	// Mikkel
	private boolean isHoursPositive(double hours) throws OperationNotAllowedException {
		if (hours < 0) {
			throw new OperationNotAllowedException("Negative hours not allowed");
		}
		return true;
	}

	// Mikkel
	private boolean isHoursWithoutHalfHourAccuracy(double hours) throws OperationNotAllowedException {
		if (hours % 0.5 != 0) {
			throw new OperationNotAllowedException("Hours logged need to be with half (0.5) hours accuracy");
		}
		return true;
	}

	// Mikkel
	public List<TimeRegistration> getTimeRegistrations() {

		List<TimeRegistration> copyRegistrations = new ArrayList<TimeRegistration>(timeRegistrations);
		return copyRegistrations;
	}

	public int getPriority() {
		return priority;
	}

	// Oli
	public void addEmployeeToActivity(Employee employee, String employeeId) throws OperationNotAllowedException {


		if (!employeeWithIdExists(employeeId)) {

			getEmployees().add(employee);

		}
	}


	public List<Employee> getEmployees() {
		return employees;
	}
}
