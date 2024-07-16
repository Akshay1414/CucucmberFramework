Feature: Registration functionality
Scenario: Creatyion of account for a user
Given User should be at registration page
When user enters following information
| Erin | Smith | erinsmith@gmail.com | 9900887678 |
| Robert | White | robertwhite@gmail.com | 7786765434 |
And Click on submit button
Then user gets created
