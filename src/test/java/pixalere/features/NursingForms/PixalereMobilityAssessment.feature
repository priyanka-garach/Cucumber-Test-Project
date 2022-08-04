Feature: Pixalere Mobility Assessment

@test11
Scenario: Pixalere Vital Signs Script
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin-P" User-p
When I select client name "TEST-Kirby , Jose" from Dashboard
And I click "General Visit" radio option for "Service Referral and Type" field
And I Navigate to "Flow Sheets -> Vital Signs" LH panel option
Then "Vital Signs" page will open
##
When I enter "Tempearture" input field
And I click "Oral" radio option for Temperatrture field
And I enter "Blood Pressure" input field
And I select "Left Arm" from "Blood Pressure" drop down
And I click "Lying" radio option for Blood Pressure Position field
And I enter "Heart Rate" input field
And I click "Regular" radio option for Pulse Type field 
And I enter "Respiratory Rate" input field
And I enter "O2 saturation" input field
And I click "On oxygen" radio option for sat_percentage_type field
And I click "Yes" radio option for progress note field
And I enter "weight" input field
And I enter "height" input field
And I click "Client" radio option for Reported By field
And I click "Yes" radio option for Pain Present field
And I enter "Head Circumference" input field
And I enter "Abdominal Girth" input field
And I click "Alert" radio option for Alert Status field
And I click on Save My Work Vital Signs Button
#Then Patient details should get verified
And I Navigate to "Viewer -> Vital Signs Flowchart" LH panel option
Then "Vital Signs Flowchart" page will open
When I start verifying records in Vital Page
Then I Logout from Pixalere

##
