Feature: Pixalere Tracheostomy

@test11
Scenario: Pixalere Tracheostomy Script
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin-P" User-p
When I globally select "Pix ID" from Search Category dropdown
And I search created patient with PIXID
And I click "General Visit" radio option for "Service Referral and Type" field
And I Navigate to "Flow Sheets -> Tracheostomy and Ventilator" LH panel option
Then "Tracheostomy" page will open
##
When I click "Humidified Air" radio option for "Humidity" field T
And I click "Yes" radio option for "Suction System Checks" field T
And I click "Yes" radio option for "Trach Set Change" field T
And I click "Yes" radio option for "Spare Trach Set Available" field T
And I click "Yes" radio option for "Stoma Care Provided?" field T
And I click "Yes" radio option for Was suctioning performed field T
And I click "Yes" radio option for "Does your client have a ventilator?" field T
And I enter "Type Of Ventilator" input field
And I enter "Leak (litres/minute)" input field
And I enter "Minute Ventilation" input field
And I enter "Pressure" input field
And I enter "Volume Tidal Exhaled" input field
And I click "Yes" radio option for "Water Level Checked" field T
And I click "Yes" radio option for "Humidifier ON Checked" field T
And I click on Save My Work In-Home Safety Identification Tool Button HSI
#ThenTracheostomy details should get verified
And I Navigate to "Viewer -> Tracheostomy and Ventilator Flowchart" LH panel option
#Then "Tracheostomy and Ventilator Record" page will open
When I start verifying records in Tracheostomy and Ventilator Record Page
Then I Logout from Pixalere