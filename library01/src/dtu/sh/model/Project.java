package dtu.sh.model;

import java.util.ArrayList;
import java.util.List;

public class Project {
	private String projectId;
	private String projectName;
	private String projectLeaderId;
	private List<Employee> employees;
	private List<Activity> unfinishedActivities = new ArrayList<Activity>();
	
	//Mikkel
	public Project(String pId, String pName, String plId, List<Employee> eList) {
		this.projectId = pId;
		this.projectName = pName;
		this.projectLeaderId = plId;
		this.employees = eList;
	}
	
	//Helena
	public Project(String title) {
		projectName = title;
	}
	
	//Mikkel
	public void createActivity() {
		
	}
	
	//Helena
	public Object getName() {
		return null;
	}
	
	
}
