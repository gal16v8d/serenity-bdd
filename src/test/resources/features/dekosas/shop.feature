#language:en

Feature: shop
    
  Scenario: Select product
    Given User is on shopping page
    When Select products
    Then Should be on shopping car
    
    