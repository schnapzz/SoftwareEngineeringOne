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
	 * Steps for registration of a project
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
	public void theProjectWithTitleIsAddedToTheListOfProjects(String arg1) throws Exception {
	    assertTrue(softwarehuset.containsProject(project));
	}

	@Given("^that the employee \"([^\"]*)\" is not logged$")
	public void thatTheEmployeeIsNotLogged(String arg1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@When("^the project with title \"([^\"]*)\" exists$")
	public void theProjectWithTitleExists(String arg1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@Then("^the employee gets the error message \"([^\"]*)\"(\\d+)\\\"([^\"]*)\"$")
	public void theEmployeeGetsTheErrorMessage(String arg1, int arg2, String arg3) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}
	
	/*
	 * Steps for registering a project activity
	 * 
	 * done by: Mikkel
	 * 
	 */
	// Mikkel Müller-Hansen
	@Given("^the project leader is logged in \"([^\"]*)\"$")
	public void theProjectLeaderIsLoggedIn(String arg1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	// Mikkel Müller-Hansen
	@And("^the project has the title \"([^\"]*)\"$")
	public void theProjectHasTheTitle(String arg1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	//    throw new PendingException();
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
