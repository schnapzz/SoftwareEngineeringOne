Feature: Log in
    Actors: Employees 
    
Scenario: Employee logs in 
    Given that the employee has a four letter username "abcd"
    When the employee logs in 
    And the employee is in the list of employees
    Then the employee is logged in 

Scenario: Employee can't log in
    Given that the employee has a four letter username "abcd"
    And the employee is not in the list of employees 
    Then the employee can not log in 
    And the employee gets the error message "Wrong username, try again"