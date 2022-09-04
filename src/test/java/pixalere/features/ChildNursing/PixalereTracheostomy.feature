Feature: Pixalere Tracheostomy

@test11
Scenario: Pixalere Tracheostomy Script
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin-P" User-p
When I globally select "Pix ID" from Search Category dropdown
And I search created patient with PIXID
And I click "General Visit" radio option for "Service Referral and Type" field
And I Navigate to "Flow Sheets -> Tracheostomy and Ventilator Record" LH panel option
Then "Tracheostomy" page will open
##
When I click "Humidified Air" radio option for Humidity field
And I click "Yes" radio option for Suction System Checks
And I click "No" radio option for Trach Set Change field
And I click "Yes" radio option for Spare Trach Set Available field
And I click "No" radio option for Stoma Care Provided field
And I click "No" radio option for suctioning performed field
And I click "Yes" radio option for client ventilator field
And I enter "Type Of Ventilator" input field
And I enter "Leak (litres/minute)" input field
And I enter "Minute Ventilation" input field
And I enter "Pressure Tracheostomy" input field in script
And I enter "Volume Tidal Exhaled" input field in script
And I click "Yes" radio option for Water Level Checked field
And I click "Yes" radio option for Humidifier ON Checked field
And I click on Save My Work In-Home Safety Identification Tool Button HSI
And I Navigate to "Viewer -> Tracheostomy and Ventilator Record" LH panel option
Then "Tracheostomy and Ventilator Flowchart" page will open
When I start verifying records in Tracheostomy and Ventilator Record Page
And I Navigate to "Flow Sheets -> Tracheostomy and Ventilator Record" LH panel option
And I press on Delete Button
And I enter "Reason for deleting record" input field Deletion in scripts
And I confirm to press Delete Button
And I check reason after deletion in viewer
Then I Logout from Pixalere