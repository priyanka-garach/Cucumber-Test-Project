Feature: Pixalere Pain Assessment

@test11
Scenario: Pixalere Pain Assessment Script
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin-P" User-p
When I globally select "Pix ID" from Search Category dropdown
And I search created patient with PIXID Nursing
And I click "General Visit" radio option for "Service Referral and Type" field
And I Navigate to "Flow Sheets -> Pain Assessment" LH panel option
Then "Pain Assessment" page will open
##
When I select Day as "5" from calendar Pain Assesment
And I select Month as "Mar" from calendar Pain Assesment
And I enter "Year Calender Pain Assessment" input field in script
And I enter "Adjuvant Pain Medication" input field in script
And I enter "Palliating Factors" input field in script
And I enter "Aggravating Factors PPA" input field in script
And I select "Deep" checkbox for Quality of Pain field
And I select "Penetrating" checkbox for Quality of Pain field
And I select "Stabbing" checkbox for Quality of Pain field
And I select "Tingling" checkbox for Quality of Pain field
And I select "Rarely" from Dropdown Frequency field
And I enter "Intensity Pain Assessment" input field in script
And I select "Constipation" checkbox for Accompanying Symptom field
And I select "Depression" checkbox for Accompanying Symptom field
And I select "Nausea" checkbox for Accompanying Symptom field
And I select "Sore Mouth" checkbox for Accompanying Symptom field
When I select Day as "5" from calendar Pain Assesment last BM
And I select Month as "Mar" from calendar Pain Assesment last BM
And I enter "Year Calender Pain Assessment Last BM" input field in script
And I enter "Pharmacological Intervention" input field in script
And I select "Cold" checkbox for Non-Pharmacological Intervention field
And I select "Assistive Devices" checkbox for Non-Pharmacological Intervention field
And I select "Massage" checkbox for Non-Pharmacological Intervention field
And I select "Heat" checkbox for Non-Pharmacological Intervention field
And I click "Yes" radio option for "Acceptable" field Pain Assessment
And I click "Yes" radio option for "Chronic Pain Parameters Unchanged" field Pain Assessment
And I click "Yes" radio option for "See Progress Notes" field Pain Assessment
And I click on Save My Work Client Care Summary Button
#Then Pain Assessment details should get verified
And I Navigate to "Viewer -> Pain Assessment Flowchart" LH panel option
Then "Pain Assessment Flowchart" page will open
When I start verifying records in Pain Assessment Flowchart Page
Then I Logout from Pixalere