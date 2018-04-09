package dtu.Softwarehuset.acceptance_tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dtu.sh.model.OperationNotAllowedException;
import dtu.sh.model.SH;

/*
 * Steps-case for an employee to log in
 * 
 * Done by: Helena Schiøtz
 */

public class LoginSteps {
	private String username;
	
	@Given("^that the employee has a four letter username \"([^\"]*)\"$")
	public void thatTheEmployeeHaveAFourLetterUsername(String username) throws Exception {
		if (username.length() == 4) {
			this.username = username;
		}
	}

	@Given("^the employee is in the list of employees$")
	public void theEmployeeIsInTheListOfEmployees() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    assertTrue(SH.isEmployeed(username));
	}

	@Then("^the employee is logged in$")
	public void theEmployeeIsLoggedIn() throws Exception {
	    SH.logInEmployee(username);
	}
	
	@Given("^the employee is not in the list of employees$")
	public void theEmployeeIsNotInTheListOfEmployees() throws Exception {
	    assertFalse(SH.isEmployeed(username));
	}

	@Then("^the employee can not log in$")
	public void theEmployeeCanNotLogIn() throws Exception {
	    assertTrue(username != SH.getLoggedInEmployee());
	}
	
	@Then("^the employee gets the error message \"([^\"]*)\"$")
	public void theEmployeeGetsTheErrorMessage(String errormessage) throws OperationNotAllowedException {
	}
	
}
