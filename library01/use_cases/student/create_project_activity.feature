Feature: Creating a project activity
    Description: An activity is created on a current project
	Actors: Project leader
	
Scenario: Create a new activity succesfully
    Given the project leader is logged in "abcd"
    And there is a project with id "030901"
    And an activity with title "Test" is not already registered as an activity in that project
    Then I create an activity with description "Test" to the project
    
Scenario: Activity is created
    Given the project leader is signed in "abcd"
    And there is a project with id "030901"
    And an activity with title "Test" is already an activity in the project "030901"
    Then the activity is not created 
    And the employee gets the error message "Project already has this activity"