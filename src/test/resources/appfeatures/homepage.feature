Feature: Home Page Functionality

Scenario: Validate title
Given User is at the landing page
Then Page title should contains "Shopping"

Scenario: verify cart icon
Given User is at the landing page
Then Cart icon should get display

Scenario: Checkout the deal section
Given User is at the landing page
When User click on summer section deal

Scenario: Login to app
Given User is at the landing page
When User click on signin button
And User enters username for login as "9730032416"
And User enters password as "Akshay14" with signin 

