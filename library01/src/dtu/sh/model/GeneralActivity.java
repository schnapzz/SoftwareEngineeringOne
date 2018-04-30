package dtu.sh.model;

import java.util.Date;
import java.util.List;

import dtu.library.Exceptions.OperationNotAllowedException;

// Sofie-Amalie
public class GeneralActivity extends Activity {
	private int startDate;
	private int endDate;

	public List<GeneralActivity> generalActivity;
	
	public GeneralActivity(String title, String description, int start, int end) {
		super(title, description, start, end);
	}
	
	public GeneralActivity(String title) {
		super(title);
	}

	public void addStartAndEndDate(int start, int end) throws OperationNotAllowedException {
		if( (start < 52) && start > 1 && (end < 52) && (end > 1)) {
			this.startDate = start;
			this.endDate = end;
		}
	}


}
