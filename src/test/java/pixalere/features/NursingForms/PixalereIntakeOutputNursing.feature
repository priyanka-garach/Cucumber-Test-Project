Feature: Pixalere Intake/Output

@test11
Scenario: Pixalere Intake/Output Script
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin-P" User-p
When I globally select "Pix ID" from Search Category dropdown
And I search created patient with PIXID Nursing
And I click "General Visit" radio option for "Service Referral and Type" field
And I Navigate to "Flow Sheets -> Intake/Output" LH panel option
Then "Intake/Output" page will open
##
When I enter "PO" input field IntakeOutput
And I enter "Enteral" input field IntakeOutput
And I enter "Void" input field IntakeOutput
And I enter "Emesis" input field IntakeOutput
And I enter "Drain 1" input field IntakeOutput
And I select "PleurX" for Drain1_Type IntakeOutput  
And I enter "Drain1_Location" input field IntakeOutput
And I enter "Drain 2" input field IntakeOutput
And I select "Tenckhoff" for Drain2_Type IntakeOutput
And I enter "Drain2_Location" input field IntakeOutput
And I enter "Drain 3" input field IntakeOutput
And I select "Hemovac" for Drain3_Type IntakeOutput
And I enter "Drain3_Location" input field IntakeOutput
And I select "Hard" for Stool Consistency
And I enter "no_of_stool" input field IntakeOutput
And I click on Save My Work IntakeOutput Button Nursing
#Then Intake/Output details should get verified
And I Navigate to "Viewer -> Intake/Output Flowchart" LH panel option
Then "Intake/Output Flowchart" page will open
When I start verifying records in IntakeOutput Nursing
And I Navigate to "Flow Sheets -> Intake/Output" LH panel option
And I press on Delete Button
And I enter "Reason for deleting record" input field Deletion in scripts
And I confirm to press Delete Button
And I Navigate to "Viewer -> Intake/Output Flowchart" LH panel option
And I check reason after deletion in viewer
Then I Logout from Pixalere
