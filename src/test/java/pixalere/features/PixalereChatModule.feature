Feature: Pixalere Chat Module

@test11
Scenario: Create New Patient
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin" User
When I Navigate to "Chat" LH panel option
And I click on "Send Message" Button
Then "Send Message" modal popup should open
##
When I search "Physician" as "Recipients User" in Send Message popup
Then "Physician" should display in "Recipients" field
When I search "Automation" as "Patient" in Send Message popup
Then "Automation" should display in "Patient" field
When I remove selected User and Patient from popup
Then Selected field should reset
##
When I search "Physician" as "Recipients User" in Send Message popup
And I search "Automation" as "Patient" in Send Message popup
And Sender type message in Chat box
And I click on "Send Message" Button on popup
Then Typed message should display in "Chat Message Thread" field
##
Given I Logout from Pixalere
And I login with "dermatologist" User
When I Navigate to "Chat" LH panel option
Then No message entry display for other user
##
Given I Logout from Pixalere
And I login with "physician" User
When I Navigate to "Chat" LH panel option
Then Latest message should display in "Receiver" user Chat panel
And I read the message from "Receiver" user
When Receiver type message in Chat box
And I click on "Send Message" Button
Then Typed message should display in "Chat Message Thread" field
##
Given I Logout from Pixalere
And I login with "admin" User
When I Navigate to "Chat" LH panel option
Then Latest message should display in "Sender" user Chat panel
And I read the message from "Sender" user