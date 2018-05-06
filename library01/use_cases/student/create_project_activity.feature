# Mikkel
Feature: Creating a project activity
    Description: An activity is created on a current project
	Actors: Project leader
	
# Mikkel
Scenario Outline: Create a new project activity succesfully
    Given the project leader "Mikk" is logged in
    And there is a project with id "030901"
    And an activity with title <title> is not already registered as an activity in that project
    When the employee create a new activity with title <title> description <desc> priority <priority> startweek <start> endweek <end> to the project
    Then there is a new unfinished activity with title <title> description <desc> priority <priority> startweek <start> endweek <end> in the project
    
    Examples:
    | title		| desc				| priority	| start	| end	|
    | "TestOne"	| "Hello World"		| 1			| 10		| 15		|
    | "TestTwo"	| "hålløj æææhh?"	| 3			| 10		| 9		|
    
# Mikkel
Scenario Outline: Create a new project activity with illegal week numbers
	Given the project leader "Mikk" is logged in
	And there is a project with id "030901"
    And an activity with title "TestOne" is not already registered as an activity in that project
    When the employee create a new project activity with start week <startweek> and end week <endweek>
    Then the employee gets the error message "Illegal week number format"
    
    Examples:
    | startweek	| endweek	|
    | -1			| 10			|
    | 10			| -1			|
    | 53			| 4			|
    | 3			| 53			|
    
    
# Mikkel
Scenario: Create Project Activity that already exists
    Given the project leader "Mikk" is logged in
    And there is a project with id "030901"
    And an activity with title "TestFinished" is already an activity in the project with id "030901"
    When the employee create a new activity with title "TestFinished" description "This is bad" priority 1 startweek 10 endweek 14 to the project
    Then the employee gets the error message "Project already has an activity with this name"
    
