Feature: Trust Create page

  Background: User logs in successfully
    Given a user logs in successfully
    And arrives on the Trust create page

  Scenario: : User creates a Trust client based in the UK
      When the user provided valid Trust client details
      And valid trust details
      And searches for an existing Individual Trustee
      And searches for an existing Individual Settlor
      And searches for an existing Individual Beneficial owner
      And provides valid Trust contact details
      And provides valid Trust bank account details
      And selects valid Nucleus go access
      And selects to have post correspondence
      Then they should be able to select next
      And submit the Trust application