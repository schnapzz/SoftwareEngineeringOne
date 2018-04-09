package dtu.Softwarehuset.acceptance_tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dtu.sh.model.SH;
import cucumber.api.java.en.And;

// Mikkel Muller-Hansen
public class ProjectSteps {
	
	private SH softwareHuset;
	
	public ProjectSteps(SH softwareHuset) {
		this.softwareHuset = softwareHuset;
	}

	// Mikkel Müller-Hansen
	// The wording was changed from the orginial to be more meaningfull and generic
	@Given("^the project leader is logged in \"([^\"]*)\"$")
	public void theProjectLeaderIsLoggedIn(String leaderId) throws Exception {
	    
		softwareHuset.loginEmployee(leaderId);
	}

	// Mikkel Müller-Hansen
	// The wording was changed from the orginial to be more meaningfull and generic
	@And("^there is a project with id \"([^\"]*)\"$")
	public void thereIsAProjectWithId(String projectId) throws Exception {
	    
		assertTrue(softwareHuset.doesProjectWithIdExist(projectId));
	}
	
	// Mikkel Müller-Hansen
	@And("^an activity with title \"([^\"]*)\" is not already registered as an activity in that project$")
	public void anActivityWithTitleIsNotAlreadyRegisteredAsAnActivityInThatProject(String arg1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new PendingException();
	}
	
	// Mikkel Müller-Hansen
	@Then("^the activity with specified hours to complete it with title \"([^\"]*)\" within the project of \"([^\"]*)\" is created$")
	public void theActivityWithSpecifiedHoursToCompleteItWithTitleWithinTheProjectOfIsCreated(String arg1, String arg2) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}
	
	
}
