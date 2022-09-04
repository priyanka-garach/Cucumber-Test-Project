Feature: Pixalere Mobility Assessment

@test11
Scenario: Pixalere Mobility Assessment Script
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin-P" User-p
When I globally select "Pix ID" from Search Category dropdown
And I search created patient with PIXID Nursing
And I click "General Visit" radio option for "Service Referral and Type" field
And I Navigate to "Assessment -> Mobility Assessment" LH panel option
Then "Mobility Assessment" page will open
##
When I select "Full" for Weight Bearing Status
And I select "Steady" for Balance
And I select "Normal" for Calf Muscle Pump
And I enter "Calf Muscle Pump Comment" input field in script
And I select "Brace" for Mobility Aids
And I enter "Mobility Aids Comment" input field in script
And I enter "Gait Pattern" input field in script
And I enter "Gait Pattern Comments" input field in script
And I enter "Walking Distance" input field in script
And I enter "Walking Endurance" input field in script
And I select "No" for Indoor Footwear
And I enter "Indoor Footwear comment" input field in script
And I select "Yes" for Outdoor Footwear
And I enter "Outdoor Footwear comment" input field in script
And I select "Yes" for Orthotics
And I enter "Orthotics comment" input field in script
And I click on Save My Work Vital Signs Button
And I select "Low" for Muscle Tone
And I select "Flat" for Arches
And I select "Yes" for Foot Supination
And I select "No" for Foot Pronation
#
And I select "Normal ROM" checkbox for Active Dorsiflexion
And I select "Decrd ROM" checkbox for Active Dorsiflexion
And I select "Normal ROM" checkbox for Passive Dorsiflexion
And I select "Decrd ROM" checkbox for Passive Dorsiflexion
#
And I select "Normal strength" checkbox for Active Plantarflexion
And I select "Decrd ROM" checkbox for Active Plantarflexion
And I select "Normal strength" checkbox for Passive Plantarflexion
And I select "Decrd ROM" checkbox for Passive Plantarflexion
#
And I select "Normal strength" checkbox for Active Great Toe
And I select "Decrd strength" checkbox for Active Great Toe
And I select "Normal strength" checkbox for Passive Great Toe
And I select "Decrd strength" checkbox for Passive Great Toe
#
And I select "Intact" for Right Proprioception
And I select "Impaired" for Left Proprioception
#
And I enter "Mobility Assessment comment" input field in script
And I save my work for Mobility Assessment Page
#Then Patient details should get verified
And I Navigate to "Viewer -> Mobility Flowchart" LH panel option
Then "Mobility Assessment Flowchart" page will open
When I start verifying records in Mobility Asessment Page
Then I Logout from Pixalere

##
