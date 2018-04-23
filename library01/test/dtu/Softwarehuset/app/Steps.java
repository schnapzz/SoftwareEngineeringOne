package dtu.Softwarehuset.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.equalTo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.it.Date;
import dtu.sh.model.Activity;
import dtu.sh.model.Employee;
import dtu.library.Exceptions.OperationNotAllowedException;
import dtu.Softwarehuset.acceptance_tests.ErrorMessageHolder;
import dtu.sh.model.Project;
import dtu.sh.model.ProjectActivity;
import dtu.sh.model.Report;
import dtu.sh.model.SH;
import cucumber.api.java.en.And;


public class Steps {

	private String username;
	private SH softwarehuset;
	private Project project;
//	private Employee loggedInEmployee;
	private Report report;
	private ErrorMessageHolder errorMessageHolder;
	private String titleActivity;
	
		
	public Steps(SH softwarehuset, ErrorMessageHolder errorMessageHolder) {
		this.errorMessageHolder = errorMessageHolder;
		this.softwarehuset = softwarehuset;
	}
	
	/*
	 * Steps for login in as an employee
	 * 
	 * done by: Helena
	 */
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
		assertTrue(username.equals(softwarehuset.getLoggedInEmployee().getID()));
	}
	
	@Given("^the employee is not in the list of employees$")
	public void theEmployeeIsNotInTheListOfEmployees() throws Exception {
	    assertFalse(softwarehuset.isEmployed(username));
	}

	@Then("^the employee can not log in$")
	public void theEmployeeCanNotLogIn() throws Exception {
	    assertFalse(username.equals(""));
	}
	
	@Then("^the employee gets the error message \"([^\"]*)\"$")
	public void theEmployeeGetsTheErrorMessage(String errorMessage) throws OperationNotAllowedException {
		assertEquals(errorMessage, this.errorMessageHolder.getErrorMessage());
	}
	
	
	/*
	 * Steps for the registration of a project
	 * 
	 * done by: Helena
	 */
	
	@Given("^that the employee \"([^\"]*)\" is logged in$")
	public void thatTheEmployeeIsLoggedIn(String username) throws Exception {
		softwarehuset.logInEmployee(username);
		// Assertions shouldn't be used in a given statement following cucumber guidelines
	    assertTrue(softwarehuset.getLoggedInEmployee().getID().equals(username));
	    this.username = username;
	}

	@When("^the employee adds the project with title \"([^\"]*)\"$")
	public void theEmployeeAddsTheProjectWithTitle(String title) throws Exception {
		try {
			softwarehuset.createProject(title);
		} catch (OperationNotAllowedException e) {
			errorMessageHolder.setErrorMessage(e.getMessage());
		}
	}

	@Then("^the project with title \"([^\"]*)\" is added to the list of projects$")
	public void theProjectWithTitleIsAddedToTheListOfProjects(String title) throws Exception {
	    assertTrue(softwarehuset.doesProjectWithTitleExist(title));
	}

	@Given("^that the employee \"([^\"]*)\" is not logged in$")
	public void thatTheEmployeeIsNotLogged(String username) throws Exception {
	    assertTrue(softwarehuset.getLoggedInEmployee().getID().equals(""));
	    this.username = username;
	}	

	@When("^the project with title \"([^\"]*)\" exists$")
	public void theProjectWithTitleExists(String title) throws Exception {
	    assertTrue(softwarehuset.doesProjectWithTitleExist(title));
	}
	
	@Then("^the project with the duplicate title \"([^\"]*)\" is not added$")
	public void theProjectWithTheDuplicateTitleIsNotAdded(String title) throws Exception {
		assertTrue(Integer.toString(softwarehuset.projectsWithTitle(title)).equals("1"));
	}
	
	
	/*
	 * Steps for adding a project leader
	 * 
	 * done by: Helena
	 */
	
	@Given("^that the project \"([^\"]*)\" has no project leader$")
	public void thatTheProjectHasNoProjectLeader(String title) throws Exception {
	    assertFalse(softwarehuset.hasProjectLeader(title));
	}

	@When("^a leader is assigned to the project \"([^\"]*)\" with the id \"([^\"]*)\"$")
	public void aLeaderIsAssignedToTheProjectWithTheId(String title, String id) throws Exception {
		try {
			softwarehuset.assignProjectLeader(title, id);
		} catch (OperationNotAllowedException e) {
			errorMessageHolder.setErrorMessage(e.getMessage());
		}
	}

	@Then("^the project \"([^\"]*)\" is assigned the leader \"([^\"]*)\"$")
	public void theProjectIsAssignedTheLeader(String title, String id) throws Exception {
	    assertTrue(softwarehuset.getProjectLeader(title).equals(id));
	}

	@Given("^the project \"([^\"]*)\" has a leader$")
	public void theProjectHasALeader(String title) throws Exception {
		assertTrue(softwarehuset.hasProjectLeader(title));
	}

	@Then("^the employee \"([^\"]*)\" is not the leader of \"([^\"]*)\"$")
	public void theEmployeeIsNotAssignedAsTheLeaderOf(String id, String title) throws Exception {
		assertFalse(softwarehuset.getProjectLeader(title).equals(id));
	}

	
	/*
	 * Steps for getting a report of a project
	 * 
	 * done by: Helena
	 */
	@Given("^that the logged in employee \"([^\"]*)\" is the project leader of \"([^\"]*)\"$")
	public void thatTheLoggedInEmployeeIsTheProjectLeaderOf(String id, String title) throws Exception {
		softwarehuset.logInEmployee(id);
	    assertThat(id,is(equalTo(softwarehuset.getLoggedInEmployee().getID())));
	    assertThat(id,is(equalTo(softwarehuset.getProjectLeader(title))));
	    username = id;
	}

	@When("^the project leader \"([^\"]*)\" requests a journal from the project \"([^\"]*)\"$")
	public void theProjectLeaderRequestsAJournalFromTheProject(String id, String title) throws Exception {
		try {
			report = softwarehuset.requestReport(title, id);
		} catch (OperationNotAllowedException e) {
			errorMessageHolder.setErrorMessage(e.getMessage());
		}
	}

	@Then("^the journal is returned$")
	public void theJournalIsReturned() throws Exception {
		//TODO
	}
	
	
	
	/*
	 * Steps for registering a project activity
	 * 
	 * done by: Mikkel
	 * 
	 */

	@Given("^the project leader \"([^\"]*)\" is logged in$")
	public void theProjectLeaderIsLoggedIn(String leaderId) throws Exception {
		System.out.println(leaderId);
		softwarehuset.logInEmployee(leaderId);
	}	
	
	// The wording was changed from the orginial to be more meaningfull and generic
	@And("^there is a project with id \"([^\"]*)\"$")
	public void thereIsAProjectWithId(String projectId) throws Exception {
		
		assertTrue(softwarehuset.doesProjectWithIdExist(projectId));
		project = softwarehuset.getProjectWithId(projectId);
	}
	
	@And("^an activity with title \"([^\"]*)\" is not already registered as an activity in that project$")
	public void anActivityWithTitleIsNotAlreadyRegisteredAsAnActivityInThatProject(String activityTitle) throws Exception {
	    
		assertFalse(project.activityExistsWithTitle(activityTitle));
	}
	
	@Then("^I create an activity with description \"([^\"]*)\" to the project$")
	public void iCreateAnActivityWithDescriptionToTheProject(String activityTitle) throws Exception {
	    
		int testLength = project.getUnfinishedActivities().size();
		ProjectActivity activity = new ProjectActivity(activityTitle, "This is a test description", 1);
		project.addActivity(activity, softwarehuset.getLoggedInEmployee());
		assertTrue(testLength+1 == project.getUnfinishedActivities().size());
	}

	@Given("^an activity with title \"([^\"]*)\" is already an activity in the project with id \"([^\"]*)\"$")
	public void anActivityWithTitleIsAlreadyAnActivityInTheProjectWithId(String activityTitle, String projectId) throws Exception {
		
		assertTrue(softwarehuset.doesProjectWithIdExist(projectId));
		assertTrue(project.activityExistsWithTitle(activityTitle));
	}

	@Then("^the activity with title \"([^\"]*)\" is not created$")
	public void theActivityWithTitleIsNotCreated(String activityTitle) throws Exception {
		ProjectActivity activity = new ProjectActivity(activityTitle, "This is a test description", 1);
		try {			
			project.addActivity(activity, softwarehuset.getLoggedInEmployee());
		} catch (OperationNotAllowedException e) {
			errorMessageHolder.setErrorMessage(e.getMessage());
		}
	}
	
	@Given("^the employee \"([^\"]*)\" is logged in$")
	public void theEmployeeIsLoggedIn(String employeeId) throws Exception {
	    softwarehuset.logInEmployee(employeeId);
	}

	@Given("^the logged in employee is not the project leader$")
	public void theLoggedInEmployeeIsNotTheProjectLeader() throws Exception {
	    Employee loggedInEmployee = softwarehuset.getLoggedInEmployee();
	    assertFalse(loggedInEmployee.getID().equalsIgnoreCase(project.getProjectLeader()));
	}

	@Then("^the employee tries to create an activity for the project with id \"([^\"]*)\"$")
	public void theEmployeeTriesToCreateAnActivityForTheProjectWithId(String projectId) throws Exception {
	    int numberOfActivities = project.getUnfinishedActivities().size();
	    try {
	    		project.addActivity(new ProjectActivity("bla", "bla", 1), softwarehuset.getLoggedInEmployee());	
	    } catch (OperationNotAllowedException e) {
			errorMessageHolder.setErrorMessage(e.getMessage());
		}
	    assertEquals(numberOfActivities, project.getUnfinishedActivities().size());   
	}
	
	
	/*
	 * Sofie-Amalie
	 */
	

	@When("^they create a general activity with the name \"([^\"]*)\"$")
	public void theyCreateAGeneralActivityWithTheName(String titleGeneralActivity) throws Exception {
	    // Write code here that turns the phrase above into concrete act
		  try {
	    		softwarehuset.getLoggedInEmployee().addGeneralActivity(titleGeneralActivity);	
	    } catch (OperationNotAllowedException e) {
			errorMessageHolder.setErrorMessage(e.getMessage());
		}
		this.titleActivity = titleGeneralActivity;
	}

	@When("^they set start time to \"([^\"]*)\" and the end time to \"([^\"]*)\"$")
	public void theySetStartTimeToAndTheEndTimeTo(int start, int end) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		  try {
			  softwarehuset.getLoggedInEmployee().getActivity(titleActivity).addStartAndEndDate(start,end);
	    } catch (OperationNotAllowedException e) {
			errorMessageHolder.setErrorMessage(e.getMessage());
		}
	}

	@Then("^the general activity is created$")
	public void theGeneralActivityIsCreated() throws Exception {
		//assertTrue
	}
//
//	@Given("^that the employee is not logged in$")
//	public void thatTheEmployeeIsNotLoggedIn() throws Exception {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("^they get the error message \"([^\"]*)\"$")
//	public void theyGetTheErrorMessage(String arg1) throws Exception {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
