Feature: Creating a project activity
    Description: An activity is created on a current project
	Actors: Project leader
	
Scenario: Create a new activity
    Given the project leader is signed in "abcd"
    And the project has the title "030901"
    And an activity with title "Test" is not already registered as an activity in that project
    Then the activity with specified hours to complete it with title "Test" within the project of "030901" is created
    
Scenario: Activity is created
    Given the project leader is signed in "abcd"
    And a project with title "030901" exists
    And an activity with title "Test" is already an activity in the project "030901"
    Then the activity is not created 
    And the employee gets the error message "Project already has this activity"