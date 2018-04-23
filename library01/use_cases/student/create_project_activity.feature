Feature: Creating a project activity
    Description: An activity is created on a current project
	Actors: Project leader
	
Scenario: Create a new activity succesfully
    Given the project leader "Mikk" is logged in
    And there is a project with id "030901"
    And an activity with title "Test" is not already registered as an activity in that project
    Then I create an activity with description "Test" to the project
    
Scenario: Activity is not created
    Given the project leader "Mikk" is logged in
    And there is a project with id "030901"
    And an activity with title "TestFinished" is already an activity in the project with id "030901"
    Then the activity with title "TestFinished" is not created 
    And the employee gets the error message "Project already has an activity with this name"
    
Scenario: Activity is not created
    Given the employee "Hela" is logged in
    And there is a project with id "030901"
    And the logged in employee is not the project leader
    Then the employee tries to create an activity for the project with id "030901" 
    And the employee gets the error message "Only the project leader can create activities for a project"