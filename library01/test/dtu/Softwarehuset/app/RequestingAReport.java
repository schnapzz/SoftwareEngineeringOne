package dtu.Softwarehuset.app;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import dtu.sh.model.Employee;
import dtu.sh.model.Project;

public class RequestingAReport {

	private Project p1;
	private Project p2;
	
	@Before
	public void setUp() throws Exception {
		p1 = new Project("SomeId", "SomeTitle", "Mikk", new ArrayList<Employee>() {{ add(new Employee("Mikk")); }} );
		p2 = new Project("SomeId2", "SomeTitle2", "Olii", new ArrayList<Employee>() {{ add(new Employee("Olii")); }} );
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void projectLeaderRequestsRapport() {
		p1.createReport();
	}

}
