Feature: Login with Valid credentials
   Scenario: Successful Login with Valid Credentials
    Given the user navigates to login page
    When user enters email as "test@gmail.com" and password as "test@123"
    And the user clicks on the Login button
    Then the user should be redirected to the MyAccount Page
    
    