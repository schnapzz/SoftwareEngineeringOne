package dtu.Softwarehuset.acceptance_tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dtu.sh.model.Project;
import dtu.sh.model.SH;
import cucumber.api.java.en.And;


public class ProjectSteps {
	private String username;
	private SH softwarehuset;
	private Project project;
	
	
	
	public ProjectSteps(SH softwarehuset) {
		this.softwarehuset = softwarehuset;
	}
	
	/*
	 * Steps for the registration of a project
	 * 
	 * done by: Helena
	 */
	
	@Given("^that the employee \"([^\"]*)\" is logged in$")
	public void thatTheEmployeeIsLoggedIn(String username) throws Exception {
	    if (username.equals(softwarehuset.getLoggedInEmployee())) {
	    	this.username = username;
	    }
	}

	@When("^the employee adds the project with title \"([^\"]*)\"$")
	public void theEmployeeAddsTheProjectWithTitle(String title) throws Exception {
	    softwarehuset.createProject(title); 
	    project = new Project(title);
	}

	@Then("^the project with title \"([^\"]*)\" is added to the list of projects$")
	public void theProjectWithTitleIsAddedToTheListOfProjects(String title) throws Exception {
	    assertTrue(softwarehuset.containsProject(title));
	}

	@Given("^that the employee \"([^\"]*)\" is not logged in$")
	public void thatTheEmployeeIsNotLogged(String username) throws Exception {
	    assertFalse(username.equals(softwarehuset.getLoggedInEmployee()));
	}

	@When("^the project with title \"([^\"]*)\" exists$")
	public void theProjectWithTitleExists(String title) throws Exception {
	    assertTrue(softwarehuset.containsProject(title));
	}
	
	@Then("^the project with title \"([^\"]*)\" is not added$")
	public void theProjectWithTitleIsNotAdded(String title) throws Exception {
	    assertFalse(softwarehuset.containsProject(title));
	}

	@Then("^the employee gets the error message \"([^\"]*)\"(\\d+)\\\"([^\"]*)\"$")
	public void theEmployeeGetsTheErrorMessage(String firstString, int name, String string2) throws Exception {
	    //TODO
	}
	
	
	
	/*
	 * Steps for registering a project activity
	 * 
	 * done by: Mikkel
	 * 
	 */
	@Given("^the project leader is logged in \"([^\"]*)\"$")
	public void theProjectLeaderIsLoggedIn(String arg1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	
	@And("^the project has the title \"([^\"]*)\"$")
	public void theProjectHasTheTitle(String arg1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	//    throw new PendingException();
	}
	

	@And("^an activity with title \"([^\"]*)\" is not already registered as an activity in that project$")
	public void anActivityWithTitleIsNotAlreadyRegisteredAsAnActivityInThatProject(String arg1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new PendingException();
	}
	

	@Then("^the activity with specified hours to complete it with title \"([^\"]*)\" within the project of \"([^\"]*)\" is created$")
	public void theActivityWithSpecifiedHoursToCompleteItWithTitleWithinTheProjectOfIsCreated(String arg1, String arg2) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}
	
	
}
