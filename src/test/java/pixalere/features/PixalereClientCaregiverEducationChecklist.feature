Feature: Pixalere Client Care Giver Education Checklist 

@test11
Scenario: Pixalere Care Plan Script
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin-P" User-p
When I globally select "Pix ID" from Search Category dropdown
And I search created patient with PIXID
And I click "General Visit" radio option for "Service Referral and Type" field
And I Navigate to "Teaching Guidelines -> Client/Caregiver Education Checklist" LH panel option
Then "Client/Caregiver Education Checklist" page will open 
##
When I click on "Initiated" for Review of Client Bill of RightsResponsibilities 
And  I click on "Completed" for Review of Client Bill of RightsResponsibilities 
When I click on "Initiated" for "Wounds" 
And  I click on "Completed" for "Wounds" 
And  I click on "Completed" for "How to trouble shoot pump"
#And I enter "Medication Name1" input field
#And I enter "Medication Name2" input field
When I click on "Initiated" for "Care of Saline lock" 
And  I click on "Completed" for "Care of Saline lock"
When I click on "Initiated" for "Air in Tubing" 
And  I click on "Completed" for "Air in Tubing"
And I click on Save My Work for Client Care Giver
And I Navigate to "Viewer -> Client/Caregiver Education Checklist History" LH panel option
Then "Client/Caregiver Education Checklist History" page will open
When I start verifying records for ClientCaregiver Education Checklist
Then I Logout from Pixalere