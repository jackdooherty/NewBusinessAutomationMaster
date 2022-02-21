Feature: Web login
  Scenario: User provides valid details
    Given a user navigates to the home page
    When they provide valid details
    And submit the login button
    Then they should be able to login successfully

    Scenario: User provides invalid details
      Given a user navigates to the individual create page
      When they provides invalid details
      Then they should see an error message displayed
