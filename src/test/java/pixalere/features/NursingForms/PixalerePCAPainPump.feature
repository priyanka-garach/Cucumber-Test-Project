Feature: Pixalere PCA Pain Pump

@test11
Scenario: Pixalere PCA Pain Pump Script
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin-P" User-p
When I select client name "TEST-Kirby , Jose" from Dashboard
And I click "General Visit" radio option for "Service Referral and Type" field
And I Navigate to "Flow Sheets -> PCA Pain Pump" LH panel option
Then "PCA Pain Pump" page will open

## PCA Pain Pump features
#When I click "General Visit" radio option for TYPE field
When I click on Add Solution button 
And I enter "SolutionNamePCAPainPump" input field
And I click "CVAD" radio option for Route field
And I click on Save Solution button 
And I click "Yes" radio option for Battery Checked field
And I click "Yes" radio option for Cassette Change field
And I click "Yes" radio option for Tubing Change field
And I select "Red" from "Site Appearance" drop down
And I click "No" radio option for Site Change field
And I select "LL1" from "Lock Level" drop down
And I enter "Reservoir volume bag cassette" input field
And I enter "Dose Concentration" input field
And I select "mg/mL" from "Dose Concentration" drop down
And I enter "Dose_hour" input field
And I enter "Bolus dose" input field
And I select "mg/mL" from "Bolus dose" drop down
And I enter "Bolus doses allowed hour" input field
And I enter "Attempts" input field
And I enter "Given" input field
And I click "Yes" radio option for Bolus reset field
Then I click on GivenButton
## Verify Data
When I Navigate to "Viewer -> PCA Pain Pump Flowchart" LH panel option
#Then "PCA Pain Pump" page will open
And I start verifying records PCA Pain Pump Flowchart
Then I Logout from Pixalere

