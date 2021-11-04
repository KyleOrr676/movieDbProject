Feature: Add new film

  Scenario: Admin member adding a new film to the website
    Given I am adding a new film that does not exist onto the website and have all the information
    When I add a new film onto the website
    Then The new film should appear on the database

  Scenario: Admin member adding an already existing film
    Given I am adding a film that already exists on the website
    When I add the film to the website
    Then I will be given a prompt that tells me "this film has already been added"