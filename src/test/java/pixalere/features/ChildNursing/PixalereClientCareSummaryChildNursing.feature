Feature: Pixalere Client Care Summary Child Nursing

@test11
Scenario: Pixalere Client Care Summary Script
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin-P" User-p
When I globally select "Pix ID" from Search Category dropdown
And I search created patient with PIXID
And I click "General Visit" radio option for "Service Referral and Type" field
And I Navigate to "Patient Profile -> Client Care Summary" LH panel option
Then "Client Care Summary" page will open
##
When I enter "MD/NP contact info" input field in script
And I enter "Client Caregiver Requests" input field in script
And I enter "Equipment Source" input field in script
And I enter "Case Coordinator" input field in script
And I enter "Caseload/ District" input field in script
And I enter "Special precautions" input field in script
And I enter "Primary nurse contact info" input field in script
And I enter "Secondary nurse(s) contact info" input field in script
And I enter "Last enteral tube change" input field in script
And I enter "Day of MicKEY balloon re-inflation" input field in script
And I enter "Care of site" input field in script
And I enter "Times of feeds" input field in script
And I click on Save My Work Client Care Summary Button
And I Navigate to "Viewer -> Client Care Summary Flowchart" LH panel option
Then "Client Care Summary Flowchart" page will open
When I start verifying records in Client Care Summary Page 
Then I Logout from Pixalere