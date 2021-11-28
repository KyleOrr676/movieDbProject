Feature As an admin member, I want to be able to delete information
  Scenario Admin member deleting unwanted information
    Given I am deleting unwanted information from the website
    When I delete unwanted information from the website
    Then I receive a message saying "information deleted successfully"

  Scenario Admin member deleting unwanted information
    Given I am deleting information that has already been deleted
    When I attempt to delete the information
    Then I receive a message saying "Information already deleted"