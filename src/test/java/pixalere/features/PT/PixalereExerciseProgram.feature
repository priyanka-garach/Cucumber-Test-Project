Feature: Pixalere Exercise Program

@test11
Scenario: Pixalere Exercise Program Script
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin-P" User-p
When I select client name "Data_PT" from Dashboard
And I select "PT" from Service Referral PT
And I click "Access Chart" radio option for "Service Referral and Type" field
And I Navigate to "Exercise Program" LH panel option
Then "PT Exercise Handouts" page will open
##
When I select "Ankle - Sitting Exercises" from Exercise handout dropdown
And I enter "HoldAST1" input field OT
And I enter "SideAST1" input field OT
And I enter "SideAST2" input field OT
And I enter "SideAST3" input field OT
And I enter "SideAST4" input field OT
And I enter "SideAST5" input field OT
And I enter "SideAST6" input field OT
And I enter "Exercise program name" input field OT
And I enter "Additional Excersize comments" input field
And I click on Save My Work Time up and Go Button
#Then Exercise Program should get verified
And I Navigate to "Viewer -> Exercise Program" LH panel option
Then "PT Exercise Handouts" page will open
When I start verifying records in Exercise Program Page
Then I Logout from Pixalere