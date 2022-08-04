Feature: Pixalere PT Joint Movement

@test11
Scenario: Pixalere PT Joint Movement
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin-P" User-p
When I globally select "Pix ID" from Search Category dropdown
And I search created patient with PIXID special for PTAssessement and Teaching
And I select PT from Service Referral PTAssessment for Teaching and PTAssessment special
And I click "Access Chart" radio option for "Service Referral and Type" field
And I Navigate to "Joint Movement" LH panel option
Then "Joint Movement" page will open
##
When I click on Check All Button
And I click on Add Joint Button
And I enter "Ankle_Dorsiflexion" input field OT
And I enter "Ankle_Plantarflexion" input field OT
And I enter "Knee_Flexion" input field OT
And I enter "Knee_Extension" input field OT
And I enter "Hip_Flexion" input field OT
And I enter "Hip_Abduction" input field OT
And I enter "Hip_Extension" input field OT
And I enter "Wrist_Flexion" input field OT
And I enter "Wrist_Extension" input field OT
And I enter "Elbow_Flexion" input field OT
And I enter "Elbow_Extension" input field OT
And I enter "Elbow_Supination" input field OT
And I enter "Elbow_Pronation" input field OT
And I enter "Shoulder_Flexion" input field OT
And I enter "Shoulder_Abduction" input field OT
And I enter "Shoulder_External_Rotation" input field OT
And I enter "Shoulder_Internal_Rotation" input field OT
And I enter "CSpine_Flexion" input field OT
And I enter "CSpine_Extension" input field OT
And I enter "CSpine_SideFlexion" input field OT
And I enter "CSpine_Rotation" input field OT
And I enter "LSpine_Flexion" input field OT
And I enter "LSpine_Extension" input field OT
And I enter "LSpine_SideFlexion" input field OT
And I click on Save Button PTJointMovement
##
And I Navigate to "Viewer -> Joint Movement" LH panel option
Then "Joint Movement" page will open
When I start verifying records in Joint Movement Page
Then I Logout from Pixalere


