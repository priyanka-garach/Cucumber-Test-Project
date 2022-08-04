Feature: Pixalere Respiratory - Suctioning

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
When I click "Yes" radio option for "Suction machine working" field IV field
And I click "No" radio option for "Battery charged" field IV field
And I click "Oral suctioning" radio option for "Type of suctioning" field IV field
And I click "Moderate" radio option for "Amount" field IV field
And I click "Clear" radio option for "Color" field IV field
And I click "Thin" radio option for "Consistency" field IV field 
And I click "None" radio option for "Odour" field IV field 
And I click "Yes" radio option for "Suctioning container cleaned" field IV field 
And I click on Save My Work Suctioning Button
#Then Respiratory Flowcharts details should get verified
And I Navigate to "Viewer -> Respiratory Flowcharts" LH panel option
#Then "Respiratory Flowcharts" page will open
When I start verifying records in Respiratory Flowcharts Page Suctioning
Then I Logout from Pixalere