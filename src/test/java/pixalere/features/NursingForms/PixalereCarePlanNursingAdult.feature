Feature: Pixalere Care Plan Nursing Adult

@test11
Scenario: Pixalere Care Plan Nursing Adult Script
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin-P" User-p
When I globally select "Pix ID" from Search Category dropdown
And I search created patient with PIXID Nursing
And I click "General Visit" radio option for "Service Referral and Type" field
And I Navigate to "Patient Profile -> Care Plan" LH panel option
Then "Care Plan" page will open
##
When I enter "Client Needs Goals One" input field in script
And I enter "Client Needs Goals Two" input field in script
And I enter "Client Needs Goals Three" input field in script
And I enter "Service Teaching Plan One" input field in script
And I enter "Service Teaching Plan Two" input field in script
And I enter "Service Teaching Plan Three" input field in script
And I click on Save Button for page Care Plan Nursing Adult
When I start verifying records in Care Plan Nursing Adult Page
Then I Logout from Pixalere