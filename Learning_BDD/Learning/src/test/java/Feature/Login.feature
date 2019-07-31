Feature: LoggingIntoTheApp

  Scenario: Login with valid username and password
    Given I navigate to login page
    When I enter username 
    When I enter password 
    Then I need to be in homepage 
    
     
   