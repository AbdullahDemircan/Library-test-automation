#@wip
@smoke
Feature: Library app login feature
  User story:
  As a user, I should be able to login with correct credentials to different accounts

  Background: Assuming user is on the login page
    Given user is on the login page


      Scenario: Login as librarian
      When user enters librarian username
      And user enters librarian password
      Then user as librarian should see the dashboard


      Scenario: Login as student
      When user enters student username
      And user enters student password
      Then user as student should see the dashboard