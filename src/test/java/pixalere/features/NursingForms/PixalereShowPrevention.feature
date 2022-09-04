Feature: Pixalere Show Prevention

@test11
Scenario: Pixalere Show Prevention Script
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin-P" User-p
When I globally select "Pix ID" from Search Category dropdown
And I search created patient with PIXID Nursing
And I click "General Visit" radio option for "Service Referral and Type" field
And I Navigate to "Prevention" LH panel option
And I click on Next Button
Then "Braden Pressure Injury Risk Assessment" page will open
When I click on Next Button
Then "Prevention Best Practices" page will open
#
And I enter "No" and "Blisters" and "Yes" for Occiput
And I enter "No" and "Blisters" and "Yes" for Scapula
And I enter "No" and "Blisters" and "Yes" for Spinous process
And I enter "No" and "Blisters" and "Yes" for Elbow
And I enter "No" and "Blisters" and "Yes" for Lliac crest
And I enter "No" and "Blisters" and "Yes" for Sacrum
And I enter "No" and "Blisters" and "Yes" for Ischial Tuberosity
And I enter "No" and "Blisters" and "Yes" for Erythema
And I enter "No" and "Blisters" and "Yes" for Heel
And I enter "No" and "Blisters" and "Yes" for Sole
And I enter "No" and "Blisters" and "Yes" for Ear
And I enter "No" and "Blisters" and "Yes" for Shoulder
And I enter "No" and "Blisters" and "Yes" for Anterior iliac spine
And I enter "No" and "Blisters" and "Yes" for Trochanter
And I enter "No" and "Blisters" and "Yes" for Thigh
And I enter "No" and "Blisters" and "Yes" for Medial knee
And I enter "No" and "Blisters" and "Yes" for Lateral knee
And I enter "No" and "Blisters" and "Yes" for Lower leg
And I enter "No" and "Blisters" and "Yes" for Medial malleolus
And I enter "No" and "Blisters" and "Yes" for Lateral malleolus
And I enter "No" and "Blisters" and "Yes" for Lateral edge of foot
And I enter "No" and "Blisters" and "Yes" for Posterior knee
And I select radio "High" for Risk Level
And I select "4" for Day Date Show Prevention
And I select "Jun" for Month Date Show Prevention
And I enter "2022 Show Prevention" input field in script
#And I enter "Additional Comments Prevention Best Practices" input field in script
And I click on Save Button Care Plan
#
Then I Logout from Pixalere

##
