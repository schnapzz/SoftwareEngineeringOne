package dtu.sh.model;

import java.util.List;
import java.util.Date;

import dtu.sh.Exceptions.IllegalWeekNumberFormatException;
import dtu.sh.Exceptions.OperationNotAllowedException;

// Sofie-Amalie
public class GeneralActivity extends Activity {

	public List<GeneralActivity> generalActivity;

	public GeneralActivity(String title, String description, int start, int end) {
		super(title, description, start, end);
	}

	public GeneralActivity(String title) {
		super(title);
	}

	public boolean addStartAndEndDate(int start, int end) throws OperationNotAllowedException {
		if ((start <= 52) && (start >= 1) && (end <= 52) && (end >= 1)) {
			setStartDate(start);
			setEndDate(end);
			return true;
		} else {
			return false;
		}
	}

}
