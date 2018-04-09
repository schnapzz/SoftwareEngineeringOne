Feature: Requesting a report of a project
    Actors: project leader
    
Scenario: Accessing journals from projects
    Given that the project leader is logged in "abcd"
    And the project leader is given as the project leader of the project id "030901"
    When the project leader requests a journal
    Then the journal is returned