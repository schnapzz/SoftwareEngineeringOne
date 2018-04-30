package dtu.sh.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProjectActivity extends Activity {

	private int priority;
	
	private List<Employee> employees = new ArrayList<Employee>() {{
		add(new Employee("Mikk"));
		add(new Employee("abcd"));
	}};
	private List<TimeRegistration> timeRegistrations;
	
	public ProjectActivity(String title, String description, int priority) {
		
		super(title, description);
		
		this.priority = priority;
		
		timeRegistrations = new ArrayList<TimeRegistration>();
	}
	
	// Mikkel
	public ProjectActivity(String title, String description, int priority, List<Employee> employees) {
		
		super(title, description);
		
		this.priority = priority;
		this.employees = employees;
		
		timeRegistrations = new ArrayList<TimeRegistration>();
	}
	
	public ProjectActivity(String title, String description, int start, int end, int priority) {
		
		super(title, description, start, end);

		this.priority = priority;
		
		timeRegistrations = new ArrayList<TimeRegistration>();
	}

	// Mikkel
	public boolean employeeWithIdExists(String loggedInEmployeeId) {
		
		assert loggedInEmployeeId != null;
		
		for (Employee employee : employees) {
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
	public void registerHours(String employeeId, double hours) {
		
		TimeRegistration timeRegistration = new TimeRegistration(employeeId, hours);
		timeRegistrations.add(timeRegistration);
		System.out.println("Registration Created");
	}

	// Mikkel
	public List<TimeRegistration> getTimeRegistrations() {
		
		List<TimeRegistration> copyRegistrations = new ArrayList<TimeRegistration>(timeRegistrations);
		return copyRegistrations;
	}
	
	public int getPriority() { 
		return priority;
	}
	
}
