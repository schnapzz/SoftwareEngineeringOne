Feature: Assign employee to a project-activity
    Description: A project is added to the list of projects
	Actors: Project leader and Employee

Scenario: Employee is assigned to activity 
    Given the project leader "Mikk" is logged in
    Given the employee with id "efgh" is not part of the activity with title "test" for project with id "030901"
     When the employee "efgh" is assigned to the activity with the title "test" for project with id "030901"
    Then the employee "efgh" is part of the activity with the title "test" for project with id "030901"
#
#Scenario: Employee is not assigned to activity
#    Given the project leader is logged in "abcd"
#    And the employee is assigned to the activity with title "test" for project with title "030901"
#    Then the employee can't be assigned to activity with title "test" for project with title "030901"