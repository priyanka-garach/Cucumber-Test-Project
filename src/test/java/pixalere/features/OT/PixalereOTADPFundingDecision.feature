Feature: Pixalere OT ADP Funding Decision

@test11
Scenario: Pixalere OT ADP Funding Decision

Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin-P" User-p
When I select client name "TEST-Kirby , Jose" from Dashboard
And I select "OT" from Service Referral
And I click "Access Chart" radio option for "Service Referral and Type" field
And I Navigate to "ADP Funding Decision" LH panel option
Then "ADP Funding Decision" page will open
##
When I enter "ADP Authorizer Name" input field OT
And I enter "Date_ADP" input field OT
And I enter "Document_Upload" input field OT
And I click on Upload Button
And I enter "Document_Name_for_Filter" input field OT
And I click on Apply Filter Button
Then I Logout from Pixalere