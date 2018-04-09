package dtu.sh.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Activity {

	private String description;
	private Date startDate;
	private Date endDate;
	
	public List<TimeRegistration> timeRegistrations;
	
	public Activity(String description, Date start, Date end) {
		this.description = description;
		this.startDate = start;
		this.endDate = end;
		
		timeRegistrations = new ArrayList<TimeRegistration>();
	}
}
