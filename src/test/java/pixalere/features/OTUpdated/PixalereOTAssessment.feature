Feature: Pixalere OT Assessment

@test11
Scenario: Pixalere OT Assessment

Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin-P" User-p
When I select client name "TEST-Kirby , Jose" from Dashboard
And I select "OT" from Service Referral
And I click "Access Chart" radio option for "Service Referral and Type" field
And I Navigate to "OT Assessment" LH panel option
Then "OT Assessment" page will open
##
When I select "Infusion - Misc" from "Product Category" dropdown OT
#And I click on Ambulation and Stair Use Assessed 
#And I select WFL radio option
#And I select Yes radio for Unsteady gait
#And I select No radio for Unsteady gait
#And I select No radio forfear of falling?
#And I select scooter ckeckbox
#And I select manual wheel chair ckeckbox
#And I click on Save Button in OTAssessment
Then I Logout from Pixalere