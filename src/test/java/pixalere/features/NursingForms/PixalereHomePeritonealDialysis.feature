Feature: Pixalere Home Peritoneal Dialysis

@test11
Scenario: Pixalere Home Peritoneal Dialysis Script
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin-P" User-p
When I select client name "TEST-Kirby , Jose" from Dashboard
And I click "General Visit" radio option for "Service Referral and Type" field
And I Navigate to "Flow Sheets -> Home Peritoneal Dialysis Record" LH panel option
Then "Home Peritoneal Dialysis Record" page will open
##Form filling
When I enter "Target Weight" input field
And I click "Cycler" radio option for Modality field
And I enter "Target Blood Pressure" input field
And I click "Yes" radio option for Antibiotic Added field
And I select "Crusty" from "Skin Integrity around port site" drop down Home
And I click "Yes" radio option for Edema field
And I enter "Location" input field
And I enter "Measurement" input field
And I enter "Dwell Time" input field
And I click "No" radio option for Dialysate Clear field
And I enter "SolutionUsed" input field
And I enter "OtherRadio" input field
And I enter "Drainage Amount" input field
And I select "Cloudy" from "Drainage" drop down Home
And I click "No" radio option for Heparin field
And I enter "Insulin" input field
Then I click on Save My Work Button on Home Peritoneal Dialysis Page 

## Verify Data
When I Navigate to "Viewer -> Home Peritoneal Flowchart" LH panel option
Then "Home Peritoneal Flowchart" page will open
When I start verifying records Home Peritoneal Flowchart
Then I Logout from Pixalere
 


