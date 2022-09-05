Feature: Pixalere OT Assessment

@test11
Scenario: Pixalere OT Assessment

Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin-P" User-p
When I select client name "Doe , Jane" from Dashboard
And I select "OT" from Service Referral
And I click "Access Chart" radio option for "Service Referral and Type" field
And I Navigate to "OT Assessment" LH panel option
Then "OT Assessment" page will open
##
When I expand all
And I enter visit date
And I select "Yes" in "Referral screened for appropriateness at some time prior to initiating service." radio assessment initiated field
And I select "Yes" in "Accuracy of info provided in referral confirmed in keeping with scope of service." radio assessment initiated field
And I select "Yes" in "Acute Respiratory Screen" radio
And I select "Yes" in "Service provided in client" radio
And I select "Yes" in "scope of practice" radio
And I select "Yes" in "Informed consent (including risks, limitations, benefits, alternatives, and risks of no service)" radio
And I select "Yes" in "Student participation in service" radio
And I enter comment for client stated concerns
And I select "House" in Home Accessibility Assessed
And I enter additional comments in Home Accessibility Assessed
And I select WFL in Home Accessibility Assessed
And I select ESS
And I select Home Accessibility Assessed NURD for Equipment
And I enter optional additional comments in Home Accessibility Assessed
And I enter Diagnosis corrections
And I select WFL in Physical Health Components Assessed
And I select Physical Health Components Assessed NURD for Equipment
And I select additional comments for Physical Health Components Assessed
And I select WFL in Skin Integrity Assessed
And I select Skin Integrity Assessed NURD for Equipment
And I select additional comments for Skin Integrity Assessed
And I select WFL in Cognition Assessed
And I select Cognition Assessed NURD for Equipment
And I select additional comments for Cognition Assessed
And I select WFL in Medication Management Discussed
And I select Medication Management Discussed NURD for Equipment
And I select additional comments for Medication Management Discussed
And I select WFL in Behavioural Health Assessed
And I select No evidence of abuse
And I select No evidence of acute suicidal risk
And I enter additional comment in Behavioural Health Assessed
And I select "Spouse/partner" checkbox in OT Assessment
And I select "Supportive housing" checkbox in OT Assessment
And I select "Caregiver stress" checkbox in OT Assessment
And I select "Social isolation/ limited activity" checkbox in OT Assessment
And I select "Partner/family" checkbox in OT Assessment
And I select WFL in Routines and IADLs Assessed
And I select Routines and IADLs Assessed NURD for Equipment
And I select additional comments for Routines and IADLs Assessed
And I select WFL in ADLs
And I select ADLs NURD for Equipment
And I select additional comments for ADLs
And I select WFL in Ambulation and Stair Use Assessed
And I select "No" in "Unsteady gait" radio
And I select "No" in "Any falls in the last 6 months" radio
And I select "No" in "Activities avoided for fear of falling" radio
And I select Ambulation and Stair Use Assessed NURD for Equipment
And I select additional comments for Ambulation and Stair Use Assessed
And I select WFL in Transfers
And I select Transfers NURD for Equipment
And I select additional comments for Transfers
And I select WFL in Bathroom ADLs
And I select Bathroom ADLs NURD for Equipment
And I select additional comments for Bathroom ADLs
And I select "OAS/CPP" checkbox in OT Assessment
And I select "VAC" checkbox in OT Assessment
And I enter VAC number
And I select "Insurance" checkbox in OT Assessment
And I enter Insurance number
And I select "WSIB" checkbox in OT Assessment
And I enter WSIB number
And I enter comment in Supplementary Funding Availability Noted
And I select "Declined to demonstrate mobility/NA:" checkbox in OT Assessment
And I select "Stairs" checkbox in OT Assessment
And I select "Wheelchair use" checkbox in OT Assessment
And I select "Referral source" checkbox in OT Assessment
And I select "Family/caregivers" checkbox in OT Assessment
And I select "Pre-contemplation" checkbox in OT Assessment
And I select "Contemplation" checkbox in OT Assessment
And I select "Preparation" checkbox in OT Assessment
And I select "Relapse prevention" checkbox in OT Assessment
And I select "Yes" in "Client Emergency Response Level" radio
And I select "Yes" in "Falls Risk Factors" radio
And I select "Yes" in "issues identified in assessment are addressed" radio
And I select "Yes" in "Assessment results shared with client" radio
And I select "Yes" in "Welcome Brochure and Notice of Information Practices provided" radio
And I enter additional comment in Assessment Activities Completed
And I select "Based on assessment above, OT has provided recommendations expected to maximize function, safety and/or independence." checkbox in OT Assessment
And I select "Recommendations provided to improve safety and decrease barriers to function." checkbox in OT Assessment
And I select "Recommendations provided and discussed with client/SDM and any questions addressed." checkbox in OT Assessment
And I select "Funding assistance to be investigated via:" checkbox in OT Assessment
And I select "Equipment to be ordered for in-home trial/rental as per Recommendations." checkbox in OT Assessment
And I select "Referral to other health care provider recommended:" checkbox in OT Assessment
And I enter additional comment in Analysis and Recommendations
And I save OT Assessment
And I Navigate to "Viewer -> OT Assessment" LH panel option
Then "OT Assessment" page will open
When I start verifying records in OT Assessment Page
Then I Logout from Pixalere