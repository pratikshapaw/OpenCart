Feature: HomePage
Scenario: AddToCart
Given User should be at HomePage
When User clicks on Tablets functionality
And User clicks on add to cart button
Then product should get added to cart 
