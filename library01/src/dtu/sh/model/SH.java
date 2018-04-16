package dtu.sh.model;

import java.util.ArrayList;
import java.util.List;

import dtu.library.Exceptions.OperationNotAllowedException;

public class SH {
	
	private String loggedInEmployee = "Mikk";
	private List<Employee> employees = new ArrayList<Employee>() {{
		add(new Employee("abcd"));
		add(new Employee("Mikk"));
	}};
	private List<Project> projects = new ArrayList<Project>() {{ 
		add(new Project("030901", "test", "Mikk", employees));
		add(new Project("test2"));
	}};	
	
	public SH() {
		Employee e1 = new Employee("abcd");
		Employee e2 = new Employee("Mikk");
		List<Employee> emp = new ArrayList<Employee>();
		emp.add(e1);
		emp.add(e2);
		employees.add(e1);
		employees.add(e2);
		
//		Project p1 = new Project("030901", "test2", "Mikk", emp); 
//		projects = new ArrayList<Project>();
//		projects.add(p1);
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
	public boolean doesProjectWithTitleExist(String title) {
		for (Project project : projects) {
			if (project.getTitle().equals(title)) {
				return true;
			}
		}
		return false;
	}
	
	
	
	//Helena
	public void createProject(String title, String username) throws OperationNotAllowedException{
		if ((!doesProjectWithTitleExist(title) && (projectsWithTitle(title) == 0)) && loggedInEmployee.equals(username)) {
			Project p = new Project(title);
			projects.add(p);
		} else if(!loggedInEmployee.equals(username)) {
			throw new OperationNotAllowedException("Employee login required");
		} else if(projectsWithTitle(title) == 1) {
			throw new OperationNotAllowedException("A project with that name already exists");
		} else {
			throw new OperationNotAllowedException();
		}
	}
	
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
	public String getLoggedInEmployee() {
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
			if (p.getId() == projectId) 
				return p;
		}
		return null;
	}

	public String getProjectLeaderFromId(String title) {
		return getProjectWithId(title).getProjectLeader();
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

	
}
