package dtu.sh.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProjectActivity extends Activity {

	private int priority;
	
	private List<TimeRegistration> timeRegistrations;
	
	public ProjectActivity(String title, String description, int priority) {
		
		super(title, description);
		
		this.priority = priority;
		timeRegistrations = new ArrayList<TimeRegistration>();
	}
	
	public ProjectActivity(String title, String description, int start, int end, int priority) {
		
		super(title, description, start, end);

		this.priority = priority;
		
		timeRegistrations = new ArrayList<TimeRegistration>();
	}

	// Mikkel
	public boolean employeeWithIdExists(String loggedInEmployeeId) {
		// TODO Auto-generated method stub
		return false;
	}

	public int numberOfTimeRegistrations() {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<TimeRegistration> getTimeRegistrations() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
