Feature: Pixalere Pain Profile

@test11
Scenario: Pixalere Pain Profile Script
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin-P" User-p
When I select client name "TEST-Kirby , Jose" from Dashboard
And I click "General Visit" radio option for "Service Referral and Type" field
And I Navigate to "Flow Sheets -> Pain Profile" LH panel option
Then "Pain Profile" page will open
##
When I enter "Aggravating Factors" input field OT
And I enter "Comments Pain Profile" input field OT
And I click on Save My Work In-Home Safety Identification Tool Button HSI
#Then Pain Profile details should get verified
And I Navigate to "Viewer -> Pain Profile Flowchart" LH panel option
Then "Pain Profile Flowchart" page will open
When I start verifying records in Pain Profile Flowchart Page
Then I Logout from Pixalere