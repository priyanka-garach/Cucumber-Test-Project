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
And I click "2: Able to stand using hands after several tries" radio option for "Sitting to standing" field PT
And I click "2: Able to stand 30 seconds unsupported" radio option for "StandingoneUnsupported1" field PT
And I click "2: Able to able to sit 30 seconds" radio option for "Sitting with back unsupported but feet supported on floor or on a stool" field PT
And I click "0: Needs assist to sit" radio option for "Standing to sitting" field PT
And I click "3: Able to transfer safely definite need of hands" radio option for "Transfers" field PT
And I click "3: Able to stand 10 seconds with supervision" radio option for "Standing unsupported with eyes closed" field PT
And I click "1: Reaches forward but needs supervision" radio option for "Reaching forward with outstretched arm while standing" field PT
And I click "4: Able to pick up slipper safely and easily" radio option for "Pick up object from the floor from a standing position" field PT
And I click "2: Able to turn 360 degrees safely but slowly" radio option for "Turn 360 degrees" field PT
And I click "3: Able to place foot ahead of other independently and hold 30 seconds" radio option for "Standing unsupported one foot in front" field PT
And I click "2: Able to lift leg independently and hold equal or >3 seconds" radio option for "Standing on one leg" field PT
And I click "2: Able to place feet together independently but unable to hold for 30 seconds" radio option for "Standing unsupported with feet together" field PT
And I click "3: Looks behind one side only other side shows less weight shift" radio option for "Turning to look behind over left and right shoulders while standing" field PT
And I click "2: Able to complete 4 steps without aid with supervision" radio option for "Place alternate foot on step or stool while standing unsupported" field PT
And I click on Save My Work Berg Balance Scale Button
#Then Berg Balance Scale should get verified
And I Navigate to "Viewer -> Berg Balance Scale" LH panel option
Then "Berg Balance Scale" page will open
When I start verifying records in Berg Balance Scale Page
Then I Logout from Pixalere