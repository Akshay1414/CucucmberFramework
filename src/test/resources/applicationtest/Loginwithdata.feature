Feature: Login Functionality with data
Scenario: Login with valid credentials
Given User is at the login screen
When User enters username as "testuserone"
When User enters password as "Test@1234"
And user click on submit button
Then User should redirect to Home page