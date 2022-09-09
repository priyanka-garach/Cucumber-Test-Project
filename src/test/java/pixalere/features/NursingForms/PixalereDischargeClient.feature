Feature: Pixalere Discharge Patient

@test11
Scenario: Pixalere Discharge Patient Nursing Adult Script
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin-P" User-p
When I globally select "Pix ID" from Search Category dropdown
And I search created patient with PIXID Nursing Discharge Patient
And I click "General Visit" radio option for "Service Referral and Type" field
And I Navigate to "Discharge Client" LH panel option
Then "Patient Accounts" page will open
##
When I select "Self Care" from Reason dropdown for Discharge
And I select "21" from Discharge Date dropdown for Discharge
And I select "Dec" from Discharge Month dropdown for Discharge
And I enter "2021" input field in script for Discharge
And I click on Discharge Patient Button
And I verify of status of discharge from patient information
Then I Logout from Pixalere