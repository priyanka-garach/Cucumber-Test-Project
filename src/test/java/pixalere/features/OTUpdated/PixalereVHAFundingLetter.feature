Feature: Pixalere VHA Funding Letter - Cognitive Impairment
@test11
Scenario: Pixalere VHA Funding Letter - Cognitive Impairment Script
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin-P" User-p
When I select client name "TEST-Kirby , Jose" from Dashboard
And I select "OT" from Service Referral
And I click "Access Chart" radio option for "Service Referral and Type" field
And I Navigate to "Funding Forms -> VHA Funding Letter - Equipment" LH panel option
Then "Funding Letter - Equipment" page will open
##
When I enter "Special Delivery Instructions" input field OT
And I enter "1st area of concern" input field OT
And I click on Add More
And I enter "2st area of concern" input field OT
And I click on Save VHA Funding Letter Button
Then I Logout from Pixalere
