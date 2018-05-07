package dtu.Softwarehuset.app;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import dtu.sh.model.Employee;
import dtu.sh.model.Project;

/**
 * 
 * @author mikkelmuller-hansen
 *
 */
public class ActivityExistsWithTitleTest {

	private Project project;
	private final String titleOne = "TestActivityOne";
	private final String titleTwo = "TestActivityTwo";
	private final String titleThree = "TestActivityThree";
	
	@Before
	public void setUp() throws Exception {
		Employee emp1 = new Employee("Mikk");
		Employee emp2 = new Employee("Hela");
		Employee emp3 = new Employee("SoAm");
		Employee emp4 = new Employee("Olii");
		
		List<Employee> empList = new ArrayList<Employee>() {{ add(emp1); add(emp2); add(emp3); add(emp4); }};
		
		project = new Project("000001", "TestProject", "Mikk", empList);
		
		project.addActivity(titleOne, "This is a testing activity", 1, emp1);
		project.addActivity(titleTwo, "This is a testing activity", 2, emp1);
	}

	@After
	public void tearDown() throws Exception {
		project = null;
	}

	@Test
	public void activityIsContainedInTheProject() {
		
		assertTrue(project.activityExistsWithTitle(titleOne));
		assertTrue(project.activityExistsWithTitle(titleTwo));
	}

	@Test
	public void activityIsNotContainedInTheProject() {
		
		assertFalse(project.activityExistsWithTitle(titleThree));
	}
	
	@Test
	public void emptyInput() {
		
		assertFalse(project.activityExistsWithTitle(""));
	}
}
