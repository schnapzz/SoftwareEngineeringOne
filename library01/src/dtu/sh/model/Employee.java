package dtu.sh.model;
import java.util.List;

import dtu.library.Exceptions.OperationNotAllowedException;

import java.util.ArrayList;

public class Employee {
	private String id;
	private List<GeneralActivity> generalActivities = new ArrayList<GeneralActivity>();
	
	public Employee(String id) {
		this.id = id;
	}

	public String getID() {
		return id;
	}

	public void addGeneralActivity(String titleGeneralActivity) throws OperationNotAllowedException {
		if (!hasGeneralActivity(titleGeneralActivity)) {
			generalActivities.add(new GeneralActivity(titleGeneralActivity));
		} else {
			throw new OperationNotAllowedException();
		}
		
	}

	private boolean hasGeneralActivity(String titleGeneralActivity) {
		for (GeneralActivity g: generalActivities) {
			if (g.getTitle().equals(titleGeneralActivity)) {
				return true;
			}
		}
		return false;
	}

}
