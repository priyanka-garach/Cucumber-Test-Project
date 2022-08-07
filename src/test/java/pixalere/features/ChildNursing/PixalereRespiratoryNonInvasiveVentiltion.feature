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
And I click "CPAP" radio option for Non invasive ventilation
And I click "Yes" radio option for Oxygen in situ
And I click "No" radio option for Humidifier Check
And I enter "Therapy hours" input field in script
And I click "Yes" radio option for Air filter cleaned
And I click "No" radio option for Mask_tubing cleaned
And I select "3" from Non invasive ventilation Date
And I select "Jan" from Non invasive ventilation Month
And I enter "invasive ventilation Year" input field in script
And I click on Save My Work Non-invasive ventilation Button
#Then Respiratory Flowcharts details should get verified

And I Navigate to "Viewer -> Respiratory Flowcharts" LH panel option
When I start verifying records in Respiratory Flowcharts Page non-invasive ventiltion
Then I Logout from Pixalere