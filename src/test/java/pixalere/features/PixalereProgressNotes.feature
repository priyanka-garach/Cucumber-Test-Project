Feature: Pixalere Progress Notes

@test11
Scenario: Progress Notes
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin" User
When I set CIN for Existing User
And I search created patient
And I Navigate to "Progress Notes" LH panel option
Then "Progress Notes" page should open
When I enter text in "Progress Notes" textarea
And I click on "Save Progress Note" input value Button
Then I verify Saved Progress Note, Date and User "Displayed" in search History
When I set "Next" day StartDate and EndDate
Then I verify Saved Progress Note, Date and User "Not Displayed" in search History
When I set "Current" day StartDate and EndDate
Then I verify Saved Progress Note, Date and User "Displayed" in search History