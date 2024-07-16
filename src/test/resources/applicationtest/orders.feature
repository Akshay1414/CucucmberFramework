Feature: Order functionality
Background:
Given user should be logged into the application
When user should be at the order page

Scenario: Fetching prefiously placed order information
When user clicks on past order button
Then user should be able to see the past order information

Scenario: Fetching current placed order information
When User clicks on the current ordwr button  
Then User should be able to see the current order information

Scenario: Fetching cancelled order information
When User clicks on cancelled order button
Then User should be able to see the cancelled order information


























































































