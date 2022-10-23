@smoke #@wip
Feature: Library app login feature
  User Story:
  As a user, I should be able to login with correct credentials to different accounts


  Scenario: Login as librarian same line
    Given I am on the login page
    When I login using "librarian1@library" and "qU9mrvur"
    Then dashboard should be displayed
    #And there should be 1239 users
 #number can be whatever you have there