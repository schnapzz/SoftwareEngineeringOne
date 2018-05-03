Feature: Creating a general activity
    Description: An employee creates a general activity for themselves
	Actors: Employee

Scenario: General activity is created when employee is logged in
    Given that the employee "Mikk" is logged in
	When they create a general activity with the name "sick"
    And they set start time to "10" and the end time to "11"
	Then the general activity "sick" is created 

Scenario: Add existing general activiy when employee is logged in 
	Given that the employee "Mikk" is logged in 
	And there is a general activity with the name "sick" 
	And they set start time to "14" and the end time to "16" 
	Then the general activity "sick" with start "14" and end "16" is created 