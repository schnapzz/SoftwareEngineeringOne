package dtu.Softwarehuset.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.hamcrest.core.IsEqual;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.equalTo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.it.Date;
import dtu.sh.Exceptions.OperationNotAllowedException;
import dtu.sh.model.Employee;
import dtu.sh.model.Project;
import dtu.sh.model.ProjectActivity;
import dtu.sh.model.Report;
import dtu.sh.model.SH;
import dtu.sh.model.TimeRegistration;
import cucumber.api.java.en.And;

public class Steps {

	private String username;
	private SH softwarehuset;
	private Project project;
	private ProjectActivity projectActivity;
	// private Employee loggedInEmployee;
	private Report report;
	private ErrorMessageHolder errorMessageHolder;
	private String titleActivity;
	private String titleGeneralActivity;
	
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
		// Assertions shouldn't be used in a given statement following cucumber
		// guidelines
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

	@Then("^the project with title \"([^\"]*)\" and id \"([^\"]*)\" is added to the list of projects$")
	public void theProjectWithTitleAndIdIsAddedToTheListOfProjects(String title, String id) throws Exception {
		assertTrue(softwarehuset.doesProjectWithTitleExist(title));
		assertTrue(softwarehuset.getProjectFromTitle(title).getId().equals(id));
	}

	@When("^the employee adds the project with title \"([^\"]*)\", start week \"([^\"]*)\" and end week \"([^\"]*)\"$")
	public void theEmployeeAddsTheProjectWithTitleStartWeekAndEndWeek(String title, int start, int end)
			throws Exception {
		try {
			softwarehuset.createProjectWithStartAndEnd(title, start, end);
		} catch (OperationNotAllowedException e) {
			errorMessageHolder.setErrorMessage(e.getMessage());
		}
	}

	@Then("^the project with title \"([^\"]*)\", id \"([^\"]*)\" , start week \"([^\"]*)\" and end week \"([^\"]*)\" is added to the list of projects$")
	public void theProjectWithTitleIdStartWeekAndEndWeekIsAddedToTheListOfProjects(String title, String id, int start,
			int end) throws Exception {
		assertTrue(softwarehuset.doesProjectWithTitleExist(title));
		assertTrue(softwarehuset.getProjectFromTitle(title).getId().equals(id));
		assertTrue(softwarehuset.getProjectFromTitle(title).getStart() == start);
		assertTrue(softwarehuset.getProjectFromTitle(title).getEnd() == end);
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
		assertThat(id, is(equalTo(softwarehuset.getLoggedInEmployee().getID())));
		assertThat(id, is(equalTo(softwarehuset.getProjectLeader(title))));
		username = id;
		project = softwarehuset.getProjectFromTitle(title);
	}

	@When("^the project leader \"([^\"]*)\" requests a report from the project \"([^\"]*)\"$")
	public void theProjectLeaderRequestsAJournalFromTheProject(String id, String title) throws Exception {
		report = softwarehuset.requestReport(project, id);
	}

	@Then("^the report is returned$")
	public void theJournalIsReturned() throws Exception {
		assertTrue(report.getFinishedActivities().equals(project.getFinishedActivities()));
		assertTrue(report.getUnFinishedActivities().equals(project.getUnfinishedActivities()));
	}

	/*
	 * Steps for registering a project activity
	 * 
	 * done by: Mikkel
	 * 
	 */

	@Given("^the project leader \"([^\"]*)\" is logged in$")
	public void theProjectLeaderIsLoggedIn(String leaderId) throws Exception {
		softwarehuset.logInEmployee(leaderId);
	}

	// The wording was changed from the orginial to be more meaningfull and generic
	@And("^there is a project with id \"([^\"]*)\"$")
	public void thereIsAProjectWithId(String projectId) throws Exception {
		assertTrue(softwarehuset.doesProjectWithIdExist(projectId));
		project = softwarehuset.getProjectWithId(projectId);
	}

