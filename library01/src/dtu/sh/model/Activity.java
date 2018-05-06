package dtu.sh.model;

// Mikkel
public abstract class Activity {

	// Mikkel
	private String title = "";
	private String description;
	
	private int startDate;
	private int endDate;
	
	// Mikkel
	public Activity(String title, String description) {
		this.title = title;
		this.description = description;
	}
	
	// Mikkel
	public Activity(String title, String description, int start, int end) 
	{
		this.title = title;
		this.description = description;
		this.startDate = start;
		this.endDate = end;
	}

	
	public Activity(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}
	
	public String getDescription() {
		return description;
	}
	
	public int getStartDate() {
		return startDate;
	}
	
	public int getEndDate() {
		return endDate;
	}
	
}
