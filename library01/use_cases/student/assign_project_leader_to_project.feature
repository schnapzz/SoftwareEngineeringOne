Feature: Assign project leader to project
    Actors: Employee
    
Scenario: Adding leader to project successfully
	Given that the employee "abcd" is logged in
	And that the project "test" has no project leader
	When a leader is assigned to the project "test" with the id "Mikk"
	Then the project is assigned the leader "Mikk"

Scenario: Adding leader to project when project has a leader
	Given that the employee "abcd" is logged in
	And the project has a leader
	When a leader is assigned to the project
	Then a leader is not assigned to the project
	And the employee gets the error message "Project already has a leader"