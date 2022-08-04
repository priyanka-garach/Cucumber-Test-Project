Feature: Pixalere MAHC-10 Fall Risk Assessment

@test11
Scenario: Pixalere MAHC-10 Fall Risk Assessment Script
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin-P" User-p
When I select client name "TEST-Kirby , Jose" from Dashboard
And I click "General Visit" radio option for "Service Referral and Type" field
And I Navigate to "Patient Profile -> MAHC-10 Fall Risk Assessment" LH panel option
Then "Missouri Alliance for Home Care (MAHC-10) Fall Risk Assessment Tool" page will open
##
When I select "Stop the Falling" checkbox for Handouts provided field MACH
And I select "Start Walking" checkbox for Handouts provided field MACH
#
And I select "MD" checkbox for ConsultsReferrals made to field MACH
#
And I enter "Details Comments Comment MAHC" input field OT
#
And I click "Yes" radio option for "Prior history of falls within 3 months" field MAHC
#
And I select "Stop the Falling" checkbox for Prior history of falls within three months field MACH
And I select "What to Do if You Fall" checkbox for Prior history of falls within three months field MACH
And I select "Home Support Exercise Program" checkbox for Prior history of falls within three months field MACH
#
And I click "No" radio option for "Incontinence" field MAHC
#
And I click "Yes" radio option for "Visual Impairment" field MAHC
#
And I select "Seeing the Truth About Fall Prevention" checkbox for Visual Impairment field MACH
#
And I select "MD" checkbox for Visual Impairment field MACH
And I select "OT" checkbox for Visual Impairment field MACH
And I select "PT" checkbox for Visual Impairment field MACH
#
And I click "Yes" radio option for "Impaired Functional Mobility" field MAHC
#
And I select "Healthy and Happy Feet" checkbox for Impaired Functional Mobility field MACH
And I select "Footwear" checkbox for Impaired Functional Mobility field MACH
And I select "Stair Safety" checkbox for Impaired Functional Mobility field MACH
And I select "Gait Aid Use" checkbox for Impaired Functional Mobility field MACH
And I select "Home Support Exercise Program" checkbox for Impaired Functional Mobility field MACH
#
And I click "No" radio option for "Environmental Hazards" field MAHC
And I click "No" radio option for "Poly Pharmacy" field MAHC
#
And I click "Yes" radio option for "Pain affecting level of function" field MAHC
#
And I select "Breathing Exercises" checkbox for Pain affecting level of function field MACH
And I select "Strategies to Manage Pain" checkbox for Pain affecting level of function field MACH
And I select "Energy Conservation" checkbox for Pain affecting level of function field MACH
And I select "Start Walking" checkbox for Pain affecting level of function field MACH
And I select "Why You Should Exercise" checkbox for Pain affecting level of function field MACH
#
And I click "No" radio option for "Cognitive Impairment" field MAHC
#
And I click "No" radio option for "Decreased Hearing Acuity" field MAHC
And I click "No" radio option for "Dizziness/Light-headedness" field MAHC
#
And I click "Yes" radio option for "Gait Aid Use" field MAHC
#
And I select "You and Your Walking Aid" checkbox for Gait Aid Use field MACH
And I select "Start Walking" checkbox for Gait Aid Use field MACH
And I select "Healthy and Happy Feet" checkbox for Gait Aid Use field MACH
And I select "Footwear" checkbox for Gait Aid Use field MACH
And I select "General Home Safety" checkbox for Gait Aid Use field MACH
#
And I click "Yes" radio option for "Foot/Footwear Concerns" field MAHC
#
And I select "Healthy and Happy Feet" checkbox for FootFootwear Concerns field MACH
And I select "Footwear" checkbox for FootFootwear Concerns field MACH
#
And I click on Save My MAHC Fall Risk Assessment Button
#Then MAHC-10 Fall Risk Assessment details should get verified
And I Navigate to "Viewer -> MAHC-10 Fall Risk Assessment" LH panel option
Then "Missouri Alliance for Home Care (MAHC-10) Fall Risk Assessment Tool" page will open
When I start verifying records in MAHC Fall Risk Assessment Page
Then I Logout from Pixalere