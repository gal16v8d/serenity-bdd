#language:en

Feature: open video

  Scenario: Open video
    Given User is on main page
    When Page loads and search
    Then Video is available
    
    