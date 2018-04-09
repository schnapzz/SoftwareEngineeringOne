package dtu.sh.model;

import java.util.ArrayList;
import java.util.List;

public class SH {
	private static String loggedInEmployee;
	private static List<Employee> employees = new ArrayList<>();
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

	public static Boolean isEmployeed(String username) {
		Boolean isEmployed = false;
		for (Employee e: employees) {
			if (e.getID().equals(username)) {
				isEmployed = true;
			}
		}
		return isEmployed;
	}

	public static void loginEmployee(String username) {
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
	
	
	
	
	
	
	
}
