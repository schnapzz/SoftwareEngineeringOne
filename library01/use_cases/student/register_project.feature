Feature: Registering a project
	Description: A project is added to the list of projects
	Actors: Employee

Scenario: Add a project successfully
 	Given that the employee "Mikk" is logged in
 	When the employee adds the project with title "New Project"
 	Then the project with title "New Project" and id "180001" is added to the list of projects
 	
Scenario: Add a project with start and end week successfully
 	Given that the employee "Mikk" is logged in
 	When the employee adds the project with title "Next Project", start week "7" and end week "10"
 	Then the project with title "Next Project", id "180001" , start week "7" and end week "10" is added to the list of projects 

Scenario: Add existing project
	Given that the employee "Mikk" is logged in
	When the employee adds the project with title "Test"
	And the project with title "Test" exists
	Then the project with the duplicate title "Test" is not added
	And the employee gets the error message "A project with that name already exists"
	
