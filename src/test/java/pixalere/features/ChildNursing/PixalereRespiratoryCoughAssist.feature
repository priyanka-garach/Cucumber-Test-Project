Feature: Pixalere Respiratory Cough Assist

@test11
Scenario: Pixalere Respiratory Cough Assist
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin-P" User-p
When I globally select "Pix ID" from Search Category dropdown
And I search created patient with PIXID
And I click "General Visit" radio option for "Service Referral and Type" field
And I Navigate to "Flow Sheets -> Respiratory Flow Sheet" LH panel option
Then "Respiratory Flow Sheet" page will open
##
And I click "Automatic" radio option for Cough Assist
And I click "Yes" radio option for Air filter cleaned Cough Assist
And I click "No" radio option for Mask_tubing cleaned Cough Assist
And I enter "Number of treatment" input field in script
And I select "7" from Cough Assist Date
And I select "Mar" from Cough Assist Month
And I enter "Cough Assist Year" input field in script
And I click on Save My Work for cough assist Button
And I Navigate to "Viewer -> Respiratory Flowcharts" LH panel option
When I start verifying records in Respiratory Flowcharts Page
And I Navigate to "Flow Sheets -> Respiratory Flow Sheet" LH panel option
And I press on Delete Button for respiratory Cough Assist
And I enter "Reason for deleting record" input field Deletion in scripts
And I confirm to press Delete Button
And I check reason after deletion in viewer
Then I Logout from Pixalere