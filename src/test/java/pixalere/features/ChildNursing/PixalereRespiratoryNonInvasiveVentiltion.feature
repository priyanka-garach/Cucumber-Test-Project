Feature: Pixalere Respiratory - non-invasive ventiltion

@test11
Scenario: Pixalere Respiratory - non-invasive ventiltion Script
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin-P" User-p
When I globally select "Pix ID" from Search Category dropdown
And I search created patient with PIXID
And I click "General Visit" radio option for "Service Referral and Type" field
And I Navigate to "Flow Sheets -> Respiratory Flow Sheet" LH panel option
Then "Respiratory Flow Sheet" page will open
##
When I click "CPAP" radio option for Non-invasive ventilation field
And I click "Yes" radio option for "Oxygen in situ" field IV field
And I click "Yes" radio option for "Humidifier Check" field IV field
And I enter "Therapy hours" input field OT
And I click "Yes" radio option for "Air filter cleaned" Non-invasive ventilation field
And I click "Yes" radio option for "Mask/tubing cleaned" Non-invasive ventilation field
And I click on Save My Work Non-invasive ventilation Button
#Then Respiratory Flowcharts details should get verified
And I Navigate to "Viewer -> Respiratory Flowcharts" LH panel option
When I start verifying records in Respiratory Flowcharts Page non-invasive ventiltion
Then I Logout from Pixalere