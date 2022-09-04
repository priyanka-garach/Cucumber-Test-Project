Feature: Pixalere PT Assessment

@test11
Scenario: Pixalere PT Assessment Script
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin-P" User-p
When I globally select "Pix ID" from Search Category dropdown
And I search created patient with PIXID special for PTAssessement and Teaching
And I select PT from Service Referral PT for read from excel
And I click "Access Chart" radio option for "Service Referral and Type" field
And I Navigate to "PT Assessment" LH panel option
Then "PT Assessment" page will open
##
When I click on "Assessment Initiated" Assessment
And I enter "Visit Date" input field in script
And I click "Yes" radio option for initiating service
And I click "Yes" radio option for scope of service
And I click "Positive screen" radio option for Acute Respiratory Screen
And I click "Yes" radio option for LHIN referral
And I click "No" radio option for scope of practice
And I enter "Assessment Initiated Comments" input field in script
And I click "Yes" radio option for verbal consent
And I click "No" radio option for Student participating in service
And I enter "Diagnosis History of Presenting Concern" input field in script
And I enter "Client SDM Stated Goal" input field in script
And I enter "Past Medical History" input field in script
And I select "Investigations/follow-up clinically relevant" checkbox for Assessment Initiated
And I enter "Investigations followup clinically relevant" input field in script
And I enter "Investigations Date" input field in script
And I click on "Add Follow Up" Button
And I select "Activities avoided for fear of falling" checkbox for Assessment Initiated
And I select "↓ Hearing (that impacts falls safety)" checkbox for Assessment Initiated
And I select "Foot problems" checkbox for Assessment Initiated
And I select "Dizziness/ lightheadedness" checkbox for Assessment Initiated
And I select "Blood pressure out of normal range" checkbox for Assessment Initiated
And I click on "Home Accessibility & Social Situation Assessed" Assessment
And I click on "House" radio option for Housing
And I select "Family" checkbox for Home Accessibility
And I select "Private caregiver" checkbox for Home Accessibility
And I enter "Difficulties report" input field in script
And I click on "No obvious evidence of abuse/neglect" radio option for evidence
And I click on "WFL - home is functionally accessible for client’s needs" radio option for Functional Accessibility of Home
And I click on "Medication Use Assessed" Assessment
And I click on "WFL- independent or managing with current supports/assistance" radio option for Medication Use Assessed
And I enter "PT scope of practice" input field in script
And I click on "Posture Assessed" Assessment
And I click on "Difficulties/risks identified" radio option for Posture Assessed
And I select "Scoliosis" checkbox for Posture Assessed
And I select "Kyphosis" checkbox for Posture Assessed
And I select "Lordosis" checkbox for Posture Assessed
And I select "Pelvic tilt" checkbox for Posture Assessed
And I enter "Posture Assessed comment" input field in script
And I click on "Edema/Skin Assessed" Assessment
And I click on "Difficulties/risks identified" radio option for Edema
And I enter "Edema Location" input field in script
And I select "Moderate" checkbox for Edema
And I select "Pitting" checkbox for Edema
And I click on "Difficulties/risks identified" radio option for Skin Integrity
And I select "Set personal reminder to complete Braden" checkbox for Skin Integrity
And I select "Incision" checkbox for Skin Integrity
And I select "↑ Risk for skin breakdown" checkbox for Skin Integrity
And I select "Unrelieved pressure" checkbox for Skin Integrity
And I select "Inability to weight shift" checkbox for Skin Integrity
And I select "Moisture" checkbox for Skin Integrity
And I select "Immobility" checkbox for Skin Integrity
And I select "History of skin breakdown" checkbox for Skin Integrity
And I click on "Save as Draft and Continue" Button

#And I click on "Pain" Tab
And I click on "Pain Assessed" Assessment
And I enter "Pain Date" input field in script
And I click on "Other" radio option for Pain Assessment
And I click on "Chronic" radio option for Duration
And I click on "Constant" radio option for Frequency
And I select "Aching" checkbox for Quality
And I select "Sharp" checkbox for Quality
And I select "Burning" checkbox for Quality
And I select "Pressure" checkbox for Quality
And I select "Radiating" checkbox for Quality
And I select "Shooting" checkbox for Quality
And I select "Sleep and rest" checkbox for Pain Factors
And I select "Emotions" checkbox for Pain Factors
And I select "Social activities" checkbox for Pain Factors
And I select "Concentration" checkbox for Pain Factors
And I select "Appetite" checkbox for Pain Factors
And I select "Intimacy" checkbox for Pain Factors
And I select "Work" checkbox for Pain Factors
And I select "Mobility" checkbox for Pain Factors
And I select "Palliating Factors" checkbox for Pain Factors
And I enter "Palliating Factors List" input field in script
And I select "Aggravating Factors" checkbox for Pain Factors
And I enter "Aggravating Factors List" input field in script
And I click on "Save as Draft and Continue" Button


