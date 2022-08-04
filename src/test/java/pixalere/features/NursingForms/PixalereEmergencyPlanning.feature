Feature: Pixalere Emergency Planning

@test11
Scenario: Pixalere Emergency Planning Script
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin-P" User-p
When I select client name "TEST-Kirby , Jose" from Dashboard
And I click "General Visit" radio option for "Service Referral and Type" field
And I Navigate to "Patient Profile -> Emergency Planning" LH panel option
#Then "Emergency Planning" page will open
##
When I click "2: 13-24 Hours" radio option for Expected Risk of Life field
And I click "Yes" radio option for Do you live alone in Emergency Planning field
And I enter "turn to for support" input field
And I click "Yes" radio option for contact your support contact in case of emergency in Emergency Planning field
And I enter "Emergency contact" input field
And I enter "Emergency Relationship" input field
And I enter "Emergency Phone" input field
And I enter "Alternate emergency contact" input field
And I enter "Alternate emergency Relationship" input field
And I enter "Alternate emergency Phone" input field
And I select "Batteries" checkbox for backup plan field
And I select "Oxygen" checkbox for backup plan field
And I enter "emergency preparedness plan" input field
And I enter "Emergency Page Comments" input field
And I click on Save My Emergency Planning Button
And I Navigate to "Viewer -> Resident Profile Flowchart" LH panel option
Then "Patient Profile Flowchart" page will open
And I start verifying records for Emergency Planning Page
Then I Logout from Pixalere