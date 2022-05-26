Feature: Web login
  @Login1
  Scenario: User logs in successfully
    Given a user navigates to the home page
    When they provide valid details
    And submit the login button
    Then they should be able to login successfully

  @Login2
  Scenario: User is unable to login with invalid details
    Given a user navigates to the home page
    When they provide invalid details
    And submit the login button
    Then they should be presented with an error message