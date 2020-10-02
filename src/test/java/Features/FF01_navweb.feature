

Feature: Home and mobile page title verify with sorting by name
  

  @Homepage
  Scenario: Home page title verify 
    Given User is on demoguru website
    And User verify the title of the page
    And close the borwser
    
  
  @Mobilesort
  Scenario: Mobile page title verify and mobile sort by name
  
    Given user is on demoguru website	
    And   User click on mobile button
  	And 	User verify the title of the page which should be
  	And 	User click on sort by to sort it by name.
  	And   Verify all the three prodcut are sort by name
  	And   User close the browser

 