Feature: Pixalere Respiratory Suctioning

@test11
Scenario: Pixalere Respiratory - Suctioning Script
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin-P" User-p
When I globally select "Pix ID" from Search Category dropdown
And I search created patient with PIXID
And I click "General Visit" radio option for "Service Referral and Type" field
And I Navigate to "Flow Sheets -> Respiratory Flow Sheet" LH panel option
Then "Respiratory Flow Sheet" page will open
##
When I click "Yes" radio option for Suction machine working
And I click "No" radio option for Battery charged
And I click "Oral suctioning" radio option for Type of suctioning
And I click "Moderate" radio option for Amount
And I click "Clear" radio option for Color
And I click "Thin" radio option for Consistency 
And I click "None" radio option for Odour
And I click "Yes" radio option for Suctioning container cleaned
And I enter "Suctioning comment" input field in script
And I select "13" from Suctioning Date
And I select "Dec" from Suctioning Month
And I enter "Suctioning Year" input field in script
And I click on Save My Work Suctioning Button
#
And I Navigate to "Viewer -> Respiratory Flowcharts" LH panel option
When I start verifying records in Respiratory Flowcharts Page Suctioning
And I Navigate to "Flow Sheets -> Respiratory Flow Sheet" LH panel option
And I press on Delete Button for respiratory suctioning
And I enter "Reason for deleting record" input field Deletion in scripts
And I confirm to press Delete Button
And I check reason after deletion in viewer for respiratory
Then I Logout from Pixalere