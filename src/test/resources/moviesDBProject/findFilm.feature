Feature: Find Film

  Scenario I want to confirm that a specific movie is on the website
    Given Ace Goldfinger is on the Website
    When I search for "Ace Goldfinger"
    Then I should be told "this film exists on the website"

  Scenario I want to confirm that a specific movie is on the website
    Given Ace Goldfinger is not on the Website
    When I search for "Ace Goldfinger"
    Then I should be told "this film does not exist on the website"