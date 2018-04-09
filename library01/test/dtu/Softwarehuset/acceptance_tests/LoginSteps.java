package dtu.Softwarehuset.acceptance_tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dtu.sh.model.SH;

public class LoginSteps {
	private String username;
	
	@Given("^that the employee have a four letter username \"([^\"]*)\"$")
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
	    SH.loginEmployee(username);
	}
	
}
