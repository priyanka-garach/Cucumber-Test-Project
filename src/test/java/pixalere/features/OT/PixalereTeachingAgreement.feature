Feature: Pixalere Teaching Agreement

@test11
Scenario: Pixalere Teaching Agreement Script
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin-P" User-p
When I select client name "TEST-Kirby , Jose" from Dashboard
And I select "OT" from Service Referral
And I click "Access Chart" radio option for "Service Referral and Type" field
And I Navigate to "Teaching Agreement" LH panel option
Then "Teaching Agreement" page will open
##
When I click "Activity to be Instructed" field OT
And I select "Ambulation" checkbox for Activity to be Instructed field
And I select "Equipment use" checkbox for Activity to be Instructed field
And I select "Active ROM" checkbox for Activity to be Instructed field
And I select "Client/SDM Consent Obtained" checkbox field OT
And I select "Learner Acknowledgement of Education" checkbox field OT
And I select "Education Completed by Service Provider" checkbox field OT
And I click on Save My Work Teaching Agreement Button
#Then Teaching Agreement details should get verified
And I Navigate to "Viewer -> Teaching Agreement" LH panel option
Then "Teaching Agreement" page will open
When I start verifying records in Teaching Agreement Page
Then I Logout from Pixalere