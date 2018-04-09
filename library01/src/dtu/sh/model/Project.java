package dtu.sh.model;

import java.util.ArrayList;
import java.util.List;

public class Project {

	private String id;
	private String name;
	private String leaderId;
	private List<Employee> employees;
	private List<Activity> unfinishedActivities = new ArrayList<Activity>();
	
	//Mikkel
	public Project(String pId, String pName, String plId, List<Employee> eList) {
		
		this.id = pId;
		this.name = pName;
		this.leaderId = plId;
		this.employees = eList;
	}
	
	//Helena
	public Project(String title) {
		name = title;
	}
	
	//Mikkel
	public void createActivity() {
		
	}
	
<<<<<<< HEAD
	//Helena
	public Object getName() {
		return null;
	}
	
=======
	// ===== GETTERS AND SETTERS =====
>>>>>>> 42364d22500c22e7b925a9a7f6fab75e7904a876
	
	public String getId() {
		return id;
	}
}
