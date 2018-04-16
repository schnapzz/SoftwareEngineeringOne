package dtu.sh.model;

import java.util.ArrayList;
import java.util.List;

public class Project {

	private String id = "";
	private String title;
	private String leaderId;
	
	private List<Employee> employees;
	private List<ProjectActivity> unfinishedActivities = new ArrayList<ProjectActivity>();
	private List<ProjectActivity> finishedActivities = new ArrayList<ProjectActivity>();
	
	//Mikkel
	public Project(String pId, String pTitle, String plId, List<Employee> eList) {
		this.id = pId;
		this.title = pTitle;
		this.leaderId = plId;
		this.employees = eList;
	}
	
	// Helena
	public Project(String title) {
		this.title = title;
	}
	
	// Mikkel
	public void createActivity() {
		
	}
	
	// Mikkel
	public boolean activityExistsWithTitle(String title) {
		
		if (containsActivityWithTitle(unfinishedActivities, title) ||
			containsActivityWithTitle(finishedActivities, title)) {
			return true;
		}
		
		return false;
	}

	// Mikkel
	private boolean containsActivityWithTitle(List<ProjectActivity> activities, String title) {
		
		for (Activity a : activities) {
			if (a.getTitle() == title) {
				return true;
			}
		}
		return false;
	}
	
	// Mikkel
	public void addActivity(ProjectActivity activity) {
		
		unfinishedActivities.add(activity);
	}
	
	// Mikkel
	public List<ProjectActivity> getUnfinishedActivities() {
		// A copy of the objects is returned to avoid manipulation of the array outside the project class.
		List<ProjectActivity> pActivities = new ArrayList<ProjectActivity>(unfinishedActivities);
		return pActivities;
	}
	
	//Helena
	public boolean hasProjectLeader() {
		if (leaderId.equals("")) {
			return false;
		} else {
			return true;
		}
	}
	
	// ===== GETTERS AND SETTERS =====
	public String getId() {
		return id;
	}
	
	public String getTitle() {
		return title;
	}

	public String getProjectLeader() {
		return leaderId;
	}

	public void setProjectLeader(String id) {
		leaderId = id;
	}

	
}
