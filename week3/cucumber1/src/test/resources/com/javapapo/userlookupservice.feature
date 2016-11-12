Feature: Find a User

  Scenario: Find a User
    Given I use the userlookup service
    When  I enter the username Bret
    Then the name Leanne Graham should show up
    