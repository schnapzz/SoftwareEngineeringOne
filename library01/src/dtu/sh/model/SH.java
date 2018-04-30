package dtu.sh.model;

import java.util.ArrayList;
import java.util.List;

import cucumber.api.java.ga.Nuairnach;
import dtu.sh.Exceptions.OperationNotAllowedException;

public class SH {
	
	private int numberOfProjects = 1;
	
	private Employee loggedInEmployee; 
	private List<Employee> employees = new ArrayList<Employee>() {{
		add(new Employee("abcd"));
		add(new Employee("Mikk"));
		add(new Employee("Hela"));
	}};
	
	private List<Project> projects = new ArrayList<Project>() {{ 
		add(new Project("030901", "Test", "Mikk", employees));
		add(new Project(numberOfProjects, "test2"));
	}};	
	
	public SH() {
		// Exists only to defeat instantiation
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
			loggedInEmployee = getEmployeeWithUsername(username);
		} else {
			throw new OperationNotAllowedException("Wrong username, try again");
		}
	}
	
	// Mikkel
	private Employee getEmployeeWithUsername(String username) {
		for (Employee e : employees) {
			if (e.getID().equals(username)) {
				return e;
			}
		}
		return null;
	}
	
	//Mikkel
	public boolean doesProjectWithIdExist(String projectId) {
		for (Project project : projects) {
			if (project.getId().equalsIgnoreCase(projectId)) {
				return true;
			}
		}
		return false;
	}
	
	//Mikkel + Helena
	public boolean doesProjectWithTitleExist(String title) {
		for (Project project : projects) {
			if (project.getTitle().equals(title)) {
				return true;
			}
		}
		return false;
	}
	
	
	//Helena
	public void createProject(String title) throws OperationNotAllowedException{
		if (!doesProjectWithTitleExist(title)) {
			projects.add(new Project(numberOfProjects, title));
			
			numberOfProjects = numberOfProjects + 1;
		} else {
			throw new OperationNotAllowedException("A project with that name already exists");
		}
	}
	
	//Helena
	public void createProjectWithStartAndEnd(String title, int start, int end) throws OperationNotAllowedException {
		if (isValidWeekNumber(start) && isValidWeekNumber(end)) {
			if (!doesProjectWithTitleExist(title)) {
				projects.add(new Project(numberOfProjects, title, start, end));
				System.out.println(numberOfProjects);
				numberOfProjects = numberOfProjects + 1;
			} else {
				throw new OperationNotAllowedException("A project with that name already exists");
			}
		}
		
	}
	
	//Helena
	private boolean isValidWeekNumber(int start) {
		if ((start >= 1) && (start <= 52)) {
			return true;
		} else {
			return false;
		}
	}

	//Helena
	public void assignProjectLeader(String title, String id) throws OperationNotAllowedException {
		for (Project p: projects) {
			if (p.getTitle().equals(title)) {
				if (!p.hasProjectLeader()) {
					p.setProjectLeader(id);
				} else {
					throw new OperationNotAllowedException("Project already has a leader");
				}
			}
		}
		throw new OperationNotAllowedException();
	}
	
	//Helena
	public Report requestReport(String title, String id) throws OperationNotAllowedException {
		for (Project p: projects) {
			if (p.getTitle().equals(title) && p.getProjectLeader().equals(id)) {
				Report report = p.createReport();
				return report;
			}
		}
		throw new OperationNotAllowedException("You are not the leader of that project");
	}
	
	//Helena
		public int projectsWithTitle(String title) {
			int k = 0;
			for (Project p: projects) {
				if (p.getTitle().equals(title)) {
					k = k + 1;
				}
			}
			return k;
		}
	
	//===GETTERS & SETTERS & CHECKERS
	//Helena
	public Employee getLoggedInEmployee() {
		return loggedInEmployee;
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

	public Project getProjectWithId(String projectId) {
		for (Project p : projects) {
			if (p.getId().equalsIgnoreCase(projectId)) 
				return p;
		}
		return null;
	}


	public boolean hasProjectLeader(String title) {
		for (Project p: projects) {
			if (p.getTitle().equals(title)) {
				return p.hasProjectLeader();
			}
		}
		return false;
	}

	public String getProjectLeader(String title) {
		for (Project p: projects) {
			if (p.getTitle().equals(title)) {
				return p.getProjectLeader();
			}
		}
		return "";
	}
	
	public Project getProjectFromTitle(String title) {
		Project pt = new Project(numberOfProjects, "placeholder");
		for (Project p: projects) {
			if (p.getTitle().equals(title)) {
				pt = p;
			}
		}
		return pt;
		
	}
}
