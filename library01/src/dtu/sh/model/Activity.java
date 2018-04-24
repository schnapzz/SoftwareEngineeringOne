package dtu.sh.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Activity {

	private String title = "";
	private String description = "";
	private int startDate;
	private int endDate;
	
	public List<TimeRegistration> timeRegistrations;
	
	public Activity(String title, String description) {
		this.title = title;
		this.description = description;
		
		timeRegistrations = new ArrayList<TimeRegistration>();
	}
	
	public Activity(String title, String description, int start, int end) {
		this.title = title;
		this.description = description;
		this.startDate = start;
		this.endDate = end;
		
		timeRegistrations = new ArrayList<TimeRegistration>();
	}

	public Activity(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}
}
