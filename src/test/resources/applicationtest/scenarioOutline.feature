Feature: Signup


Scenario Outline: Signup to the application with different data
Given User is at the signup page
When User enters "<name>" on form 
And user enters "<age>" inside the form
And user select the "<gender>"
And user select the server as <server>
Then user should get created
# to take data in other forms - for string= "<name>" , for int <server>

Examples: 

| name| age| gender| server |
|Eder| 18 | Male | 5 |
|Ron| 22 | Male | 6 |
|Diana| 19 | Female | 7 |
|Daniel| 25 | Male | 8 |