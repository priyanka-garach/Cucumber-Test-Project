Feature: Pixalere Client Summary

@test11
Scenario: Pixalere Client Summary Script
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin-P" User-p
When I select client name "TEST-Kirby , Jose" from Dashboard
And I select "OT" from Service Referral
And I click "Access Chart" radio option for "Service Referral and Type" field
And I Navigate to "Client Summary" LH panel option
Then "Client Summary" page will open
##
When I enter "Special Instructions" input field in script
And I click on Save Client Summary Button
And I verify data of client Summary
Then I Logout from Pixalere