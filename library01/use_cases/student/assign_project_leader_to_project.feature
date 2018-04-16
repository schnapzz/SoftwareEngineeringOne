Feature: Assign project leader to project
    Actors: Employee
    
Scenario: Adding leader to project successfully
	Given that the employee "Mikk" is logged in
	And that the project "test2" has no project leader
	When a leader is assigned to the project "test2" with the id "Mikk"
	Then the project "test2" is assigned the leader "Mikk"

Scenario: Adding leader to project when project has a leader
	Given that the employee "Mikk" is logged in
	And the project "test" has a leader
	When a leader is assigned to the project "test" with the id "efgh"
	Then the employee "efgh" is not the leader of "test"
	And the employee gets the error message "Project already has a leader"