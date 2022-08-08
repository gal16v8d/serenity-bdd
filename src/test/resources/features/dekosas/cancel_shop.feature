#language:en

Feature: cancel shop
    
  Scenario: Cancel shop
    Given User select products to buy
    When Perform cancel
    Then Shop gets cancel
    
    