
Feature: User Registration
  As a new user
  I want to register on the website
  So that I can access protected features


  # Successful registration
  Scenario: Successful signup with valid details
  
   Given the user is on the signuo page
    When the user enters Name "Chandan"
    And the user enters Email
      And the user submits the signup button form
    Then the user should see a signup success message
      
      