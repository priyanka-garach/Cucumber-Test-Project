Feature: Pixalere Recommendations Sheet

@test11
Scenario: Pixalere Recommendations Sheet Script
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin-P" User-p
When I select client name "Data_PT" from Dashboard
And I select "PT" from Service Referral PT
And I click "Access Chart" radio option for "Service Referral and Type" field
And I Navigate to "Recommendations Sheet" LH panel option
Then "Recommendations Sheet" page will open
##
When I enter "RecommendationsData" input field OT
And I click on Save My Work Teaching Agreement Button
#Then Recommendations Sheet should get verified
And I Navigate to "Viewer -> Recommendations Sheet" LH panel option
Then "Recommendations Sheet" page will open
When I start verifying records in Recommendations Sheet Page
Then I Logout from Pixalere