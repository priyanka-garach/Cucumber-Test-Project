Feature: Pixalere Palliative Performance Scale

@test11
Scenario: Palliative Performance Scale
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin" User
When I set CIN for Existing User
And I search created patient
And I Navigate to "Palliative -> Palliative Performance Scale" LH panel option
Then "Palliative Performance Scale" page should open
##
When I select different PPS Level And verify selected PPS should displayed in area below
##
When I delete saved record
Then "Delete Assessment" popup should open
When I edit reason in "Reason for Marked in Error" text field
And I click on "Delete this charting" Button on popup
##
Then I verify selected PPS Level record is deleted