package dtu.sh.model;
import java.util.List;
import java.util.Date;
import dtu.sh.Exceptions.OperationNotAllowedException;


// Sofie-Amalie
public class GeneralActivity extends Activity {
	private int startDate = 0;
	private int endDate = 0;

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
//
//	public int getStartDate() {
//		// TODO Auto-generated method stub
//		return startDate;
//	}
//
//	public int getEndDate() {
//		// TODO Auto-generated method stub
//		return endDate;
//	}

}