	@And("^an activity with title \"([^\"]*)\" is not already registered as an activity in that project$")
	public void anActivityWithTitleIsNotAlreadyRegisteredAsAnActivityInThatProject(String activityTitle)
			throws Exception {
		assertFalse(project.activityExistsWithTitle(activityTitle));
	}

	@When("^the employee create a new activity with title \"([^\"]*)\" and description \"([^\"]*)\" and priority (\\d+) to the project$")
	public void theEmployeeCreateANewActivityWithTitleAndDescriptionAndPriorityToTheProject(String activityTitle,
			String desc, int priority) throws Exception {
		projectActivity = new ProjectActivity(activityTitle, desc, priority);
		try {
			project.addActivity(projectActivity, softwarehuset.getLoggedInEmployee());
		} catch (OperationNotAllowedException e) {
			errorMessageHolder.setErrorMessage(e.getMessage());
		}
	}

	@Then("^I create an activity with description \"([^\"]*)\" to the project$")
	public void iCreateAnActivityWithDescriptionToTheProject(String activityTitle) throws Exception {
		int testLength = project.getUnfinishedActivities().size();
		ProjectActivity activity = new ProjectActivity(activityTitle, "This is a test description", 1);
		project.addActivity(activity, softwarehuset.getLoggedInEmployee());
		assertTrue(testLength + 1 == project.getUnfinishedActivities().size());
	}

