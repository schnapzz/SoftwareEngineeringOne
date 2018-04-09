package dtu.sh.model;

import java.util.ArrayList;
import java.util.List;

public class SH {
	private String loggedInEmployee;
	private List<Employee> employees = new ArrayList<>();
	private List<Project> projects = new ArrayList<>();
	
	
	
	//Helena
	public Boolean isEmployeed(String username) {
		for (Employee e: employees) {
			if (e.getID().equals(username)) {
				return true;
			}
		}
		return false;
	}
	
	//Helena
	public void logInEmployee(String username) {
		loggedInEmployee = username;
		//throw new OperationNotAllowedException("Wrong username, try again");
		
	}
	
	//Helena
	public String getLoggedInEmployee() {
		return loggedInEmployee;
	}
	
	//Helena
	public void createProject(String title) {
		Project p = new Project(title);
		projects.add(p);
	}

	//Helena
	public boolean containsProject(Project project) {
		for (Project p: projects) {
			if (p.equals(project)) {
				return true;
			}
		}
		return false;
	}
	

	
	
	
	
}
