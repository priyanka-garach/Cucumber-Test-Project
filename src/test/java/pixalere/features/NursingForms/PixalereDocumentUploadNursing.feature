Feature: Pixalere Document Upload Nursing

@test11
Scenario: Pixalere Document Upload Nursing
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin-P" User-p
When I globally select "Pix ID" from Search Category dropdown
And I search created patient with PIXID Nursing
And I click "General Visit" radio option for "Service Referral and Type" field
And I Navigate to "Document Upload" LH panel option
Then "Patient Accounts" page will open
##
When I enter "Document Name for Document Upload" input field in script
And I enter "Document_Upload" input field in script
And I select "BPMH" from dropdown of Document Type
And I click on Upload Button
And I verify Document Upload Details
And I press on Delete Button for Document Upload
And I enter "Reason for deleting record" input field Deletion in scripts
And I confirm to press Delete Button
And I confirm to press Delete Button
And I check reason after deletion in viewer
Then I Logout from Pixalere