	@Given("^an activity with title \"([^\"]*)\" is already an activity in the project with id \"([^\"]*)\"$")
	public void anActivityWithTitleIsAlreadyAnActivityInTheProjectWithId(String activityTitle, String projectId)
			throws Exception {
		assertTrue(softwarehuset.doesProjectWithIdExist(projectId));
		assertTrue(project.activityExistsWithTitle(activityTitle));
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

	@Then("^there is a new unfinished activity with title \"([^\"]*)\" and description \"([^\"]*)\" and priority (\\d+) in the project$")
	public void thereIsANewUnfinishedActivityWithTitleAndDescriptionAndPriorityInTheProject(String aTitle, String aDesc,
			int aPriority) throws Exception {

		ProjectActivity pa = project.getProjectActivityWithTitle(aTitle);

		assertTrue(pa.getTitle().equals(aTitle));
		assertTrue(pa.getDescription().equals(aDesc));
		assertTrue(pa.getPriority() == aPriority);
	}

	/*
	 * Creating a general activity
	 * 
	 * Done by: Sofie-Amalie
	 */

	@When("^they create a general activity with the name \"([^\"]*)\"$")
	public void theyCreateAGeneralActivityWithTheName(String titleGeneralActivity) throws Exception {
		softwarehuset.getLoggedInEmployee().addGeneralActivity(titleGeneralActivity);	
		this.titleGeneralActivity = titleGeneralActivity;

	}

	@When("^they set start time to \"([^\"]*)\" and the end time to \"([^\"]*)\"$")
	public void theySetStartTimeToAndTheEndTimeTo(int start, int end) throws Exception {
	    softwarehuset.getLoggedInEmployee().getActivity(titleGeneralActivity).addStartAndEndDate(start,end);
	}

	@Then("^the general activity \"([^\"]*)\" is created$")
	public void theGeneralActivityWithStartAndEndIsCreated(String titleGeneralActivity) throws Exception {
		assertTrue(softwarehuset.getLoggedInEmployee().doesGeneralActivityExist(titleGeneralActivity));
	}

	@Given("^there is a general activity with the name \"([^\"]*)\"$")
	public void thereIsAGeneralActivityWithTheName(String titleGeneralActivity) throws Exception {
		try {
			System.out.println("hwj" + softwarehuset.getLoggedInEmployee().getID());
			softwarehuset.getLoggedInEmployee().addExistingGeneralActivity(titleGeneralActivity);
		} catch (OperationNotAllowedException e) {
			errorMessageHolder.setErrorMessage(e.getMessage());
		}
		this.titleGeneralActivity = titleGeneralActivity;	}

	@Then("^the general activity \"([^\"]*)\" with start \"([^\"]*)\" and end \"([^\"]*)\" is created$")
	public void theGeneralActivityWithStartAndEndIsCreated(String titleGeneralActivity, int start, int end) throws Exception {
		assertTrue(softwarehuset.getLoggedInEmployee().doesGeneralActivityExist(titleGeneralActivity));
		assertTrue(softwarehuset.getLoggedInEmployee().getActivity(titleGeneralActivity).getStartDate() == start);
		assertTrue(softwarehuset.getLoggedInEmployee().getActivity(titleGeneralActivity).getEndDate() == end);
	}
	
	/*
	 * Steps for employee log hours
	 * 
	 * done by: Mikkel
	 * 
	 */

	@Given("^the employee is part of activity with title \"([^\"]*)\" for project with id \"([^\"]*)\"$")
	public void theEmployeeIsPartOfActivityWithTitleForProjectWithTitle(String activityTitle, String projectId)
			throws Exception {

		project = softwarehuset.getProjectWithId(projectId);
		String loggedInEmployeeId = softwarehuset.getLoggedInEmployee().getID();
		assertTrue(project.employeeWithIdExists(loggedInEmployeeId));
		assertTrue(project.activityExistsWithTitle(activityTitle));

		projectActivity = project.getProjectActivityWithTitle(activityTitle);
		assertTrue(projectActivity.employeeWithIdExists(loggedInEmployeeId));
	}

	@When("^the employee logs (.+) hours$")
	public void theEmployeeWithIdLogsHours(double hours) throws Exception {

		try {
			projectActivity.registerHours(softwarehuset.getLoggedInEmployee().getID(), hours);
		} catch (OperationNotAllowedException e) {
			errorMessageHolder.setErrorMessage(e.getMessage());
		}
	}

	@Then("^(.+) hours are logged for employee \"([^\"]*)\" for activity \"([^\"]*)\" for project with id \"([^\"]*)\"$")
	public void hoursAreLoggedForEmployeeForActivityForProjectWithTitle(double hours, String employeeId,
			String activityTitle, String projectId) throws Exception {

		// Get the objects from softwarehuset to check if they've been properly updated
		// Project p = softwarehuset.getProjectWithId(projectId);
		// projectActivity = p.getProjectActivityWithTitle(activityTitle);

		List<TimeRegistration> timeRegistrations = projectActivity.getTimeRegistrations();

		// Check that there's any Time Registrations at all
		assertTrue(projectActivity.getTimeRegistrations().size() > 0);

		// Extract registrations for the employee
		List<TimeRegistration> employeeWithIdRegistrations = new ArrayList<TimeRegistration>();
		for (TimeRegistration tr : timeRegistrations) {
			if (tr.getEmployeeId().equals(employeeId)) {
				employeeWithIdRegistrations.add(tr);
			}
		}

		// See it there is any registrations
		assertTrue(employeeWithIdRegistrations.size() > 0);

		// Check if the sum of registrations adds up to hours
		double sum = 0.0;
		for (TimeRegistration tr : employeeWithIdRegistrations) {
			sum += tr.getHours();
		}
		assertTrue(sum == hours);
	}

	@Then("^the activity have (\\d+) time registrations$")
	public void theActivityHaveTimeRegistrations(int numOfRegistrations) throws Exception {
		assertTrue(projectActivity.numberOfTimeRegistrations() == numOfRegistrations);
	}
		
	//�li
	
	/*
	 * Steps for assign employee to a project activity
	 * 
	 * done by: Oli
	 * 
	 */
	
	@Given("^\"([^\"]*)\" is project leader of project with id \"([^\"]*)\"$")
	public void is_project_leader_of_project_with_id(String leaderId, String projectId) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Project currentProject = softwarehuset.getProjectWithId(projectId);
		assertTrue(currentProject.getProjectLeader().equals(leaderId));
		
	    //throw new PendingException();
	}
	
