Feature: Pixalere 30 Second Sit-Stand

@test11
Scenario: Pixalere 30 Second Sit-Stand Script
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin-P" User-p
When I select client name "TEST-Savage , Keon" from Dashboard
And I select "PT" from Service Referral PT
And I click "Access Chart" radio option for "Service Referral and Type" field
And I Navigate to "Outcome Measures -> 30 Second Sit-Stand" LH panel option
Then "30 Second Sit to Stand Test" page will open
##
When I select "Client performed modified exercise" Checkbox from Instruct the Client field
And I enter "NumberPT" input field
And I click on Save My Work 30 Second Sit-Stand Button
#Then 30 Second Sit-Stand should get verified
And I Navigate to "Viewer -> 30 Second Sit to Stand Test" LH panel option
Then "30 Second Sit to Stand Test" page will open
When I start verifying records in 30 Second Sit-Stand Page
Then I Logout from Pixalere