package dtu.Softwarehuset.app;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import dtu.sh.model.SH;

public class CSVWhitebox {

	private SH softwarehuset;
	
	@Before
	public void setUp() throws Exception {
		this.softwarehuset = new SH();
	}

	@After
	public void tearDown() throws Exception {
		
		softwarehuset = null;
	}

	@Test
	public void emptyInput() {
		
		String[] input = new String[0];
		assertTrue(softwarehuset.isEmployeeIdsLegalForAssignments(input));
	}

	@Test
	public void idNotLongEnough() {
		
		String[] input = new String[1];
		input[0] = "as";
		assertFalse(softwarehuset.isEmployeeIdsLegalForAssignments(input));
	}
	
	@Test
	public void idTooLong() {
		
		String[] input = new String[1];
		input[0] = "asasas";
		assertFalse(softwarehuset.isEmployeeIdsLegalForAssignments(input));
	}
	
	@Test
	public void idNotEmployedEmployee() {
		
		String[] input = new String[1];
		input[0] = "Lola";
		assertFalse(softwarehuset.isEmployeeIdsLegalForAssignments(input));
	}
	
	@Test
	public void oneCorrectIdOneIllegal() {
		
		String[] input = new String[2];
		input[0] = "Hela";
		input[1] = "as";
		assertFalse(softwarehuset.isEmployeeIdsLegalForAssignments(input));
	}
	
	@Test
	public void legalAndCorrectFormatOne() {
		
		String[] input = new String[1];
		input[0] = "Hela";
		assertTrue(softwarehuset.isEmployeeIdsLegalForAssignments(input));
	}
	
	@Test
	public void legalAndCorrectFormatTwo() {
		
		String[] input = new String[2];
		input[0] = "Hela";
		input[1] = "SoAm";
		assertTrue(softwarehuset.isEmployeeIdsLegalForAssignments(input));
	}
}
