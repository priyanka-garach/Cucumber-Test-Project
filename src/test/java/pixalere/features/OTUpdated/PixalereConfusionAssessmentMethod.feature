Feature: Pixalere Confusion Assessment Method

@test11
Scenario: Pixalere Confusion Assessment Method Script
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin-P" User-p
When I select client name "Doe , Jane" from Dashboard
And I select "OT" from Service Referral
And I click "Access Chart" radio option for "Service Referral and Type" field
And I Navigate to "Outcome Measures -> Confusion Assessment Method" LH panel option
Then "CAM Tool" page will open
##
When I click "Yes" radio option for "Cognitive Changes and Fluctuating Course" field CAM
And I click "Yes" radio option for "Inattention" field CAM
And I click "Yes" radio option for "Disorganized Thinking" field CAM
And I click "Yes" radio option for "Altered Level of Consciousness" field CAM
When I enter "Comment" input field in script
And I click on Save Confusion Assessment Method Button
And I Navigate to "Viewer -> Confusion Assessment Method" LH panel option
Then "CAM Tool Flowchart" page will open
When I start verifying records in Confusion Assessment Method Page
Then I Logout from Pixalere
