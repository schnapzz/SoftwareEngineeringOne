package dtu.sh.model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import dtu.sh.Exceptions.OperationNotAllowedException;

public class Project {

	private String id = "";
	private String title;
	private String leaderId = "";
	private int start = 0;
	private int end = 0;
	
	private List<Employee> employees;
	private List<ProjectActivity> unfinishedActivities = new ArrayList<ProjectActivity>() {{ 
		add(new ProjectActivity("TestUnfinished", "test description", 1));
		add(new ProjectActivity("test", "test", 1));
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
	
	//Helena
	public Project(int pId, String title) {
		this.id = assignId(pId);
		this.title = title;
	}

	public Project(int pId, String title, int start, int end) {
		this.title = title;
		this.id = assignId(pId);
		this.start = start;
		this.end = end;
	}

	// Mikkel
	public boolean activityExistsWithTitle(String title) {
		
		assert title.toCharArray().length > 0;
		
		if (containsActivityWithTitle(unfinishedActivities, title) ||
			containsActivityWithTitle(finishedActivities, title)) {
			return true;
		}		
		return false;
	}

	// Mikkel
	private boolean containsActivityWithTitle(List<ProjectActivity> activities, String title) {
		
		assert activities.size() > 0;
		
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
	
	//Helena
	public boolean hasProjectLeader() {
		if (this.leaderId.equals("")) {
			return false;
		} else {
			return true;
		}
	}
	
	//Helena
	public String assignId(int projectNumber) {
		String year = "18";
		id = year + "000" + projectNumber;
		return id;
	}
	
	//Helena
	public Report createReport() {
		Report report = new Report(finishedActivities, unfinishedActivities);
		return report;
	}
	
	// Mikkel
	public boolean employeeWithIdExists(String loggedInEmployeeId) {
		for (Employee employee : employees) {
			if (loggedInEmployeeId.equals(employee.getID())) {
				return true;
			}
		}
		return false;
	}

	// Mikkel
	public ProjectActivity getProjectActivityWithTitle(String activityTitle) {
		
		assert activityTitle.toCharArray().length > 0;
		
		ProjectActivity projectActivity = searchForProjectActivity(activityTitle, unfinishedActivities);
		if (projectActivity == null) {
			projectActivity = searchForProjectActivity(activityTitle, finishedActivities);
		}
		
		assert projectActivity != null;
		
		// remember to copy.
		// Talk to members about when to copy an object
		
		return projectActivity;
	}
	
	private ProjectActivity searchForProjectActivity(String activityTitle, List<ProjectActivity> projectActivities) {
		assert projectActivities != null;
		for (ProjectActivity pa : projectActivities) {
			if (pa.getTitle().equals(activityTitle)) {
				return pa;
			}
		}
		return null;
	}

//	// Mikkel
//	public void registerHours(String employeeId, double hours) throws OperationNotAllowedException {
//		
//		assert employeeId != null;
//		
//		if (isHoursImproperlyFormatted(hours)) { throw new OperationNotAllowedException("Hours logged need to be with half (0.5) hours accuracy"); }
//		
//		activeProjectActivity.registerHours(employeeId, hours);
//	}

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

	public int getStart() {
		return this.start;
	}
	
	public int getEnd() {
		return this.end;
	}
	
	// Mikkel
	public List<ProjectActivity> getUnfinishedActivities() {
		// A copy of the objects is returned to avoid manipulation of the array outside the project class.
		List<ProjectActivity> pActivities = new ArrayList<ProjectActivity>(unfinishedActivities);
		return pActivities;
	}

	public List<ProjectActivity> getFinishedActivities() {
		return finishedActivities;
	}

	public void setStartDate(int start) {
		this.start = start;
	}
	
	public void setEndDate(int end) {
		this.end = end;
	}
}
