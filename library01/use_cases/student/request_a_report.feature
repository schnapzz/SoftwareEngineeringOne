Feature: Requesting a report of a project
    Actors: project leader
    
Scenario: Receiving a report from a project
    Given that the logged in employee "Mikk" is the project leader of "test"
    When the project leader "Mikk" requests a journal from the project "test"
    Then the journal is returned
   

    
