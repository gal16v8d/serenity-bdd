#language:en

Feature: click computers

  Scenario: Navigation success
    Given User is on main page
    When Click on computers link
    Then Computers page should be visible
    
    