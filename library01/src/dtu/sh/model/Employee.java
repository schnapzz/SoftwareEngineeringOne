package dtu.sh.model;

import java.util.List;

import com.sun.javafx.image.impl.General;

import cucumber.api.java.it.Date;
import dtu.sh.Exceptions.OperationNotAllowedException;

import java.util.ArrayList;

public class Employee {
	private String id;
	private List<GeneralActivity> generalActivities = new ArrayList<GeneralActivity>(){{ 
		add(new GeneralActivity("sick", "test description", 5, 10));
		add(new GeneralActivity("Holiday", "test with holliday", 42, 44));
	}};
	
	
	public Employee(String id) {
		this.id = id;
	}

	public String getID() {
		return id;
	}

	public void addGeneralActivity(String titleGeneralActivity) throws OperationNotAllowedException {
		if (!hasGeneralActivity(titleGeneralActivity)) {
			generalActivities.add(new GeneralActivity(titleGeneralActivity));
		} 

	}

	private boolean hasGeneralActivity(String titleGeneralActivity) {
		for (GeneralActivity g : generalActivities) {
			if (g.getTitle().equals(titleGeneralActivity)) {
				return true;
			}
		}
		return false;
	}

	public GeneralActivity getActivity(String titleGeneralActivity) {
		GeneralActivity a = null;
		for (GeneralActivity g : generalActivities) {
			if (g.getTitle().equals(titleGeneralActivity)) {
				a = g;
			}
		}
		return a;
	}
	

	public boolean doesGeneralActivityExist(String titleGeneralActivity) {
		for (GeneralActivity generalActivity : generalActivities) {
			if (generalActivity.getTitle().equals(titleGeneralActivity)) {
				return true;
			}
		}
		return false;
	}

	public void addExistingGeneralActivity(String titleGeneralActivity) throws OperationNotAllowedException {
		if (hasGeneralActivity(titleGeneralActivity)) {
			generalActivities.add(new GeneralActivity(titleGeneralActivity));
		}
	}

	public List<GeneralActivity> getGeneralActivities() {
		return generalActivities;
	}

	public void addGeneralActivity(GeneralActivity gifflar) {
		generalActivities.add(gifflar);
	}
}



















