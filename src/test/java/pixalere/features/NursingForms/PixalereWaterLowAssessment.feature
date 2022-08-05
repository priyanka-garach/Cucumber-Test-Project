Feature: Pixalere Waterlow Assessment

@test11
Scenario: Pixalere Care Plan Nursing Adult Script
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin-P" User-p
When I globally select "Pix ID" from Search Category dropdown
And I search created patient with PIXID Nursing
And I click "General Visit" radio option for "Service Referral and Type" field
And I Navigate to "Patient Profile -> Waterlow Assessment" LH panel option
Then "Waterlow Assessment" page will open
##
When I click "2 : Incontinent faeces" radio option for Incontinence field 
And I click "0 : Healthy" radio option for Skin Type - Visual Risk Area field 
And I click "0 : Fully mobile" radio option for Mobility field 
And I click "99 : BMI" radio option for Nutrition Element field 
And I select "0 : Terminal Cahexia" checkbox for Special Risks - Tissue Malnutrition field
And I select "1 : Smoking" checkbox for Special Risks - Tissue Malnutrition field
And I select "1 : Diabetes" checkbox for Special Risks - Neurological Deficit field
And I select "1 : Sensory" checkbox for Special Risks - Neurological Deficit field
And I select "0 : Not Applicable" checkbox for Special Risks - Surgery/Trauma field
And I select "1 : Cytotoxic" checkbox for Medication field
And I select "0 : High Dose Steroid Use" checkbox for Medication field
And I select "1 : Cytotoxic" checkbox for Medication field
And I click on Add My Electronic Signature and Save My Work Button
And I click on Confirm Button
##
And I Navigate to "Viewer -> Waterlow Flowchart" LH panel option
Then "Waterlow Flowchart" page will open
Then I start verifying records in Waterlow Assessment
And I press on Delete Button
And I enter "Reason for deleting record" input field Deletion in scripts
And I confirm to press Delete Button
And I check reason after deletion in viewer
And I Logout from Pixalere