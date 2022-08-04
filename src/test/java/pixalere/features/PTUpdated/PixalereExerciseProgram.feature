Feature: Pixalere Exercise Program

@test11
Scenario: Pixalere Exercise Program Script
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin-P" User-p
When I globally select "Pix ID" from Search Category dropdown
And I search created patient with PIXID special
And I select PT from Service Referral
And I click "Access Chart" radio option for "Service Referral and Type" field
And I Navigate to "Exercise Program" LH panel option
Then "PT Exercise Handouts" page will open

##
When I select "Ankle - Sitting Exercises" from Exercise handout dropdown
And I enter "Hold" input field in script
And I enter "Repeat" input field in script
And I enter "Sides" input field in script
And I click on Add button for Exercise
Then I verify record after add button
And I enter "Exercise program name" input field in script
And I enter "Additional Excersize comments" input field
And I click on Save My Work Time up and Go Button

#Then Exercise Program should get verified
And I Navigate to "Viewer -> Exercise Program" LH panel option
Then "PT Exercise Handouts" page will open
When I start verifying records in Exercise Program Page
Then I Logout from Pixalere