Feature: Pixalere Login Script

@test11
Scenario Outline: Pixalere Login Script
Given I setup in Browser
Given I am enter Pixalere Url
Then I verify Pixalere Login page is displayed
When I entered <username> and <password> and click on Continue button
Then I should get logged in and shown "WCC Progress Notes/Recommendations" popup
When I close popup Window
Then I should be shown the Home Screen
And I Logout from Pixalere
Examples:
|username|password|
|achal|Tatva@123|