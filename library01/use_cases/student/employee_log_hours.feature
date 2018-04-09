Feature: Logging working hours on an activity
    Actors:Employee
    
Scenario: Employee logs hours
    Given that the employee is logged in "abcd"
    And the employee is part of activity with title "test" for project with title "030901"
    And the employee chooses activity with title "test" for project with title "030901"
    When the employee with id "abcd" logs 6 hours
    Then 6 hours are logged for "abcd" for activity "test" for project with title "030901"