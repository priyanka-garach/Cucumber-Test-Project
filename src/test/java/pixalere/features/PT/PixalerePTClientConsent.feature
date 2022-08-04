Feature: Pixalere PT Client Consent

@test11
Scenario: Pixalere PT Client Consent
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin-P" User-p
When I globally select "Pix ID" from Search Category dropdown
And I search created patient with PIXID special for PTAssessement and Teaching
And I select PT from Service Referral PTAssessment for Teaching and PTAssessment special
And I click "Access Chart" radio option for "Service Referral and Type" field
And I Navigate to "Client Consent" LH panel option
Then "Client Consent" page will open
##
When I click on "Service Consent Obtained" checkbox Button SM
And I verified data for "Proposed Health Services Discussed"
And I verified data for "Risks, alternatives and benefits of service discussed"
And I click on "Consent Obtained to Collect, Use and Release Personal Health Information:" checkbox Button SM
And I verified data for "VHA acts as Health Information Custodian. Service Provider is the agent"
And I click on Virtual Care Consent to Open PopUp
And I click on radio button "Aware but not currently clinically appropriate" CC
And I click on radio button two "Aware but not currently clinically appropriate" CC
And I click checkbox for "Substitute Decision Maker"
And I enter "SDM Name" input field OT
And I click checkbox for "Spouse"
And I click checkbox for "Power of Attorney"
And I save my work PTClient Consent
##
And I Navigate to "Viewer -> Client Consent" LH panel option
Then "Client Consent" page will open
When I start verifying records in Client Consent Page
Then I Logout from Pixalere


