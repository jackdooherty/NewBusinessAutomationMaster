Feature: Web login
  Scenario: User provides valid details
    Given a user navigates to the home page
    When they provide valid details
    And submit the login button
    Then they should be able to login successfully