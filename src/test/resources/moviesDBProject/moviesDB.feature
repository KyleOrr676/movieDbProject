Feature: Admin member
Is the user a member of the Admin team?

  Scenario: Admin member makes changes to the wesbite
    Given I am a member of the admin team
    When I make a change on the website
    Then The changes i make should be displayed to the user

  Scenario: Non-Admin member makes changes to the website
    Given I am not a member of the admin team
    When I attempt to make changes to the website
    Then I will not be given access to do so and will be returned to the main home page

