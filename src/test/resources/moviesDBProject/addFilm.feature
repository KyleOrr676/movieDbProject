Feature: Add Dark Knight

  Scenario: Admin member adding a Dark Knight to the website
    Given I have the information for the film
    When I add The Dark Knight onto the website
    Then I should be told Film added successfully

  Scenario: Admin member adding an already existing film
    Given I have the information for the film
    When I add the already existing film to the website
    Then I should be told this film has already been added