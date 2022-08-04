Feature: Pixalere TUG

@test11
Scenario: Pixalere TUG Script
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin-P" User-p
When I select client name "Data_PT" from Dashboard
And I select "PT" from Service Referral PT
And I click "Access Chart" radio option for "Service Referral and Type" field
And I Navigate to "Outcome Measures -> TUG" LH panel option
Then "Time up and Go" page will open
##
When Date of Visit gets inputed 
And I enter "TimeTUG" input field OT
And I enter "Aid UsedTUG" input field OT
And I click on Save My Work Time up and Go Button
And I Navigate to "Viewer -> Time up and Go" LH panel option
Then "Time up and Go" page will open
When I start verifying records in Time up and Go Page
Then I Logout from Pixalere