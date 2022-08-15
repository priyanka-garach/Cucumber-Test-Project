Feature: Pixalere Fall Risk Assessment

@test11
Scenario: Pixalere Fall Risk Assessment Script
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin-P" User-p
When I select client name "TEST-Kirby , Jose" from Dashboard
And I click "General Visit" radio option for "Service Referral and Type" field
And I Navigate to "Patient Profile -> Fall Risk Assessment" LH panel option
Then "Fall Risk Assessment" page will open
##
When I select "Education" checkbox for "History of Fall" FallRisk
And I select "2" from drpdown Handout for History of Fall FallRisk
And I select checkbox "MD/NP" from Referrals/rx for History of Fall FallRisk
And I enter "Details for History of Fall" in script
And I select "Education" checkbox for "Cogntive impairment" FallRisk
And I select "1" from drpdown Handout for Cogntive impairment FallRisk
And I select checkbox "OT" from Referrals/rx for Cogntive impairment FallRisk
And I select checkbox "MD/NP" from Referrals/rx for Cogntive impairment FallRisk
And I enter "Details for Cogntive impairment" in script
And I select "Education" checkbox for "Taking 4 or more medications" FallRisk
And I select "3" from drpdown Handout for Taking 4 or more medications FallRisk
And I select checkbox "Pharmacist" from Referrals/rx for Taking 4 or more medications FallRisk
And I select checkbox "MD/NP" from Referrals/rx for Taking 4 or more medications FallRisk
And I enter "Details for Taking 4 or more medications" in script
And I click on Save My Work Client Care Summary Button
#Then Fall Risk Assessment details should get verified
And I Navigate to "Viewer -> Fall Risk History" LH panel option
Then "Fall Risk History" page will open
When I start verifying records in Fall Risk History Page
Then I Logout from Pixalere