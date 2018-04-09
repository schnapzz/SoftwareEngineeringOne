package dtu.sh.model;

import java.util.ArrayList;
import java.util.List;

public class SH {
	private String loggedInEmployee;
	private List<Employee> employees = new ArrayList<>();

	private List<Project> projects;
	
	public SH() {
		Employee e1 = new Employee("abcd");
		Employee e2 = new Employee("Mikk");
		List<Employee> emp = new ArrayList<Employee>();
		emp.add(e1);
		emp.add(e2);
		
		Project p1 = new Project("030901", "test", "abcd", emp); 
		projects = new ArrayList<Project>();
		projects.add(p1);
	}

	//Helena
	public Boolean isEmployeed(String username) {
		for (Employee e: employees) {
			if (e.getID().equals(username)) {
				return true;
			}
		}
		return false;
		//throw new OperationNotAllowedException("Wrong username, try again");
	}
	
	public boolean isValidUsername(String username) {
		if (username.length() == 4) {
			return true;
		}
		else return false;
	}

	public void logInEmployee(String username) {
		loggedInEmployee = username;
		
	}

	public boolean doesProjectWithIdExist(String projectId) {
		
		for (Project project : projects) {
			if (project.getId() == projectId) {
				return true;
			}
		}
		return false;
	}
	
	public String getLoggedInEmployee() {
		return loggedInEmployee;
	}
	
	
	
	
	
}
