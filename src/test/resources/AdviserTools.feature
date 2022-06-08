Feature: Adviser home page

  Background: User logs in successfully
    Given a user logs in successfully

  Scenario Outline: Dashboard features
    Then the "<feature>" is "<state>" for the user

    Examples:
      | feature        | state    |
      | Home           | enabled  |
      | Clients        | enabled  |
      | Tools          | enabled  |
      | MI             | enabled  |
      | Reports        | enabled  |
      | Tax year start | enabled  |
      | Conversion     | disabled |
      | Wrapstore      | enabled  |
      | Library        | enabled  |
      | Research       | enabled  |
      | Admin          | enabled  |
      | Contact us     | enabled  |
      | Live Support   | enabled  |
      | MiFID II       | enabled  |

