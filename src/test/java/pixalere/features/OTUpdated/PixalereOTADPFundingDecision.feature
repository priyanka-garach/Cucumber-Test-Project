Feature: Pixalere OT ADP Funding Decision

@test11
Scenario: Pixalere OT ADP Funding Decision

Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin-P" User-p
When I select client name "Doe , Jane" from Dashboard
And I select "OT" from Service Referral
And I click "Access Chart" radio option for "Service Referral and Type" field
And I Navigate to "ADP Funding Decision" LH panel option
Then "ADP Funding Decision" page will open
##
When I enter "ADP Authorizer Name" input field in script
And I enter "Date_ADP" input field in script
And I enter "Document_Upload" input field in script
And I click on Upload Button
And I enter "From_ADP" input field in script
And I enter "To_ADP" input field in script
And I enter "Document_Name_for_Filter" input field in script
And I enter "uploaded_by" input field in script
And I click on Apply Filter Button
Then I Verified searched record
Then I Logout from Pixalere