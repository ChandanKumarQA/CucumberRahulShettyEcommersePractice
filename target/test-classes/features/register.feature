Feature: User Registration
  As a new user
  I want to register on the website
  So that I can access protected features


  # Successful registration
  Scenario: Successful registration with valid details
  
   Given the user is on the Register page
    When the user enters First Name "Chandan"
      And the user enters Last Name "Kumar"
      And the user enters Email
      And the user enters Phone Number "9876543210"
      And the user selects Occupation
      And the user selects Gender
      And the user enters Password
      And the user enters Confirm Password 
      And the user submits the registration form
    Then the user should see a registration success message
      
      