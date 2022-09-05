Feature: Pixalere Teaching Agreement D

@test11
Scenario: Pixalere Teaching Agreement Script
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin-P" User-p
When I select client name "Doe , Jane" from Dashboard
And I select "OT" from Service Referral
And I click "Access Chart" radio option for "Service Referral and Type" field
And I Navigate to "Teaching Agreement" LH panel option
Then "Teaching Agreement" page will open
##
When I expand "Activity to be Instructed" field OT
And I select "ADL" checkbox for Activity to be Instructed field
And I select "Ambulation" checkbox for Activity to be Instructed field
And I select "Bathroom safety" checkbox for Activity to be Instructed field
And I select "Breathing exercises" checkbox for Activity to be Instructed field
And I select "Communication" checkbox for Activity to be Instructed field
And I select "Equipment use" checkbox for Activity to be Instructed field
And I select "Exercise program" checkbox for Activity to be Instructed field
And I select "Feeding" checkbox for Activity to be Instructed field
And I select "Mobility aids" checkbox for Activity to be Instructed field
And I select "Active ROM" checkbox for Activity to be Instructed field
And I select "Passive ROM" checkbox for Activity to be Instructed field
And I select "Stairs" checkbox for Activity to be Instructed field
And I select "Compression stockings (Donning/Doffing)" checkbox for Activity to be Instructed field
And I select "Transfers" checkbox for Transfer to be Instructed field
And I select "Mechanical lift and sling" checkbox for Transfer to be Instructed field
And I select "Sit to stand lift" checkbox for Transfer to be Instructed field
And I select "Transfer board" checkbox for Transfer to be Instructed field
And I select "Transfer disc" checkbox for Transfer to be Instructed field
And I select "Bed to chair to bed" checkbox for Transfer to be Instructed field
And I select "Chair to chair" checkbox for Transfer to be Instructed field
And I select "Toilet seat transfer" checkbox for Transfer to be Instructed field
And I select "Commode transfer" checkbox for Transfer to be Instructed field
And I select "Bath tub transfer" checkbox for Transfer to be Instructed field
And I select "Shower stall transfer" checkbox for Transfer to be Instructed field
And I select "Stair glide transfer" checkbox for Transfer to be Instructed field
And I select "Lift handout provided" checkbox for Resources to be Instructed field
And I select "Resource materials/information sheet provided" checkbox for Resources to be Instructed field
And I select "Exercise sheets provided" checkbox for Resources to be Instructed field
When I enter "Activity Comment" input field in script
When I expand "client" checkbox field OT
And I select "Yes" radio button for SDM Consent Obtained Question1 field
And I select "Yes" radio button for SDM Consent Obtained Question2 field
And I select "Yes" radio button for SDM Consent Obtained Question3 field
And I select "Client" checkbox for Consent to be Instructed field
And I select "SDM" checkbox for Consent to be Instructed field
And I select "With Use of Interpreter" checkbox for Consent to be Instructed field
And I select "Verbally" checkbox for Consent to be Instructed field
And I select "With Signature" checkbox for Consent to be Instructed field
When I expand "learner" checkbox field OT
When I enter learner name
And I select Learner dropdown
And I select Employed By dropdown
And I select Date
And I select "Yes" radio button for Learner Question1 field
And I select "Yes" radio button for Learner Question2 field
And I select "Yes" radio button for Learner Question3 field
When I expand "edu" checkbox field OT
And I select "Yes" radio button for Acknowledge1
And I select "Yes" radio button for Acknowledge2
And I click on Save My Work Teaching Agreement Button
#Then Teaching Agreement details should get verified
And I Navigate to "Viewer -> Teaching Agreement" LH panel option
Then "Teaching Agreement" page will open
When I start verifying records in Teaching Agreement Page
Then I Logout from Pixalere