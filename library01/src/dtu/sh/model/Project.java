package dtu.sh.model;

import java.util.ArrayList;
import java.util.List;

public class Project {

	private String id;
	private String name;
	private String leaderId;
	
	private List<Employee> employees;
	private List<ProjectActivity> unfinishedActivities = new ArrayList<ProjectActivity>();
	private List<ProjectActivity> finishedActivities = new ArrayList<ProjectActivity>();
	
	// Mikkel
	public Project(String pId, String pName, String plId, List<Employee> eList) {
		this.id = pId;
		this.name = pName;
		this.leaderId = plId;
		this.employees = eList;
	}
	
	// Helena
	public Project(String title) {
		name = title;
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
	
	// ===== GETTERS AND SETTERS =====
	public String getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

	// Mikkel
	public List<ProjectActivity> getUnfinishedActivities() {
		// A copy of the objects is returned to avoid manipulation of the array outside the project class.
		List<ProjectActivity> pActivities = new ArrayList<ProjectActivity>(unfinishedActivities);
		return pActivities;
	}

	
}
