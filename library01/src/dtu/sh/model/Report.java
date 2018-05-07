package dtu.sh.model;

import java.util.ArrayList;
import java.util.List;

/*
 * Helena
 */

public class Report {
	
	private List<ProjectActivity> finishedActivities;
	private List<ProjectActivity> unfinishedActivities;
	
	public Report(List<ProjectActivity> finishedActivities, List<ProjectActivity> unfinishedActivities) {
		this.unfinishedActivities = unfinishedActivities;
		this.finishedActivities = finishedActivities;
	}

	
	// ===== GETTERS AND SETTERS =====
	
	public List<ProjectActivity> getFinishedActivities() {
		return finishedActivities;
	}
	
	public List<ProjectActivity> getUnFinishedActivities() {
		return unfinishedActivities;
	}
	
	
}
