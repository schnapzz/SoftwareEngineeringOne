$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("use_cases/student/assign_project_leader_to_project.feature");
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
  "name": "the employee create a new activity with title \u003ctitle\u003e and description \u003cdesc\u003e and priority \u003cpriority\u003e to the project",
  "keyword": "When "
});
formatter.step({
  "name": "there is a new unfinished activity with title \u003ctitle\u003e and description \u003cdesc\u003e and priority \u003cpriority\u003e in the project",
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
        "priority"
      ]
    },
    {
      "cells": [
        "\"TestOne\"",
        "\"Hello World\"",
        "0"
      ]
    },
    {
      "cells": [
        "\"TestTwo\"",
        "\"hålløj æææhh?\"",
        "1"
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
  "name": "the employee create a new activity with title \"TestOne\" and description \"Hello World\" and priority 0 to the project",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.theEmployeeCreateANewActivityWithTitleAndDescriptionAndPriorityToTheProject(String,String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "there is a new unfinished activity with title \"TestOne\" and description \"Hello World\" and priority 0 in the project",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.thereIsANewUnfinishedActivityWithTitleAndDescriptionAndPriorityInTheProject(String,String,int)"
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
  "name": "the employee create a new activity with title \"TestTwo\" and description \"hålløj æææhh?\" and priority 1 to the project",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.theEmployeeCreateANewActivityWithTitleAndDescriptionAndPriorityToTheProject(String,String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "there is a new unfinished activity with title \"TestTwo\" and description \"hålløj æææhh?\" and priority 1 in the project",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.thereIsANewUnfinishedActivityWithTitleAndDescriptionAndPriorityInTheProject(String,String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Project activity is not created",
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
  "name": "the employee create a new activity with title \"TestFinished\" and description \"This is bad\" and priority 1 to the project",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.theEmployeeCreateANewActivityWithTitleAndDescriptionAndPriorityToTheProject(String,String,int)"
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
  "name": "that the employee has a four letter username \"efgh\"",
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
  "name": "the project with title \"New Project\" and id \"180001\" is added to the list of projects",
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
  "name": "the project with title \"Next Project\", id \"180001\" , start week \"7\" and end week \"10\" is added to the list of projects",
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