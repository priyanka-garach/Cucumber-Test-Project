Feature: Pixalere Care Plan

@test11
Scenario: Pixalere Care Plan Script
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin-P" User-p
When I globally select "Pix ID" from Search Category dropdown
And I search created patient with PIXID
And I click "General Visit" radio option for "Service Referral and Type" field
And I Navigate to "Patient Profile -> Care Plan" LH panel option
Then "Care Plan" page will open 
##
When I enter "Problem CP" input field CarePlan
And I enter "Client Problem Nursing Diagnosis" input field CarePlan
And I enter "Interventions Routine Care" input field CarePlan
And I enter "Expected Outcomes ReEvaluation Date" input field CarePlan
And I click "Yes" radio option for Goals Met field 
And I click on Save My Work Care Plan Button CarePlan
And I click on upadte button
And I enter "Edit Client Problem Nursing Diagnosis" input field CarePlan
And I enter "Edit Interventions Routine Care" input field CarePlan
And I enter "Edit Expected Outcomes ReEvaluation Date" input field CarePlan
And I click on after Edit Update Care Plan Button
#Then Care Plan details should get verified
And I Navigate to "Viewer -> Prevention Care Plan Flowchart" LH panel option
Then "Prevention Care Plan Flowchart" page will open
When I start verifying records in Prevention Care Plan
Then I Logout from Pixalere