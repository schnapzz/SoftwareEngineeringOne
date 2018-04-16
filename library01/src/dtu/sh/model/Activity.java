package dtu.sh.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Activity {

	private String title;
	private String description;
	private Date startDate;
	private Date endDate;
	
	public List<TimeRegistration> timeRegistrations;
	
	public Activity(String title, String description) {
		this.title = title;
		this.description = description;
		
		timeRegistrations = new ArrayList<TimeRegistration>();
	}
	
	public Activity(String title, String description, Date start, Date end) {
		this.title = title;
		this.description = description;
		this.startDate = start;
		this.endDate = end;
		
		timeRegistrations = new ArrayList<TimeRegistration>();
	}

	public String getTitle() {
		return title;
	}
}
