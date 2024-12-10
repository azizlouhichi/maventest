@loginFeature
Feature: feature to test login functionality

  @validCredentials
  Scenario: Check login is successful with valid credentials
    Given user is on login page
    When user enters Username as "<username>" and Password as "<password>"
    And clicks on login button
    Then user is navigated to the home page

  @inValidCredentials
  Scenario: Check login with invalid credentials
    Given user is on login page
    When user enters invalid Username as "<username>" and Password as "<password>"
    And clicks on login button
    Then error message is displayed - Invalid Credentials
