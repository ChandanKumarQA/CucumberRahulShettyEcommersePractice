Feature: Sucessfully purchase item
Scenario: Add a product and purchase 

Given User is login with valid carediation
And Click view details of the product
And Add  product in the cart
And Verify the same product is added in the cart
And Click on the checkout 
Then Fill payment details
And Click place order
And Click order check order is placed



