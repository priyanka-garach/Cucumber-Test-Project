Feature: Pixalere FIM

@test11
Scenario: Pixalere FIM Script
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin-P" User-p
When I select client name "Data_PT" from Dashboard
And I select "PT" from Service Referral PT
And I click "Access Chart" radio option for "Service Referral and Type" field
And I Navigate to "Outcome Measures -> FIM" LH panel option
Then "Functional Independence Measure (FIM®) Instrument" page will open
##
When I tick checkbox for Data obtained from other Discipline
And I enter "FIMData" input field OT
And I select "5" from "Eating" for Self-Care Category dropdown
And I select "5" from "Grooming" for Self-Care Category dropdown
And I select "5" from "Bathing" for Self-Care Category dropdown
And I select "5" from "Dressing – Upper Body" for Self-Care Category dropdown
And I select "5" from "Dressing – Lower body" for Self-Care Category dropdown
And I select "5" from "Toileting" for Self-Care Category dropdown
#
And I select "5" from "Bladder Management" for Sphincter Control dropdown
And I select "5" from "Bowel Management" for Sphincter Control dropdown
#
And I select "5" from "Bed, Chair, Wheelchair" for Transfers dropdown
And I select "5" from "Toilet" for Transfers dropdown
And I select "5" from "Tub, Shower" for Transfers dropdown
#
And I select "5" from "Walk/Wheelchair" for Locomotion dropdown
And I select "5" from "Stairs" for Locomotion dropdown
And I select "5" from "Comprehension" for Communication dropdown
And I select "5" from "Expression" for Communication dropdown
#
And I select "5" from "Social interaction" for Self-Care Category dropdown
And I select "5" from "Problem Solving" for Self-Care Category dropdown
And I select "5" from "Memory" for Self-Care Category dropdown
#
And I click on Save My Work Functional Independence Measure Button
#Then Functional Independence Measure should get verified
And I Navigate to "Viewer -> FIM" LH panel option
Then "Functional Independence Measure (FIM®) Instrument" page will open
When I start verifying records in Functional Independence Measure Page
Then I Logout from Pixalere