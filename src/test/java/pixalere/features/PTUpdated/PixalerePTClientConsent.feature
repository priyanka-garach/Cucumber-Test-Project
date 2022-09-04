Feature: Pixalere PT Client Consent

@test11
Scenario: Pixalere PT Client Consent
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin-P" User-p
When I globally select "Pix ID" from Search Category dropdown
And I search created patient with PIXID special for PTConsent Form
And I select PT from Service Referral PT for read from excel
And I click "Access Chart" radio option for "Service Referral and Type" field
And I Navigate to "Consent Form" LH panel option
Then "Consent Form" page will open
##
When I click on "Service Consent Obtained" arrow Button
And I click checkbox "As per that described by goals/care plan" for Proposed Health Services Discussed
And I click checkbox "Other" for Proposed Health Services Discussed
And I enter "Specify Proposed Health Services" input field in script
And I enter "Service Consent Obtained comments" input field in script
And I click radio "Yes" Risk for alternatives and benefits of service discussed
And I click on "Consent Obtained to Collect, Use and Release Personal Health Information:" arrow Button
And I click radio "Yes" for Notice of Information Practices provided to client SDM
And I click radio "LHIN" for Your service funder
And I tick "Other" for Family friends caregivers
And I enter "Other comment Family friends caregivers" input field in script 
And I tick "Other" for Medical Contacts
And I enter "Other comment Medical Contacts" input field in script
And I enter "Vendors" input field in script
And I enter "Other comment Consent Obtained" input field in script
And I click on "Virtual Care Consent" arrow Button
And I tick "Consent to Use Electronic/Audio-Visual/Communication" for Virtual Care Consent
And I click radio "Aware but not interested" Client is aware of the option of virtual care with telephone
And I click checkbox "Language barriers" for Client not interested in virtual care by telephone because
And I click checkbox "Hearing impairment" for Client not interested in virtual care by telephone because
And I click checkbox "Other" for Client not interested in virtual care by telephone because
And I click radio "Aware and interested" Client is aware of the option of virtual care with video
And I click radio "Yes" regarding virtual care with video. Client SDM provided informed consent.
And I click radio "Yes" regarding virtual care with novideo. Client SDM provided informed consent.
And I enter "Alternate Contact Name Phone Number" input field in script
And I enter "Back up plan" input field in script
And I enter "Back up plan comments" input field in script
And I click checkbox "Substitute Decision Maker" for Consent obtained from
And I enter "SDM Name consent" input field in script
And I click checkbox "Spouse" for Relationship
And I click checkbox "Parent" for Relationship
And I click checkbox "Other" for Relationship
And I enter "Other relationship comment" input field in script
And I click radio "Yes" I the Service Provider have completed this consent discussion with the clientSDM
And I enter "Date client consent" input field in script
And I click checkbox "Lock Box Required" for Lock Box Required
And I enter "Lock Box Required comment" input field in script
And I enter "Effective Date client consent" input field in script
#
And I save my work PTClient Consent
##
And I Navigate to "Viewer -> Consent Form" LH panel option
Then "Consent Form" page will open
When I start verifying records in Client Consent Page
Then I Logout from Pixalere


