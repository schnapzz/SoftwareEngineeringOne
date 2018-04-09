package dtu.sh.model;

import java.util.Date;

public class ProjectActivity extends Activity {

	private int priority;
	
	public ProjectActivity(String description, Date start, Date end, int priority) {
		super(description, start, end);

		this.priority = priority;
	}

	
}
