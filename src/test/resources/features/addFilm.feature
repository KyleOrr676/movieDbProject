Feature: Adding new film
  As an admin I want to add a new film to the database so that it can be accessed by users at a later point.

  Scenario: a new film is added to the database successfully using all information
    Given the film information is available
    When i try to add the film with Film ID 1034, language ID 1, title "Aliens", length 126, description "Sci-Fi Film" to the database
    Then the new film in the database should have Film ID 1034, language ID 1, title "Aliens", length 126, description "Sci-Fi Film"