	//Oli

	@Given("^the employee with id \"([^\"]*)\" is not part of the activity with title \"([^\"]*)\" for project with id \"([^\"]*)\"$")
	public void theEmployeeWithIdIsNotPartOfTheActivityWithTitleForProjectWithTitle(String employeeId,
			String activityTitle, String projectId) throws Exception {
		// Write code here that turns the phrase above into concrete actions

		Project currentProject = softwarehuset.getProjectWithId(projectId);
		ProjectActivity currentActivity = currentProject.getProjectActivityWithTitle(activityTitle);
		assertFalse(currentActivity.employeeWithIdExists(employeeId));
		//
		// throw new PendingException();
	}
	
	//Oli
	@When("^the employee \\\"([^\\\"]*)\\\" is assigned to the activity with the title \"([^\"]*)\" for project with id \"([^\"]*)\"$")
	public void theEmployeeIsAssignedToTheActivityWithTheTitleForProjectWithTitle(String employeeId,
			String activityTitle, String projectId) throws Exception {
		// Write code here that turns the phrase above into concrete actions
		Project currentProject = softwarehuset.getProjectWithId(projectId);
		ProjectActivity currentActivity = currentProject.getProjectActivityWithTitle(activityTitle);
		Employee employee = softwarehuset.getEmployeeWithId(employeeId);

		currentActivity.addEmployeeToActivity(employee, employeeId);

	}
	//Oli
	@Then("^the employee \"([^\"]*)\" is part of the activity with the title \"([^\"]*)\" for project with id \"([^\"]*)\"$")
	public void theEmployeeIsPartOfTheActivityWithTheTitleForProjectWithId(String employeeId, String activityTitle,
			String projectId) throws Exception {
		
		Project currentProject = softwarehuset.getProjectWithId(projectId);
		ProjectActivity currentActivity = currentProject.getProjectActivityWithTitle(activityTitle);
		assertTrue(currentActivity.employeeWithIdExists(employeeId));

		// throw new PendingException();
	}

	//Oli
	@Given("^the employee \"([^\"]*)\" is already part of the activity with the title \"([^\"]*)\" for project with id \"([^\"]*)\"$")
	public void theEmployeeIsAlreadyPartOfTheActivityWithTheTitleFor_project_with_id(String employeeId,
			String activityTitle, String projectId) throws Exception {
		
		Project currentProject = softwarehuset.getProjectWithId(projectId);
		ProjectActivity currentActivity = currentProject.getProjectActivityWithTitle(activityTitle);
		Employee employee = softwarehuset.getEmployeeWithId(employeeId);

		currentActivity.addEmployeeToActivity(employee, employeeId);

		assertTrue(currentActivity.employeeWithIdExists(employeeId));

		// throw new PendingException();
	}
	
	//Oli
	@Then("^the employee \"([^\"]*)\" is not assigned again to activity with title \"([^\"]*)\" for project with title \"([^\"]*)\"$")
	public void the_employee_is_not_assigned_again_to_activity_with_title_for_project_with_title(String employeeId,
			String activityTitle, String projectId) throws Exception {
		// Write code here that turns the phrase above into concrete actions
		Project currentProject = softwarehuset.getProjectWithId(projectId);
		ProjectActivity currentActivity = currentProject.getProjectActivityWithTitle(activityTitle);

		int counter = 0;
		boolean onlyOnce;
		for (Employee e : currentActivity.getEmployees()) {
			if (e.getID().equals(employeeId)) {
				counter++;
			}

		}
		
		if (counter < 1)
			onlyOnce = false;

		else
			onlyOnce = true;

		assertTrue(onlyOnce);

	}

}
