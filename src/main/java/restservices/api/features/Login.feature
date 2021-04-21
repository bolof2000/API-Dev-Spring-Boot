Feature: Login Feature
  This feature deals with the login functionality of the application

  Scenario: Login with correct username and password
    Given User navigate to the home page
    When user clicks the my account
    And user enters "<email>" and "<>password"
    And user clicks the login button
    And User clicks the register button
    Then verify the user successfully login

