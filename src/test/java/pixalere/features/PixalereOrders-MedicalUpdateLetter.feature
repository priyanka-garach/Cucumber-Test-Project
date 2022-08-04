Feature: Pixalere Orders - Medical Update Letter

@test11
Scenario: Orders - Medical Update Letter
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin" User
When I set CIN for Existing User
And I search created patient
And I Navigate to "Orders -> Medical Update Letter" LH panel option
Then "Medical Update Letter" page should open
##
When I edit "Physician's / Nurse Practitioner's Name" field for Orders
And I edit "Providers Report" field for Orders
##
And I click on "Add My Electronic Signature and Save My Work" div Button
Then "Confirm" popup should open
When I click on "Confirm" Button
Then "Orders - Medical Update Letter" field Data should saved and verify in History record
##
When I edit "Reason for Marked in Error" field for Orders
And I click on "Delete Medical Update Letter" input value Button for Orders
Then "Orders - Medical Update Letter" field Data should deleted and verify in History record