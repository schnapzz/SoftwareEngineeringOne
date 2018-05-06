package dtu.Softwarehuset.app;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import dtu.sh.model.SH;

/**
 * 
 * @author mikkelmuller-hansen
 *
 */
public class ValidityOfWeekNumbers {

	private SH softwarehuset;
	
	@Before
	public void setUp() throws Exception {
		softwarehuset = new SH();
	}

	@After
	public void tearDown() throws Exception {
		softwarehuset = null;
	}

	@Test
	public void validWeekNumberMin() {
		
		assertTrue(softwarehuset.isValidWeekNumber(1));
	}

	@Test
	public void validWeekNumberMax() {
		
		assertTrue(softwarehuset.isValidWeekNumber(52));
	}
	
	@Test
	public void invalidZerothWeek() {
		
		assertFalse(softwarehuset.isValidWeekNumber(0));
	}
	
	@Test
	public void invalidNegativeWeek() {
		
		assertFalse(softwarehuset.isValidWeekNumber(-1));
	}
	
	@Test
	public void invalidFiftythirdWeek() {
		
		assertFalse(softwarehuset.isValidWeekNumber(53));
	}
}
