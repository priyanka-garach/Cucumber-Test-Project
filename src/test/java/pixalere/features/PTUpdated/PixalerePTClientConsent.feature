Feature: Pixalere PT Client Consent

@test11
Scenario: Pixalere PT Client Consent
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin-P" User-p
When I globally select "Pix ID" from Search Category dropdown
And I search created patient with PIXID special for PTAssessement and Teaching
And I select PT from Service Referral
And I click "Access Chart" radio option for "Service Referral and Type" field
And I Navigate to "Consent Form" LH panel option
Then "Consent Form" page will open
##
When I click on "Service Consent Obtained" checkbox Button SM
And I verified data for "Proposed Health Services Discussed"
And I verified data for "Risks, alternatives and benefits of service discussed"
And I click on "Add a New Proposed Health Service" Button 
And I click on Other checkbox for Service Consent Obtained
And I enter "Other Service Consent Obtained" input field in script
And I enter "Comments Service Consent Obtained" input field in script
And I click on radio button "Yes" for Service Consent Obtained
And I click on "Consent Obtained to Collect, Use and Release Personal Health Information:" checkbox Button SM
And I verified data for "VHA acts as Health Information Custodian. Service Provider is the agent"
And I click on Virtual Care Consent to Open PopUp
And I click on "Add New Virtual Care Consent" Button
And I click on Required for video checkbox
And I click on radio button "Aware but not currently clinically appropriate" CC
#And I click on radio button two "Aware and interested" CC
And I click on radio button two "Yes" for Virtual Care Consent PT reviewed
And I enter "Alternate Contact Name" input field in script
And I enter "Backup Plan" input field in script
And I enter "Comments in Virtual Care Consent" input field in script
#And I click on Email Use For Communication Requested by Client_SDM to Open PopUp
And I click checkbox for "Client/SDM has requested and agree to communication via Email"
And I click on "Add New Email Address" Button
And I enter "Email" input field in script
And I click checkbox for "Primary E-mail Address"
And I click on "Add New Email Address" Button
And I click on Text Use For Communication Requested by Client_SDM Open PopUp
And I click on checkbox for Client_Substitute Decision Maker has requested and agrees to communication via text
#And I click checkbox for "Client"
And I click checkbox for "With Use of Interpreter"
#And I click checkbox for "Verbally"
And I click on radio button "No" for Guidelines and Policies
And I enter "Date Guidelines" input field in script
And I click checkbox for "Lock Box Required"
#And I enter "Lock Box Required" input field in script
#And I enter "Date Guidelines Alternate" input field in script
#And I click on "Save Lock box" Button
And I save my work PTClient Consent
##
And I Navigate to "Viewer -> Client Consent" LH panel option
Then "Client Consent" page will open
When I start verifying records in Client Consent Page
Then I Logout from Pixalere


