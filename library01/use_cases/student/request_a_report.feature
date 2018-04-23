Feature: Requesting a report of a project
    Actors: project leader
    
Scenario: Receiving a report from a project
    Given that the logged in employee "Mikk" is the project leader of "Test"
    When the project leader "Mikk" requests a journal from the project "Test"
    Then the journal is returned
   

    
