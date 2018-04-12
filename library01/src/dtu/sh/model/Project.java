package dtu.sh.model;

import java.util.ArrayList;
import java.util.List;

public class Project {

	private String id;
	private String title;
	private String leaderId;
	private List<Employee> employees;
	private List<Activity> unfinishedActivities = new ArrayList<Activity>();
	
	//Mikkel
	public Project(String pId, String pTitle, String plId, List<Employee> eList) {
		this.id = pId;
		this.title = pTitle;
		this.leaderId = plId;
		this.employees = eList;
	}
	
	//Helena
	public Project(String title) {
		this.title = title;
	}
	
	//Mikkel
	public void createActivity() {
		
	}
	

	// ===== GETTERS AND SETTERS =====
	public String getId() {
		return id;
	}
	
	public String getTitle() {
		return title;
	}

	
}
