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
	
	//Óli
	public static boolean isValidUsername(String username) {
		if (username.length() == 4) {
			return true;
		} else {
			return false;
		}
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
	public boolean containsProject(String title) {
		for (Project p: projects) {
			if (p.getName().equals(title)) {
				return true;
			}
		}
		return false;
	}
	

	
	
	
	
}
