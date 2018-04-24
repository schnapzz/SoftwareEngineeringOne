Feature: Logging working hours on an activity
	Actor: Employee
    
Scenario: Employee logs hours succesfully
    Given that the employee "abcd" is logged in
    And the employee is part of activity with title "First" for project with title "Test"
    And the employee chooses activity with title "First" for project with title "Test"
    And the activity with title "First" have 0 time registrations
    Then the employee with id "abcd" logs 6.0 hours
    And 6.0 hours are logged for employee "abcd" for activity "First" for project with title "Test"
    And the activity with title "First" have 1 time registrations
    Then the employee with id "abcd" logs 0.5 hours
    And 6.5 hours are logged for employee "abcd" for activity "First" for project with title "Test"
    And the activity with title "First" have 2 time registrations

# Mikkel
Scenario: Project leader logs hours succesfully
    Given the project leader "Mikk" is logged in
    And the employee is part of activity with title "First" for project with title "Test"
    And the employee chooses activity with title "First" for project with title "Test"
    And the activity with title "First" have 0 time registrations
    Then the employee with id "Mikk" logs 6.0 hours
    And 6.0 hours are logged for employee "abcd" for activity "First" for project with title "Test"
    And the activity with title "First" have 1 time registrations
    Then the employee with id "Mikk" logs 0.5 hours
    And 6.5 hours are logged for employee "abcd" for activity "First" for project with title "Test"
    And the activity with title "First" have 2 time registrations
    
# Mikkel
Scenario: Employee logs negative hours
	Given that the employee "abcd" is logged in
	And the employee is part of activity with title "First" for project with title "Test"
	And the employee chooses activity with title "First" for project with title "Test"
	And the activity with title "First" have 0 time registrations
	Then the employee with id "abcd" logs -1.0 hours
	And the employee gets the error message "Negative hours not allowed"
	And the activity with title "First" have 0 time registrations

# Mikkel
Scenario: Employee logs hours without half hour accuracy
	Given that the employee "abcd" is logged in
	And the employee is part of activity with title "First" for project with title "Test"
	And the employee chooses activity with title "First" for project with title "Test"
	And the activity with title "First" have 0 time registrations
	Then the employee with id "abcd" logs 0.25 hours
	And the employee gets the error message "Hours logged need to be with half (0.5) hours accuracy"
	And the activity with title "First" have 0 time registrations
	Then the employee with id "abcd" logs 0.7590319 hours
	And the employee gets the error message "Hours logged need to be with half (0.5) hours accuracy"
	And the activity with title "First" have 0 time registrations
	Then the employee with id "abcd" logs 1.3 hours
	And the employee gets the error message "Hours logged need to be with half (0.5) hours accuracy"
	And the activity with title "First" have 0 time registrations