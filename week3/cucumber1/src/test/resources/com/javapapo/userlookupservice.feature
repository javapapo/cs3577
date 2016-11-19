Feature: Find a User

  Scenario: Find User Bret
    Given I use the userlookup service
    When  I enter the username Paris
    Then the name Leanne Graham should show up
