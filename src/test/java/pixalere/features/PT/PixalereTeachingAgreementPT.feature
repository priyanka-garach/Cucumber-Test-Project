Feature: Pixalere Teaching Agreement PT

@test11
Scenario: Pixalere Exercise Program Script
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin-P" User-p
When I globally select "Pix ID" from Search Category dropdown
And I search created patient with PIXID special for PTAssessement and Teaching
And I select PT from Service Referral PTAssessment for Teaching and PTAssessment special
And I click "Access Chart" radio option for "Service Referral and Type" field
And I Navigate to "Teaching Agreement" LH panel option
Then "Teaching Agreement" page will open
##
When I click on ckeckbox label "Client/SDM Consent Obtained" PT Assessment
And I click on ckeckbox label "Learner Acknowledgement of Education" PT Assessment
And I click on ckeckbox label "Education Completed by Service Provider" PT Assessment	
And I click on Save Confusion Assessment Method TeachingPT Button
And I Navigate to "Viewer -> Teaching Agreement" LH panel option
Then "Teaching Agreement" page will open
When I start verifying records in Teaching Agreement PT Page
Then I Logout from Pixalere