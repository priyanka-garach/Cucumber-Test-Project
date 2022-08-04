Feature: Pixalere Show Prevention

@test11
Scenario: Pixalere Show Prevention Script
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin-P" User-p
When I globally select "Pix ID" from Search Category dropdown
And I search created patient with PIXID
And I click "General Visit" radio option for "Service Referral and Type" field
And I Navigate to "Prevention" LH panel option
Then "Prevention" page will open
##
And I click "Within 12 Hours" radio option for Expected Risk of Life field
And I click "Yes" radio option for Do you live alone field of Emergency Planning
And I enter "Turn to for support" input field
And I click "Yes" radio option for Support contact in case of emergency of Emergency Planning
And I enter "Emergency contact" input field
And I enter "Relationship" input field
And I enter "Phone" input field
And I enter "Alternate Emergency contact" input field
And I enter "Relationship" input field
And I enter "Phone" input field
When I checked "Batteries" checkbox
When I checked "Power Source" checkbox
When I checked "Oxygen" checkbox
And I enter "Kind services do you consider essential" input field
And I enter "Comments" input field
And I click on Next Button
##
And I click "Completely Limited" radio option for Sensory/Perception field
And I click "Constantly" radio option for Moisture field
And I click "Activity" radio option for Bedfast field
And I click "Completely Immobile" radio option for Mobility field
And I click "Very Poor" radio option for Nutrition field
And I click "Problem" radio option for Friction field
And I enter "Very High Risk Score" input field
When I checked "Elevation Heels off bed" checkbox for Interventions
And I checked "Apply skin barriers to protect skin" checkbox for Interventions
And I checked "Consider OT/PT consult" checkbox for Interventions
And I checked "Offer ordered supplements" checkbox for Interventions
And I checked "Consider use of assistive devices" checkbox for Interventions
And I enter "Additional Comments" input field
And I click on Next Button
##
And I click "No" radio option for Skin Normal Occiput field in Skin Observation
And I click "Yes" radio option for Pain Present Occiput field in Skin Observation
And I click "Medium" radio option for Risk Level in Prevention Best Practices
And I enter "Additional Comments" input field
And I click on Save Prevention Care Plan Button
#Then Patient details should get verified
And I Navigate to "Viewer -> Prevention care plan flowchart" LH panel option
Then "Prevention care plan flowchart" page will open
When I start verifying records in Prevention care plan Page
Then I Logout from Pixalere
