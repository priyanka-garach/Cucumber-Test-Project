Feature: Pixalere Daily Schedule

@test11
Scenario: Pixalere Daily Schedule Script
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin-P" User-p
When I globally select "Pix ID" from Search Category dropdown
And I search created patient with PIXID Nursing
And I click "General Visit" radio option for "Service Referral and Type" field
And I Navigate to "Patient Profile -> Daily Schedule" LH panel option
When I enter Time Activity
When I click on Save My Work Daily Schedule Button
And I Navigate to "Viewer -> Daily Schedule" LH panel option
And I verify daily schedule
Then I Logout from Pixalere
