package dtu.sh.model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import dtu.library.Exceptions.OperationNotAllowedException;

public class Project {

	private String id = "";
	private String title;
	private String leaderId = "";
	
	private int projectNumber = 0;
	
	private List<Employee> employees;
	private List<ProjectActivity> unfinishedActivities = new ArrayList<ProjectActivity>() {{ 
		add(new ProjectActivity("TestUnfinished", "test description", 1));
	}};
	private List<ProjectActivity> finishedActivities = new ArrayList<ProjectActivity>() {{ 
		add(new ProjectActivity("TestFinished", "test description", 2));
	}};
	
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
		this.id = assignId();
	}
	
	// Mikkel
	public boolean activityExistsWithTitle(String title) {
		System.out.println(unfinishedActivities + " " + finishedActivities);
		if (containsActivityWithTitle(unfinishedActivities, title) ||
			containsActivityWithTitle(finishedActivities, title)) {
			return true;
		}
		
		return false;
	}

	// Mikkel
	private boolean containsActivityWithTitle(List<ProjectActivity> activities, String title) {
		
		if (activities.size() == 0) { return false; }
		
		for (Activity a : activities) {
			if (a.getTitle().equalsIgnoreCase(title)) {
				return true;
			}
		}
		return false;
	}
	
	// Mikkel
	public void addActivity(ProjectActivity activity, Employee employee) throws OperationNotAllowedException {
		
		if (activityExistsWithTitle(activity.getTitle())) { throw new OperationNotAllowedException("Project already has an activity with this name"); }
		else if (!isEmployeeProjectLeader(employee)) { throw new OperationNotAllowedException("Only the project leader can create activities for a project"); }
	
		unfinishedActivities.add(activity);
	}
	
	private boolean isEmployeeProjectLeader(Employee employee) {
		return employee.getID().equalsIgnoreCase(getProjectLeader());
	}
	
	// Mikkel
	public List<ProjectActivity> getUnfinishedActivities() {
		// A copy of the objects is returned to avoid manipulation of the array outside the project class.
		List<ProjectActivity> pActivities = new ArrayList<ProjectActivity>(unfinishedActivities);
		return pActivities;
	}
	
	//Helena
	public boolean hasProjectLeader() {
		if (this.leaderId.equals("")) {
			return false;
		} else {
			return true;
		}
	}
	
	//Helena
	public String assignId() {
		String id = "";
		Calendar cal = Calendar.getInstance();
		String year = cal.get(Calendar.YEAR) + ""; 
		year.replaceAll("20", "");
		switch (Integer.toString(projectNumber).length()) {
		case  1:
			id = year + "000" + projectNumber;
			break;
		case 2:
			id = year + "00" + projectNumber;
			break;
		case 3:
			id = year + "0" + projectNumber;
			break;
		case 4: 
			id = year + projectNumber;
			break;
		}
		projectNumber = projectNumber + 1;		
		return id;
	}
	
	//Helena
	public Report createReport() {
		Report report = new Report(unfinishedActivities, finishedActivities);
		return report;
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
