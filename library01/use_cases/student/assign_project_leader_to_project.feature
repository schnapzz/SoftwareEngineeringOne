Feature: Assign project leader to project
    Actors: Employee
    
Scenario: Adding leader to project successfully
	Given that the employee is logged in "abcd"
	And that the project has no project leader
	When a leader is assigned to the project with the id "efgh"
	Then the leader is assigned to the project

Scenario: Adding leader to project when project has a leader
	Given that the employee is logged in 
	And the project has a leader
	When a leader is assigned to the project
	Then a leader is not assigned to the project
	And the employee gets the error message "Project already has a leader"