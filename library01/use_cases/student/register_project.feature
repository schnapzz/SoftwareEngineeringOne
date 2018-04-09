Feature: Registering a project
	Description: A project is added to the list of projects
	Actors: Employee

Scenario: Add a project successfully
 	Given that the employee "abcd" is logged in
 	When the employee adds the project with title "030901"
 	Then the project with title "030901" is added to the list of projects
 	
Scenario: Add a project when employee is not logged in
	Given that the employee "abcd" is not logged
	When the employee adds the project with title "030901"
	Then the employee gets the error message "Employee login required"

Scenario: Add existing project
	Given that the employee "abcd" is logged in
	When the employee adds the project with title "030901"
	And the project with title "030901" exists
	Then the employee gets the error message "Project with the name \"030901\" already exists"