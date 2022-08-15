Feature: Pixalere Diabetes Teaching Guidelines

@test11
Scenario: Pixalere Diabetes Teaching Guidelines Script
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin-P" User-p
When I globally select "Pix ID" from Search Category dropdown
And I search created patient with PIXID Nursing
And I click "General Visit" radio option for "Service Referral and Type" field
And I Navigate to "Teaching Guidelines -> Diabetes Teaching Guidelines" LH panel option
Then "Diabetes Teaching Guidelines" page will open
##
When I click on 'Self-monitoring of blood glucose (SMBG)' Completed Button on Diabetes Teaching Guidelines Page
And I click on 'Blood glucose control' Completed Button on Diabetes Teaching Guidelines Page
And I click on 'Blood glucose meter accuracy' Completed Button on Diabetes Teaching Guidelines Page
And I click on 'Hypertension' Completed Button on Diabetes Teaching Guidelines Page
And I click on 'Waist circumference' Completed Button on Diabetes Teaching Guidelines Page
And I click on 'Body Mass Index' Completed Button on Diabetes Teaching Guidelines Page
And I click on 'Nutrition' Completed Button on Diabetes Teaching Guidelines Page
And I click on 'Physical activity' Completed Button on Diabetes Teaching Guidelines Page
And I click on 'Smoking' Completed Button on Diabetes Teaching Guidelines Page
And I click on 'Retinopathy' Completed Button on Diabetes Teaching Guidelines Page
And I click on 'Chronic kidney disease (CKD)' Completed Button on Diabetes Teaching Guidelines Page
And I click on 'Neuropathy/foot examination' Completed Button on Diabetes Teaching Guidelines Page
And I click on 'CAD Assessment' Completed Button on Diabetes Teaching Guidelines Page
And I click on 'Dyslipidemia' Completed Button on Diabetes Teaching Guidelines Page
And I click on Save My Work Diabetes Teaching Guidelines Button
#Then Diabetes Teaching Guidelines details should get verified
And I Navigate to "Viewer -> Diabetes Teaching Guidelines History" LH panel option
Then "Diabetes Teaching Guidelines History" page will open
When I start verifying records in Diabetes Teaching Guidelines Page
Then I Logout from Pixalere
