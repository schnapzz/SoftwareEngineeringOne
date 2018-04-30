# Mikkel
Feature: Creating a project activity
    Description: An activity is created on a current project
	Actors: Project leader
	
# Mikkel
Scenario Outline: Create a new project activity succesfully
    Given the project leader "Mikk" is logged in
    And there is a project with id "030901"
    And an activity with title <title> is not already registered as an activity in that project
    When the employee create a new activity with title <title> and description <desc> and priority <priority> to the project
    Then there is a new unfinished activity with title <title> and description <desc> and priority <priority> in the project
    
    Examples:
    | title		| desc				| priority	|
    | "TestOne"	| "Hello World"		| 0			|
    | "TestTwo"	| "hålløj æææhh?"	| 1			|
    
# Mikkel
Scenario: Project activity is not created
    Given the project leader "Mikk" is logged in
    And there is a project with id "030901"
    And an activity with title "TestFinished" is already an activity in the project with id "030901"
    When the employee create a new activity with title "TestFinished" and description "This is bad" and priority 1 to the project
    Then the employee gets the error message "Project already has an activity with this name"
    
