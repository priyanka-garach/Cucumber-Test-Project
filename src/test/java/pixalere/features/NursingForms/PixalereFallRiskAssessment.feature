Feature: Pixalere Fall Risk Assessment

@test11
Scenario: Pixalere Fall Risk Assessment Script
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin-P" User-p
When I select client name "TEST-Kirby , Jose" from Dashboard
And I click "General Visit" radio option for "Service Referral and Type" field
And I Navigate to "Patient Profile -> Fall Risk Assessment" LH panel option
Then "Fall Risk Assessment" page will open
##
When I click on Save My Work Client Care Summary Button
#Then Fall Risk Assessment details should get verified
And I Navigate to "Viewer -> Fall Risk History" LH panel option
Then "Fall Risk History" page will open
When I start verifying records in Fall Risk History Page
Then I Logout from Pixalere