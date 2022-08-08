Feature: Pixalere MedRAT

@test11
Scenario: Pixalere MedRAT Script
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin-P" User-p
When I globally select "Pix ID" from Search Category dropdown
And I search created patient with PIXID Nursing
And I click "General Visit" radio option for "Service Referral and Type" field
And I Navigate to "Patient Profile -> MedRAT" LH panel option
Then "Medication Risk Assessment Tool" page will open
##
When I click "Simple" radio option for client's medication regimen field
And I click "Chaotic (Tick off possible reasons below)" radio option for client's medication adherence field
And I select "Impaired cognition" checkbox for medication adherence reasons field
And I select "Impaired vision, hearing, swallowing" checkbox for medication adherence reasons field
And I select "Lacks necessary support" checkbox for medication adherence reasons field
And I select "Lower literacy or ESL issues" checkbox for medication adherence reasons field
And I select "Side effects" checkbox for medication adherence reasons field
And I select "Cost" checkbox for medication adherence reasons field
And I select "beliefs" checkbox for medication adherence reasons field
And I select "Lacks basic understanding of medications" checkbox for medication adherence reasons field
And I select "Other" checkbox for medication adherence reasons field
And I click "Yes" radio option for  client on any high risk medications field
And I click "Yes" Based on the information above is the client high risk field
And I click on Save MedRAT Button
And I Navigate to "Viewer -> MedRAT" LH panel option
And I start verifying records in MedRAT Page
And I Navigate to "Patient Profile -> MedRAT" LH panel option
And I press on Delete Button
And I enter "Reason for Deletion" input field IO
And I confirm to press Delete Button
And I Navigate to "Viewer -> MedRAT" LH panel option
And I start verifying records in MedRAT Delete Page
Then I Logout from Pixalere