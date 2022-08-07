Feature: Pixalere Exercise Program

@test11
Scenario: Pixalere Exercise Program Script
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin-P" User-p
When I globally select "Pix ID" from Search Category dropdown
And I search created patient with PIXID PT
And I select "PT" from Service Referral PT
And I click "Access Chart" radio option for "Service Referral and Type" field
And I Navigate to "Exercise Program" LH panel option
Then "PT Exercise Handouts" page will open
##
When I select "Ankle - Sitting Exercises" from Exercise handout dropdown
And I enter "Hold" input field in script
And I enter "Repeat" input field in script
And I enter "Sides" input field in script
And I click on Add button for Exercise one
And I enter "Hold2" input field in script
And I enter "Repeat2" input field in script
And I enter "Sides2" input field in script
And I click on Add button for Exercise two
And I enter "Hold3" input field in script
And I enter "Repeat3" input field in script
And I enter "SideAST3" input field in script
And I click on Add button for Exercise three
And I enter "Hold4" input field in script
And I enter "Repeat4" input field in script
And I enter "SideAST4" input field in script
And I click on Add button for Exercise four
And I enter "Hold5" input field in script
And I enter "Repeat5" input field in script
And I enter "SideAST5" input field in script
And I click on Add button for Exercise five
Then I verify record after add button
And I enter "Excersize Visit Date" input field in script
And I enter "Exercise program name" input field in script
And I enter "Additional Excersize comments" input field in script
And I click on Save My Work Time up and Go Button
#Then Exercise Program should get verified
And I Navigate to "Viewer -> Exercise Program" LH panel option
Then "PT Exercise Handouts" page will open
When I start verifying records in Exercise Program Page
Then I Logout from Pixalere