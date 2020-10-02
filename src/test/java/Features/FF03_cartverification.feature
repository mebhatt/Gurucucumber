
@cartverify
Feature: Verify You can not add more product in cart than available in store
 

  
  Scenario: Cart Verification with multiple product 
    Given User is on demogur and click mobile button
    And  User Click on Add Cart button of Soni Xperia mobile
    And  User change the quantity to 1000 and click Update button
    Then User get Error message the requsted quantity for sony xperia is not available 
    And  User click Empty cart button 
    Then Messae comes shopping cart is empty  
    Then Uer close the borwser 
  