#And I click on "Mobility" Tab
And I click on "Mobility Assessed" Assessment
And I click on "WFL – independent or managing with current supports" radio option for Bed Mobility
And I enter "Bed Mobility comment" input field in script
And I click on "WFL – independent or managing with current supports" radio option for Chair Repositioning
And I enter "Chair Repositioning comment" input field in script
And I click on "WFL – independent or managing with current supports" radio option for Transfers
And I enter "Transfers comment" input field in script
And I click on "WFL –weight bearing is not impacting function" radio option for Weight Bearing Status
And I enter "Weight Bearing Status comment" input field in script
And I click on "Non-ambulatory" radio option for Ambulation
And I enter "Ambulation comment" input field in script
And I select "TUG (Time Up and Go)" checkbox for Mobility
And I enter "TUG Time" input field in script
And I enter "Aid used" input field in script
And I select "U_Rollator" checkbox for Mobility
And I select "R_Single point cane" checkbox for Mobility
And I select "D_Quad cane" checkbox for Mobility
And I select "U_Bed Rails" checkbox for Mobility
And I select "R_Transfer Board" checkbox for Mobility
And I select "D_Furniture Risers" checkbox for Mobility
And I select "D_Toilet safety arms" checkbox for Mobility
And I select "U_Grab bars" checkbox for Mobility
And I select "R_Tub rail" checkbox for Mobility
And I click on "Stair use Assessed" Assessment
And I click on "WFL – independent or managing with current supports" radio option for Stair use Assessed
And I select "D_Stairglide" checkbox for Mobility
And I select "R_Supervision on stairs" checkbox for Mobility
And I select "U_Assistance on stairs x1" checkbox for Mobility
And I click on "Balance Assessed" Assessment
And I click on "WFL - sufficient for function" radio option for Sitting balance
And I click on "Not Applicable" radio option for Standing balance
And I select "30 seconds Sit-stand" checkbox for Mobility
And I select "30 second sit-stand Test" checkbox for Mobility
And I enter "30 second sit-stand Test" input field in script
And I enter "Balance Assessed comments" input field in script
And I click on "Save as Draft and Continue" Button

#And I click on "MSK" Tab
And I click on "Musculoskeletal Status" Assessment
And I enter "Date of MSK Assessment" input field in script
And I click on "WFL - sufficient for function" radio option for MSK
And I click on Check All Button
And I enter "Musculoskeletal Status comments" input field in script
And I click on "Save as Draft and Continue" Button

#And I click on "Respiratory/Neuro" tab
And I click on "Respiratory" Assessment
And I click on ckeckbox for respiration
And I click on "WFL-respiration status sufficient for function" Respiratory
And I enter "Respiratory comments" input field in script
And I click on "Neurological" Assessment
And I click on ckeckbox for neurological
And I click on "WFL - sufficient for function" Neurological
And I enter "Neurological comments" input field in script
And I click on "Save as Draft and Continue" Button

#And I click on "Cognition" tab
And I click on "Cognition" Assessment
And I click on "WFL - sufficient for function" radio option for Cognitive Functioning
And I click on "WFL - sufficient for function" radio option for Affective Functioning
And I click on "No obvious evidence of imminent suicidal risk" radio option for Cognition
And I enter "Cognition comments" input field in script
And I click on "Save as Draft and Continue" Button

#And I click on "Analysis & Recommendations" tab
And I click on "Analysis & Recommendations" Assessment
And I click on "Contemplation" radio option for PT Service
And I select "Referral source" checkbox for Assessment information
And I select "Client" checkbox for Assessment information
And I select "One or more MAHC factors" checkbox for Assessment information
And I click on "Yes" radio Option for Assessment results
And I click on "Yes" radio Option for conversation completed
And I click on "Yes" radio Option for Welcome Brochure
And I click on "No" radio Option for Client Emergency
And I select "HEP provided" checkbox for Assessment information
And I click on Save As Draft PTAssessment

And I Navigate to "Viewer -> Assessment" LH panel option
Then "PT Assessment" page will open
#Then PT Assessment should get verified
When I start verifying records in PT Assessment Page
Then I Logout from Pixalere