Feature: Pixalere Individualized Numeric Rating Scale

@test11
Scenario: Pixalere Individualized Numeric Rating Scale Script
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin-P" User-p
When I globally select "Pix ID" from Search Category dropdown
And I search created patient with PIXID
And I click "General Visit" radio option for "Service Referral and Type" field
And I Navigate to "Patient Profile -> Individualized Numeric Rating Scale (INRS)" LH panel option
Then "Individualized Numeric Rating Scale (INRS)" page will open
##
When I enter "Information for scale provided by" input field OT
#And I select "Parents/Guardain" from Relationship dropdown
And I enter "Worst Possible Pain 10" input field OT
And I enter "Moderate Pain 5" input field OT
And I click on Save My Work Non-Verbal Pediatric Pain Button one
And I enter "Words used for pain" input field OT
And I enter "discomfort/pain triggers for your child" input field OT
And I enter "initial interventions in the past" input field OT
#And I enter "Additional comments" input field OT
And I click on Save My Work Pain Considerations Pain Button two
And I select "2" from childs current pain score field dropdown OT
And I enter "the child doing when you noticed the pain" input field OT
And I enter "Medications for Pain Pharmacological" input field OT
And I enter "Cooling spray Physical & Environmental" input field OT
And I enter "Distraction Psychological & Behavioral" input field OT
And I enter "Medical Devices 	Intervention" input field OT
And I enter "Medical Devices" input field OT
And I enter "Client Specific Intervention Other" input field OT
And I enter "Please document MRP recommendations" input field OT
And I click on Save My Work Pain Management: Interventions Button three
#Then Individualized Numeric Rating Scale should get verified
And I Navigate to "Viewer -> Individualized Numeric Rating Scale (INRS)" LH panel option
Then "Individualized Numeric Rating Scale (INRS)" page will open
When I start verifying records in Individualized Numeric Rating Scale Page
Then I Logout from Pixalere