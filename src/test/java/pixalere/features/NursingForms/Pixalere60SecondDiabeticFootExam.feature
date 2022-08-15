Feature: Pixalere 60 Second Diabetic Foot Exam

@test11
Scenario: Pixalere 60 Second Diabetic Foot Exam Script
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin-P" User-p
When I globally select "Pix ID" from Search Category dropdown
And I search created patient with PIXID Nursing
And I click "General Visit" radio option for "Service Referral and Type" field
And I Navigate to "Assessment -> 60 Second Diabetic Foot Exam" LH panel option
Then "Sensory Assessment" page will open
##
When I click "1" radio option for "Left foot Derm" field 60
And I click "1" radio option for "Right foot Derm" field 60
And I click "1" radio option for "Left foot Nails" field 60
And I click "1" radio option for "Right foot Nails" field 60
And I click "0" radio option for "Left foot Deformity" field 60
And I click "0" radio option for "Right foot Deformity" field 60 
And I click "1" radio option for "Left foot Footwear" field 60 
And I click "1" radio option for "Right foot Footwear" field 60 
And I click "1" radio option for "Left foot Temperature" field 60
And I click "1" radio option for "Right foot Temperature" field 60
And I click "2" radio option for "Left foot Range of Motion" field 60
And I click "2" radio option for "Right foot Range of Motion" field 60
And I click "2" radio option for "Left foot Ask 4 questions" field 60
And I click "2" radio option for "Right foot Ask 4 questions" field 60
And I click "1" radio option for "Left foot Pedal Pulses" field 60
And I click "1" radio option for "Right foot Pedal Pulses" field 60
And I click "1" radio option for "Left foot Dependent Rubor" field 60
And I click "1" radio option for "Right foot Dependent Rubor" field 60
And I click "1" radio option for "Left foot Erythema" field 60
And I click "1" radio option for "Right foot Erythema" field 60
And I click on image of Left foot Body Parts
And I click on image of Right foot Body Parts
And I read left foot score
And I read right foot score
And I read Left Foot Image Score
And I read Right Foot Image Score
And I click on Save My Work In-Home Safety Identification Tool Button HSI
#Then Sensory Assessment Flowchart should get verified
And I Navigate to "Viewer -> Sensory Assessment Flowchart" LH panel option
Then "Sensory Assessment Flowchart" page will open
When I start verifying records in Sensory Assessment Flowchart Page
And I press on Delete Button
And I enter "Reason for deleting record" input field Deletion in scripts
And I confirm to press Delete Button
And I check reason after deletion in viewer
Then I Logout from Pixalere