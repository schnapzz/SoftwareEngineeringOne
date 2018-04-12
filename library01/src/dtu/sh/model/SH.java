package dtu.sh.model;

import java.util.ArrayList;
import java.util.List;

public class SH {
	
	private String loggedInEmployee;
	private List<Employee> employees = new ArrayList<>();
	private List<Project> projects = new ArrayList<Project>();;
	
	public SH() {
		
		Employee e1 = new Employee("abcd");
		Employee e2 = new Employee("Mikk");
		List<Employee> emp = new ArrayList<Employee>();
		emp.add(e1);
		emp.add(e2);
		
		Project p1 = new Project("030901", "test", "abcd", emp); 
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
	}
	
	//�li
	public boolean isValidUsername(String username) {
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

	public boolean doesProjectWithIdExist(String projectId) {
		for (Project project : projects) {
			if (project.getId() == projectId) {
				return true;
			}
		}
		return false;
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

	public Project getProjectWithId(String projectId) {
		
		for (Project p : projects) {
			if (p.getId() == projectId) 
				return p;
		}
		return null;
	}
	

	
	
	
	
}
