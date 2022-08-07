Feature: Pixalere PT Joint Movement

@test11
Scenario: Pixalere PT Joint Movement
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin-P" User-p
When I globally select "Pix ID" from Search Category dropdown
And I search created patient with PIXID PT
And I select "PT" from Service Referral PT
And I click "Access Chart" radio option for "Service Referral and Type" field
And I Navigate to "Joint Movement" LH panel option
Then "Joint Movement" page will open
##
When I click on Check All Button
And I click on Add Joint Button
And I enter "Ankle_Dorsiflexion" input field in script
And I enter "Ankle_Plantarflexion" input field in script
And I enter "Knee_Flexion" input field in script
And I enter "Knee_Extension" input field in script
And I enter "Hip_Flexion" input field in script
And I enter "Hip_Abduction" input field in script
And I enter "Hip_Extension" input field in script
And I enter "Wrist_Flexion" input field in script
And I enter "Wrist_Extension" input field in script
And I enter "Elbow_Flexion" input field in script
And I enter "Elbow_Extension" input field in script
And I enter "Elbow_Supination" input field in script
And I enter "Elbow_Pronation" input field in script
And I enter "Shoulder_Flexion" input field in script
And I enter "Shoulder_Abduction" input field in script
And I enter "Shoulder_External_Rotation" input field in script
And I enter "Shoulder_Internal_Rotation" input field in script
And I enter "CSpine_Flexion" input field in script
And I enter "CSpine_Extension" input field in script
And I enter "CSpine_SideFlexion" input field in script
And I enter "CSpine_Rotation" input field in script
And I enter "LSpine_Flexion" input field in script
And I enter "LSpine_Extension" input field in script
And I enter "LSpine_SideFlexion" input field in script
And I click on Save Button PTJointMovement
##
And I Navigate to "Viewer -> Joint Movement" LH panel option
Then "Joint Movement" page will open
When I start verifying records in Joint Movement Page
Then I Logout from Pixalere


