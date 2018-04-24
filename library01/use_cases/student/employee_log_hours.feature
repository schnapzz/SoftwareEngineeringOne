Feature: Logging working hours on an activity
    Actors:Employee
    
Scenario: Employee logs hours succesfully
    Given that the employee is logged in "abcd"
    And the employee is part of activity with title "First" for project with title "Test"
    And the employee chooses activity with title "First" for project with title "Test"
    Then the employee with id "abcd" logs 6.0 hours
    And 6.0 hours are logged for "abcd" for activity "First" for project with title "Test"
    
Scenario: Employee logs negative hours
	Given that the employee is logged in "abcd"
	And the employee is part of activity with title "First" for project with title "Test"
	And the employee chooses activity with title "First" for project with title "Test"
	Then the employee with id "abcd" logs -1.0 hours
	And the employee gets the error message "Negative hours not allowed"