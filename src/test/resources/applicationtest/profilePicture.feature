Feature: Profile functionality

Scenario: Add profile for a user
Given User should be at home page
When User clicks on add profile button
And Upload the image
Then profile should be added

Scenario: Update profile for a user
Given User should be at home page
When User clicks on Update profile button
And Upload the image
Then profile should be updated

Scenario: Delete profile for a user
Given User should be at home page
When User clicks on delete profile button
Then profile should be deleted