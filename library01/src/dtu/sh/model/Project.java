package dtu.sh.model;

import java.util.ArrayList;
import java.util.List;

public class Project {
	
	private String projectId;
	private String projectName;
	private String projectLeaderId;
	private List<Employee> employees;
	private List<Activity> unfinishedActivities = new ArrayList<Activity>();
	
	public Project(String pId, String pName, String plId, List<Employee> eList) {
		
		this.projectId = pId;
		this.projectName = pName;
		this.projectLeaderId = plId;
		this.employees = eList;
	}
	
	public void createActivity() {
		
	}
	
	
}
