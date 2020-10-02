
@prodcutcost
Feature: Product cost on detail and list page are same
  

  
  Scenario: Verify product cost on detail and list page
    Given User is on demoguru website and click moible 
    And   User verify the price of soni xperia on list page
    And   User click sonia xperia
    And   User verify the price of soni xperia on detail page
    And   User compare prices and both should be same
    And   User close the borwser
    
  
 
 