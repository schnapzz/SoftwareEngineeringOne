$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("use_cases/student/assign_employee_to_a_project_activity.feature");
formatter.feature({
  "name": "Assign employee to a project-activity",
  "description": "\tDescription: A project is added to the list of projects\n\tActors: Project leader and Employee",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Employee is assigned to activity",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the project leader \"Mikk\" is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.theProjectLeaderIsLoggedIn(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Mikk\" is project leader of project with id \"030901\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.is_project_leader_of_project_with_id(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee with id \"efgh\" is not part of the activity with title \"test\" for project with id \"030901\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.theEmployeeWithIdIsNotPartOfTheActivityWithTitleForProjectWithTitle(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee \"efgh\" is assigned to the activity with the title \"test\" for project with id \"030901\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.theEmployeeIsAssignedToTheActivityWithTheTitleForProjectWithTitle(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee \"efgh\" is part of the activity with the title \"test\" for project with id \"030901\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.theEmployeeIsPartOfTheActivityWithTheTitleForProjectWithId(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Employee is not assigned to activity",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the project leader \"Mikk\" is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.theProjectLeaderIsLoggedIn(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Mikk\" is project leader of project with id \"030901\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.is_project_leader_of_project_with_id(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee \"efgh\" is already part of the activity with the title \"test\" for project with id \"030901\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.theEmployeeIsAlreadyPartOfTheActivityWithTheTitleFor_project_with_id(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee \"efgh\" is assigned to the activity with the title \"test\" for project with id \"030901\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.theEmployeeIsAssignedToTheActivityWithTheTitleForProjectWithTitle(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee \"efgh\" is not assigned again to activity with title \"test\" for project with title \"030901\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.the_employee_is_not_assigned_again_to_activity_with_title_for_project_with_title(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("use_cases/student/assign_project_leader_to_project.feature");
formatter.feature({
  "name": "Assign project leader to project",
  "description": "    Actors: Employee",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Adding leader to project successfully",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "that the employee \"Mikk\" is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.thatTheEmployeeIsLoggedIn(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "that the project \"test2\" has no project leader",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.thatTheProjectHasNoProjectLeader(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a leader is assigned to the project \"test2\" with the id \"Mikk\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.aLeaderIsAssignedToTheProjectWithTheId(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project \"test2\" is assigned the leader \"Mikk\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.theProjectIsAssignedTheLeader(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Adding leader to project when project has a leader",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "that the employee \"Mikk\" is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.thatTheEmployeeIsLoggedIn(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project \"Test\" has a leader",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.theProjectHasALeader(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a leader is assigned to the project \"Test\" with the id \"efgh\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.aLeaderIsAssignedToTheProjectWithTheId(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee \"efgh\" is not the leader of \"Test\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.theEmployeeIsNotAssignedAsTheLeaderOf(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee gets the error message \"Project already has a leader\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.theEmployeeGetsTheErrorMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("use_cases/student/create_general_activity.feature");
formatter.feature({
  "name": "Creating a general activity",
  "description": "    Description: An employee creates a general activity for themselves\n\tActors: Employee",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "General activity is created when employee is logged in",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "that the employee \"Mikk\" is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.thatTheEmployeeIsLoggedIn(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "they create a general activity with the name \"sick\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.theyCreateAGeneralActivityWithTheName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "they set start time to \"10\" and the end time to \"11\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.theySetStartTimeToAndTheEndTimeTo(int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the general activity \"sick\" is created",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.theGeneralActivityWithStartAndEndIsCreated(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add existing general activiy when employee is logged in",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "that the employee \"Mikk\" is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.thatTheEmployeeIsLoggedIn(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "there is a general activity with the name \"sick\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.thereIsAGeneralActivityWithTheName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "they set start time to \"14\" and the end time to \"16\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.theySetStartTimeToAndTheEndTimeTo(int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the general activity \"sick\" with start \"14\" and end \"16\" is created",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.theGeneralActivityWithStartAndEndIsCreated(String,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add existing general activiy when employee is logged in",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "that the employee \"Mikk\" is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.thatTheEmployeeIsLoggedIn(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "there is a general activity with the name \"sick\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.thereIsAGeneralActivityWithTheName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "they set start time to \"0\" and the end time to \"53\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.theySetStartTimeToAndTheEndTimeTo(int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Dates are not added to general activity with title \"sick\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.datesAreNotAddedToGeneralActivityWithTitle(String)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("use_cases/student/create_project_activity.feature");
formatter.feature({
  "name": "Creating a project activity",
  "description": "    Description: An activity is created on a current project\n\tActors: Project leader",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Create a new project activity succesfully",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the project leader \"Mikk\" is logged in",
  "keyword": "Given "
});
formatter.step({
  "name": "there is a project with id \"030901\"",
  "keyword": "And "
});
formatter.step({
  "name": "an activity with title \u003ctitle\u003e is not already registered as an activity in that project",
  "keyword": "And "
});
formatter.step({
  "name": "the employee create a new activity with title \u003ctitle\u003e description \u003cdesc\u003e priority \u003cpriority\u003e startweek \u003cstart\u003e endweek \u003cend\u003e to the project",
  "keyword": "When "
});
formatter.step({
  "name": "there is a new unfinished activity with title \u003ctitle\u003e description \u003cdesc\u003e priority \u003cpriority\u003e startweek \u003cstart\u003e endweek \u003cend\u003e in the project",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "title",
        "desc",
        "priority",
        "start",
        "end"
      ]
    },
    {
      "cells": [
        "\"TestOne\"",
        "\"Hello World\"",
        "1",
        "10",
        "15"
      ]
    },
    {
      "cells": [
        "\"TestTwo\"",
        "\"hålløj æææhh?\"",
        "3",
        "10",
        "9"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Create a new project activity succesfully",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the project leader \"Mikk\" is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.theProjectLeaderIsLoggedIn(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "there is a project with id \"030901\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.thereIsAProjectWithId(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an activity with title \"TestOne\" is not already registered as an activity in that project",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.anActivityWithTitleIsNotAlreadyRegisteredAsAnActivityInThatProject(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee create a new activity with title \"TestOne\" description \"Hello World\" priority 1 startweek 10 endweek 15 to the project",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.theEmployeeCreateANewActivityWithTitleDescriptionPriorityStartweekEndweekToTheProject(String,String,int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "there is a new unfinished activity with title \"TestOne\" description \"Hello World\" priority 1 startweek 10 endweek 15 in the project",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.thereIsANewUnfinishedActivityWithTitleDescriptionPriorityStartweekEndweekInTheProject(String,String,int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Create a new project activity succesfully",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the project leader \"Mikk\" is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.theProjectLeaderIsLoggedIn(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "there is a project with id \"030901\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.thereIsAProjectWithId(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an activity with title \"TestTwo\" is not already registered as an activity in that project",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.anActivityWithTitleIsNotAlreadyRegisteredAsAnActivityInThatProject(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee create a new activity with title \"TestTwo\" description \"hålløj æææhh?\" priority 3 startweek 10 endweek 9 to the project",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.theEmployeeCreateANewActivityWithTitleDescriptionPriorityStartweekEndweekToTheProject(String,String,int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "there is a new unfinished activity with title \"TestTwo\" description \"hålløj æææhh?\" priority 3 startweek 10 endweek 9 in the project",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.thereIsANewUnfinishedActivityWithTitleDescriptionPriorityStartweekEndweekInTheProject(String,String,int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Create a new project activity with illegal week numbers",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the project leader \"Mikk\" is logged in",
  "keyword": "Given "
});
formatter.step({
  "name": "there is a project with id \"030901\"",
  "keyword": "And "
});
formatter.step({
  "name": "an activity with title \"TestOne\" is not already registered as an activity in that project",
  "keyword": "And "
});
formatter.step({
  "name": "the employee create a new project activity with start week \u003cstartweek\u003e and end week \u003cendweek\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "the employee gets the error message \"Illegal week number format\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "startweek",
        "endweek"
      ]
    },
    {
      "cells": [
        "-1",
        "10"
      ]
    },
    {
      "cells": [
        "10",
        "-1"
      ]
    },
    {
      "cells": [
        "53",
        "4"
      ]
    },
    {
      "cells": [
        "3",
        "53"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Create a new project activity with illegal week numbers",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the project leader \"Mikk\" is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.theProjectLeaderIsLoggedIn(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "there is a project with id \"030901\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.thereIsAProjectWithId(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an activity with title \"TestOne\" is not already registered as an activity in that project",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.anActivityWithTitleIsNotAlreadyRegisteredAsAnActivityInThatProject(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee create a new project activity with start week -1 and end week 10",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.theEmployeeCreateANewProjectActivityWithStartWeekAndEndWeek(int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee gets the error message \"Illegal week number format\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.theEmployeeGetsTheErrorMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Create a new project activity with illegal week numbers",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the project leader \"Mikk\" is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.theProjectLeaderIsLoggedIn(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "there is a project with id \"030901\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.thereIsAProjectWithId(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an activity with title \"TestOne\" is not already registered as an activity in that project",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.anActivityWithTitleIsNotAlreadyRegisteredAsAnActivityInThatProject(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee create a new project activity with start week 10 and end week -1",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.theEmployeeCreateANewProjectActivityWithStartWeekAndEndWeek(int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee gets the error message \"Illegal week number format\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.theEmployeeGetsTheErrorMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Create a new project activity with illegal week numbers",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the project leader \"Mikk\" is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.theProjectLeaderIsLoggedIn(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "there is a project with id \"030901\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.thereIsAProjectWithId(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an activity with title \"TestOne\" is not already registered as an activity in that project",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.anActivityWithTitleIsNotAlreadyRegisteredAsAnActivityInThatProject(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee create a new project activity with start week 53 and end week 4",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.theEmployeeCreateANewProjectActivityWithStartWeekAndEndWeek(int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee gets the error message \"Illegal week number format\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.theEmployeeGetsTheErrorMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Create a new project activity with illegal week numbers",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the project leader \"Mikk\" is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.theProjectLeaderIsLoggedIn(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "there is a project with id \"030901\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.thereIsAProjectWithId(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an activity with title \"TestOne\" is not already registered as an activity in that project",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.anActivityWithTitleIsNotAlreadyRegisteredAsAnActivityInThatProject(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee create a new project activity with start week 3 and end week 53",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.theEmployeeCreateANewProjectActivityWithStartWeekAndEndWeek(int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee gets the error message \"Illegal week number format\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.theEmployeeGetsTheErrorMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Create Project Activity that already exists",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the project leader \"Mikk\" is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.theProjectLeaderIsLoggedIn(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "there is a project with id \"030901\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.thereIsAProjectWithId(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an activity with title \"TestFinished\" is already an activity in the project with id \"030901\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.anActivityWithTitleIsAlreadyAnActivityInTheProjectWithId(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee create a new activity with title \"TestFinished\" description \"This is bad\" priority 1 startweek 10 endweek 14 to the project",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.theEmployeeCreateANewActivityWithTitleDescriptionPriorityStartweekEndweekToTheProject(String,String,int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee gets the error message \"Project already has an activity with this name\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.theEmployeeGetsTheErrorMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("use_cases/student/employee_log_hours.feature");
formatter.feature({
  "name": "Logging working hours on an activity",
  "description": "\tActor: Employee",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Employee logs hours succesfully",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "that the employee \u003cemployee\u003e is logged in",
  "keyword": "Given "
});
formatter.step({
  "name": "the employee is part of activity with title \"TestUnfinished\" for project with id \"030901\"",
  "keyword": "And "
});
formatter.step({
  "name": "the activity have 0 time registrations",
  "keyword": "And "
});
formatter.step({
  "name": "the employee logs \u003chourlog\u003e hours",
  "keyword": "When "
});
formatter.step({
  "name": "\u003ctotalhours\u003e hours are logged for employee \u003cemployee\u003e for activity \"TestUnfinished\" for project with id \"030901\"",
  "keyword": "Then "
});
formatter.step({
  "name": "the activity have 1 time registrations",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "employee",
        "hourlog",
        "totalhours"
      ]
    },
    {
      "cells": [
        "\"abcd\"",
        "6.0",
        "6.0"
      ]
    },
    {
      "cells": [
        "\"abcd\"",
        "0.5",
        "0.5"
      ]
    },
    {
      "cells": [
        "\"Mikk\"",
        "6.0",
        "6.0"
      ]
    },
    {
      "cells": [
        "\"Mikk\"",
        "0.5",
        "0.5"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Employee logs hours succesfully",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "that the employee \"abcd\" is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.thatTheEmployeeIsLoggedIn(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee is part of activity with title \"TestUnfinished\" for project with id \"030901\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.theEmployeeIsPartOfActivityWithTitleForProjectWithTitle(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity have 0 time registrations",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.theActivityHaveTimeRegistrations(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee logs 6.0 hours",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.theEmployeeWithIdLogsHours(double)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "6.0 hours are logged for employee \"abcd\" for activity \"TestUnfinished\" for project with id \"030901\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.hoursAreLoggedForEmployeeForActivityForProjectWithTitle(double,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity have 1 time registrations",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.theActivityHaveTimeRegistrations(int)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Employee logs hours succesfully",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "that the employee \"abcd\" is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.thatTheEmployeeIsLoggedIn(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee is part of activity with title \"TestUnfinished\" for project with id \"030901\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.theEmployeeIsPartOfActivityWithTitleForProjectWithTitle(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity have 0 time registrations",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.theActivityHaveTimeRegistrations(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee logs 0.5 hours",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.theEmployeeWithIdLogsHours(double)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "0.5 hours are logged for employee \"abcd\" for activity \"TestUnfinished\" for project with id \"030901\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.hoursAreLoggedForEmployeeForActivityForProjectWithTitle(double,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity have 1 time registrations",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.theActivityHaveTimeRegistrations(int)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Employee logs hours succesfully",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "that the employee \"Mikk\" is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.thatTheEmployeeIsLoggedIn(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee is part of activity with title \"TestUnfinished\" for project with id \"030901\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.theEmployeeIsPartOfActivityWithTitleForProjectWithTitle(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity have 0 time registrations",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.theActivityHaveTimeRegistrations(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee logs 6.0 hours",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.theEmployeeWithIdLogsHours(double)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "6.0 hours are logged for employee \"Mikk\" for activity \"TestUnfinished\" for project with id \"030901\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.hoursAreLoggedForEmployeeForActivityForProjectWithTitle(double,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity have 1 time registrations",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.theActivityHaveTimeRegistrations(int)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Employee logs hours succesfully",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "that the employee \"Mikk\" is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.thatTheEmployeeIsLoggedIn(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee is part of activity with title \"TestUnfinished\" for project with id \"030901\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.theEmployeeIsPartOfActivityWithTitleForProjectWithTitle(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity have 0 time registrations",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.theActivityHaveTimeRegistrations(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee logs 0.5 hours",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.theEmployeeWithIdLogsHours(double)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "0.5 hours are logged for employee \"Mikk\" for activity \"TestUnfinished\" for project with id \"030901\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.hoursAreLoggedForEmployeeForActivityForProjectWithTitle(double,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity have 1 time registrations",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.theActivityHaveTimeRegistrations(int)"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Employee logs makes multiple registrations succesfully",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "that the employee \u003cemployee\u003e is logged in",
  "keyword": "Given "
});
formatter.step({
  "name": "the employee is part of activity with title \"TestUnfinished\" for project with id \"030901\"",
  "keyword": "And "
});
formatter.step({
  "name": "the activity have 0 time registrations",
  "keyword": "And "
});
formatter.step({
  "name": "the employee logs \u003cfirstRegi\u003e hours",
  "keyword": "When "
});
formatter.step({
  "name": "the employee logs \u003csecondRegi\u003e hours",
  "keyword": "And "
});
formatter.step({
  "name": "\u003ctotalhours\u003e hours are logged for employee \u003cemployee\u003e for activity \"TestUnfinished\" for project with id \"030901\"",
  "keyword": "Then "
});
formatter.step({
  "name": "the activity have 2 time registrations",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "employee",
        "firstRegi",
        "secondRegi",
        "totalhours"
      ]
    },
    {
      "cells": [
        "\"abcd\"",
        "6.0",
        "0.5",
        "6.5"
      ]
    },
    {
      "cells": [
        "\"Mikk\"",
        "6.0",
        "0.5",
        "6.5"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Employee logs makes multiple registrations succesfully",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "that the employee \"abcd\" is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.thatTheEmployeeIsLoggedIn(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee is part of activity with title \"TestUnfinished\" for project with id \"030901\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.theEmployeeIsPartOfActivityWithTitleForProjectWithTitle(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity have 0 time registrations",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.theActivityHaveTimeRegistrations(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee logs 6.0 hours",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.theEmployeeWithIdLogsHours(double)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee logs 0.5 hours",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.theEmployeeWithIdLogsHours(double)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "6.5 hours are logged for employee \"abcd\" for activity \"TestUnfinished\" for project with id \"030901\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.hoursAreLoggedForEmployeeForActivityForProjectWithTitle(double,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity have 2 time registrations",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.theActivityHaveTimeRegistrations(int)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Employee logs makes multiple registrations succesfully",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "that the employee \"Mikk\" is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.thatTheEmployeeIsLoggedIn(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee is part of activity with title \"TestUnfinished\" for project with id \"030901\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.theEmployeeIsPartOfActivityWithTitleForProjectWithTitle(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity have 0 time registrations",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.theActivityHaveTimeRegistrations(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee logs 6.0 hours",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.theEmployeeWithIdLogsHours(double)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee logs 0.5 hours",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.theEmployeeWithIdLogsHours(double)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "6.5 hours are logged for employee \"Mikk\" for activity \"TestUnfinished\" for project with id \"030901\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.hoursAreLoggedForEmployeeForActivityForProjectWithTitle(double,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity have 2 time registrations",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.theActivityHaveTimeRegistrations(int)"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Employee logs negative hours",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "that the employee \u003cemployee\u003e is logged in",
  "keyword": "Given "
});
formatter.step({
  "name": "the employee is part of activity with title \"TestUnfinished\" for project with id \"030901\"",
  "keyword": "And "
});
formatter.step({
  "name": "the activity have 0 time registrations",
  "keyword": "And "
});
formatter.step({
  "name": "the employee logs -1.0 hours",
  "keyword": "When "
});
formatter.step({
  "name": "the activity have 0 time registrations",
  "keyword": "Then "
});
formatter.step({
  "name": "the employee gets the error message \"Negative hours not allowed\"",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "employee"
      ]
    },
    {
      "cells": [
        "\"abcd\""
      ]
    },
    {
      "cells": [
        "\"Mikk\""
      ]
    }
  ]
});
formatter.scenario({
  "name": "Employee logs negative hours",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "that the employee \"abcd\" is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.thatTheEmployeeIsLoggedIn(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee is part of activity with title \"TestUnfinished\" for project with id \"030901\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.theEmployeeIsPartOfActivityWithTitleForProjectWithTitle(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity have 0 time registrations",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.theActivityHaveTimeRegistrations(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee logs -1.0 hours",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.theEmployeeWithIdLogsHours(double)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity have 0 time registrations",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.theActivityHaveTimeRegistrations(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee gets the error message \"Negative hours not allowed\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.theEmployeeGetsTheErrorMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Employee logs negative hours",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "that the employee \"Mikk\" is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.thatTheEmployeeIsLoggedIn(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee is part of activity with title \"TestUnfinished\" for project with id \"030901\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.theEmployeeIsPartOfActivityWithTitleForProjectWithTitle(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity have 0 time registrations",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.theActivityHaveTimeRegistrations(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee logs -1.0 hours",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.theEmployeeWithIdLogsHours(double)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity have 0 time registrations",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.theActivityHaveTimeRegistrations(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee gets the error message \"Negative hours not allowed\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.theEmployeeGetsTheErrorMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Employee logs hours without half hour accuracy",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "that the employee \u003cemployee\u003e is logged in",
  "keyword": "Given "
});
formatter.step({
  "name": "the employee is part of activity with title \"TestUnfinished\" for project with id \"030901\"",
  "keyword": "And "
});
formatter.step({
  "name": "the activity have 0 time registrations",
  "keyword": "And "
});
formatter.step({
  "name": "the employee logs \u003chourslogged\u003e hours",
  "keyword": "When "
});
formatter.step({
  "name": "the activity have 0 time registrations",
  "keyword": "Then "
});
formatter.step({
  "name": "the employee gets the error message \"Hours logged need to be with half (0.5) hours accuracy\"",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "employee",
        "hourslogged"
      ]
    },
    {
      "cells": [
        "\"abcd\"",
        "0.00001"
      ]
    },
    {
      "cells": [
        "\"abcd\"",
        "0.25"
      ]
    },
    {
      "cells": [
        "\"abcd\"",
        "0.7590319"
      ]
    },
    {
      "cells": [
        "\"abcd\"",
        "0.99999"
      ]
    },
    {
      "cells": [
        "\"abcd\"",
        "1.3"
      ]
    },
    {
      "cells": [
        "\"Mikk\"",
        "0.00001"
      ]
    },
    {
      "cells": [
        "\"Mikk\"",
        "0.25"
      ]
    },
    {
      "cells": [
        "\"Mikk\"",
        "0.7590319"
      ]
    },
    {
      "cells": [
        "\"Mikk\"",
        "0.99999"
      ]
    },
    {
      "cells": [
        "\"Mikk\"",
        "1.3"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Employee logs hours without half hour accuracy",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "that the employee \"abcd\" is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.thatTheEmployeeIsLoggedIn(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee is part of activity with title \"TestUnfinished\" for project with id \"030901\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.theEmployeeIsPartOfActivityWithTitleForProjectWithTitle(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity have 0 time registrations",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.theActivityHaveTimeRegistrations(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee logs 0.00001 hours",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.theEmployeeWithIdLogsHours(double)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity have 0 time registrations",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.theActivityHaveTimeRegistrations(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee gets the error message \"Hours logged need to be with half (0.5) hours accuracy\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.theEmployeeGetsTheErrorMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Employee logs hours without half hour accuracy",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "that the employee \"abcd\" is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.thatTheEmployeeIsLoggedIn(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee is part of activity with title \"TestUnfinished\" for project with id \"030901\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.theEmployeeIsPartOfActivityWithTitleForProjectWithTitle(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity have 0 time registrations",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.theActivityHaveTimeRegistrations(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee logs 0.25 hours",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.theEmployeeWithIdLogsHours(double)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity have 0 time registrations",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.theActivityHaveTimeRegistrations(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee gets the error message \"Hours logged need to be with half (0.5) hours accuracy\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.theEmployeeGetsTheErrorMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Employee logs hours without half hour accuracy",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "that the employee \"abcd\" is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.thatTheEmployeeIsLoggedIn(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee is part of activity with title \"TestUnfinished\" for project with id \"030901\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.theEmployeeIsPartOfActivityWithTitleForProjectWithTitle(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity have 0 time registrations",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.theActivityHaveTimeRegistrations(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee logs 0.7590319 hours",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.theEmployeeWithIdLogsHours(double)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity have 0 time registrations",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.theActivityHaveTimeRegistrations(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee gets the error message \"Hours logged need to be with half (0.5) hours accuracy\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.theEmployeeGetsTheErrorMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Employee logs hours without half hour accuracy",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "that the employee \"abcd\" is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.thatTheEmployeeIsLoggedIn(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee is part of activity with title \"TestUnfinished\" for project with id \"030901\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.theEmployeeIsPartOfActivityWithTitleForProjectWithTitle(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity have 0 time registrations",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.theActivityHaveTimeRegistrations(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee logs 0.99999 hours",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.theEmployeeWithIdLogsHours(double)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity have 0 time registrations",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.theActivityHaveTimeRegistrations(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee gets the error message \"Hours logged need to be with half (0.5) hours accuracy\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.theEmployeeGetsTheErrorMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Employee logs hours without half hour accuracy",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "that the employee \"abcd\" is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.thatTheEmployeeIsLoggedIn(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee is part of activity with title \"TestUnfinished\" for project with id \"030901\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.theEmployeeIsPartOfActivityWithTitleForProjectWithTitle(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity have 0 time registrations",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.theActivityHaveTimeRegistrations(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee logs 1.3 hours",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.theEmployeeWithIdLogsHours(double)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity have 0 time registrations",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.theActivityHaveTimeRegistrations(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee gets the error message \"Hours logged need to be with half (0.5) hours accuracy\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.theEmployeeGetsTheErrorMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Employee logs hours without half hour accuracy",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "that the employee \"Mikk\" is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.thatTheEmployeeIsLoggedIn(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee is part of activity with title \"TestUnfinished\" for project with id \"030901\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.theEmployeeIsPartOfActivityWithTitleForProjectWithTitle(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity have 0 time registrations",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.theActivityHaveTimeRegistrations(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee logs 0.00001 hours",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.theEmployeeWithIdLogsHours(double)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity have 0 time registrations",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.theActivityHaveTimeRegistrations(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee gets the error message \"Hours logged need to be with half (0.5) hours accuracy\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.theEmployeeGetsTheErrorMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Employee logs hours without half hour accuracy",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "that the employee \"Mikk\" is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.thatTheEmployeeIsLoggedIn(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee is part of activity with title \"TestUnfinished\" for project with id \"030901\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.theEmployeeIsPartOfActivityWithTitleForProjectWithTitle(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity have 0 time registrations",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.theActivityHaveTimeRegistrations(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee logs 0.25 hours",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.theEmployeeWithIdLogsHours(double)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity have 0 time registrations",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.theActivityHaveTimeRegistrations(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee gets the error message \"Hours logged need to be with half (0.5) hours accuracy\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.theEmployeeGetsTheErrorMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Employee logs hours without half hour accuracy",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "that the employee \"Mikk\" is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.thatTheEmployeeIsLoggedIn(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee is part of activity with title \"TestUnfinished\" for project with id \"030901\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.theEmployeeIsPartOfActivityWithTitleForProjectWithTitle(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity have 0 time registrations",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.theActivityHaveTimeRegistrations(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee logs 0.7590319 hours",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.theEmployeeWithIdLogsHours(double)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity have 0 time registrations",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.theActivityHaveTimeRegistrations(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee gets the error message \"Hours logged need to be with half (0.5) hours accuracy\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.theEmployeeGetsTheErrorMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Employee logs hours without half hour accuracy",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "that the employee \"Mikk\" is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.thatTheEmployeeIsLoggedIn(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee is part of activity with title \"TestUnfinished\" for project with id \"030901\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.theEmployeeIsPartOfActivityWithTitleForProjectWithTitle(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity have 0 time registrations",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.theActivityHaveTimeRegistrations(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee logs 0.99999 hours",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.theEmployeeWithIdLogsHours(double)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity have 0 time registrations",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.theActivityHaveTimeRegistrations(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee gets the error message \"Hours logged need to be with half (0.5) hours accuracy\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.theEmployeeGetsTheErrorMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Employee logs hours without half hour accuracy",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "that the employee \"Mikk\" is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.thatTheEmployeeIsLoggedIn(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee is part of activity with title \"TestUnfinished\" for project with id \"030901\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.theEmployeeIsPartOfActivityWithTitleForProjectWithTitle(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity have 0 time registrations",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.theActivityHaveTimeRegistrations(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee logs 1.3 hours",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.theEmployeeWithIdLogsHours(double)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the activity have 0 time registrations",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.theActivityHaveTimeRegistrations(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee gets the error message \"Hours logged need to be with half (0.5) hours accuracy\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.theEmployeeGetsTheErrorMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("use_cases/student/employee_login.feature");
formatter.feature({
  "name": "Log in",
  "description": "    Actors: Employees ",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Employee logs in",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "that the employee has a four letter username \"abcd\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.thatTheEmployeeHaveAFourLetterUsername(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee logs in",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.theEmployeeLogsIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee is in the list of employees",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.theEmployeeIsInTheListOfEmployees()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee is logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.theEmployeeIsLoggedIn()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Employee can\u0027t log in",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "that the employee has a four letter username \"qwer\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.thatTheEmployeeHaveAFourLetterUsername(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee is not in the list of employees",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.theEmployeeIsNotInTheListOfEmployees()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee logs in",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.theEmployeeLogsIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee gets the error message \"Wrong username, try again\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.theEmployeeGetsTheErrorMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("use_cases/student/register_project.feature");
formatter.feature({
  "name": "Registering a project",
  "description": "\tDescription: A project is added to the list of projects\n\tActors: Employee",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Add a project successfully",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "that the employee \"Mikk\" is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.thatTheEmployeeIsLoggedIn(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee adds the project with title \"New Project\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.theEmployeeAddsTheProjectWithTitle(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project with title \"New Project\" and id \"180004\" is added to the list of projects",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.theProjectWithTitleAndIdIsAddedToTheListOfProjects(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add a project with start and end week successfully",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "that the employee \"Mikk\" is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.thatTheEmployeeIsLoggedIn(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee adds the project with title \"Next Project\", start week \"7\" and end week \"10\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.theEmployeeAddsTheProjectWithTitleStartWeekAndEndWeek(String,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project with title \"Next Project\", id \"180004\" , start week \"7\" and end week \"10\" is added to the list of projects",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.theProjectWithTitleIdStartWeekAndEndWeekIsAddedToTheListOfProjects(String,String,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add existing project",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "that the employee \"Mikk\" is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.thatTheEmployeeIsLoggedIn(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee adds the project with title \"Test\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.theEmployeeAddsTheProjectWithTitle(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project with title \"Test\" exists",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.theProjectWithTitleExists(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project with the duplicate title \"Test\" is not added",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.theProjectWithTheDuplicateTitleIsNotAdded(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee gets the error message \"A project with that name already exists\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.theEmployeeGetsTheErrorMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("use_cases/student/request_a_report.feature");
formatter.feature({
  "name": "Requesting a report of a project",
  "description": "    Actors: project leader",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Receiving a report from a project",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "that the logged in employee \"Mikk\" is the project leader of \"Test\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.thatTheLoggedInEmployeeIsTheProjectLeaderOf(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project leader \"Mikk\" requests a report from the project \"Test\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.theProjectLeaderRequestsAJournalFromTheProject(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the report is returned",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.theJournalIsReturned()"
});
formatter.result({
  "status": "passed"
});
});