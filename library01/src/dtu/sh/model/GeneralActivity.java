package dtu.sh.model;

import java.util.Date;
import java.util.List;

// Mikkel
public class GeneralActivity extends Activity {

	public List<GeneralActivity> generalActivity;
	
	public GeneralActivity(String title, String description, Date start, Date end) {
		super(title, description, start, end);
		
	}
	
	public GeneralActivity(String title) {
		// TODO Auto-generated constructor stub
		super(title);
	}

	public String getTitle(String title) {
		return title;
	}

}
