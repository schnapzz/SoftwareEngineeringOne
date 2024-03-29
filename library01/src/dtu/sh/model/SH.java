package dtu.sh.model;

import java.util.ArrayList;
import java.util.List;

import cucumber.api.java.ga.Nuairnach;
import dtu.sh.Exceptions.OperationNotAllowedException;

public class SH {
	
	private int numberOfProjects = 4;
	
	private Employee loggedInEmployee; 
	private List<Employee> employees = new ArrayList<Employee>() {{
		add(new Employee("Mikk"));
		add(new Employee("Hela"));
		add(new Employee("SoAm"));
		add(new Employee("OliG"));
		add(new Employee("abcd"));
		add(new Employee("efgh"));
		add(new Employee("John"));
		add(new Employee("Poul"));
		add(new Employee("Bear"));
		add(new Employee("Kimm"));
		add(new Employee("Duck"));
	}};
	
	
	private List<Project> projects = new ArrayList<Project>() {{ 
		add(new Project("030901", "Test", "Mikk", employees));
		add(new Project(2, "Test3", 5, 10));
		add(new Project(3, "test2"));
	}};	

	//Helena
	public Boolean isEmployed(String username) {
		
		assert username != null;
		
		for (Employee e : employees) {
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
			loggedInEmployee = getEmployeeWithId(username);
			} else {
			throw new OperationNotAllowedException("Wrong username, try again");
		}
	}
	
	//Helena
	public Employee getEmployeeWithId(String username) {
		Employee emp = null;
		for (Employee e : employees) {
			if (e.getID().equals(username)) {
				emp = e;
				break;
			}
		}
		return emp;
	}
	
	//Mikkel
	public boolean doesProjectWithIdExist(String projectId) {
		
		boolean projectExists = false;
		for (Project project : projects) {
			if (project.getId().equalsIgnoreCase(projectId)) {
				projectExists = true;
				break;
			}
		}
		return projectExists;
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
				numberOfProjects = numberOfProjects + 1;
			} else {
				throw new OperationNotAllowedException("A project with that name already exists");
			}
		}
		
	}
	
	//Helena
	public boolean isValidWeekNumber(int start) {
		
		assert true;
		
		boolean isValid = false;
		if ((start >= 1) && (start <= 52)) {
			isValid = true;
		}
		
		return isValid;
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
	public Report requestReport(Project project, String id) {
		
		assert project != null && id != null && projects != null && id.length() == 4;
		
		Report repport = null;
		for (Project p: projects) {
			if (p.getTitle().equals(project.getTitle()) && p.getProjectLeader().equals(id)) {
				repport = p.createReport();
				break;
			}
		}
		
		return repport;
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
	
	//Helena
	public Employee getLoggedInEmployee() {
		return loggedInEmployee;
	}

	// Mikkel
	public Project getProjectWithId(String projectId) {
		for (Project p : projects) {
			if (p.getId().equalsIgnoreCase(projectId)) 
				return p;
		}
		return null;
	}

	// Mikkel
	public boolean hasProjectLeader(String title) {
		for (Project p: projects) {
			if (p.getTitle().equals(title)) {
				return p.hasProjectLeader();
			}
		}
		return false;
	}
	
	// Mikkel
	public boolean isEmployeeIdsLegalForAssignments(String[] employeeIds) {
		assert employeeIds != null && this.employees.size() > 0;
		for (String employeeId : employeeIds) {	
			if (isIllegalIdFormat(employeeId) || !isEmployed(employeeId)) {
				return false;
			}
		}
		return true;
	}
	
	// Mikkel
	private boolean isIllegalIdFormat(String employeeId) {
		assert employeeId != null;
		return employeeId.length() != 4;
	}
	
	//Helena
	public String getProjectLeader(String title) {
		for (Project p: projects) {
			if (p.getTitle().equals(title)) {
				return p.getProjectLeader();
			}
		}
		return "";
	}
	
	//Helena
	public Project getProjectFromTitle(String title) {
		Project pt = null;
		for (Project p: projects) {
			if (p.getTitle().equals(title)) {
				pt = p;
			}
		}
		return pt;
		
	}

	//Helena
	public List<Project> getProjects() {
		return projects;
	}
	
	//Mikkel
	public List<Employee> getEmployeesFromIds(String[] employeeIds) {
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		for (String employeeId : employeeIds) {
			Employee emp = getEmployeeWithId(employeeId);
			list.add(emp);
		}
		return list;
	}
	

}
