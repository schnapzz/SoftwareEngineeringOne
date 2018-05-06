package dtu.Softwarehuset.app;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import dtu.sh.model.Report;
import dtu.sh.model.SH;

public class RequestingAReport {

	private SH softwarehuset;
	private final String title1 = "TestProjectOne";
	private final String title2 = "TestProjectTwo";

	
	@Before
	public void setUp() throws Exception {
		softwarehuset = new SH();
			
		
		softwarehuset.createProject(title1);
		softwarehuset.getProjectFromTitle(title1).setProjectLeader("Mikk");
		softwarehuset.createProject(title2);
		softwarehuset.getProjectFromTitle(title2).setProjectLeader("Olii");
	}

	@After
	public void tearDown() throws Exception {
		softwarehuset = null;
	}

	@Test
	public void projectLeaderRequestsRapport() {
		Report r1 = softwarehuset.requestReport(softwarehuset.getProjectFromTitle(title1), "Mikk");
		Report r2 = softwarehuset.requestReport(softwarehuset.getProjectFromTitle(title2), "Olii");
		
		assertTrue(r1 != null);
		assertTrue(r2 != null);
	}

	@Test
	public void regularEmployeeRequestsRapport() {
		Report r1 = softwarehuset.requestReport(softwarehuset.getProjectFromTitle(title1), "Olii");
		Report r2 = softwarehuset.requestReport(softwarehuset.getProjectFromTitle(title2), "Mikk");
		
		assertTrue(r1 == null);
		assertTrue(r2 == null);
	}
}
