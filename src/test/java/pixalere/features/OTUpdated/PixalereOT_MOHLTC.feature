Feature: Pixalere OT MOHLTC

@test11
Scenario: Pixalere OT MOHLTC

Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin-P" User-p
When I select client name "TEST-Kirby , Jose" from Dashboard
And I select "OT" from Service Referral
And I click "Access Chart" radio option for "Service Referral and Type" field
And I Navigate to "Funding Forms -> Ontario MOHLTC - Application for Funding Mobility Devices" LH panel option
##
When PDF is downloaded and verified
Then I Logout from Pixalere