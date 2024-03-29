Feature: Pixalere Confusion Assessment Method

@test11
Scenario: Pixalere Confusion Assessment Method Script
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin-P" User-p
When I globally select "Pix ID" from Search Category dropdown
And I search created patient with PIXID PT
And I select "PT" from Service Referral PT
And I click "Access Chart" radio option for "Service Referral and Type" field
And I Navigate to "Outcome Measures -> Confusion Assessment Method" LH panel option
Then "CAM Tool" page will open
##
When I click "Yes" radio option for "Cognitive Changes and Fluctuating Course" field CAM
And I click "Yes" radio option for "Inattention" field CAM
And I click "Yes" radio option for "Disorganized Thinking" field CAM
And I click "Yes" radio option for "Altered Level of Consciousness" field CAM
And I enter "cam_tool_comment" input field in script
And I click on Save Confusion Assessment Method Button 
And I Navigate to "Viewer -> Confusion Assessment Method" LH panel option
Then "CAM Tool Flowchart" page will open
When I start verifying records in Confusion Assessment Method Page
And I press on Delete Button
And I enter "Reason for deleting record" input field Deletion in scripts
And I confirm to press Delete Button
And I check reason after deletion in viewer
Then I Logout from Pixalere
