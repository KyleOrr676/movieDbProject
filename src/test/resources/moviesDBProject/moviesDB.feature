Feature: Admin member
Is the user a member of the Admin team?

  Scenario: Admin member makes changes to the wesbite
    Given I am a member of the admin team
    When I make a change on the website
    Then I should be told "Access granted".

  Scenario: Non-Admin member makes changes to the website
    Given I am not a member of the admin team
    When I make a change on the website
    Then I should be told "Access denied".

