Feature:  Profile feature
Background: 
Given User should be at profile page

Scenario Outline: Create profile for user
When user enter firstname as "<firstname>"
And user enters lastname as "<lastname>"
And user enters city name as "<city>"
Then profile should get created

Examples:
| firstname | lastname | city |
| eder | Mejia | Mexicocity |
| Aron | Severs | Austin |
|Cynthia | white | London |