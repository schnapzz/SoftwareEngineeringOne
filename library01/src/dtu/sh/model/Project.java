package dtu.sh.model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import dtu.sh.Exceptions.IllegalWeekNumberFormatException;
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
		
		assert title != null;
		
		if (containsActivityWithTitle(unfinishedActivities, title) ||
			containsActivityWithTitle(finishedActivities, title)) {
			return true;
		}
		
		assert true;
		
		return false;
	}

	// Mikkel
	private boolean containsActivityWithTitle(List<ProjectActivity> activities, String title) {
		
		assert activities != null;
		
		for (Activity a : activities) {
			if (a.getTitle().equals(title)) {
				return true;
			}
		}
	
		assert true;
		
		return false;
	}
	
	// Mikkel
	public void addActivity(String title, String desc, int priority, int start, int end, 
						   List<Employee> employees, Employee loggedInEmployee) throws OperationNotAllowedException, 
																				      IllegalWeekNumberFormatException {
		
		if (activityExistsWithTitle(title)) { throw new OperationNotAllowedException("Project already has an activity with this name"); }
		else if (!isEmployeeProjectLeader(loggedInEmployee)) { throw new OperationNotAllowedException("Only the project leader can create activities for a project"); }
		else if (!isLegalWeekNumbers(start, end)) { throw new IllegalWeekNumberFormatException(); }
		else {
			
			ProjectActivity activity = new ProjectActivity(title, desc, priority, start, end, employees);
			unfinishedActivities.add(activity);
		}
		
		
	}
	
	// Mikkel
	public void addActivity(String title, String desc, int priority, Employee employee) throws OperationNotAllowedException {
		
		if (activityExistsWithTitle(title)) { throw new OperationNotAllowedException("Project already has an activity with this name"); }
		else if (!isEmployeeProjectLeader(employee)) { throw new OperationNotAllowedException("Only the project leader can create activities for a project"); }
		else {
			
			ProjectActivity activity = new ProjectActivity(title, desc, priority);
			unfinishedActivities.add(activity);
		}
	}
	
	// Mikkel
	private boolean isEmployeeProjectLeader(Employee employee) {
		return employee.getID().equalsIgnoreCase(getProjectLeader());
	}
	
	// Mikkel
	private boolean isLegalWeekNumbers(int startWeek, int endWeek) {
		return 0 < startWeek && startWeek < 53 && 0 < endWeek && endWeek < 53;
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
	public ProjectActivity getProjectActivityWithTitle(String activityTitle) {
		
		assert activityTitle != null && activityTitle.isEmpty() != true;
		
		ProjectActivity projectActivity = searchForProjectActivity(activityTitle, unfinishedActivities);
		if (projectActivity == null) {
			projectActivity = searchForProjectActivity(activityTitle, finishedActivities);
		}
		
		assert projectActivity != null;
		
		
		return projectActivity;
	}
	
	// Mikkel
	private ProjectActivity searchForProjectActivity(String activityTitle, List<ProjectActivity> projectActivities) {
		
		assert projectActivities != null;
		
		for (ProjectActivity pa : projectActivities) {
			if (pa.getTitle().equals(activityTitle)) {
				return pa;
			}
		}
		return null;
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
