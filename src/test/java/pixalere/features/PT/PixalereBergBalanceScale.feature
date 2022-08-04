Feature: Pixalere Berg Balance Scale

@test11
Scenario: Pixalere Berg Balance Scale Script
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin-P" User-p
When I select client name "TEST-Savage , Keon" from Dashboard
And I select "PT" from Service Referral PT
And I click "Access Chart" radio option for "Service Referral and Type" field
And I Navigate to "Outcome Measures -> Berg Balance Scale" LH panel option
Then "Berg Balance Scale" page will open
##
When I click on Long Button
And I click "random" radio option for "Sitting to standing" field PT
And I click "random" radio option for "StandingoneUnsupported1" field PT
And I click "random" radio option for "Sitting with back unsupported but feet supported on floor or on a stool" field PT
And I click "random" radio option for "Standing to sitting" field PT
And I click "random" radio option for "Transfers" field PT
And I click "random" radio option for "Standing unsupported with eyes closed" field PT
And I click "random" radio option for "Reaching forward with outstretched arm while standing" field PT
And I click "random" radio option for "Pick up object from the floor from a standing position" field PT
And I click "random" radio option for "Turn 360 degrees" field PT
And I click "random" radio option for "Standing unsupported one foot in front" field PT
And I click "random" radio option for "Standing on one leg" field PT
And I click on Save My Work Berg Balance Scale Button
#Then Berg Balance Scale should get verified
And I Navigate to "Viewer -> Berg Balance Scale" LH panel option
Then "Berg Balance Scale" page will open
When I start verifying records in Berg Balance Scale Page
Then I Logout from Pixalere