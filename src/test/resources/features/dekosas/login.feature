#language:en

Feature: login

  Scenario: Perform login
    Given User is on main page
    When Prompt to login
    Then User gets logged
    
    