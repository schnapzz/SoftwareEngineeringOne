Feature: Registering a project
	Description: A project is added to the list of projects
	Actors: Employee

Scenario: Add a project successfully
 	Given that the employee "Mikk" is logged in
 	When the employee adds the project with title "New Project"
 	Then the project with title "New Project" is added to the list of projects
 	
Scenario: Add a project when employee is not logged in
	Given that the employee "efgh" is not logged in
	When the employee adds the project with title "test2"
	Then the project with title "test2" is not added
	And the employee gets the error message "Employee login required"

Scenario: Add existing project
	Given that the employee "Mikk" is logged in
	When the employee adds the project with title "test"
	And the project with title "test" exists
	Then the project with the duplicate title "test" is not added
	And the employee gets the error message "A project with that name already exists"