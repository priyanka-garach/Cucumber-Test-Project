Feature: Pixalere Teaching Guidelines - Client-Caregiver Education Checklist

@test111
Scenario: Create New Patient
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin" User
And I create New Patient
And I accept Patient Consent
And I Logout from Pixalere

@test111
Scenario: Client-Caregiver Education Checklist
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin" User
When I search created patient
And I Navigate to "Teaching Guidelines -> Client/Caregiver Education Checklist" LH panel option
Then "Client/Caregiver Education Checklist" page should open
##
When I select all "Initiated" and "Completed" buttons
And I edit "Name of medication" input list
And I click on "Add Other Teaching" Button on Teaching section
Then "Add Other Teaching" popup should open
When I edit "Other Education" text field on popup
And I click on "Save Other Teaching" Button on popup
Then Text field should added in "Other Education" column field
When I select all "Initiated" and "Completed" buttons
And I click on "Add My Electronic Signature and Save My Work" Button
Then "Initiated" and "Completed" ButtonList should not displayed And "Undo Chart Done" ButtonList should display
When I select all "Undo Chart Done" buttons
And I click on "Add My Electronic Signature and Save My Work" Button
Then "Initiated" and "Completed" ButtonList should displayed And "Undo Chart Done" ButtonList should not display