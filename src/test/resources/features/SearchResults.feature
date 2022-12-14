@smoke #@wip
Feature: Library app login feature
  User story:
  As a user, I should be able to login as librarian. When I go to Users
  page, table
  should have following columns:
  • Actions
  • UserID
  • Full Name
  • Email
  • Group
  • Status

Scenario: Table columns names
Given I am on the login page
And I login as a librarian
And I click on "Users" link
Then table should have following column names:
| Actions |
| User ID |
| Full Name |
| Email |
| Group |
| Status |