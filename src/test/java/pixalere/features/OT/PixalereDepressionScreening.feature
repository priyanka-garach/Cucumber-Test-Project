Feature: Pixalere Depression Screening

@test11
Scenario: Pixalere Depression Screening Script
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin-P" User-p
When I select client name "TEST-Kirby , Jose" from Dashboard
And I select "OT" from Service Referral
And I click "Access Chart" radio option for "Service Referral and Type" field
And I Navigate to "Outcome Measures -> Depression Screening Tool" LH panel option
Then "Depression Screening Tool" page will open
##
And I click "Yes" radio option for "Have you felt depressed or down" field CAM
And I click "Yes" radio option for "Changes in your normal sleeping pattern" field CAM
And I click "Yes" radio option for "Withdrawal from previously enjoyed activities or socializing" field CAM
And I click "Yes" radio option for "experienced feelings of intense" field CAM
And I click "Yes" radio option for "An increase in drug/alcohol use" field CAM
And I click on Save Depression Screening Button
#Then Depression Screening details should get verified
And I Navigate to "Viewer -> Depression Screening Tool" LH panel option
Then "Depression Screening Tool" page will open
When I start verifying records in Depression Screening Page
Then I Logout from Pixalere