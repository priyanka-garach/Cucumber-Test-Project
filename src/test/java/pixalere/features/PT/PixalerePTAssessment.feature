Feature: Pixalere PT Assessment Program

@test11
Scenario: Pixalere PT Assessment Script
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin-P" User-p
When I globally select "Pix ID" from Search Category dropdown
And I search created patient with PIXID special for PTAssessement and Teaching
And I select PT from Service Referral PTAssessment for Teaching and PTAssessment special
And I click "Access Chart" radio option for "Service Referral and Type" field
And I Navigate to "PT Assessment" LH panel option
Then "PT Assessment" page will open
##
When I click on ckeckbox label "Assessment Initiated" PT Assessment
And I enter "Client/SDM Stated Goal" input field OT
And I click on ckeckbox label "Home Accessibility & Social Situation Assessed" PT Assessment
And I click on ckeckbox label "Medication Use Assessed" PT Assessment	
And I click on ckeckbox label "Posture Assessed" PT Assessment
And I click on ckeckbox label "Edema/Skin Assessed" PT Assessment	
#And I click on Save as Draft and Continue Button
#And I click on ckeckbox label "Pain Assessed" PT Assessment
#And I click on Save as Draft and Continue Button
#And I click on ckeckbox label "Mobility Assessed" PT Assessment
#And I click on ckeckbox label "Stair use Assessed" PT Assessment
#And I click on ckeckbox label "Balance Assessed" PT Assessment
#And I click on Save as Draft and Continue Button
#And I click on ckeckbox label "Musculoskeletal Status" PT Assessment
#And I click on Save as Draft and Continue Button
#And I click on ckeckbox label "Respiratory" PT Assessment
#And I click on ckeckbox label "Neurological" PT Assessment
#And I click on Save as Draft and Continue Button
#And I click on ckeckbox label "Cognition" PT Assessment
#And I click on Save as Draft and Continue Button
#And I click on ckeckbox label "Analysis & Recommendations" PT Assessment
And I click on Save As Draft PTAssessment
And I click on Save My Work 30 Second Sit-Stand Button PT Assessment
#Then Exercise Program should get verified
Then I Logout from Pixalere