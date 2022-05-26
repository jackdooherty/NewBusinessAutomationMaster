Feature: Individual Create page

  Background: User logs in successfully
    Given a user logs in successfully
    And arrives on the Individual create page

  @Individual1
  Scenario: Create new individual client with a tax residency outwith the UK
    When the user provides valid client details
    And personal details
    And nationality details within a tax residency outwith the UK
    And contact details
    And bank account details
    And Nucleus Go details
    And correspondence details
    Then they should be able to successfully submit the application

  @Individual2
  Scenario: Create Individual client with a tax residency in the UK
    When the user provides valid client details
    And personal details
    And nationality details within the UK
    And contact details
    And bank account details
    And Nucleus Go details
    And correspondence details
    Then they should be able to successfully submit the application

    @Individual3
    Scenario: Create Individual client with an age over 75
      When the user provides valid client details
      And personal details with an age over 75
      And nationality details within the UK
      And contact details
      And bank account details
      And Nucleus Go details
      And correspondence details
      Then they should be able to successfully submit the application