@feature1
Feature: Campaign functionality

@sanity
Scenario: Creation of campaign
Given User is at campaign page
When user click on create campaign button
And User enters the information
And User clicks on save button
Then campaign should get created

@regression @sanity
Scenario: Scheduling campaign
Given User is at campaign page
When user click on edit campaign button
And User enters the information
And User clicks on Schedule button
Then campaign should get scheduled

@functional
Scenario: Sent campaign
Given User is at campaign page
When user click on sent campaign button
Then campaign should get scheduled