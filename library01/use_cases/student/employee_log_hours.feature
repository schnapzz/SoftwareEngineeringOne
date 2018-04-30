Feature: Logging working hours on an activity
	Actor: Employee

# Mikkel    
Scenario Outline: Employee logs hours succesfully
    Given that the employee <employee> is logged in
    And the employee is part of activity with title "TestUnfinished" for project with id "030901"
    And the activity have 0 time registrations
    When the employee logs <hourlog> hours
    Then <totalhours> hours are logged for employee <employee> for activity "TestUnfinished" for project with id "030901"
    And the activity have 1 time registrations
	
	Examples:
	| employee	| hourlog 	| totalhours 	|
	| "abcd"		| 6.0	  	| 6.0			|
	| "abcd"		| 0.5		| 0.5			|
	| "Mikk"		| 6.0	  	| 6.0			|
	| "Mikk"		| 0.5		| 0.5			|
    
Scenario Outline: Employee logs makes multiple registrations succesfully
	Given that the employee <employee> is logged in
    And the employee is part of activity with title "TestUnfinished" for project with id "030901"
    And the activity have 0 time registrations
    When the employee logs <firstRegi> hours
    And the employee logs <secondRegi> hours
    Then <totalhours> hours are logged for employee <employee> for activity "TestUnfinished" for project with id "030901"
    And the activity have 2 time registrations
    
    Examples:
	| employee	| firstRegi 	| secondRegi		| totalhours 	|
	| "abcd"		| 6.0	  	| 0.5			| 6.5			|
	| "Mikk"		| 6.0	  	| 0.5			| 6.5			|
    
# Mikkel
Scenario Outline: Employee logs negative hours
	Given that the employee <employee> is logged in
	And the employee is part of activity with title "TestUnfinished" for project with id "030901"
    And the activity have 0 time registrations
	When the employee logs -1.0 hours
	Then the activity have 0 time registrations
	And the employee gets the error message "Negative hours not allowed"
	
	Examples:
	| employee 	|
	| "abcd"		|
	| "Mikk"		|

# Mikkel
Scenario Outline: Employee logs hours without half hour accuracy
	Given that the employee <employee> is logged in
	And the employee is part of activity with title "TestUnfinished" for project with id "030901"
	And the activity have 0 time registrations
	When the employee logs <hourslogged> hours
	Then the activity have 0 time registrations
	And the employee gets the error message "Hours logged need to be with half (0.5) hours accuracy"
	
	Examples:
	| employee	| hourslogged 	|
	| "abcd" 	| 0.00001		|
	| "abcd" 	| 0.25			|
	| "abcd" 	| 0.7590319		|
	| "abcd" 	| 0.99999		|
	| "abcd" 	| 1.3			|
	| "Mikk" 	| 0.00001		|
	| "Mikk" 	| 0.25			|
	| "Mikk" 	| 0.7590319		|
	| "Mikk" 	| 0.99999		|
	| "Mikk" 	| 1.3			|