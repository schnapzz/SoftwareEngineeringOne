package dtu.Softwarehuset.acceptance_tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dtu.library.Exceptions.OperationNotAllowedException;
import dtu.sh.model.SH;

/*
 * Steps-case for an employee logging in
 * 
 * Done by: Helena
 */

public class LoginSteps {
	private String username;
	private SH softwarehuset;
	private ErrorMessageHolder errorMessageHolder;
	
	public LoginSteps(SH softwarehuset, ErrorMessageHolder errorMessageHolder) {
		this.softwarehuset = softwarehuset;
		this.errorMessageHolder = errorMessageHolder;		
	}
	
	@Given("^that the employee has a four letter username \"([^\"]*)\"$")
	public void thatTheEmployeeHaveAFourLetterUsername(String username) throws Exception {
		assertTrue(softwarehuset.isValidUsername(username));
		this.username = username;
	}
	
	@When("^the employee logs in$")
	public void theEmployeeLogsIn() throws Exception {
	    try {
	    	softwarehuset.logInEmployee(username);
		} catch (OperationNotAllowedException e) {
			errorMessageHolder.setErrorMessage(e.getMessage());
		}
	}

	@Given("^the employee is in the list of employees$")
	public void theEmployeeIsInTheListOfEmployees() throws Exception {
	    assertTrue(softwarehuset.isEmployed(username));
	}

	@Then("^the employee is logged in$")
	public void theEmployeeIsLoggedIn() throws Exception {
		assertTrue(username.equals(softwarehuset.getLoggedInEmployee()));
	}
	
	@Given("^the employee is not in the list of employees$")
	public void theEmployeeIsNotInTheListOfEmployees() throws Exception {
	    assertFalse(softwarehuset.isEmployed(username));
	}

	@Then("^the employee can not log in$")
	public void theEmployeeCanNotLogIn() throws Exception {
	    assertTrue(!username.equals(softwarehuset.getLoggedInEmployee()));
	}
	
	@Then("^the employee gets the error message \"([^\"]*)\"$")
	public void theEmployeeGetsTheErrorMessage(String errorMessage) throws OperationNotAllowedException {
		assertEquals(errorMessage, this.errorMessageHolder.getErrorMessage());
	}
	
}
