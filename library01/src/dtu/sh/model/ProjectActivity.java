package dtu.sh.model;

import java.util.Date;

public class ProjectActivity extends Activity {

	private int priority;
	
	public ProjectActivity(String title, String description, int priority) {
		super(title, description);
		
		this.priority = priority;
	}
	
	public ProjectActivity(String title, String description, Date start, Date end, int priority) {
		super(title, description, start, end);

		this.priority = priority;
	}

	
}
