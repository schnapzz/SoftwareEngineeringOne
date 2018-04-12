package dtu.sh.model;

import java.util.ArrayList;
import java.util.List;

import dtu.library.Exceptions.OperationNotAllowedException;

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
		employees.add(e1);
		employees.add(e2);
		
		Project p1 = new Project("030901", "test", "Mikk", emp); 
		projects = new ArrayList<Project>();
		projects.add(p1);
	}

	//Helena
	public Boolean isEmployed(String username) {
		for (Employee e: employees) {
			if (e.getID().equals(username)) {
				return true;
			}
		}
		return false;
	}
	
	//Oli
	public boolean isValidUsername(String username) {
		if (username.length() == 4) {
			return true;
		} else {
			return false;
		}
	}

	//Helena
	public void logInEmployee(String username) throws OperationNotAllowedException {
		if (isValidUsername(username) && isEmployed(username)) {
			loggedInEmployee = username;
		} else {
			throw new OperationNotAllowedException("Wrong username, try again");
		}
	}
	
	//Mikkel
	public boolean doesProjectWithIdExist(String projectId) {
		for (Project project : projects) {
			if (project.getId() == projectId) {
				return true;
			}
		}
		return false;
	}
	
	//Mikkel + Helena
	public boolean doesProjectWithTitleExist(String projectId) {
		for (Project project : projects) {
			if (project.getTitle() == projectId) {
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
	public void createProject(String title) throws OperationNotAllowedException{
		if (!doesProjectWithIdExist(title)) {
			Project p = new Project(title);
			projects.add(p);
		} else {
			throw new OperationNotAllowedException("Project with the name " + title + " already exists");
		}
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
