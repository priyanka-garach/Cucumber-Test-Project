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
When I click on "Activity to be Instructed" checkbox
And I select "Breathing exercises" checkbox for Activity to be Instructed
And I select "Ambulation" checkbox for Activity to be Instructed
And I select "Stairs" checkbox for Activity to be Instructed
And I select "Bathroom safety" checkbox for Activity to be Instructed
And I select "Transfers" checkbox for Activity to be Instructed
And I select "Transfer board" checkbox under Transfer Feild
And I select "Stair glide transfer" checkbox under Transfer Feild
And I select "Sit to stand lift" checkbox under Transfer Feild
And I select "Chair to chair" checkbox under Transfer Feild
And I select "Toilet seat transfer" checkbox under Transfer Feild
And I select "Bath tub transfer" checkbox under Transfer Feild
And I select "Lift handout provided" checkbox for Activity to be Instructed
And I select "Exercise sheets provided" checkbox for Activity to be Instructed
And I enter "Activity to be Instructed" input field in script
And I click on "Client/SDM Consent Obtained" checkbox
And I select "Yes" radio button for  Activities Assigned
And I select "No" radio button for  modification plan
And I select "Yes" radio button for service provider
And I select "Client" checkbox for Client Consent Obtained
And I select "With Use of Interpreter" checkbox for Client Consent Obtained
And I select "Verbally" checkbox for Client Consent Obtained
And I click on "Learner Acknowledgement of Education" checkbox
And I select "Yes" radio button for Education received
And I select "Yes" radio button for alternatives and benefits
And I select "No" radio button for PSW providing
And I enter "LearnerName" input field in script
And I select "PSW" from learner dropdown
And I select "VHA" from employed dropdown
And I enter "LearnerDate" input field in script
And I click on "Education Completed by Service Provider" checkbox
And I select "Yes" radio button for demonstrated understanding
And I select "No" radio button for Service Supervisor
And I enter "Education Completed by Service Provider" input field in script
And I click on save button
##
And I Navigate to "Viewer -> Teaching Agreement" LH panel option
Then "Teaching Agreement" page will open
When I start verifying records in Teaching Agreement PT Page
Then I Logout from Pixalere