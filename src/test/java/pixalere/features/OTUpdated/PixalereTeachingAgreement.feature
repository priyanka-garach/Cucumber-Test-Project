Feature: Pixalere Teaching Agreement D

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
And I select "Yes" radio button for SDM Consent Obtained Question1 field
And I select "Yes" radio button for SDM Consent Obtained Question2 field
And I select "Yes" radio button for SDM Consent Obtained Question3 field
And I select "Client" checkbox for Consent Obtained field
And I select "Learner Acknowledgement of Education" checkbox field OT
And I enter "Name" field OT
And I select "2" dropdown for Learner field
And I select "2" dropdown for Employed By field
And I enter "Date_LAP" field OT
And I select "Yes" radio button for Education received on the activities field
And I select "Yes" radio button for Learner Acknowledgement of Education Question field
And I select "Yes" radio button for instructions of the service field
And I select "Yes" radio button for Education Completed by Service Provider acknowledge1 field
And I select "Yes" radio button for Education Completed by Service Provider acknowledge2 field
And I select "Education Completed by Service Provider" checkbox field OT
And I click on Save My Work Teaching Agreement Button
#Then Teaching Agreement details should get verified
And I Navigate to "Viewer -> Teaching Agreement" LH panel option
Then "Teaching Agreement" page will open
When I start verifying records in Teaching Agreement Page
Then I Logout from Pixalere